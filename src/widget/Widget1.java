package widget;

import model.Model;
import model.Model1;

/* This class extends the abstract Widget class */
public class Widget1 extends Widget{
	
	String widgetName;
	String parentName;
	Model model1;
	
	// The widget is built using a widget name and a parent name
	// implement buildWidget from Widget class
	@Override
	public void buildWidget(String widgetName, String parentName){
		System.out.println("Building the widget");
		this.widgetName = widgetName;
		this.parentName = parentName;
	}
	
	// implement showWidget from Widget class
	@Override
	public void showWidget(){
		if(this.parentName != "")
			System.out.println("Parent Widget : "+this.parentName+" -> Widget : "+this.widgetName);
		else
			System.out.println("Widget : "+this.widgetName);
	}
	
	public void createModel(int modelNumber, String modelName){
		this.model1 = new Model1(modelNumber, modelName);
	}
}
