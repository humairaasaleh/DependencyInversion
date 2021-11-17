package com.qa.dependencyinversion;

public class Runner {
	
	public static void main(String[] args) {
		Project p = new Project();
		BackendDeveloper bd = new BackendDeveloper();
		FrontendDeveloper fd = new FrontendDeveloper();
		
		p.dev(fd);
		p.dev(bd);
		
	}

}
