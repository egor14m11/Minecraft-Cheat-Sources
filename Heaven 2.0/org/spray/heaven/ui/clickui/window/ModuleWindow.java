package org.spray.heaven.ui.clickui.window;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.spray.heaven.features.module.Module;
import org.spray.heaven.font.IFont;
import org.spray.heaven.main.Wrapper;
import org.spray.heaven.ui.clickui.base.AbstractElement;
import org.spray.heaven.ui.clickui.base.AbstractWindow;
import org.spray.heaven.ui.clickui.button.ModuleButton;
import org.spray.heaven.util.MathUtil;
import org.spray.heaven.util.render.Drawable;
import org.spray.heaven.util.render.RenderUtil;
import org.spray.heaven.util.render.animation.Animation;
import org.spray.heaven.util.render.animation.Direction;
import org.spray.heaven.util.render.animation.impl.DecelerateAnimation;
import org.spray.heaven.util.render.animation.impl.EaseBackIn;
import org.spray.heaven.util.render.shader.drawable.RoundedShader;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class ModuleWindow extends AbstractWindow {

	private final List<ModuleButton> buttons;
	private final ResourceLocation ICON;

	private double maxHeight = 0; // Maximum height for elements

	private final Animation animation = new EaseBackIn(270, 1f, 1.03f, Direction.BACKWARDS);
	private final Animation dragAnimation = new DecelerateAnimation(260, 1F, Direction.BACKWARDS);
	private final Animation rotationAnim = new DecelerateAnimation(260, 1F, Direction.FORWARDS);

	private double scrollSpeed;
	private double prevScrollProgress;
	private double scrollProgress;
	private boolean scrollHover; // scroll hover

	private float rotation = 0;
	
	private int index = 0;

	public ModuleWindow(String name, List<Module> features, int index, double x, double y, double width, double height) {
		super(name, x, y, width, height);
		buttons = new ArrayList<>();
		ICON = new ResourceLocation("heaven/textures/icons/windows/" + name.toLowerCase() + ".png");
		
		this.index = index;

		features.sort((a, b) -> Integer.compare((int) IFont.WEB_SMALL.getStringWidth(b.getName()),
				(int) IFont.WEB_SMALL.getStringWidth(a.getName())));
		features.forEach(feature -> {
			ModuleButton button = new ModuleButton(feature);
			button.setHeight(15);
			buttons.add(button);
		});
	}

	@Override
	public void init() {
		buttons.forEach(ModuleButton::init);
	}

	@Override
	public void render(int mouseX, int mouseY, float delta, Color color, boolean finished) {
		super.render(mouseX, mouseY, delta, color, finished);

		maxHeight = 4000;

		scrollHover = Drawable.isHovered(mouseX, mouseY, x, y + height, width, maxHeight);
		Color rectColor = new Color(14, 15, 17, 250);

		animation.setDirection(isOpen() ? Direction.FORWARDS : Direction.BACKWARDS);
		dragAnimation.setDirection(dragging ? Direction.FORWARDS : Direction.BACKWARDS);
		rotationAnim.setDirection(Direction.FORWARDS);
		
		GlStateManager.pushMatrix();

		float centerX = (float) (x + (mouseX - prevTargetX) / 2);
		float centerY = (float) (y + (height) / 2);

		rotation = (float) ((prevTargetX > x) ? RenderUtil.scrollAnimate(rotation, (float) -(5 - (x - prevTargetX) * 3.3), .94f)
				: (prevTargetX < x) ? RenderUtil.scrollAnimate(rotation, (float) (5 + (x - prevTargetX) * 3.3), .94f)
						: RenderUtil.scrollAnimate(rotation, 0, .8f));
		
		float dragScale = (float) (1f - (0.016f * dragAnimation.getOutput()));
		double amount = Mouse.getDWheel();
		GlStateManager.translate(centerX, centerY, 1);
		GlStateManager.scale(dragScale + Math.abs(rotation / 200), dragScale, 1);
		GlStateManager.rotate((float) ((rotation)), 0, 0, 1);
		GlStateManager.translate(-centerX, -centerY, 1);

//		Drawable.drawBlurredShadow((int) x + 2, (int) (y + height - 5), (int) width - 4,
//				(int) ((getButtonsHeight() + 5) * animation.getOutput()), 8, new Color(18, 18, 20, 255));
		RoundedShader.drawRound((float) x + 2, (float) (y + height - 5), (float) width - 4,
				(float) ((getButtonsHeight() + 5) * animation.getOutput()), 3, true, new Color(35, 35, 38, 255));

		if (animation.finished(Direction.FORWARDS)) {
			if (scrollHover) {
				if (Keyboard.isKeyDown(Keyboard.KEY_DOWN))
					amount = -1;
				else if (Keyboard.isKeyDown(Keyboard.KEY_UP))
					amount = 1;

				amount = MathUtil.clamp((float) amount, -1F, 1F);

				if (amount != 0) {
					double sa = amount < 0 ? amount - 10 : amount + 10;
					scrollSpeed -= sa;
				}
			}

			Drawable.drawBlurredShadow((int) x + 4, (int) (y + height - 1), (int) width - 8, 3, 7,
					new Color(0, 0, 0, 180));

			for (ModuleButton button : buttons) {
				button.setX(x + 2);
				button.setY(y + height - getScrollProgress());
				button.setWidth(width - 4);
				button.setHeight(15);

				button.render(mouseX, mouseY, delta, color, finished);
			}
		}
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		
		Drawable.drawRectWH(x, y, width, height, rectColor.getRGB());
		Drawable.drawTexture(ICON, x + 3, y + (height - 12) / 2, 12, 12);
		IFont.WEB_SMALL.drawStringWithShadow(getName(), x + 19, y + height / 2 - (IFont.WEB_SMALL.getFontHeight() / 2),
				-1);
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GlStateManager.popMatrix();

		updatePosition();
	}

	@Override
	public void mouseClicked(int mouseX, int mouseY, int button) {
		if (button == 1 && hovered) {
			setOpen(!isOpen());
		}
		super.mouseClicked(mouseX, mouseY, button);

		if (isOpen() && scrollHover)
			buttons.forEach(b -> b.mouseClicked(mouseX, mouseY, button));
		else if (!isOpen()) {
			buttons.forEach(ModuleButton::resetAnimation);
		}
	}

	@Override
	public void tick() {
		super.tick();
		if (isOpen()) {
			buttons.forEach(ModuleButton::tick);
		}
	}

	@Override
	public void mouseReleased(int mouseX, int mouseY, int button) {
		super.mouseReleased(mouseX, mouseY, button);
		if (isOpen())
			buttons.forEach(b -> b.mouseReleased(mouseX, mouseY, button));
	}

	@Override
	public void handleMouseInput() throws IOException {
		super.handleMouseInput();
		for (ModuleButton button : buttons)
			button.handleMouseInput();
	}

	@Override
	public void keyTyped(char chr, int keyCode) {
		if (isOpen()) {
			for (ModuleButton button : buttons)
				button.keyTyped(chr, keyCode);
		}
	}

	@Override
	public void onClose() {
		super.onClose();
		buttons.forEach(ModuleButton::onGuiClosed);
	}

	private double getScrollProgress() {
		return prevScrollProgress + (scrollProgress - prevScrollProgress) * Wrapper.MC.getRenderPartialTicks();
	}

	private void setScrollProgress(double value) {
		prevScrollProgress = scrollProgress;
		scrollProgress = value;
	}

	private void updatePosition() {
		double offsetY = 0;
		double openY = 0;
		for (ModuleButton button : buttons) {
			button.setOffsetY(offsetY);
			if (button.isOpen()) {
				for (AbstractElement element : button.getElements()) {
					if (element.isVisible())
						offsetY += element.getHeight();
				}
				offsetY += 2;
			}
			offsetY += button.getHeight() + openY;
		}
	}

	public double getButtonsHeight() {
		double height = 0;
		for (ModuleButton button : buttons) {
			height += button.getElementsHeight();
			height += button.getHeight();
		}

		return height;
	}

	public int getHeightDifference() {
		double diffHeight = maxHeight;
		return (int) (this.getButtonsHeight() - diffHeight);
	}

}
