package step01_기초;
/* 
 * 각각 변수에 대입하여 출력 하세요 
 * --결과
 * 이름 : 이순신 	<--  println()
 * 나이 : 25세 	<-- print()
 * 부서 : 개발부
 * 성적 : 87.5점	<-- printf() 부서 성적 한번에 출력 
 */
public class Test4 {

	public static void main(String[] args) {
		String a="이순신";
		int b=25;
		String c="개발부";
		float d=87.5f;
		
		System.out.println("이름 : "+a);
		System.out.print("나이 : "+b+"세\n");
		System.out.printf("부서 : %s\n성적 : %.1f점\n", c, d);
		
		
		
		
		
		
	}

}








