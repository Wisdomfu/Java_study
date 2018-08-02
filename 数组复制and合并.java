

public class 数组复制and合并 {//System.arraycopy(源数组, 从源数组复制数据的起始位置, 目标数组, 复制到目标数组的起始位置, 复制的长度)
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};System.out.println("a:");
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		int[] b= {0,0,0,0,0,0,0,0,0,0};
		System.out.println();System.out.println("b:");
		for(int i=0;i<b.length;i++) System.out.print(" "+b[i]);
		System.arraycopy(a, 3, b, 3, 5);//数组复制
		System.out.println("\n"+"复制后的b：");
		for(int i=0;i<b.length;i++) System.out.print(" "+b[i]);
		for(int it:b) System.out.print(" "+it);
		int[] c;
		c=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);//数组a和b的合并
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("\n"+"a,b合并：");
		for(int i=0;i<c.length;i++) System.out.print(" "+c[i]);
	}
}
