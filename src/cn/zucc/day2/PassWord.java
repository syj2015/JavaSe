package cn.zucc.day2;

import java.util.Scanner;


public class PassWord {
	String name;
	int key;
	Scanner sc = new Scanner(System.in);
	public void shuru1(){
		System.out.println("请输入用户名：");
		String n1 = sc.next();
		while(!n1.equals("admin1")){
			System.out.println("用户名错误，请重新输入：");
			n1 = sc.next();
		}
		System.out.println("请输入旧密码：");
		int k1 = sc.nextInt();
		while(k1!=123456){
			System.out.println("密码错误，请重新输入：");
			k1 = sc.nextInt();
		}
		System.out.println("请输入新密码：");
		int k2 = sc.nextInt();
		System.out.println("请再次输入新密码：");
		int k3 = sc.nextInt();
		while(k3!=k2){
			System.out.println("密码错误，请重新输入：");
			k3 = sc.nextInt();
		}
		System.out.println("密码修改成功!!!");
		
	}
	
}
