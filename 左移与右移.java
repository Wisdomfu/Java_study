
public class ���������� {
	public static void main(String[] args) {
		int a=7;
		int b=a<<1;
		int c=a>>1;
		System.out.println("a��"+"ʮ���ƣ�"+a+"�����ƣ�"+Integer.toBinaryString(a));
		System.out.println("a����һλ��"+Integer.toBinaryString(a<<1)+"  "+b);
		System.out.println("a����һλ��"+Integer.toBinaryString(a>>1)+"  "+c);
		System.out.println("�����ŵ����������ƣ�");
		a=-7;
		b=a<<1;
		c=a>>1;
		System.out.println("a��"+"ʮ���ƣ�"+a+"�����ƣ�"+Integer.toBinaryString(a));
		System.out.println("a����һλ��"+Integer.toBinaryString(a<<1)+"  "+b);
		System.out.println("a����һλ��"+Integer.toBinaryString(a>>1)+"  "+c);
	}

}
