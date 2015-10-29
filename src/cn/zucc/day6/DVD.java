package cn.zucc.day6;




public class DVD {
	private String name;
	private int State;
	private String data;
	public DVD(String name, int state, String data) {
		super();
		this.name = name;
		State = state;
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}
/*	@Override
	public String toString() {
		return name + "\t" + State + "\t" + data;
	}*/

	

	
	

}
