package cn.zucc.day2;

import java.util.Scanner;

public class MyShopping {
	Scanner sc = new Scanner(System.in);
	int sz;
	String ni;
	int k1;
	public void zhuye() {//主页
		System.out.println("\t欢迎使用XXX系统\n\t\t"
				+ "1.登录系统\n\t\t2.退出");
		System.out.println("*****************************\n" +
				"请输入选择的数字：");
		sz=sc.nextInt();
		if(sz==1){
			shuru();
		}else if(sz==2){
			tuichu();
		}else{
			zhuye();
		}
	}
	
	public void tuichu(){//退出
		System.out.println("谢谢使用");
	}

	public void shuru() {//登录

		System.out.println("请输入用户名：");
		ni = sc.next();
		while (!ni.equals("admin1")) {
			System.out.println("您没有权限进入，请重新登录：");
			ni = sc.next();
		}
		System.out.println("请输入密码：");
		k1 = sc.nextInt();
		while (k1 != 123456) {
			System.out.println("密码错误，请重新输入：");
			k1 = sc.nextInt();
		}
		System.out.println("登录成功:"+ni);
	}
	
	

}
