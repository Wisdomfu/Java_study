package 字符;

public class 练习_随机字符串and排序 {
	public static String randomString() {//获取5个随机大写字母小写字母数字组成的字符串
		int a;
		char c[]=new char[5];
		for(int n=0;n<5;n++) {
			a=(int)(Math.random()*123);
			if(/*(a>=48&&a<=57)||*/(a>=65&&a<=90)||(a>=97&&a<=122)) {
				c[n]=(char)a;//System.out.print(c[n]);
			}
			else n--;
			}
		return String.valueOf(c);
	}
	
	public static void stringSort(String s[],char a[]) {
		int tag[]=new int[] {0,1,2,3,4,5,6,7};
		int A[]=new int[8];
		for(int i=0;i<8;i++) {
			if(a[i]>=97) A[i]=(int)a[i]-32;
			else A[i]=(int)a[i];
		}
		for(int i=0;i<8;i++) {//存放tag的外层循环
				for(int j=i;j<8;j++) {
					if(A[j]<A[i]) {
						int temp1;   int temp2;
						temp1=A[i];  temp2=tag[i];
						A[i]=A[j];   tag[i]=tag[j];
						A[j]=temp1;  tag[j]=temp2;
					}
				}
		}
		for(int k=0;k<8;k++) {
			System.out.print(s[tag[k]]+" | ");
		}
	}
	
	
	public static void main(String[] args) {
		String s[]=new String[8];
		char a[]=new char[8];
		System.out.println("获取8组随机字符串如下：");
		for(int i=0;i<8;i++) {
			s[i]=randomString();
			a[i]=s[i].charAt(0);
			System.out.print(s[i]+" | ");
		}
		System.out.println("\n首字母排序（不分大小写）后结果如下：");
		stringSort(s,a);
	}

}
