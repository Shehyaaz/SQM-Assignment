package service;

import model.Model1;

/* This class implements the Service interface */
public class Service1 implements Service{
	String serviceName;
	
	// parameterized constructor
	public Service1(String name){
		this.serviceName = name;
	}
	
	// override runService method
	@Override
	public void runService(){
		Model1 model1 = new Model1(1, "My model");
		System.out.println("Running service : "+this.serviceName);
		System.out.println("Model used :");
		model1.printModel();
	}
}
