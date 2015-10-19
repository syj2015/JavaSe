package cn.zucc.day1;

import java.util.Scanner;

public class ZhangSan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("输入张三JAVA成绩：");
		int javaScore=sc.nextInt();
		System.out.println("输入张三SQL成绩：");
		int sqlScore=sc.nextInt();
		System.out.println("输入张三MATLAB成绩：");
		int matlabScore=sc.nextInt();
		int cha=Math.abs(javaScore-sqlScore);
		System.out.println("JAVA和SQL的分数差："+cha);
		int pjf=javaScore/3+sqlScore/3+matlabScore/3;	
		System.out.println("平均分："+pjf);
		

	}

}
