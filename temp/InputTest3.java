package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 이름 : 강호동
 * 성별 : 남
 * 나이 : 23
 * 
 * 이름은 강호동입니다
 * 성별은 남자입니다
 * 나이는 23세입니다 
 * 
 */

public class InputTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		
		String name;
		char gender;
		int age;
		
		System.out.print("이름 : "); 
		name=br.readLine();
		
		System.out.print("성별 : "); 
		gender=br.readLine().charAt(0);
		
		System.out.print("나이 : "); 
		age=Integer.parseInt(br.readLine());
		
		System.out.println("이름은 "+name+"입니다");
		System.out.println("성별은 "+gender+"입니다");
		System.out.println("나이는 "+age+"입니다");
		

	}

}











