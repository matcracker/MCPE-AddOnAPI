package com.matcracker.MCPE_AddOnAPI;

import com.matcracker.MCPE_AddOnAPI.entities.Entity;

public class AddOnAPI {
	private String formatVersion = "0.1";

	public AddOnAPI getInstance() {
		return this;
	}

	public String getFormatVersion() {
		return formatVersion;
	}
	
	public void createEntity(Entity entity){
		//@TODO JSON Parser from object to file
	}

}
