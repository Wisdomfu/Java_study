
public class ����_��С�����_���鷴ת {
	public static void main(String[] args) {
		int [] a;//���� int a[];
		a=new int[5];
		int[] b=new int[]{1,11,111,1111,11111};//�����ʼ��
		b[0]=1000;
		System.out.println("�����Ϊ��");
		for(int i=0;i<5;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.println(a[i]);
			if(a[i]<b[0]) b[0]=a[i];
		}
		System.out.println("��С����Ϊ��"+b[0]);
		output();
		output("���鷴ת��");
		turnback(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void output() {
		System.out.println("\n");
	}
	
	public static  void output(String S) {
		System.out.println(S);
	}
	
	public static void turnback(int a[]) {
		int temp;
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	}
}