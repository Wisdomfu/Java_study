package �ڲ���;

public class Hero_��̬�ڲ��� {
	//��Ǿ�̬�ڲ��಻ͬ����̬�ڲ���ˮ�����ʵ���� ����Ҫһ���ⲿ���ʵ��Ϊ����������ֱ��ʵ����
	//�﷨��new �ⲿ��.��̬�ڲ���();
	//��Ϊû��һ���ⲿ���ʵ���������ھ�̬�ڲ������治���Է����ⲿ���ʵ�����Ժͷ���
	//���˿��Է����ⲿ���˽�о�̬��Ա�⣬��̬�ڲ������ͨ��ûʲô�������
	public String name;
	protected float hp;
	
	private static void battleWin() {
		System.out.println("ʤ����");
	}
	
	//�з�ˮ��
	static class EnemyCrystal{
		int hp=5000;
		
		//���ˮ����Ѫ��Ϊ�㣬��ʤ��
		public void checkVictory() {
			if(hp==0) {
				Hero_��̬�ڲ���.battleWin();
				
				//��̬�ڲ��಻�ܷ����ⲿ��Ķ������ԣ������ŵġ�name������
				//System.out.println(name+"win this name");
			}
		}
	}
	
	public static void main(String[] args) {
		//���ö���Ϳ���ʵ������̬�ڲ���
		Hero_��̬�ڲ���.EnemyCrystal crystal=new Hero_��̬�ڲ���.EnemyCrystal();
		crystal.checkVictory();
	}
}
