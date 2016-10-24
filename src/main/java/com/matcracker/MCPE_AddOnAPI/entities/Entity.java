package com.matcracker.MCPE_AddOnAPI.entities;

public class Entity {
	/*
	 * @TODO List - Check almost all "set" method if can be > 0 - Add more
	 * entities - Add documentation
	 */
	private EntityType type;

	private float movement = 0.25F;
	private float maxMovement = 0.5F;
	private EntityFamily fam = new EntityFamily(getType());
	
	public EntityFamily getFamily(){
		return fam;
	}
	
	public Entity(EntityType type) {
		this.type = type;
	}

	public void setType(EntityType type) {
		this.type = type;
	}

	public EntityType getType() {
		return type;
	}

	public String getIdentifier() {
		return type.getIdentifier();
	}

	public void setMovement(float movement) {
		this.movement = movement;
	}

	public float getMovement() {
		return movement;
	}

	public void setMaxMovement(float maxMovement) {
		this.maxMovement = maxMovement;
	}

	public float getMaxMovement() {
		return maxMovement;
	}

	public boolean isProjectile() {
		switch (type) {
			case ARROW:
			case FIREBALL:
			case FIREBALL_SMALL:
				return true;
			default:
				return false;
		}
	}

}
