package �ڲ���;

public abstract class Hero_������ {
	//ֱ��ʵ����һ�������࣬����������ʵ������󷽷���
	//��Ȼʵ���˳��󷽷�����ô����һ���µ��ֻ࣬������࣬û��������
	//�������࣬����������
	String name;
	float hp;
	float armor;
	int moveSpeed;
	public abstract void attack();
	
	public static void main(String[] args) {
		
		int a=10;
		//ʹ�����ʱ�򵱳�ʵ��attack()����
		Hero_������ h=new Hero_������(){
			public void attack() {
				System.out.println("�µĽ����ֶ�"+a);
			}
		};
		h.attack();
		
		//ͨ����ӡh�����Կ���h�����������
		System.out.println(h);
	}
}
