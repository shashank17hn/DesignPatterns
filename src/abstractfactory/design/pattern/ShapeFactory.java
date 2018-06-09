package abstractfactory.design.pattern;

import interfaces.AbstractFactory;
import interfaces.DrawShapes;
import interfaces.OS;
import model.Cirle;
import model.Triangle;

public class ShapeFactory implements AbstractFactory{
	

	@Override
	public DrawShapes getShape(String shape) {
		if(shape.equals("triangle"))
			return new Triangle();
		else
			return new Cirle();
	}

	@Override
	public OS getOs(String os) {
		throw new UnsupportedOperationException();
	}

}
