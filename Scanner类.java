import java.util.Scanner;
public class Scanner�� {
	public static void main(String[] args) {
		int a;
		Scanner S=new Scanner(System.in);
		a=S.nextInt();
		String x;
		x=S.nextLine();//ȡ����ȡ�ַ�����Ҫ��һ��nextLineȡ�����س�����
		x=S.nextLine();
		System.out.println("x="+x);
		System.out.println("a="+a);
		S.close();
	}

}
