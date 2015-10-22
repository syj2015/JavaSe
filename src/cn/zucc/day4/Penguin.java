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
		System.out.println("宠物名字:"+super.getName()+"\t健康度："+super.getHealth()+
				"\t亲密度："+super.getLove()+"\t性别："+sex);
		
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
		System.out.println("宠物名字:"+super.getName()+"\t健康度："+super.getHealth()+
				"\t亲密度："+super.getLove()+"\t性别："+sex);
		
	}
	
	public void cure(){
		System.out.println("吃药修养");
	}
	
	public void swimming(){
		System.out.println("主人和企鹅玩游泳游戏，企鹅健康值减少10，与主人亲密度增加5");
	}

	public void eat(){
		System.out.println("企鹅吃撑了");
	}

}

