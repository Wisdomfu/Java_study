
public class ��ά���� {
	public static void main(String[] args) {
		//��ʼ����ά����
		int[][] a=new int[2][3];//������һά���飬ÿ��һά���鳤����3
		a[1][2]=5;//���Է���һά���飬��Ϊ�Ѿ������˿ռ�
		
		//ֻ�����λ����
		int[][] b=new int[2][];//ֻ������һά���飬ÿ��һά���鳤����δ����
		b[0]=new int [3];//�������ȷ��䳤�ȣ���Ϊ�Ѿ�������ʱ��
		b[1]=new int[4];
		b[0][2]=1;
		
		//ָ�����ݵ�ͬʱ������ռ�
		int[][] c=new int[][] {
			{1,2},{3,4},{5,6,7}
		};
		c[2][1]=0;
		System.out.println(c[2][0]+c[2][1]+c[2][2]);
		
		//��ϰ������һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
		//�ҳ������ά����������Ǹ�ֵ������ӡ�����ά����
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
	
	public static int randomnum() {//��ȡ�����
		return (int)(Math.random()*100);
	}
	
	public static void show(int d[][]) {//��ʾ��ά��������
		System.out.println("show:");
		for(int j=0;j<d.length;j++) {
			for(int k=0;k<d[0].length;k++) {
				System.out.print(" "+d[j][k]);
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void findmax(int d[][]) {//�ҵ���������ֵ�����������ֵ
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
		System.out.println("���ֵΪ��"+n);
		System.out.println("����  x:"+x+"  y:"+y);
	}
}
