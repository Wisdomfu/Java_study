
public class 字符串与数字的转换 {
	public static void main(String[] args) {
	//数字转字符串
		int a=314;
	 	//方法一：
		String str1=Integer.toString(a);
		//方法二：
		String str2=String.valueOf(a);
		//方法三：
		Integer It=a;
		String str3=It.toString();
		
	//字符串转数字:Integer的静态方法parseInt
		String S="999";
		int b=Integer.parseInt(S);
		
    //练习：浮点数与字符串转换
		//浮点转字符串
		float c=3.14f;
		String M=String.valueOf(c);
		
		Float it=c;
		String N=it.toString();
		
		
		}

}
