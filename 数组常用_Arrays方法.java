import java.util.Arrays;
public class 数组常用_Arrays方法 {
	public static void main(String[] args) {
		
		//拷贝数组：Array.copyOfRange(int[] original, int from, int to)
		System.out.println("数组拷贝：");
		int a[]=new int[] {1,2,3,4,5,6};
		// copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
		int b[]=Arrays.copyOfRange(a, 0, 3);//所以实际上是复制0号到2号元素
		for(int i=0;i<b.length;i++) {
			System.out.print(" "+b[i]);
		}
		
		//Arrays.toString(a[])转换为字符串（不用循环，方便输出观察）
		System.out.println("\n\na[]——>String:");
		String m=Arrays.toString(a);
		System.out.println(m);
		
		//Arrays.sort(a[])：排序
		int[] c=new int[] {5,6,4,7,3,8};
		System.out.println("\n排序：\n"+Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		//Arrays.binarySearch(a[],number):搜索位置（搜索前必须先使用sort排序）
		int d[]=new int[] {3,4,2,5,1,6};
		System.out.println("\n搜索："+Arrays.toString(d));
		Arrays.sort(d);//必须先sort排序
		int p=Arrays.binarySearch(d, 5);
		System.out.println("5的位置为："+p);
		
		//Arrays.equals(a,b)判断数组是否相同
		int[] e=new int[] {1,2,3,4,5,6};
		int[] f=new int[] {1,2,3,4,5,0};
		System.out.println("\n判断是否相同：\n"+Arrays.equals(e, f));
		
		//Arrays.fill(a,number)：用一个元素填充数组
		int[] g=new int[10];
		Arrays.fill(g, 6);
		System.out.println("\n填充：\n"+Arrays.toString(g));
		
		//练习：二维数组排序
		System.out.println("\n练习：5X8二维数组排序");
		int[][]o=new int[5][8];
		int[]O=new int[40];
		System.out.println("获取二维随机数组：");
		for(int j=0;j<o.length;j++) {//获取二维随机数组
			for(int k=0;k<o[0].length;k++) {
				o[j][k]=randomnum();
				System.out.print(" "+o[j][k]);
			}System.out.println();
		}
		for(int j=0;j<o.length;j++) {
			System.arraycopy(o[j], 0, O, j*8, 8);//一维一维地拷贝到一维数组O
		}System.out.println("获取随机数填充二维数组拷贝到一维数组：\n"+Arrays.toString(O));
		Arrays.sort(O);
		System.out.println("排序后：\n"+Arrays.toString(O));
		for(int j=0;j<o.length;j++) {//反向拷贝回二维数组
			System.arraycopy(O, j*8, o[j], 0, 8);//一维一维地拷贝到一维数组O
		}System.out.println("反向拷贝回二维数组：");
		for(int j=0;j<o.length;j++) {//输出排序后地二维随机数组
			for(int k=0;k<o[0].length;k++) {
				System.out.print(" "+o[j][k]);
			}System.out.println();
		}
	}
	public static int randomnum() {//获取随机数
		return (int)(Math.random()*100);
	}
}
