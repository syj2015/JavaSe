package cn.zucc.day8;

public class Students {
	private String name;
	private int Scode;
	private String Saddress;
	private int Sgrade;
	private String Semail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScode() {
		return Scode;
	}
	public void setScode(int scode) {
		this.Scode = scode;
	}
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		this.Saddress = saddress;
	}
	public int getSgrade() {
		return Sgrade;
	}
	public void setSgrade(int sgrade) {
		this.Sgrade = sgrade;
	}
	public String getSemail() {
		return Semail;
	}
	public void setSemail(String semail) {
		this.Semail = semail;
	}
	public Students(String name, int scode, String saddress, int sgrade,
			String semail) {
		super();
		this.name = name;
		this.Scode = scode;
		this.Saddress = saddress;
		this.Sgrade = sgrade;
		this.Semail = semail;
	}
	public Students() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", saddress=" + Saddress + ", scode="
				+ Scode + ", semail=" + Semail + ", sgrade=" + Sgrade + "]";
	}
	

}
