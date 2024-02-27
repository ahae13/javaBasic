package stream_ex;

import java.util.Arrays;
import java.util.List;

public class StreamEx4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "orange");
		
		list.stream().forEach(n -> {
			String s = n.toUpperCase();
			System.out.print(s + "\t");
		});
		System.out.println();
		
		list.stream().map(s -> s.toUpperCase()).forEach(n -> System.out.print(n + "\t"));
	}

}
