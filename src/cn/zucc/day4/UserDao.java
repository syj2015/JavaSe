package cn.zucc.day4;

public interface UserDao {
//	public final String boy = "ÄÐ";
//	public final String girl = "Å®";
	public User findUser(String uName);
	public int addUser(User user);
	public int updateUser(User user);



}
