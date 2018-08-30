package 内部类;

//非静态内部类
public class Hero_非静态内部类 {
	//战斗成绩只有在一个英雄对象存在的时候才有意义
	//所以实例化BattleScore 的时候，必须建立在一个存在的英雄的基础上
	//语法: new 外部类().new 内部类()
	//作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的

	private String name;
	float hp;
	float armor;
	float moveSpeed;
	
	//非静态内部类，只有一个外部对象存在的时候，才有意义
	//战斗成绩只有在一个英雄存在时才有意义
	class Battlescore{
		int kill;
		int die;
		int assit;
		public void Ledgendary() {
			if(kill>=8) System.out.println(name+"超神！");
			else System.out.println("尚未超神");
		}
	}
	
	public static void main(String[] args) {
		Hero_非静态内部类 garen=new Hero_非静态内部类();
		garen.name="盖伦";
		
		// 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础之上
        Battlescore score = garen.new Battlescore();
        score.kill=10;
        score.Ledgendary();
	}
}
