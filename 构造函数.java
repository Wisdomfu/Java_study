
public class 构造函数 {
	String name;
	int HP;
	int Armor;
	int moveSpeed;
	
	public 构造函数() {
		
	}
	public 构造函数(String heroname) {
		name=heroname;
	}
	
	public 构造函数(String heroname,int herohp) {
		name=heroname;
		HP=herohp;
	}
	
	public static void main(String[] args) {
		构造函数 dema=new 构造函数();
		构造函数 yasuo=new 构造函数("亚索");
		构造函数 timo=new 构造函数("提莫",485);
		System.out.println(dema.name);
		System.out.println(yasuo.name);
		System.out.println(timo.name);
	}
}
