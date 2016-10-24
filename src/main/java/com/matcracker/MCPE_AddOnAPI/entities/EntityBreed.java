package com.matcracker.MCPE_AddOnAPI.entities;

public class EntityBreed{
	
	private Entity entity;
	private boolean requireTame = false;
	private String[] breedItems;
	
	public EntityBreed(Entity entity) {
		this.entity = entity;
	}
	
	public Entity getEntity(){
		return entity;
	}

	public boolean isRequiredTame() {
		return requireTame;
	}

	public void setRequireTame(boolean requireTame) {
		this.requireTame = requireTame;
	}

	public String[] getBreedItems() {
		return breedItems;
	}

	public void setBreedItems(String[] breedItems) {
		this.breedItems = breedItems;
	}

}
