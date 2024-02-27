package basic;

public class ConstrouctorTest {

	public static void main(String[] args) {
		A a = new A("홍길동");
		A b = new A("임꺽정", 43);
		
		System.out.println(a);
		System.out.println(b);
	}

}
