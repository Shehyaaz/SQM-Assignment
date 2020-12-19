package service;

public class Service2{
	/* This class does not implement the Service interface */
	
	String serviceName;
	double serviceTime;
	double maxTime;
	
	// prints Service name
	void printServiceName(){
		System.out.println("Service name : "+this.serviceName);
	}
	
	// prints service time
	void printServiceTime(){
		System.out.println("Service time : "+this.serviceTime);
	}
	
	// prints max time information
	void printMaxTime(){
		if(this.maxTime == 0)
			System.out.println("Zero max time alloted");
		else if(this.maxTime > 0 && this.maxTime <= 10)
			System.out.println("Max time between 1 and 10 time intervals");
		else
			System.out.println("Max time more than 10 time intervals");
	}
}
