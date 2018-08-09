package 类的多态;

public class APHero extends Hero implements Mortal{
	public void die() {
		System.out.println("魔法英雄"+this.name+"died！");
	}
}
