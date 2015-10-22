package cn.zucc.day4;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("请输入用户名：");
		 * String name = sc.next(); System.out.print("请输入密码："); String mima =
		 * sc.next(); if(mima.length()+1>=6){ System.out.println("注册成功"); }else{
		 * System.out.println("密码长度不能小于6位数"); }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("请输入用户名：");
		 * String name = sc.next(); System.out.print("请输入密码："); String mima =
		 * sc.next(); if(name.equals("TOM")&&mima.equals("1234567")){
		 * System.out.println("登录成功！！"); }else{ System.out.println("用户名或密码不匹配");
		 * }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("请输入用户名：");
		 * String name = sc.next(); System.out.print("请输入密码："); String mima =
		 * sc.next(); if(name.equalsIgnoreCase("TOM")&&mima.equals("1234567")){
		 * System.out.println("登录成功！！"); }else{ System.out.println("用户名或密码不匹配");
		 * }
		 */

		/*
		 * System.out.println("欢迎使用XX系统"); Scanner sc = new Scanner(System.in);
		 * String n; String m; String m1; Register r = new Register(); int i=0;
		 * do{ System.out.println("请输入账号"); n = sc.next();
		 * System.out.println("请输入密码"); m = sc.next();
		 * System.out.println("请再输入密码"); m1 = sc.next(); r.verify(n,m,m1,i);
		 * }while(i==1);
		 */

		/*
		 * int sqlScore = 80; //sql成绩 int javaScore = 90; //java成绩 double
		 * htmlScore = 86.7; //html成绩 //创建成绩单 String scoreSheet = "SQL:" +
		 * sqlScore + "  Java:" + javaScore + "  HTML:" + htmlScore;
		 * 
		 * //打印成绩单 System.out.println("*****成绩单*****");
		 * System.out.println(scoreSheet);
		 */

		/*
		 * String s = new String("你好，"); String name = new String("张三！"); String
		 * sentence = s.concat(name); System.out.println(sentence);
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("请输入java文件名："); String j = sc.next();
		 * System.out.println("请输入邮箱地址："); String d = sc.next(); int index =
		 * j.lastIndexOf("."); if (index != -1 && index != 0 &&
		 * j.substring(index + 1, j.length()).equals( "java")) {
		 * System.out.println("文件名有效。"); } else { System.out.println("文件名无效。");
		 * } if (d.indexOf('@') !=- 1 && d.indexOf('.') > d.indexOf('@')){
		 * System.out.println("Email有效。"); }else{
		 * System.out.println("Email无效。"); }
		 */

		/*
		 * String words="长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山"; String[] printword=new
		 * String[100]; System.out.println("***原歌词格式***\n"+words);
		 * System.out.println("\n***拆分后歌词格式***"); printword=words.split(" ");
		 * for(int i=0;i<printword.length;i++){ System.out.println( printword[i]
		 * ); }
		 */

		/*
		 * StringBuffer sb = new StringBuffer("青春无悔"); int num=110; StringBuffer
		 * sb1 = sb.append("我心永恒"); System.out.println(sb1); StringBuffer sb2 =
		 * sb1.append('啊'); System.out.println(sb2); StringBuffer sb3 =
		 * sb2.append(num); System.out.println(sb3);
		 */

		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("请输入一串数字： "); String nums = input.next();
		 * StringBuffer str=new StringBuffer(nums); for(int
		 * i=str.length()-3;i>0;i=i-3){ str.insert(i,','); }
		 * System.out.print(str);
		 */


/*		Scanner sc = new Scanner(System.in);
		String n;
		String m;
		String m1;
		Register r = new Register();
		int i = 0;
		do {
			System.out.println("请输入账号");
			n = sc.next();
			System.out.println("请输入密码");
			m = sc.next();
			System.out.println("请再输入密码");
			m1 = sc.next();
			r.verify(n, m, m1, i);
		} while (i == 1);
		//
		Goods g = new Goods();
		g.dfg();
		int v;
		int b;
		System.out.println("bianhao");
		v=sc.nextInt();
		System.out.println("shumu");
		b=sc.nextInt();
		g.qwe(v,b);
*/		
		
		
		Scanner sc = new Scanner(System.in);
		Topic t = new Topic(sc.next(),sc.next(), sc.next(), sc.nextInt());
		t.getInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
