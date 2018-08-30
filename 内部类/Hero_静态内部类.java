package 内部类;

public class Hero_静态内部类 {
	//与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
	//语法：new 外部类.静态内部类();
	//因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
	//除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别
	public String name;
	protected float hp;
	
	private static void battleWin() {
		System.out.println("胜利！");
	}
	
	//敌方水晶
	static class EnemyCrystal{
		int hp=5000;
		
		//如果水晶的血量为零，则胜利
		public void checkVictory() {
			if(hp==0) {
				Hero_静态内部类.battleWin();
				
				//静态内部类不能访问外部类的对象属性，如下排的“name”变量
				//System.out.println(name+"win this name");
			}
		}
	}
	
	public static void main(String[] args) {
		//不用对象就可以实例化静态内部类
		Hero_静态内部类.EnemyCrystal crystal=new Hero_静态内部类.EnemyCrystal();
		crystal.checkVictory();
	}
}
