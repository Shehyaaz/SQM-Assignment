package user_interface;

import widget.Widget1;
import widget.Widget2;

// an enumeration of application themes
enum AppTheme{
	LightTheme, DarkTheme
}

/* This class contains methods to build and display a screen  */
public class Screen{
	
	String screenTitle; // screen title
	Widget1 widget1;
	Widget2 widget2; // screen widgets
	AppTheme theme;
	
	// parameterized constructor
	public Screen(String title, int theme){
		this.screenTitle = title;
		this.widget1 = new Widget1();
		this.widget2 = new Widget2();
		if(theme == 0)
			this.theme = AppTheme.LightTheme;
		else
			this.theme = AppTheme.DarkTheme;
	}
	
	public void buildScreen(String widgetName1, String widgetName2, String serviceName){
		this.widget1.buildWidget(widgetName1,"");
		this.widget2.buildWidget(widgetName2,"", serviceName);
	}
	
	public void showScreen(){
		System.out.println("Screen title :" + this.screenTitle);
		if(theme == AppTheme.LightTheme)
			System.out.println("Screen theme is light");
		else
			System.out.println("Screen theme is dark");
		this.widget1.showWidget();
		this.widget2.showWidget();
	}
}
