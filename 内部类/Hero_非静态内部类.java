package �ڲ���;

//�Ǿ�̬�ڲ���
public class Hero_�Ǿ�̬�ڲ��� {
	//ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
	//����ʵ����BattleScore ��ʱ�򣬱��뽨����һ�����ڵ�Ӣ�۵Ļ�����
	//�﷨: new �ⲿ��().new �ڲ���()
	//��ΪHero�ķǾ�̬�ڲ��࣬�ǿ���ֱ�ӷ����ⲿ���privateʵ������name��

	private String name;
	float hp;
	float armor;
	float moveSpeed;
	
	//�Ǿ�̬�ڲ��ֻ࣬��һ���ⲿ������ڵ�ʱ�򣬲�������
	//ս���ɼ�ֻ����һ��Ӣ�۴���ʱ��������
	class Battlescore{
		int kill;
		int die;
		int assit;
		public void Ledgendary() {
			if(kill>=8) System.out.println(name+"����");
			else System.out.println("��δ����");
		}
	}
	
	public static void main(String[] args) {
		Hero_�Ǿ�̬�ڲ��� garen=new Hero_�Ǿ�̬�ڲ���();
		garen.name="����";
		
		// ʵ�����ڲ���
        // BattleScore����ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
        // ������ʵ�������뽨����һ���ⲿ�����Ļ���֮��
        Battlescore score = garen.new Battlescore();
        score.kill=10;
        score.Ledgendary();
	}
}
