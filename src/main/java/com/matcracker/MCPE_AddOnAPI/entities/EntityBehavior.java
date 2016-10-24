package com.matcracker.MCPE_AddOnAPI.entities;

import com.matcracker.MCPE_AddOnAPI.components.Components.BehaviourType;

public class EntityBehavior {
	private BehaviourType type;
	private int priority = 1;
	private float speedMultiplier = 1F;
	private float targetDistance = 0;
	private boolean trackTarget = false;
	
	private float lookDistance = 4F;
	
	public EntityBehavior(BehaviourType type){
		this.type = type;
	}
	
	public EntityBehavior(BehaviourType type, int priority, float speedMultiplier){
		this.type = type;
		this.priority = priority;
		this.setSpeedMultiplier(speedMultiplier);
	}
	
	public void setType(BehaviourType type){
		this.type = type;
	}
	
	public BehaviourType getType(){
		return type;
	}
	
	public void setPriority(int priority){
		this.priority = priority;
	}
	
	public int getPriority(){
		return priority;
	}
	
	public void setSpeedMultiplier(float speedMultiplier) {
		this.speedMultiplier = speedMultiplier;
	}
	
	public float getSpeedMultiplier() {
		return speedMultiplier;
	}

	public float getTargetDistance() {
		return targetDistance;
	}

	public void setTargetDistance(float targetDistance) {
		this.targetDistance = targetDistance;
	}

	public boolean isTrackingTarget(){
		return trackTarget;
	}

	public void setTrackTarget(boolean trackTarget) {
		switch(type){
			case MELEE_ATTACK:
			case MOUNT_PATHING:
				this.trackTarget = trackTarget;
			default:
				break;
		}
			
	}
	
	public float getLookDistance() {
		return lookDistance;
	}

	public void setLookDistance(float lookDistance) {
		if(type == BehaviourType.LOOK_AT_PLAYER)
			this.lookDistance = lookDistance;
	}


	
	
	
}
