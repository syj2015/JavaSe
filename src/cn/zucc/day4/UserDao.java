package cn.zucc.day4;

public interface UserDao {
	public Topic findTopic(int topicId);
	public int addTopic(Topic topic);
	public int deleteTopic(int topicId);
	public int updateTopic(Topic topic);

}
