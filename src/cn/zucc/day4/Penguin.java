/*package cn.zucc.day4;

public class Penguin extends Pet {
	private String sex;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Penguin(String sex) {
		super();
		this.sex = sex;
	}

	public Penguin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Penguin(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}
	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}
	public void print(){
		System.out.println("��������:"+super.getName()+"\t�����ȣ�"+super.getHealth()+
				"\t���ܶȣ�"+super.getLove()+"\t�Ա�"+sex);
		
	}

}*/


package cn.zucc.day4;



public class Penguin extends Pet {
	private String sex;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Penguin(String sex) {
		super();
		this.sex = sex;
	}


	public Penguin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Penguin(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}
	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}
	public void print(){
		System.out.println("��������:"+super.getName()+"\t�����ȣ�"+super.getHealth()+
				"\t���ܶȣ�"+super.getLove()+"\t�Ա�"+sex);
		
	}
	
	public void cure(){
		System.out.println("��ҩ����");
	}
	
	public void swimming(){
		System.out.println("���˺��������Ӿ��Ϸ����콡��ֵ����10�����������ܶ�����5");
	}

	public void eat(){
		System.out.println("���Գ���");
	}

}

