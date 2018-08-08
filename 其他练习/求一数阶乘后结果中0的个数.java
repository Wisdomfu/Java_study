package 其他练习;

import java.util.Scanner;
public class 求一数阶乘后结果中0的个数 {
	private static Scanner s;
    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long x=n;
        for(long j=n-1;j>0;j--){
            x=x*j;
        }
        System.out.println(x);
        int count=0;
        long z=x;
        long y;
        do {
        	y=z;
        	z=z/10;
        	if(y-z*10==0) {
        		count++;
        	}else break;
        }while(z!=0);
        return count;
    }
    public static void main(String[] args){
        long a,b;
        s = new Scanner(System.in);
        a=s.nextInt();
        b=trailingZeros(a);
        System.out.println(b);
    }
}