package widget;

public abstract class Widget{
	/* This class provides the general structure of a widget */
	
	String widgetName;
	String parentName;
	
	// build the widget
	public abstract void buildWidget(String widgetName, String parentName);
	
	// display the widget
	public abstract void showWidget();
}
