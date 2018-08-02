
public class 三元操作符 {//表达式？值1:值2   如果表达式为真 返回值1  如果表达式为假 返回值2
	public static void main(String[] args) {
		int a=1;
		a=a++;
		boolean b;
		b=a==a++;
		System.out.println(b);
		System.out.println(a);
		a=a==a++?3:4;
		System.out.println(a);
		
	}
}
