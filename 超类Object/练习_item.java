package 超类Object;

public class 练习_item {
	String name;
	int price;
	public String toString(){
		return this.name+this.price;
	}
	
	public void finalize() {
		System.out.println(this.name+" 正在回收");
	}

	public boolean equals(Object O) {
		if(O instanceof 练习_item) {
			练习_item h=(练习_item) O;
			return this.price==h.price;//假设价格相同则代表相同
		}
		else return false;
	}
	
	public static void main(String[] args) {
		练习_item I1=new 练习_item();
		I1.name="红水晶1  ";
		I1.price=400;
		I1.finalize();
		练习_item I2=new 练习_item();
		I2.name="红水晶2  ";
		I2.price=400;
		System.out.println(I1.toString());
		System.out.println(I2.equals(I1));
	}
}
