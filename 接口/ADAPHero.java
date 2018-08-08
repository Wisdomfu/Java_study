package 接口;

public class ADAPHero extends Hero implements AD,AP{
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}

}
