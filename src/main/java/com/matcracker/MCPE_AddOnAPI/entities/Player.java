
package com.matcracker.MCPE_AddOnAPI.entities;

public interface Player extends HumanEntity{

	public int getSaturation();

	public void setSaturation(int saturation);

	public int getExhaustion();

	public void setExhaustion(int exhaustion);

	public int getMaxExhaustion();

	public void setMaxExhaustion(int maxExhaustion);

	public int getLevel();

	public void setLevel(int level);

	public int getMaxLevel();

	public void setMaxLevel(int maxLevel);

	public float getExp();

	public void setExp(float exp);

	public float getMaxExp();

	public void setMaxExp(float maxExp);

}
