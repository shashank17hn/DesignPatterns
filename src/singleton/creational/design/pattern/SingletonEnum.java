package singleton.creational.design.pattern;

public enum SingletonEnum {
	
	RED(1), BLUE(2), GREEN(3);
	
	private int code;
	
	private SingletonEnum(int code) {
		this.code = code;
	}
	
	@Override
	public String toString(){
		
		return String.valueOf(this.code);
	}

}
