package cn.zucc.day1;

import java.util.Scanner;

public class ZhangSan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��������JAVA�ɼ���");
		int javaScore=sc.nextInt();
		System.out.println("��������SQL�ɼ���");
		int sqlScore=sc.nextInt();
		System.out.println("��������MATLAB�ɼ���");
		int matlabScore=sc.nextInt();
		int cha=Math.abs(javaScore-sqlScore);
		System.out.println("JAVA��SQL�ķ����"+cha);
		int pjf=javaScore/3+sqlScore/3+matlabScore/3;	
		System.out.println("ƽ���֣�"+pjf);
		

	}

}
