
public class 二维数组 {
	public static void main(String[] args) {
		//初始化二维数组
		int[][] a=new int[2][3];//有两个一维数组，每个一维数组长度是3
		a[1][2]=5;//可以访问一维数组，因为已经分配了空间
		
		//只分配二位数组
		int[][] b=new int[2][];//只有两个一维数组，每个一维数组长度暂未分配
		b[0]=new int [3];//必须事先分配长度，因为已经分配了时间
		b[1]=new int[4];
		b[0][2]=1;
		
		//指定内容的同时，分配空间
		int[][] c=new int[][] {
			{1,2},{3,4},{5,6,7}
		};
		c[2][1]=0;
		System.out.println(c[2][0]+c[2][1]+c[2][2]);
		
		//练习：定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
		//找出这个二维数组里，最大的那个值，并打印出其二维坐标
		int[][] d=new int[5][5];
		//System.out.println(d.length);
		for(int j=0;j<d.length;j++) {
			for(int k=0;k<d[0].length;k++) {
				d[j][k]=randomnum();
			}
		}
		show(d);
		findmax(d);
	}
	
	public static int randomnum() {//获取随机数
		return (int)(Math.random()*100);
	}
	
	public static void show(int d[][]) {//显示二维数组内容
		System.out.println("show:");
		for(int j=0;j<d.length;j++) {
			for(int k=0;k<d[0].length;k++) {
				System.out.print(" "+d[j][k]);
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void findmax(int d[][]) {//找到并输出最大值，且输出坐标值
		int n=0;
		int x=0,y=0;
		for(int j=0;j<d.length;j++) {
			for(int k=0;k<d[0].length;k++) {
				if(d[j][k]>n) {
					n=d[j][k];
					x=j;
					y=k;
				}
			}
		}
		System.out.println("最大值为："+n);
		System.out.println("坐标  x:"+x+"  y:"+y);
	}
}
