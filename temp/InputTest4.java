package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 반지름을 입력하세요 : 5
 * 
 * 원의 넓이 : 78.5 <==(반*반*3.14)
 * 원의 둘레 : 31.4 <==(2*3.14*반)
 * 
 */
public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		
		int r;
//		double size;
		double rnd;
		
		System.out.print("반지름을 입력하세요 : ");
		r=Integer.parseInt(br.readLine());
		
		double size=3.14*r*r;
		rnd=2*3.14*r;
		
		System.out.printf("원의 넓이 : %.1f\n", size);
		System.out.printf("원의 둘레 : %.1f\n", rnd);
	}

}























