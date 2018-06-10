package singleton.creational.design.pattern;

// simple singleton approach

public class Singleton {
	
	
	//constructor
	private Singleton() {};
	// variable
	private  static Singleton instance;
	//
	public static Singleton getInstance() {
		if(instance == null)
		instance = new Singleton();
	   return instance;
	}

}
