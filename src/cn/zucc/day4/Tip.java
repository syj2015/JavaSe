package cn.zucc.day4;

public class Tip {
	private String title;
	private String content;
	private String publishTime;
	private int uid;
	public void getInfo(){
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Tip(String title, String content, String publishTime, int uid) {
		super();
		this.title = title;
		this.content = content;
		this.publishTime = publishTime;
		this.uid = uid;
	}
	public Tip() {
		super();
		// TODO Auto-generated constructor stub
	};
	

}
