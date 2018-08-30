package 接口与继承_综合练习;

public class Spider extends Animal{
	public String name;
	protected int legs;
	public void eat() {
		System.out.println(name+"吃小虫子");
	}
}
