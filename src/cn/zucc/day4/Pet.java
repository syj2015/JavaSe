/*package cn.zucc.day4;

public class Pet {//abstract
	private String name;
	private int health;
	private int love;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public Pet(String name, int health, int love) {
//		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	
	


	public Pet() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		
		System.out.println("宠物名字:"+name+"\t健康度："
				+health+"\t亲密度："+love);
	}
	
//	public abstract void print();

}*/


package cn.zucc.day4;

public abstract class Pet {//abstract
	private String name;
	private int health;
	private int love;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public Pet(String name, int health, int love) {
//		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	
	


	public Pet() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		
		System.out.println("宠物名字:"+name+"\t健康度："
				+health+"\t亲密度："+love);
	}
	
//	public abstract void print();
	
	public abstract void cure();
	public abstract void eat();


}
