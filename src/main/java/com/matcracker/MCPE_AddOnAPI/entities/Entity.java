package com.matcracker.MCPE_AddOnAPI.entities;

public interface Entity{
	public String getIdentifier();
	
	public EntityType getEntityType();
	
	public void setEntityType(EntityType type);

	public float getMovement();
	
	public void setMovement(float movement);
	
	public float getMaxMovement();
	
	public void setMaxMovement(float maxMovement);
	
}
