
public class ���캯�� {
	String name;
	int HP;
	int Armor;
	int moveSpeed;
	
	public ���캯��() {
		
	}
	public ���캯��(String heroname) {
		name=heroname;
	}
	
	public ���캯��(String heroname,int herohp) {
		name=heroname;
		HP=herohp;
	}
	
	public static void main(String[] args) {
		���캯�� dema=new ���캯��();
		���캯�� yasuo=new ���캯��("����");
		���캯�� timo=new ���캯��("��Ī",485);
		System.out.println(dema.name);
		System.out.println(yasuo.name);
		System.out.println(timo.name);
	}
}
