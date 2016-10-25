package com.matcracker.MCPE_AddOnAPI.entities;

import com.matcracker.MCPE_AddOnAPI.components.Components.BehaviourType;

public interface Behavioral {

	public void setType(BehaviourType type);

	public BehaviourType getBehaviorType();

	public void setPriority(int priority);

	public int getPriority();

	public void setSpeedMultiplier(float speedMultiplier);

	public float getSpeedMultiplier();

	public float getLookDistance();

	public void setLookDistance(float lookDistance);

}
