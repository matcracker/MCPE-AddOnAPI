package com.matcracker.MCPE_AddOnAPI.entities;

public class EntityDamageable extends Entity{
	
	public EntityDamageable(EntityType type) {
		super(type);
	}

	private float health = 20F;
	private float maxHealth = 20F;
	
	public void setMaxHealth(float maxHealth){
		this.maxHealth = maxHealth;
	}
	
	public float getMaxHealth(){
		return maxHealth;
	}
	
	public void setHealth(float health){
		this.health = health;
	}
	
	public float getHealth(){
		return health;
	}
}
