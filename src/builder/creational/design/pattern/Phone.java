package builder.creational.design.pattern;

public class Phone {
	
	private String processor;
	private String color;
	private String ram;
	private String size;
	
	public Phone(String processor, String color, String ram, String size) {
		super();
		this.processor = processor;
		this.color = color;
		this.ram = ram;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Phone [processor=" + processor + ", color=" + color + ", ram=" + ram + ", size=" + size + "]";
	}
	
	
	

}
