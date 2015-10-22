package cn.zucc.day3;

public class Tip {
	private String title;
	private String content;
	private String publishTime;
	private int uid;
	public String getTitle(){
		return title;
	}
	public String getContent(){
		return content;
	}
	public String getPublishTime(){
		return publishTime;
	}
	public int getUid(){
		return uid;
	}
	public void getInfo(){
		System.out.println("标题"+title);
		System.out.println("内容"+content);
		System.out.println("时间"+publishTime);
	}
}
//title：String
//content：String
//publishTime：String 
//uid：int 
//getInfo() ：void