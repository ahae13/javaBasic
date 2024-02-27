package stream_ex;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공");
		
		String name1 = list.stream().reduce("이순신", (s1, s2) -> (s1.length() - s2.length()) >= 0 ? s1 : s2);
		System.out.println(name1);
	}

}
