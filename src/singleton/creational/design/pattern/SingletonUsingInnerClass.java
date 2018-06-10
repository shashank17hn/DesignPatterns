package singleton.creational.design.pattern;


// using inner class
public class SingletonUsingInnerClass {

	private SingletonUsingInnerClass() {}
	
	// inner class
	private static class InnerClass{
		public static final SingletonUsingInnerClass instance = new SingletonUsingInnerClass();
	}
	
	public static SingletonUsingInnerClass getInstance() {
		return new InnerClass().instance;
	}
	
	
}
