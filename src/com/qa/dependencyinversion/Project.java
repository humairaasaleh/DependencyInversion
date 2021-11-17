package com.qa.dependencyinversion;

public class Project {
	private String developer;

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public void dev(Developer d) {
		d.chooseDeveloperType();
	}

}
