package stream_ex;

import java.util.Arrays;

public class StreamEx2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).filter(n -> n%2 == 0).sum();
		
		System.out.println(sum);
	}

}
