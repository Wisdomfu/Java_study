package 类的多态;

public class Hero {
	String name;
	int hp;//血量
	int armor;//护甲
	int attack;//攻击
	int movespeed;//移动速度
	
	public static void kill(Hero n,Mortal m) {
		System.out.print(n.name+"攻击；  ");
		m.die();
	}
	public static void main(String[] args) {
		Hero yasuo=new Hero();
		yasuo.name="亚索";
		ADHero nuoshou=new ADHero();
		nuoshou.name="诺克萨斯之手";
		APHero xiaofa=new APHero();
		xiaofa.name="邪恶小法师";
		ADAPHero wuqi=new ADAPHero();
		wuqi.name="武器大师";
		kill(yasuo,nuoshou);
		kill(yasuo,xiaofa);
		kill(yasuo,wuqi);
	}
}