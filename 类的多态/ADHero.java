package 类的多态;

public class ADHero extends Hero implements Mortal{
	public void die() {
		System.out.println("物理英雄"+this.name+"died！");
	}
}
