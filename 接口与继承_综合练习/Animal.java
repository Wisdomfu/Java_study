package 接口与继承_综合练习;

public abstract class Animal {
	protected String name;
	protected int legs;
	protected Animal(){
		System.out.println("我是Animal的无参构造函数~");
	}
	protected Animal(int legs){
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println(name+"是用"+legs+"条腿行动的");
	}
	
}
