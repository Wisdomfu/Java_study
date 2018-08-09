package 类的多态;

public class ADAPHero extends Hero implements Mortal{
	public void die() {
		System.out.println("物理魔法双系英雄"+this.name+"died！");
	}
}
