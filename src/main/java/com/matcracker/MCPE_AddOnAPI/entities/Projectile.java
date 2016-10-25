package com.matcracker.MCPE_AddOnAPI.entities;

public interface Projectile extends Entity{
	
	public boolean isKnockback();

	public void setKnockback(boolean knockback);

	public float getGravity();

	public void setGravity(float gravity);

	public float[] getOffset();

	public void setOffset(float[] offset);

	public float getPower();
	
	public void setPower(float power);

	public int getAnchor();

	public void setAnchor(int anchor);
}
