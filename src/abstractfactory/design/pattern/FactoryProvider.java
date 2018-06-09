package abstractfactory.design.pattern;

import factory.design.pattern.OsFactory;
import interfaces.AbstractFactory;

public class FactoryProvider {
	
	public AbstractFactory getFatory(String str) {
		
		if(str.equals("triangle"))
			return new ShapeFactory();
		else
			return (AbstractFactory) new OsFactory();
	}
}
