package model;

public class Model1 extends Model{
	/* Model1 extends Model abstract class */
	String modelName; // model name
	int modelNumber; // model number
	
	// default contructor
	public Model1(){
		this.modelName = "";
		this.modelNumber = 0;
	}
	
	// parameterized contructor
	public Model1(int number, String name){
		this.modelName = name;
		this.modelNumber = number;
	}
	
	// implements abtract method setModel
	public void setModel(int number, String name){
		this.modelName = name;
		this.modelNumber = number;
	}
	
	// implements abtract method getModel
	public Model getModel(){
		return this;
	}
	
	// implements abtract method printModel
	public void printModel(){
		System.out.println("Model number : "+ this.modelNumber);
		System.out.println("Model name : "+ this.modelName);
	}
}
