package com.qa.dependencyinversion;

public class FrontendDeveloper implements Developer {

	@Override
	public void chooseDeveloperType() {
		writeJavaScript();
	}

	private void writeJavaScript() {
		System.out.println("JavaScript is used everywhere anyway.");
	}
}
