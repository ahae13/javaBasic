package basic;

public class UnitTest {

	public static void main(String[] args) {
		UnitA unitA = new UnitA(100, "테란", 1);
		UnitB unitB = new UnitB(50, "저그", 1);
		
		unitA.attack(unitB);
		System.out.println(unitA);
		System.out.println(unitB);
	}

}
