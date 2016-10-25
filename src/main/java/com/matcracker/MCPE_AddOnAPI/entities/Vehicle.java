package com.matcracker.MCPE_AddOnAPI.entities;

public interface Vehicle extends Entity{
	public int getSeatCount();
	
	public void setSeatCount(int seatCount);
	
	public float[] getSeatsPosition();
	
	public void setSeatsPosition(float[] position);
}
