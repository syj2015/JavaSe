package cn.zucc.day4;

public  class User{
	private int gender;
	private String uName;

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	

	public User(String uName,int gender) {
		super();
		this.gender = gender;
		this.uName = uName;
	}

	public void getUserInfo(){
		String sex;
		if(this.getGender()==1){
			sex = "��";
		}else{
			sex = "Ů";
		}
		System.out.println("����:"+this.getuName()+"\t�Ա�:"+sex);
//		return "����:"+this.getuName()+"\t�Ա�:"+sex;//
	}

/*	@Override
	public String toString() {
		return "����:" + uName+"���Ա�:" +  ;
	}*/

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
