package �ڲ���;

public abstract class Hero_������ {
	//������������Ϊ�����ֵ������� 
	//���ڲ��಻һ�����ǣ��ڲ�����������ڳ�Ա��λ�ã��������Ժͷ���ƽ�ȵ�λ�á� 
	//�������������һ����ֱ�������ڴ�������棬��������������forѭ����ȵȵط�
	String name;
	float hp;
	float armor;
	int moveSpeed;
	public abstract void attack();
	public static void main(String[] args) {
		
		//����������������룬�����������Զ��������
		class SomeHero extends Hero_������{
			public void attack() {
				System.out.println(name+"�µĽ����ֶ�");
			}
		}
		SomeHero h=new SomeHero();
		h.name="�ز�ʦ";
		h.attack();
	}

}
