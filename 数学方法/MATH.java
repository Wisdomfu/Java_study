package ��ѧ����;

public class MATH {
	public static double e() {//��ϰ����������Ȼ����e��ֵ
		double y=0;//long i=Long.MAX_VALUE;
		double x=9.223372036854776E14;
		y=Math.pow(1+(1/x),x);
		return y;
	}
	
	//��ϰ������������������
	public static String countPrime() {
		return"����������0������ֵ�е������������봫�����޲�����";
	}
	
	public static int countPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {//���ѭ����1~num
			int count1=0;
			for(int j=1;j<=i;j++) {//�ڲ㣬���㹫�����������ж��Ƿ�Ϊ������
				if(i%j==0) count1++;
			}
			if(count1==2) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		float f1=4.4f;
		float f2=4.5f;
		 //5.4�������뼴5
        System.out.println(Math.round(f1));
        //5.5�������뼴6
        System.out.println(Math.round(f2));
         
        //�õ�һ��0-1֮��������������ȡ����1��
        System.out.println(Math.random());
         
        //�õ�һ��0-10֮���������� ��ȡ����10��
        System.out.println((int)( Math.random()*10));
        //����
        System.out.println(Math.sqrt(9));
        //�η���2��4�η���
        System.out.println(Math.pow(2,4));
         
        //��
        System.out.println(Math.PI);
         
        //��Ȼ����
        System.out.println(Math.E);

        System.out.println(e());
        System.out.println(countPrime(10000000));
	}
}
