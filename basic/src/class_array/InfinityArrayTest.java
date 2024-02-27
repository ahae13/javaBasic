package class_array;

public class InfinityArrayTest {

	public static void main(String[] args) {
		
		InfinityArray ia = new InfinityArray();
		
		ia.add(1);
		ia.add(2);
		ia.add(3);
		ia.add(4);
		ia.add(5);
		ia.add(6); // 저장가능?
		
		for(int i = 0; i < ia.length(); i++) {
			System.out.print(ia.get(i) + " ");
		}
		System.out.println();
		System.out.println("삭제전 : " + ia.length());
		ia.remove(3);
		System.out.println("삭제후 : " +ia.length());
		
		
	}

}
