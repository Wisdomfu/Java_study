package 字符;

public class 练习_随机字符串 {//获取5个随机大写字母小写字母数字组成的字符串
	public static void main(String[] args) {
		int a;
		
		char c[]=new char[5];
		for(int n=0;n<5;n++) {
			a=(int)(Math.random()*123);
			if((a>=48&&a<=57)||(a>=65&&a<=90)||(a>=97&&a<=122)) {
				c[n]=(char)a;System.out.print(c[n]);
			}
			else n--;
			}
	}

}
