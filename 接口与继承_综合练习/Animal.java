package �ӿ���̳�_�ۺ���ϰ;

public abstract class Animal {
	protected String name;
	protected int legs;
	protected Animal(){
		System.out.println("����Animal���޲ι��캯��~");
	}
	protected Animal(int legs){
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println(name+"����"+legs+"�����ж���");
	}
	
}
