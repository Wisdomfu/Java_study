
public class 数组排序_选择法and冒泡法 {
	public static void main(String[] args) {
		int[] a=new int[10];//数组初始化
		System.out.println("获取随机数：");
		for(int i=0;i<10;i++) {//数组获取随机数
			a[i]=randomnum();
			System.out.print(" "+a[i]);
		}
		int[] b=a;
		System.out.println();
		System.out.println("选择法排序：");
		selection(a);//选择法排序（递增）
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		System.out.println();
		System.out.println("冒泡法排序：");
		bubble(b);//冒泡法排序（递增）
		for(int i=0;i<a.length;i++)
			System.out.print(" "+b[i]);
	}
	
	public static int randomnum() {//获取随机两位整数方法
		return (int)(Math.random()*100);
	}
	
	public static void selection(int[] a) {//选择排序法
		for(int j=0;j<a.length;j++) {
			for(int k=j;k<a.length;k++) {
				int temp;
				if(a[j]>a[k]) {
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
	}
	
	public static void bubble(int[] a) {//冒泡排序法
		for(int j=0;j<a.length;j++) {
			for(int k=0;k<a.length-1;k++) {
				int temp;
				if(a[k]>a[k+1]) {
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
	}
}
