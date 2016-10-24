package com.matcracker.MCPE_AddOnAPI.entities;

public class EntityAge {
	protected Entity entity;
	protected long duration;
	protected String[] feedItems; //Array or not?
	protected boolean baby;
	
	public EntityAge(Entity entity){
		this.entity = entity;
	}
	
	public EntityAge(Entity entity, long duration, String[] feedItems){
		this.entity = entity;
		if(isAgeable()){
			this.duration = duration;
			this.feedItems = feedItems;
		}
	}
	
	public boolean isAgeable(){
		switch (entity.getType()) {
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

	public String[] getFeedItems() {
		return feedItems;
	}

	public void setFeedItems(String[] feedItems) {
		this.feedItems = feedItems;
	}

	public boolean isBaby() {
		return baby;
	}

	public void setBaby(boolean baby) {
		this.baby = baby;
	}

	public Entity getEntity() {
		return entity;
	}	
	
}
