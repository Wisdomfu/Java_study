
public class ��������_ѡ��andð�ݷ� {
	public static void main(String[] args) {
		int[] a=new int[10];//�����ʼ��
		System.out.println("��ȡ�������");
		for(int i=0;i<10;i++) {//�����ȡ�����
			a[i]=randomnum();
			System.out.print(" "+a[i]);
		}
		int[] b=a;
		System.out.println();
		System.out.println("ѡ������");
		selection(a);//ѡ�����򣨵�����
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		System.out.println();
		System.out.println("ð�ݷ�����");
		bubble(b);//ð�ݷ����򣨵�����
		for(int i=0;i<a.length;i++)
			System.out.print(" "+b[i]);
	}
	
	public static int randomnum() {//��ȡ�����λ��������
		return (int)(Math.random()*100);
	}
	
	public static void selection(int[] a) {//ѡ������
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
	
	public static void bubble(int[] a) {//ð������
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
