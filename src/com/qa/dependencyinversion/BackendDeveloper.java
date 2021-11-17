package com.qa.dependencyinversion;

public class BackendDeveloper implements Developer {

	@Override
	public void chooseDeveloperType() {
		writeJavaScript();
	}

	private void writeJavaScript() {
		System.out.println("C# is just Microsoft Java anyway. ");
	}

}
