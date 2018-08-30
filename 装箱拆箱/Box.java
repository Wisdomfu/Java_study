package 装箱拆箱;

public class Box {
	byte b = 2;
	short s = 3;
	float f = 1;
	double d = 4;
	int i = 9;

	// 自动装箱
	Byte y = b;
	Short h = s;
	Float l = f;
	Double o = d;
	//     Byte y1 = i;

	// 自动拆箱
	byte b1 = y;
	short s1 = h;
	float f1 = l;
	double d1 = o;

	// 通过Byte获取byte的最大值
	public static void main(String[] args) {
		System.out.println("Byte:\n"+Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE+"\n");
		
		System.out.println("Short:\n"+Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"\n");
		
		System.out.println("Float:\n"+Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"\n");
		
		System.out.println("Doulbe:\n"+Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"\n");
		
		System.out.println("Doulbe:\n"+Integer.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"\n");
	}
}
