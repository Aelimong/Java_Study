package step01_기초;


/*각각 변수응 만등고 값을 대입하여
 * 결과를 출력하세요(이름, 성별, 입사점수)
 
 * 출력 ---
 * 내 이름은 강호동이며 성별은 남자이고
 * 입사성적은 85.35점입니다
 * 
 */


public class Test1 {

	public static void main(String[] args) {
         String name="강호동";
         char gender='남';
         double score=85.35;		
		
		
		
		System.out.println("내 이름은 "+name+"이며 " +
		                   "성별은 "+gender+"자이고\n" +
		                   "입사성적은 "+score+"점입니다");

	}

}
