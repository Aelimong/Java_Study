package step01_����;
// System.out.printf("�޽��� or �����", ����1, ����2, ...); 

/* ����� 
 * %s : String ���ڿ�, char
 * %c : char ���� 1��
 * %f : float, double �Ǽ�
 * %d : int byte ����
 */

public class DataType2 {

	public static void main(String[] args) {
		String name="ȫ�浿";
		char gender='��';
		double score=85.3000000;
		int age=25;
		double tall=183.4;
		
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %c\n", gender);
		System.out.printf("���� : %-10.1f\n", score);
		System.out.printf("���� : %10d\n", age);
		System.out.printf("���� : %.1f\n", tall);
		System.out.println("-----------------");
		System.out.println("���� : "+String.format("%-10.1f", score));
		
		
	}

}

















