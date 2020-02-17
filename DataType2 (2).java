package step01_기초;
// System.out.printf("메시지 or 제어문자", 변수1, 변수2, ...); 

/* 제어문자 
 * %s : String 문자열, char
 * %c : char 문자 1개
 * %f : float, double 실수
 * %d : int byte 정수
 */

public class DataType2 {

	public static void main(String[] args) {
		String name="홍길동";
		char gender='남';
		double score=85.3000000;
		int age=25;
		double tall=183.4;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %c\n", gender);
		System.out.printf("점수 : %-10.1f\n", score);
		System.out.printf("나이 : %10d\n", age);
		System.out.printf("신장 : %.1f\n", tall);
		System.out.println("-----------------");
		System.out.println("점수 : "+String.format("%-10.1f", score));
		
		
	}

}


















