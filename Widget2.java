package widget;

import service.Service1;

public class Widget2 extends Widget1{
	/* This class extends Widget1 class */
	
	String widgetName, parentName, serviceName;
	
	// override buildWidget method
	public void buildWidget(String widgetName, String parentName, String serviceName){
		super.buildWidget(widgetName, parentName);
		this.serviceName = serviceName;
	}
	
	// override showWidget method
	public void showWidget(){
		super.showWidget();
		Service1 service1 = new Service1(this.serviceName);
		service1.runService();
	}

}
