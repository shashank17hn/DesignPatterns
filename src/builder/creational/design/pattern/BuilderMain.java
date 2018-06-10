package builder.creational.design.pattern;

public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph = new PhoneBuilder().setColor("Blue").setProcessor("Quad Core").getPhone();
		System.out.println(ph);

	}

}
