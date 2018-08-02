
public class 结束循环 {
	public static void main(String[] args) {
		        boolean breakout = false; //是否终止外部循环的标记
		        System.out.println("使用boolean变量结束外部循环：");
		        for (int i = 0; i < 10; i++) {
		 
		            for (int j = 0; j < 10; j++) {
		                System.out.println(i + ":" + j);
		                if (1 == j % 2) {
		                    breakout = true; //终止外部循环的标记设置为true
		                    break;
		                }
		            }
		            if (breakout) //判断是否终止外部循环
		                break;
		        }
		        System.out.println();
		        System.out.println("使用标签结束外部循环：");
		        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
		            for (int i = 0; i < 10; i++) {
		                 
		                for (int j = 0; j < 10; j++) {
		                    System.out.println(i+":"+j);
		                    if(0==j%2&&j!=0) 
		                        break outloop; //如果是双数，结束外部循环
		                }
		                 
		            }
		        System.out.println("练习：黄金分割点：");
				/*寻找某两个数相除，其结果 离黄金分割点 0.618最近
		        分母和分子不能同时为偶数分母和分子
		        取值范围在[1-20]*/
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
		        System.out.println("离黄金分割点（0.618）最近的两个数相除是："+a+"/"+b+"="+(float)a/(float)b);
		    }
	}

