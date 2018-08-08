package 其他练习;
import java.util.Scanner;
public class 尾部0的个数 {

    public static int trailingZeros(long p) {
        int i = 0;
        for(long j=1;j<=p;j++){
        	long k=j;
            do{
                if(k%5==0) {
                    i++;
                    k=k/5;
                    }else break;
            }while(k%5==0);
        }
        return i;
     
    }
    public static void main(String[] args){
        long a,b;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=trailingZeros(a);
        System.out.println(b);
        s.close();
    }
}