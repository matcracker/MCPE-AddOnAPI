package com.matcracker.MCPE_AddOnAPI.entities;

public interface Tameable {
	public boolean isRequiredTame();

	public void setRequireTame(boolean requireTame);
	
	public String getBreedItem();
	
	public void setBreedItem(String breedItem);
	
	public String[] getBreedItems();

	public void setBreedItems(String[] breedItems);
}
