package ������ü��̳�;

public class Armor extends Item{
	int defend;
	public static void main(String[] args) {
		Armor Quilted_armor=new Armor();//����
		Quilted_armor.name="����";
		Quilted_armor.price=300;
		Quilted_armor.defend=15;
		
		Armor Chain_mail=new Armor();
		Chain_mail.name="���Ӽ�";
		Chain_mail.price=700;
		Chain_mail.defend=30;
	}
}
