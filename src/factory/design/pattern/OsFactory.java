package factory.design.pattern;

import interfaces.OS;
import model.AndroidOS;
import model.IOS;
import model.WindowsOS;

public class OsFactory {

	// here we create the object behind the scene 
	public OS getInstance(String os) {
		if(os.equals("android"))
			return new AndroidOS();
		if(os.equals("ios"))
			return new IOS();
		else
			return new WindowsOS();
	}
}
