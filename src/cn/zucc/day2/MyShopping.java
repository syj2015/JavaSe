package cn.zucc.day2;

import java.util.Scanner;

public class MyShopping {
	Scanner sc = new Scanner(System.in);
	int sz;
	String ni;
	int k1;
	public void zhuye() {//��ҳ
		System.out.println("\t��ӭʹ��XXXϵͳ\n\t\t"
				+ "1.��¼ϵͳ\n\t\t2.�˳�");
		System.out.println("*****************************\n" +
				"������ѡ������֣�");
		sz=sc.nextInt();
		if(sz==1){
			shuru();
		}else if(sz==2){
			tuichu();
		}else{
			zhuye();
		}
	}
	
	public void tuichu(){//�˳�
		System.out.println("ллʹ��");
	}

	public void shuru() {//��¼

		System.out.println("�������û�����");
		ni = sc.next();
		while (!ni.equals("admin1")) {
			System.out.println("��û��Ȩ�޽��룬�����µ�¼��");
			ni = sc.next();
		}
		System.out.println("���������룺");
		k1 = sc.nextInt();
		while (k1 != 123456) {
			System.out.println("����������������룺");
			k1 = sc.nextInt();
		}
		System.out.println("��¼�ɹ�:"+ni);
	}
	
	

}
