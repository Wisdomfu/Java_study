import java.util.Arrays;
public class ���鳣��_Arrays���� {
	public static void main(String[] args) {
		
		//�������飺Array.copyOfRange(int[] original, int from, int to)
		System.out.println("���鿽����");
		int a[]=new int[] {1,2,3,4,5,6};
		// copyOfRange(int[] original, int from, int to)
        // ��һ��������ʾԴ����
        // �ڶ���������ʾ��ʼλ��(ȡ�õ�)
        // ������������ʾ����λ��(ȡ����)
		int b[]=Arrays.copyOfRange(a, 0, 3);//����ʵ�����Ǹ���0�ŵ�2��Ԫ��
		for(int i=0;i<b.length;i++) {
			System.out.print(" "+b[i]);
		}
		
		//Arrays.toString(a[])ת��Ϊ�ַ���������ѭ������������۲죩
		System.out.println("\n\na[]����>String:");
		String m=Arrays.toString(a);
		System.out.println(m);
		
		//Arrays.sort(a[])������
		int[] c=new int[] {5,6,4,7,3,8};
		System.out.println("\n����\n"+Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		//Arrays.binarySearch(a[],number):����λ�ã�����ǰ������ʹ��sort����
		int d[]=new int[] {3,4,2,5,1,6};
		System.out.println("\n������"+Arrays.toString(d));
		Arrays.sort(d);//������sort����
		int p=Arrays.binarySearch(d, 5);
		System.out.println("5��λ��Ϊ��"+p);
		
		//Arrays.equals(a,b)�ж������Ƿ���ͬ
		int[] e=new int[] {1,2,3,4,5,6};
		int[] f=new int[] {1,2,3,4,5,0};
		System.out.println("\n�ж��Ƿ���ͬ��\n"+Arrays.equals(e, f));
		
		//Arrays.fill(a,number)����һ��Ԫ���������
		int[] g=new int[10];
		Arrays.fill(g, 6);
		System.out.println("\n��䣺\n"+Arrays.toString(g));
		
		//��ϰ����ά��������
		System.out.println("\n��ϰ��5X8��ά��������");
		int[][]o=new int[5][8];
		int[]O=new int[40];
		System.out.println("��ȡ��ά������飺");
		for(int j=0;j<o.length;j++) {//��ȡ��ά�������
			for(int k=0;k<o[0].length;k++) {
				o[j][k]=randomnum();
				System.out.print(" "+o[j][k]);
			}System.out.println();
		}
		for(int j=0;j<o.length;j++) {
			System.arraycopy(o[j], 0, O, j*8, 8);//һάһά�ؿ�����һά����O
		}System.out.println("��ȡ���������ά���鿽����һά���飺\n"+Arrays.toString(O));
		Arrays.sort(O);
		System.out.println("�����\n"+Arrays.toString(O));
		for(int j=0;j<o.length;j++) {//���򿽱��ض�ά����
			System.arraycopy(O, j*8, o[j], 0, 8);//һάһά�ؿ�����һά����O
		}System.out.println("���򿽱��ض�ά���飺");
		for(int j=0;j<o.length;j++) {//��������ض�ά�������
			for(int k=0;k<o[0].length;k++) {
				System.out.print(" "+o[j][k]);
			}System.out.println();
		}
	}
	public static int randomnum() {//��ȡ�����
		return (int)(Math.random()*100);
	}
}
