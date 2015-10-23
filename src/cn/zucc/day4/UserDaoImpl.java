package cn.zucc.day4;

public class UserDaoImpl implements UserDao {

	public User au[] = new User[20];

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		for (int i = 0; i < au.length; i++) {
			if(au[i]==null){
				au[i]=user;
			}
		}
		return 0;//return 1;
	}

	@Override
	public User findUser(String uName) {
		// TODO Auto-generated method stub
		for (int i = 0; i < au.length; i++) {
			if(au[i].equals(uName)){
				return au[i];  //为什么uName不行?
			}
		}
		return null;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		User un = this.findUser(user.getuName());
		if(un!=null){
			un.setGender(user.getGender());
			un.setuName(user.getuName());
			return 0;
		}else{
			return this.updateUser(user);
		}
		
	}


}
