package com.matcracker.MCPE_AddOnAPI.entities;

public class Player extends EntityDamageable{
	private int saturation;
	private int exhaustion;
	private int maxExhaustion;
	private int level;
	private int maxLevel;
	private float exp;
	private float maxExp;

	public Player(EntityType type) {
		super(type);
	}

	public int getSaturation() {
		return saturation;
	}

	public void setSaturation(int saturation) {
		this.saturation = saturation;
	}

	public int getExhaustion() {
		return exhaustion;
	}

	public void setExhaustion(int exhaustion) {
		this.exhaustion = exhaustion;
	}

	public int getMaxExhaustion() {
		return maxExhaustion;
	}

	public void setMaxExhaustion(int maxExhaustion) {
		this.maxExhaustion = maxExhaustion;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	public float getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(float maxExp) {
		this.maxExp = maxExp;
	}

}
