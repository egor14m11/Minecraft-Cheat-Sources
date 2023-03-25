package zamorozka.event.events;

import net.minecraft.client.Minecraft;
import zamorozka.event.Event;

public class EventMotion extends Event {

	private boolean onGround;
	private float yaw;
	private float pitch;
	private double y;
	private boolean pre;
	
	public EventMotion(final float yaw, final float pitch, final double y, final boolean onGround, final boolean pre) {
		this.yaw = yaw;
		this.pitch = pitch;
		this.y = y;
		this.onGround = onGround;
		this.pre = pre;
	}
	
	public EventMotion(final float yaw, final float pitch, final double y, final boolean onGround) {
		this.yaw = yaw;
		this.pitch = pitch;
		this.y = y;
		this.onGround = onGround;
	}
	
	public void setRotation(float yaw, float pitch) {
		if (Float.isNaN(yaw) || Float.isNaN(pitch) || pitch > 90 || pitch < -90) return;
		
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
	public void setRotations(float[] rotations) {
		setRotation(rotations[0], rotations[1]);
	}
	public float[] getRotations() {
		return new float[] {yaw, pitch};
	}
	
	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}
	
	public float getYaw() {
		return yaw;
	}

	public float getPitch() {
		return pitch;
	}

	public double getY() {
		return y;
	}

	public boolean isOnGround() {
		return onGround;
	}
	
	public void setYaw(float yaw) {
		Minecraft.getMinecraft().player.renderYawOffset = yaw;
		Minecraft.getMinecraft().player.rotationYawHead = yaw;
		this.yaw = yaw;
	}
	
	public void setPitch(float pitch) {
		this.pitch = pitch;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	public boolean isPre() {
		return pre;
	}
	
}