package cn.zucc.day2;

import java.util.Scanner;

public class FeedBack {
	String yonghu;
	int jifen;
	Scanner sc = new Scanner(System.in);
	public void panduan(){
		System.out.print("������֣�");
		jifen=sc.nextInt();
		System.out.print("���뿨���ͣ�");
		yonghu=sc.next();
		if((yonghu.equals("��")&&jifen>1000)||
				(yonghu.equals("�տ�")&&jifen>5000)){
			System.out.println("��������500��");
		}else{
			System.out.println("��Ǹ��û�л�������");
		}
	}

}
