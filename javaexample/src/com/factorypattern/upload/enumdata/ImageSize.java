package com.factorypattern.upload.enumdata;

public enum ImageSize {
	SMALL("2x3"),
	MEDIUM("3x4"), 
	LARGE("4x6"), 
	UNLIMITTED("UNLIMITTED");
	
	private String description;
	
	private ImageSize(String description)
	{
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
}
