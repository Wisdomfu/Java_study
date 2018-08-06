package 类的引用及继承;

public class Weapon extends Item{//类的继承，在原Item的基础上多了damage属性
	int damage;
	public static void main(String[] args) {
		Weapon knife=new Weapon();//类的引用
		knife.price=350;
		knife.damage=15;
		knife.name="无尽之刃";
	}
}
