package cn.zucc.day6;

public class Duck extends Animal implements Terrestrial{
	private int legNum;

	public int getLegNum() {
		return 2;//
	}

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
//

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("¸Â¸Â¸Â");
	}
//
	public Duck(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}

	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Duck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	

	

	

}
