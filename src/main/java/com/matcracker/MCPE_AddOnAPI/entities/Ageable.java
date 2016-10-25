package com.matcracker.MCPE_AddOnAPI.entities;

public interface Ageable extends Creature{
	public void setBaby(boolean flag);
	
	public boolean isBaby();
	
	public long getDuration();
	
	public void setDuration(long duration);

}
