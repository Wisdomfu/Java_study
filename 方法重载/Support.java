package ��������;

public class Support extends Hero{
	
	//����������
	public void heal() {
		System.out.println(name+" �Ǹ�������������");
	}
	
	public void heal(Hero h1) {
		System.out.println(name+" ������"+h1.name);
	}
	
	public void heal(Hero h1,int hpup) {
		System.out.println(name+" ������"+h1.name+" "+hpup+"���Ѫ��");
	}
	
	//�ɱ������Ĳ���
	public void heal(Hero...heros) {
		System.out.print(name+"������");
		for(int i=0;i<heros.length;i++) {
			System.out.print(" "+heros[i].name+" ");
		}
	}
	
	public static void main(String[] args) {
		Support starmother=new Support();//�½���������
		starmother.name="����֮�ӡ�������";
		Hero dema=new Hero();//�½��������
		dema.name="��������";
		Hero timo=new Hero();//�½���Ī����
		timo.name="��Ī";
		starmother.heal();
		starmother.heal(dema);
		starmother.heal(timo,100);
		starmother.heal(dema,dema,timo,timo,dema);
	}
}
