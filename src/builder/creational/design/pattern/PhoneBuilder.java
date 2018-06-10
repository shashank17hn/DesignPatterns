package builder.creational.design.pattern;

public class PhoneBuilder {
	
	private String processor;
	private String color;
	private String ram;
	private String size;
	
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setSize(String size) {
		this.size = size;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(processor, color, ram, size);
	}
	
	
	
	

}
