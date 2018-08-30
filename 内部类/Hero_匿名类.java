package 内部类;

public abstract class Hero_匿名类 {
	//直接实例化一个抽象类，并“当场”实现其抽象方法。
	//既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
	//这样的类，叫做匿名类
	String name;
	float hp;
	float armor;
	int moveSpeed;
	public abstract void attack();
	
	public static void main(String[] args) {
		
		int a=10;
		//使用类的时候当场实现attack()方法
		Hero_匿名类 h=new Hero_匿名类(){
			public void attack() {
				System.out.println("新的进攻手段"+a);
			}
		};
		h.attack();
		
		//通过打印h，可以看到h这个对象属于
		System.out.println(h);
	}
}
