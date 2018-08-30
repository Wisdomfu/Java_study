package 接口与继承_综合练习;

public class Main_Animals {
	public static void main(String[] args) {
		//Spider 对象
		Spider spd=new Spider();
		spd.eat();
		System.out.println();
		
		//Cat 对象
		Cat Mio=new Cat("小猫");
		Mio.eat();
		Mio.play();
		System.out.println();
		
		//Fish 对象
		Fish yuer=new Fish();
		yuer.eat();
		yuer.setName("小鲤鱼");
		yuer.eat();
		yuer.play();
	}
}
