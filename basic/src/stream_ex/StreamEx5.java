package stream_ex;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEx5 {

	public static void main(String[] args) {
		int sum = IntStream.of(1, 3, 5, 7, 9).sum();
		System.out.println("sum : " + sum);
		
		int[] arr = {1, 2, 3, 4, 5};
		sum = Arrays.stream(arr).sum();
		System.out.println("sum : " + sum);
		
		Arrays.stream(arr).min().ifPresent(n -> System.out.println("min : " + n));
		Arrays.stream(arr).max().ifPresent(n -> System.out.println("max : " + n));
		
	}

}
