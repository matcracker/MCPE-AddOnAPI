package com.matcracker.MCPE_AddOnAPI;

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
	
	//@TODO Sort in alphabetical order when all entities type are added
	public enum EntityType{
		ARROW,
		SKELETON,
		ZOMBIE,
		FIREBALL_LARGE,
		FIREBALL_SMALL,
		ZOMBIE_PIGMAN,
		HUSK,
		GHAST
	}
		
	public String getEntityID(){
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
