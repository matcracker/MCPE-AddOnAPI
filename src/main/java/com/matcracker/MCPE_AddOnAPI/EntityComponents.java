package com.matcracker.MCPE_AddOnAPI;

public class EntityComponents{
	
	private EntityType type;
	private float health = 20F;
	private float maxHealth = 20F;
	private float height = 2F;
	private float width = 1F;
	
	private int damage;
	
	public EntityComponents(EntityType type){
		this.type = type;
	}
	
	public EntityComponents(EntityType type, float health, float height, float width){
		this.health = health;
		this.height = height;
		this.width = width;
	}
	
	public enum EntityType{
		SKELETON,
		ZOMBIE,
		ZOMBIE_PIGMAN,
		HUSK,
		GHAST
	}
	
	public String getEntityID(){
		return "minecraft:" + type.toString().toLowerCase();
	}
	
	public float getMaxHealth(){
		return maxHealth;
	}
	
	public float getHealth(){
		return health;
	}
	
	public float getHeight(){
		return height;
	}
	
	public float getWidth(){
		return width;
	}
	
	public int getDamage(){
		return damage;
	}
	
}
