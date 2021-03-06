package model;

/* abtract class which defines a model*/
public abstract class Model{
	
	// prints model information
	public abstract void printModel();
	
	// sets model information
	public abstract void setModel(int number, String name);
	
	// returns a model object
	public abstract Model getModel();
}
