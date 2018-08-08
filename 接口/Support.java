package 接口;

public class Support extends Hero implements Healer{
	public void heal() {
		System.out.println("对友方英雄进行治疗");
	}

}
