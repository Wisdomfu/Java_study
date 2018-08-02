
public class 左移与右移 {
	public static void main(String[] args) {
		int a=7;
		int b=a<<1;
		int c=a>>1;
		System.out.println("a："+"十进制："+a+"二进制："+Integer.toBinaryString(a));
		System.out.println("a左移一位："+Integer.toBinaryString(a<<1)+"  "+b);
		System.out.println("a右移一位："+Integer.toBinaryString(a>>1)+"  "+c);
		System.out.println("带符号的左移与右移：");
		a=-7;
		b=a<<1;
		c=a>>1;
		System.out.println("a："+"十进制："+a+"二进制："+Integer.toBinaryString(a));
		System.out.println("a左移一位："+Integer.toBinaryString(a<<1)+"  "+b);
		System.out.println("a右移一位："+Integer.toBinaryString(a>>1)+"  "+c);
	}

}
