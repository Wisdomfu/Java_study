package �ӿ���̳�_�ۺ���ϰ;

public class Cat extends Animal implements Pet{
	public Cat(String name) {
		super(4);
		this.name=name;
	}
	public Cat() {
		this("");
	}
	public void eat() {
		System.out.println(name+"����С���");
	}
	public String getName() {
		return name;
	}
	public void play() {
		System.out.println("~~~Cat is playing~~~");
	}
	public void setName(String name) {
		this.name=name;
	}
}
