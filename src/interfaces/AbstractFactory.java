package interfaces;

public interface AbstractFactory {

	public DrawShapes getShape(String shape);
	public OS getOs(String os);
}
