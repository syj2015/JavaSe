package cn.zucc.day4;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("�������û�����");
		 * String name = sc.next(); System.out.print("���������룺"); String mima =
		 * sc.next(); if(mima.length()+1>=6){ System.out.println("ע��ɹ�"); }else{
		 * System.out.println("���볤�Ȳ���С��6λ��"); }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("�������û�����");
		 * String name = sc.next(); System.out.print("���������룺"); String mima =
		 * sc.next(); if(name.equals("TOM")&&mima.equals("1234567")){
		 * System.out.println("��¼�ɹ�����"); }else{ System.out.println("�û��������벻ƥ��");
		 * }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("�������û�����");
		 * String name = sc.next(); System.out.print("���������룺"); String mima =
		 * sc.next(); if(name.equalsIgnoreCase("TOM")&&mima.equals("1234567")){
		 * System.out.println("��¼�ɹ�����"); }else{ System.out.println("�û��������벻ƥ��");
		 * }
		 */

		/*
		 * System.out.println("��ӭʹ��XXϵͳ"); Scanner sc = new Scanner(System.in);
		 * String n; String m; String m1; Register r = new Register(); int i=0;
		 * do{ System.out.println("�������˺�"); n = sc.next();
		 * System.out.println("����������"); m = sc.next();
		 * System.out.println("������������"); m1 = sc.next(); r.verify(n,m,m1,i);
		 * }while(i==1);
		 */

		/*
		 * int sqlScore = 80; //sql�ɼ� int javaScore = 90; //java�ɼ� double
		 * htmlScore = 86.7; //html�ɼ� //�����ɼ��� String scoreSheet = "SQL:" +
		 * sqlScore + "  Java:" + javaScore + "  HTML:" + htmlScore;
		 * 
		 * //��ӡ�ɼ��� System.out.println("*****�ɼ���*****");
		 * System.out.println(scoreSheet);
		 */

		/*
		 * String s = new String("��ã�"); String name = new String("������"); String
		 * sentence = s.concat(name); System.out.println(sentence);
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("������java�ļ�����"); String j = sc.next();
		 * System.out.println("�����������ַ��"); String d = sc.next(); int index =
		 * j.lastIndexOf("."); if (index != -1 && index != 0 &&
		 * j.substring(index + 1, j.length()).equals( "java")) {
		 * System.out.println("�ļ�����Ч��"); } else { System.out.println("�ļ�����Ч��");
		 * } if (d.indexOf('@') !=- 1 && d.indexOf('.') > d.indexOf('@')){
		 * System.out.println("Email��Ч��"); }else{
		 * System.out.println("Email��Ч��"); }
		 */

		/*
		 * String words="��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ"; String[] printword=new
		 * String[100]; System.out.println("***ԭ��ʸ�ʽ***\n"+words);
		 * System.out.println("\n***��ֺ��ʸ�ʽ***"); printword=words.split(" ");
		 * for(int i=0;i<printword.length;i++){ System.out.println( printword[i]
		 * ); }
		 */

		/*
		 * StringBuffer sb = new StringBuffer("�ഺ�޻�"); int num=110; StringBuffer
		 * sb1 = sb.append("��������"); System.out.println(sb1); StringBuffer sb2 =
		 * sb1.append('��'); System.out.println(sb2); StringBuffer sb3 =
		 * sb2.append(num); System.out.println(sb3);
		 */

		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("������һ�����֣� "); String nums = input.next();
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
			System.out.println("�������˺�");
			n = sc.next();
			System.out.println("����������");
			m = sc.next();
			System.out.println("������������");
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
