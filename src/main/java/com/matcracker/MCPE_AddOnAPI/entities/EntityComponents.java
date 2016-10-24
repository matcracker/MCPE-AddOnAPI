package com.matcracker.MCPE_AddOnAPI.entities;

public class EntityComponents{
	/*
	 * @TODO List
	 * - Check almost all "set" method if can be > 0
	 * - Add more entities
	 * - Add documentation 
	 */
	private EntityType type;
	private float health = 20F;
	private float maxHealth = 20F;
	private float height = 2F;
	private float width = 1F;
	private float movement = 0.25F;
	private float maxMovement = 0.5F;
	
	private int damage;
	
	public EntityComponents(EntityType type){
		this.type = type;
	}
	
	public EntityComponents(EntityType type, float health, float maxHealth, float height, float width){
		this.type = type;
		this.health = health;
		this.maxHealth = maxHealth;
		this.height = height;
		this.width = width;
	}
	
	public String getIdentifier(){
		return "minecraft:" + type.toString().toLowerCase();
	}
	
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
	
	public void setHeight(float height){
		this.height = height;
	}
	
	public float getHeight(){
		return height;
	}
	
	public void setWidth(float width){
		this.width = width;
	}
	
	public float getWidth(){
		return width;
	}
	
	public void setMovement(float movement){
		this.movement = movement;
	}
	
	public float getMovement(){
		return movement;
	}
	
	public void setMaxMovement(float maxMovement){
		this.maxMovement = maxMovement;
	}
	
	public float getMaxMovement(){
		return maxMovement;
	}
	
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public boolean isProjectile(){
		switch(type){
			case ARROW:
			case FIREBALL_LARGE:
			case FIREBALL_SMALL:
				return true;
			default:
				return false;
		}
	}
	
}
