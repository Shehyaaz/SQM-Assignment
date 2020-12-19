package user_interface;

import service.Service;

public class Application implements Service{
	/* This class displays the application */
	
	String appName;
	Screen screen;
	
	// parameterized constructor
	public Application(String appName, String screenTitle, int theme){
		this.appName = appName;
		this.screen = new Screen(screenTitle, theme);
	}
	
	// build the application
	public void buildApp(String widgetName1, String widgetName2, String serviceName){
		this.screen.buildScreen(widgetName1, widgetName2, serviceName);
	}
	
	// show the application
	public void showApp(){
		System.out.println("App Name : "+this.appName);
		this.screen.showScreen();
	}
	
	public void runService(){
		System.out.println("Running Service....");
	}
}
