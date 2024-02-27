package static_ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\dev\\eclipse-java-2023-12\\ws\\basic\\src\\static_ex\\file.txt"));
		
		String s = sc.nextLine();
		System.out.println(s);
		s = sc.nextLine();
		System.out.println(s);
	}

}
