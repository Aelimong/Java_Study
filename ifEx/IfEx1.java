package ifEx;

public class IfEx1 {

	public static void main(String[] args) {

//		if~else~if문----------------------------
//		int score=95;
//		char grade;
//		
//		if(score>=90)	grade='A';
//		else if(score>=80)	grade='B';
//		else if(score>=70)	grade='C';
//		else if(score>=60)	grade='D';
//		else	grade='F';
//		
//		System.out.println("점수는 "+score+"점이고 학점은 "+grade+"입니다");
		
		int score=95;
		char grade='\0';
		
		if(score>=90 && score<=100) grade='A';
		if(score>=80 && score<90) grade='B';
		if(score>=70 && score<80) grade='C';
		if(score>=60 && score<70) grade='D';
		if(score>=0 && score<60) grade='F';
		
		System.out.println("점수는 "+score+"점이고 학점은 "+grade+"입니다");
		
		
	
//		if~else문----------------------------------
//		int score=45;
//		
//		if(score>=60) {
//			System.out.println("합격");
//			System.out.println("점수는 "+score+"점입니다");
//		}else {
//			System.out.println("불합격");
//			System.out.println("점수는 "+score+"점이며 다음 기회에...");
//		}
		
		
		
//		if문 --------------------------------------
//		String str="korea";
//		
//		if(str=="korea") {
//			System.out.println("대한민국");
//		}
//		
//		System.out.println("******");
//


	}
}






