package cn.zucc.day8;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.naming.spi.DirStateFactory.Result;



public class JDBC_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("未找到驱动器");
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			System.out.println("连接成功");
			Statement stmt = conn.createStatement();
			
//			String sql = "insert into students(name,Scode,Sgrade) value('java',1028,4)";
//			stmt.execute(sql);
			
			String sql = "select*from students";
			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()){
//				System.out.println(rs.getString(1));
//			}
			
			
			
			List<Students> list = new ArrayList<Students>();
			while(rs.next()){
				Students st = new Students();
				st.setName(rs.getString("name"));
				st.setScode(rs.getInt("Scode"));
				st.setSaddress(rs.getString("Saddress"));
				st.setSgrade(rs.getInt("Sgrade"));
				st.setSemail(rs.getString("Semail"));
				list.add(st);
			}
			for(Students sd : list){
				System.out.println(sd);//?
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
