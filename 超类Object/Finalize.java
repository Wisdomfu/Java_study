package ����Object;

public class Finalize {
	public String name;
	protected float hp;
	
	public String toString() {
		return name;
	}
	public void finalize() {//�������պ���
		System.out.println("���Ӣ�����ڻ���");
	}
	public static void main(String[] args) {
		Finalize h;
		for(int i=0;i<490186;i++)//������i>=490186�ſ�ʼ���գ�������йأ���
		{
			//���������µĶ���
            //ÿ����һ������ǰһ�����󣬾�û������ָ����
            //��Щ���󣬾������������յ�����
            //���������ѻ��ıȽ϶��ʱ�򣬾ͻᴥ����������
            //һ��������󱻻��գ�����finalize()�����ͻᱻ����
			h=new Finalize();
		}
	}
}
