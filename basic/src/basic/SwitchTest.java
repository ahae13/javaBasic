package basic;

public class SwitchTest {

	public static void main(String[] args) {
		
		int score = 54;
		char grade;
		
		switch(score/10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		String result = (grade != 'F')? "좋아요": "싫어요";
		
		System.out.println(grade);
		System.out.println(result);
	}

}
