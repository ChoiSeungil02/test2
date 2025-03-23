package test2;

public class Hello {
	String message;

	public String say() {
		return message; 
	}

	public Hello() {
		this("안녕하세요");
	}
	public Hello(String message) {
		this.message = message;
	}

}
