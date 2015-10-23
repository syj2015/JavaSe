package cn.zucc.day5;

public class Dog {
	
	
	private String name;
	private String pinzhong;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPinzhong() {
		return pinzhong;
	}
	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, String pinzhong) {
		super();
		this.name = name;
		this.pinzhong = pinzhong;
	}
	/*
	@Override
	public String toString() {
		return "Dog [name=" + name + ", pinzhong=" + pinzhong + "]";
	}
	*/

}
