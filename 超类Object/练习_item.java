package ����Object;

public class ��ϰ_item {
	String name;
	int price;
	public String toString(){
		return this.name+this.price;
	}
	
	public void finalize() {
		System.out.println(this.name+" ���ڻ���");
	}

	public boolean equals(Object O) {
		if(O instanceof ��ϰ_item) {
			��ϰ_item h=(��ϰ_item) O;
			return this.price==h.price;//����۸���ͬ�������ͬ
		}
		else return false;
	}
	
	public static void main(String[] args) {
		��ϰ_item I1=new ��ϰ_item();
		I1.name="��ˮ��1  ";
		I1.price=400;
		I1.finalize();
		��ϰ_item I2=new ��ϰ_item();
		I2.name="��ˮ��2  ";
		I2.price=400;
		System.out.println(I1.toString());
		System.out.println(I2.equals(I1));
	}
}
