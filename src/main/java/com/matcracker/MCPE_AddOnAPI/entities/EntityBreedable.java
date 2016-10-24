package com.matcracker.MCPE_AddOnAPI.entities;

public class EntityBreedable extends Entity {

	private boolean requireTame;
	private String[] breedItems;

	public EntityBreedable(EntityType entity) {
		super(entity);
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
