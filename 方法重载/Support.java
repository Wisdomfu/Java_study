package 方法重载;

public class Support extends Hero{
	
	//方法的重载
	public void heal() {
		System.out.println(name+" 是辅助，可以治疗");
	}
	
	public void heal(Hero h1) {
		System.out.println(name+" 治疗了"+h1.name);
	}
	
	public void heal(Hero h1,int hpup) {
		System.out.println(name+" 治疗了"+h1.name+" "+hpup+"点的血量");
	}
	
	//可变数量的参数
	public void heal(Hero...heros) {
		System.out.print(name+"治疗了");
		for(int i=0;i<heros.length;i++) {
			System.out.print(" "+heros[i].name+" ");
		}
	}
	
	public static void main(String[] args) {
		Support starmother=new Support();//新建辅助星妈
		starmother.name="众星之子——星妈";
		Hero dema=new Hero();//新建德玛对象
		dema.name="德玛西亚";
		Hero timo=new Hero();//新建提莫对象
		timo.name="提莫";
		starmother.heal();
		starmother.heal(dema);
		starmother.heal(timo,100);
		starmother.heal(dema,dema,timo,timo,dema);
	}
}
