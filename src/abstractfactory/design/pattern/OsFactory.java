package abstractfactory.design.pattern;

import interfaces.AbstractFactory;
import interfaces.DrawShapes;
import interfaces.OS;
import model.AndroidOS;
import model.IOS;
import model.WindowsOS;

public class OsFactory implements AbstractFactory {

	// here we create the object behind the scene 
	@Override
	public DrawShapes getShape(String shape) {
     	throw new UnsupportedOperationException();
	}

	@Override
	public OS getOs(String os) {
		if(os.equals("android"))
			return new AndroidOS();
		if(os.equals("ios"))
			return new IOS();
		else
			return new WindowsOS();
	}
}
