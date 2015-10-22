package cn.zucc.day4;

public class UsbUser implements Usb,Usb1 {


	@Override
	public void lian() {
		// TODO Auto-generated method stub
		System.out.println("Á´½Ó³É¹¦£¡£¡");

	}

	@Override
	public void yun(double i, double d) {
		// TODO Auto-generated method stub
		double k = i/d;
		System.out.println(k);
	}


	
	
	private int c;


	public UsbUser(int c) {
		super();
		this.c = c;
	}

	public UsbUser() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void pr() {
		// TODO Auto-generated method stub
		int y = x*c;
		System.out.println(y);
	}


}
