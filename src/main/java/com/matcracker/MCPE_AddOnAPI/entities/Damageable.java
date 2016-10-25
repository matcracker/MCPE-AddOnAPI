package com.matcracker.MCPE_AddOnAPI.entities;

public interface Damageable extends Entity{
	public void setMaxHealth(float maxHealth);
	
	public float getMaxHealth();
	
	public void setHealth(float health);
	
	public float getHealth();
	
	public int getDamage();

	public void setDamage(int damage);
}
