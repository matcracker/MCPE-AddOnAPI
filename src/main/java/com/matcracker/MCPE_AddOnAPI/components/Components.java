package com.matcracker.MCPE_AddOnAPI.components;

public class Components {
	public enum ComponentsType {
		IDENTIFIER,
		PROJECTILE,
		NAMEABLE,
		TYPE_FAMILY,
		COLLOSION_BOX,
		MOVEMENT,
		HEALTH,
		ATTACK,
		EQUIPMENT,
		FOLLOWRANGE,
		TELEPORT,
		TARGET_NEARBY_SENSOR
	}

	public enum BehaviourType {
		FLOAT,
		MELEE_ATTACK,
		PANIC,
		MOUNT_PATHING,
		BREED,
		TEMPT,
		FOLLOW_PARENT,
		RANDOM_STROLL,
		LOOK_AT_PLAYER,
		NEAREST_ATTACKABLE_TARGET,
		RANDOM_LOOK_AROUND

	}

	public enum ComponentsGroupsType {
		FAST, SLOW
	}
}
