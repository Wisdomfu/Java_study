package 类的引用及继承;

public class Armor extends Item{
	int defend;
	public static void main(String[] args) {
		Armor Quilted_armor=new Armor();//布甲
		Quilted_armor.name="布甲";
		Quilted_armor.price=300;
		Quilted_armor.defend=15;
		
		Armor Chain_mail=new Armor();
		Chain_mail.name="锁子甲";
		Chain_mail.price=700;
		Chain_mail.defend=30;
	}
}
