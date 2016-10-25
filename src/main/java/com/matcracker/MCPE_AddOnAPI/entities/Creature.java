package com.matcracker.MCPE_AddOnAPI.entities;

public interface Creature extends LivingEntity{
	public void setTarget(EntityType type);
	
	public EntityType getTarget();
	
	public void setTargets(EntityType[] type);
	
	public EntityType[] getTargets();
	
	public void setMaxDistance(int distance);
	
	public int getMaxDistance();
}
