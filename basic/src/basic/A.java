package basic;

public class A {

	private String name;
	private int age;
	
	
	public A(String name) {
		this.name = name;
	}
	
	public A(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
