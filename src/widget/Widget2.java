package widget;

import service.Service1;

/* This class extends Widget1 class */
public class Widget2 extends Widget1{
	
	String widgetName, parentName, serviceName;
	
	// override buildWidget method from Widget1
	public void buildWidget(String widgetName, String parentName, String serviceName){
		super.buildWidget(widgetName, parentName);
		this.serviceName = serviceName;
	}
	
	// override showWidget method from Widget1
	public void showWidget(){
		super.showWidget();
		Service1 service1 = new Service1(this.serviceName);
		service1.runService();
	}

}
