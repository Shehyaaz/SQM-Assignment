/*
* Main class to execute the application.
*/
package main;

import user_interface.Application;

public class Main{
	// main method to execute the application
	public static void main(String args[]){
		// create a new application
		Application app = new Application("My App", "First Screen", 0);
		// build the application
		app.buildApp("Widget 1", "Widget 2", "My Service");
		// show the application
		app.showApp();
	}
}
