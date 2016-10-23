package com.matcracker.MCPE_AddOnAPI;

import com.matcracker.MCPE_AddOnAPI.EntityComponents.EntityType;

public class EntityFamily {
	
	private EntityType type;
	
	public EntityFamily(EntityType type){
		this.type = type;
	}
		
	public boolean isUndead(){
		switch(this.type){
			case ZOMBIE:
			case ZOMBIE_PIGMAN:
			case HUSK:
			case SKELETON:
				return true;
			default:
				return false;
		}
	}
	
	public boolean isMonster(){
		if(isUndead())
			return true;
		
		return false;
	}
	
	public boolean isBad(){
		if(isMonster())
			return true;
		
		switch(type){
			//add more monster
			case GHAST:
				return true;
			default:
				return false;
		}
	}
}