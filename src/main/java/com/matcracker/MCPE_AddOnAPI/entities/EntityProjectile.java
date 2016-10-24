package com.matcracker.MCPE_AddOnAPI.entities;

public class EntityProjectile {
	EntityType type;
	
	private Entity entity;
	private boolean knockback = true;
	private int damage = 1;
	private float power = 1F;
	private float gravity = 0.05F;
	private int anchor = 1;
	private float[] offset;
	
	public EntityProjectile(Entity entity){
		this.entity = entity;
		this.type = entity.getType();
	}
	
	public Entity getEntity(){
		return entity;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public boolean isKnockback() {
		return knockback;
	}

	public void setKnockback(boolean knockback) {
		this.knockback = knockback;
	}

	public float getGravity() {
		return gravity;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}

	public float[] getOffset() {
		return offset;
	}

	public void setOffset(float[] offset) {
		this.offset = offset;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	public int getAnchor() {
		return anchor;
	}

	public void setAnchor(int anchor) {
		this.anchor = anchor;
	}
	
}
