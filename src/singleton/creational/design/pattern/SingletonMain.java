package singleton.creational.design.pattern;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonEnum enums = SingletonEnum.RED;
		SingletonEnum enums2 = SingletonEnum.RED;
		
		System.out.println(enums == enums2);
		
		
		Singleton s = Singleton.getInstance();

	}

}
