package cn.zucc.day4;

public class Topic extends Tip {
	public int topicId;
	public int boardId;
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public Topic(String title, String content, String publishTime, int uid,
			int topicId, int boardId) {
		super(title, content, publishTime, uid);
		this.topicId = topicId;
		this.boardId = boardId;
	}
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topic(String title, String content, String publishTime, int uid) {
		super(title, content, publishTime, uid);
		// TODO Auto-generated constructor stub
	}
	public void getInfo(){
		System.out.println(super.getTitle()+super.getPublishTime());
	}

}
