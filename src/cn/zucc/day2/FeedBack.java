package cn.zucc.day2;

import java.util.Scanner;

public class FeedBack {
	String yonghu;
	int jifen;
	Scanner sc = new Scanner(System.in);
	public void panduan(){
		System.out.print("输入积分：");
		jifen=sc.nextInt();
		System.out.print("输入卡类型：");
		yonghu=sc.next();
		if((yonghu.equals("金卡")&&jifen>1000)||
				(yonghu.equals("普卡")&&jifen>5000)){
			System.out.println("回馈积分500分");
		}else{
			System.out.println("抱歉，没有回馈积分");
		}
	}

}
