
public class ��Ԫ������ {//���ʽ��ֵ1:ֵ2   ������ʽΪ�� ����ֵ1  ������ʽΪ�� ����ֵ2
	public static void main(String[] args) {
		int a=1;
		a=a++;
		boolean b;
		b=a==a++;
		System.out.println(b);
		System.out.println(a);
		a=a==a++?3:4;
		System.out.println(a);
		
	}
}
