
public class 长路与and短路与 {
	    public static void main(String[] args) {
	        //长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
	        int i = 2;
	        System.out.println( i==2 & i++ ==3  ); //无论如何i++都会被执行，所以i的值变成了3
	        System.out.println(i);
	         
	        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
	        int j = 2;
	        System.out.println( j== 2 && j++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
	        System.out.println(j);     
	         //短路与“&&”和长路与“&”都是“且”的意思，不过&&前若为假，到&&即停止，返回假，不进行后面表达式的判断。
	    }
	}

