package 内部类;

public abstract class Hero_本地类 {
	//本地类可以理解为有名字的匿名类 
	//与内部类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。 
	//本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方
	String name;
	float hp;
	float armor;
	int moveSpeed;
	public abstract void attack();
	public static void main(String[] args) {
		
		//与匿名类的区别在与，本地类有了自定义的类名
		class SomeHero extends Hero_本地类{
			public void attack() {
				System.out.println(name+"新的进攻手段");
			}
		}
		SomeHero h=new SomeHero();
		h.name="地卜师";
		h.attack();
	}

}
