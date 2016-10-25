package com.matcracker.MCPE_AddOnAPI.entities;

import java.util.ArrayList;
import java.util.List;

public class EntityFamily {

	private Entity entity;

	public EntityFamily(Entity entity) {
		this.entity = entity;
	}
	
	public Entity getEntity(){
		return entity;
	}

	public boolean isUndead() {
		switch (getEntity().getEntityType()) {
			case ZOMBIE:
			case ZOMBIE_PIGMAN:
			case ZOMBIE_HUSK:
			case SKELETON:
				return true;
			default:
				return false;
		}
	}

	public boolean isMonster() {
		if (isUndead() || getEntity() instanceof Monster)
			return true;
		
		return false;
	}

	public boolean isBad() {
		if (isMonster())
			return true;

		switch (getEntity().getEntityType()) {
			// add more monster
			case GHAST:
				return true;
			default:
				return false;
		}
	}

	public String[] getFamilyNames() {
		List<String> family = new ArrayList<String>();

		family.add(getEntity().getEntityType().getIdentifier());
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
