

public class ���鸴��and�ϲ� {//System.arraycopy(Դ����, ��Դ���鸴�����ݵ���ʼλ��, Ŀ������, ���Ƶ�Ŀ���������ʼλ��, ���Ƶĳ���)
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};System.out.println("a:");
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		int[] b= {0,0,0,0,0,0,0,0,0,0};
		System.out.println();System.out.println("b:");
		for(int i=0;i<b.length;i++) System.out.print(" "+b[i]);
		System.arraycopy(a, 3, b, 3, 5);//���鸴��
		System.out.println("\n"+"���ƺ��b��");
		for(int i=0;i<b.length;i++) System.out.print(" "+b[i]);
		for(int it:b) System.out.print(" "+it);
		int[] c;
		c=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);//����a��b�ĺϲ�
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("\n"+"a,b�ϲ���");
		for(int i=0;i<c.length;i++) System.out.print(" "+c[i]);
	}
}
