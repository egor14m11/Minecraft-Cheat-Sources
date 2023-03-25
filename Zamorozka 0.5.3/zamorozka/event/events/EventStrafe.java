package zamorozka.event.events;

import zamorozka.event.Event;

public class EventStrafe extends Event {

	public float strafe;
	public float forward;
	public float friction;
	
	public EventStrafe(float strafe, float forward, float friction) {
		this.strafe = strafe;
		this.forward = forward;
		this.friction = friction;
	}
	
	public float getStrafe() {
		return strafe;
	}
	
	public float getForward() {
		return forward;
	}
	
	public float getFriction() {
		return friction;
	}
	
	public void setStrafe(float strafe) {
		this.strafe = strafe;
	}
	
	public void setForward(float forward) {
		this.forward = forward;
	}
	
	public void setFriction(float friction) {
		this.friction = friction;
	}
	
}