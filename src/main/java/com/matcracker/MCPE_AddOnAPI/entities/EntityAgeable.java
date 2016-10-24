package com.matcracker.MCPE_AddOnAPI.entities;

import java.util.HashMap;

public class EntityAgeable extends Entity {

	protected long duration;
	/**
	 * String -> item name 
	 * Float -> growth
	 */
	protected HashMap<String, Float> feedItems;
	protected boolean baby;
	
	public EntityAgeable(EntityType type) {
		super(type);
	}
	
	public boolean isAgeable() {
		switch (getType()) {
			case COW:
				return true;
			default:
				return false;
		}
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public HashMap<String, Float> getFeedItems() {
		return feedItems;
	}

	public void setFeedItems(HashMap<String, Float> feedItems) {
		this.feedItems = feedItems;
	}

	public boolean isBaby() {
		return baby;
	}

	public void setBaby(boolean baby) {
		this.baby = baby;
	}

}
