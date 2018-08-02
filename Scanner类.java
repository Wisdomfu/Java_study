import java.util.Scanner;
public class Scanner类 {
	public static void main(String[] args) {
		int a;
		Scanner S=new Scanner(System.in);
		a=S.nextInt();
		String x;
		x=S.nextLine();//取数后取字符串，要用一个nextLine取掉“回车”；
		x=S.nextLine();
		System.out.println("x="+x);
		System.out.println("a="+a);
		S.close();
	}

}
