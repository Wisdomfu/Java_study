package 数学方法;

public class MATH {
	public static double e() {//练习方法，求自然对数e的值
		double y=0;//long i=Long.MAX_VALUE;
		double x=9.223372036854776E14;
		y=Math.pow(1+(1/x),x);
		return y;
	}
	
	//练习方法，计算质数个数
	public static String countPrime() {
		return"本函数计算0到上限值中的质数个数，请传入上限参数！";
	}
	
	public static int countPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {//外层循环，1~num
			int count1=0;
			for(int j=1;j<=i;j++) {//内层，计算公因数个数（判断是否为质数）
				if(i%j==0) count1++;
			}
			if(count1==2) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		float f1=4.4f;
		float f2=4.5f;
		 //5.4四舍五入即5
        System.out.println(Math.round(f1));
        //5.5四舍五入即6
        System.out.println(Math.round(f2));
         
        //得到一个0-1之间的随机浮点数（取不到1）
        System.out.println(Math.random());
         
        //得到一个0-10之间的随机整数 （取不到10）
        System.out.println((int)( Math.random()*10));
        //开方
        System.out.println(Math.sqrt(9));
        //次方（2的4次方）
        System.out.println(Math.pow(2,4));
         
        //π
        System.out.println(Math.PI);
         
        //自然常数
        System.out.println(Math.E);

        System.out.println(e());
        System.out.println(countPrime(10000000));
	}
}
