
public class 位或and位与 {
	public static void main(String[] args) {
		int a=5;
		int b=17;
		int c=a|b;
		int d=a&b;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println("位或："+Integer.toBinaryString(c));
		System.out.println("位与："+Integer.toBinaryString(d));
		System.out.println(c);
	}

}
