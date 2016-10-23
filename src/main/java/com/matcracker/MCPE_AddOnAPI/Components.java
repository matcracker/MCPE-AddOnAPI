package com.matcracker.MCPE_AddOnAPI;

public class Components {
	public enum ComponentsType{
		IDENTIFIER,
		NAMEABLE,
		TYPE_FAMILY,
		COLLOSION_BOX,
		MOVEMENT,
		HEALTH,
		ATTACK,
		EQUIPMENT,
		FOLLOWRANGE,
		TARGET_NEARBY_SENSOR
	}
	
	public enum BehaviourType{
		FLOAT,
		MELEE_ATTACK,
		NEAREST_ATTACKABLE_TARGET,
		RANDOM_LOOK_AROUND
		
	}
	
	public enum ComponentsGroupsType{
		FAST,
		SLOW
	}
}
