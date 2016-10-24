package com.matcracker.MCPE_AddOnAPI.sounds;

public enum Sound {
	MILK("milk");
	
	private String soundName;
	
	private Sound(String soundName){
		this.soundName = soundName;
	}
	
	public String getSoundName(){
		return soundName;
	}
}
