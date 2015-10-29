package cn.zucc.day6;

public abstract class Animal {
	private String name;
	void shout(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//
	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name;
	}

	
	

}
