package �ַ�;
import java.util.Scanner;
public class ��ϰ_Character {//ͨ��Scanner�ӿ���̨��ȡ�ַ�����Ȼ����ַ���ת��Ϊ�ַ�����

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a;//���ڴ���ַ���
		a=s.nextLine();
		char A[]=a.toCharArray();
		s.close();
		for(int i=0;i<A.length;i++) {
			if(Character.isUpperCase(A[i])) System.out.print(A[i]);
			if(Character.isDigit(A[i])) System.out.print(A[i]);
		}
	}
}
