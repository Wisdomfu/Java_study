package 字符;
import java.util.Scanner;
public class 练习_Character {//通过Scanner从控制台读取字符串，然后把字符串转换为字符数组

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a;//用于存放字符串
		a=s.nextLine();
		char A[]=a.toCharArray();
		s.close();
		for(int i=0;i<A.length;i++) {
			if(Character.isUpperCase(A[i])) System.out.print(A[i]);
			if(Character.isDigit(A[i])) System.out.print(A[i]);
		}
	}
}
