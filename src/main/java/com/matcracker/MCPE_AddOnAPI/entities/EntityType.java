package com.matcracker.MCPE_AddOnAPI.entities;

//@TODO Sort in alphabetical order when all entities type are added
public enum EntityType {
	ARROW("arrow.skeleton"),
	SKELETON("skeleton"),
	ZOMBIE("zombie"),
	FIREBALL("fireball.large"),
	FIREBALL_SMALL("fireball.small"),
	ZOMBIE_PIGMAN("zombie_pigman"),
	HUSK("husk"),
	GHAST("ghast"), 
	CREEPER("creeper"), 
	COW("cow");
	
	private String identifier;
	
	private EntityType(String identifier){
		this.identifier = identifier;
	}
	
	public String getIdentifier(){
		return "minecraft:" + identifier;
	}
}
