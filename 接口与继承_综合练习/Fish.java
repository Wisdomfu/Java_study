package �ӿ���̳�_�ۺ���ϰ;

public class Fish extends Animal implements Pet{
	private String name;
	public void walk() {
		System.out.println("Fish has no legs and cannot walk !");
	}
	public Fish() {
		name="��";
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void play(){
		System.out.println("~~~Fish is playing happily~~~");
	}
	public void eat() {
		System.out.println(name+"��ˮ��Ķ���~");
	}
}
