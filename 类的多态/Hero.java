package ��Ķ�̬;

public class Hero {
	String name;
	int hp;//Ѫ��
	int armor;//����
	int attack;//����
	int movespeed;//�ƶ��ٶ�
	
	public static void kill(Hero n,Mortal m) {
		System.out.print(n.name+"������  ");
		m.die();
	}
	public static void main(String[] args) {
		Hero yasuo=new Hero();
		yasuo.name="����";
		ADHero nuoshou=new ADHero();
		nuoshou.name="ŵ����˹֮��";
		APHero xiaofa=new APHero();
		xiaofa.name="а��С��ʦ";
		ADAPHero wuqi=new ADAPHero();
		wuqi.name="������ʦ";
		kill(yasuo,nuoshou);
		kill(yasuo,xiaofa);
		kill(yasuo,wuqi);
	}
}