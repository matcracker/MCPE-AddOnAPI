package com.matcracker.MCPE_AddOnAPI.entities;

public class EntityCollisionBox extends Entity {
	private float height;
	private float width;

	public EntityCollisionBox(EntityType type) {
		super(type);
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getWidth() {
		return width;
	}

}
