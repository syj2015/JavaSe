package cn.zucc.day2;

import java.util.Scanner;


public class PassWord {
	String name;
	int key;
	Scanner sc = new Scanner(System.in);
	public void shuru1(){
		System.out.println("�������û�����");
		String n1 = sc.next();
		while(!n1.equals("admin1")){
			System.out.println("�û����������������룺");
			n1 = sc.next();
		}
		System.out.println("����������룺");
		int k1 = sc.nextInt();
		while(k1!=123456){
			System.out.println("����������������룺");
			k1 = sc.nextInt();
		}
		System.out.println("�����������룺");
		int k2 = sc.nextInt();
		System.out.println("���ٴ����������룺");
		int k3 = sc.nextInt();
		while(k3!=k2){
			System.out.println("����������������룺");
			k3 = sc.nextInt();
		}
		System.out.println("�����޸ĳɹ�!!!");
		
	}
	
}
