package org.spray.infinity.via.handler;

import java.util.List;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelEncoderException;
import com.viaversion.viaversion.util.PipelineUtil;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

@ChannelHandler.Sharable
public class FabricEncodeHandler extends MessageToMessageEncoder<ByteBuf> {
	private final UserConnection info;

	public FabricEncodeHandler(UserConnection info) {
		this.info = info;
	}

	@Override
	protected void encode(final ChannelHandlerContext ctx, ByteBuf bytebuf, List<Object> out) throws Exception {
		if (!info.checkOutgoingPacket())
			throw CancelEncoderException.generate(null);
		if (!info.shouldTransformPacket()) {
			out.add(bytebuf.retain());
			return;
		}

		ByteBuf transformedBuf = ctx.alloc().buffer().writeBytes(bytebuf);
		try {
			info.transformOutgoing(transformedBuf, CancelEncoderException::generate);

			out.add(transformedBuf.retain());
		} finally {
			transformedBuf.release();
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		if (PipelineUtil.containsCause(cause, CancelCodecException.class))
			return;
		super.exceptionCaught(ctx, cause);
	}
}