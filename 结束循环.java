
public class ����ѭ�� {
	public static void main(String[] args) {
		        boolean breakout = false; //�Ƿ���ֹ�ⲿѭ���ı��
		        System.out.println("ʹ��boolean���������ⲿѭ����");
		        for (int i = 0; i < 10; i++) {
		 
		            for (int j = 0; j < 10; j++) {
		                System.out.println(i + ":" + j);
		                if (1 == j % 2) {
		                    breakout = true; //��ֹ�ⲿѭ���ı������Ϊtrue
		                    break;
		                }
		            }
		            if (breakout) //�ж��Ƿ���ֹ�ⲿѭ��
		                break;
		        }
		        System.out.println();
		        System.out.println("ʹ�ñ�ǩ�����ⲿѭ����");
		        outloop: //outloop�����ʾ�ǿ����Զ���ı���outloop1,ol2,out5
		            for (int i = 0; i < 10; i++) {
		                 
		                for (int j = 0; j < 10; j++) {
		                    System.out.println(i+":"+j);
		                    if(0==j%2&&j!=0) 
		                        break outloop; //�����˫���������ⲿѭ��
		                }
		                 
		            }
		        System.out.println("��ϰ���ƽ�ָ�㣺");
				/*Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
		        ��ĸ�ͷ��Ӳ���ͬʱΪż����ĸ�ͷ���
		        ȡֵ��Χ��[1-20]*/
		        float Gold=(float) 0.618;
		        int a=1;
		        int b=1;
		        float distance=10;
		        float d;
		        for(int j=1;j<21;j++) {
		        	
		        	for(int k=1;k<21;k++) {
		        		if((a%2==0)&&(b%2==0)) continue;
		        		d=Math.abs(Gold-(float)j/(float)k);System.out.println("j:"+j+" k:"+k);
		        		if(d<distance) {
		        			a=j;b=k;distance=d;
		        		}System.out.println("a:"+a+" b:"+b+" d:"+d);
		        	}
		        }
		        System.out.println("��ƽ�ָ�㣨0.618�����������������ǣ�"+a+"/"+b+"="+(float)a/(float)b);
		    }
	}

