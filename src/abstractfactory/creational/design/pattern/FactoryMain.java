package abstractfactory.creational.design.pattern;

import interfaces.AbstractFactory;
import interfaces.OS;

/*
this is the main method here you just have to give what type of os you want. no need to pass object. This is kind of client interface
in future if requiements grows we wont change this class we will just modify os factory class and add respective class if needed.*/

public class FactoryMain {

	public static void main(String[] args) {
		
		FactoryProvider fp = new FactoryProvider();
		AbstractFactory af = fp.getFatory("triangle");
        af.getShape("circle").getDetails();
	}

}
