package model;

/* Model1 extends Model abstract class */
public class Model1 extends Model{
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
	@Override
	public void setModel(int number, String name){
		this.modelName = name;
		this.modelNumber = number;
	}
	
	// implements abtract method getModel
	@Override
	public Model getModel(){
		return this;
	}
	
	// implements abtract method printModel
	@Override
	public void printModel(){
		System.out.println("Model number : "+ this.modelNumber);
		System.out.println("Model name : "+ this.modelName);
	}
}
