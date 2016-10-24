package com.matcracker.MCPE_AddOnAPI.entities;

import java.util.ArrayList;
import java.util.List;

public class EntityFamily {

	private EntityType type;

	public EntityFamily(EntityType type) {
		this.type = type;
	}

	public boolean isUndead() {
		switch (this.type) {
			case ZOMBIE:
			case ZOMBIE_PIGMAN:
			case HUSK:
			case SKELETON:
				return true;
			default:
				return false;
		}
	}

	public boolean isMonster() {
		if (isUndead())
			return true;

		switch (type) {
			case CREEPER:
				return true;
			default:
				return false;
		}
	}

	public boolean isBad() {
		if (isMonster())
			return true;

		switch (type) {
			// add more monster
			case GHAST:
				return true;
			default:
				return false;
		}
	}

	public String[] getFamilyNames() {
		List<String> family = new ArrayList<String>();

		family.add(type.toString().toLowerCase());
		if(isUndead())
			family.add("undead");
		if(isMonster())
			family.add("monster");
		if(isBad())
			family.add("bad");

		String[] famArray = new String[family.size()];
		famArray = family.toArray(famArray);

		return famArray;
	}
}
