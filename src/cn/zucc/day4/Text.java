package cn.zucc.day4;

import java.util.Scanner;

public class Text {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Dog d=new Dog("asd",2,5,"gu");
		d.print();
		Scanner sc = new Scanner(System.in);
		Penguin p = new Penguin(sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
		p.print();*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭ����XX�����");
		System.out.print("��ѡ��ҪҪ�����ĳ������֣�");
		String n = sc.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ�1.��  2.���");
		int a = sc.nextInt();
		String lei = null;
		switch(a){
		case 1:
			lei="��";
			System.out.print("��ѡ��"+lei+"��Ʒ�֣�");
			String b = sc.next();
			Dog d=new Dog(n,100,20,b);
			d.print();
			break;
		case 2:
			lei="���";
			System.out.print("��ѡ��"+lei+"���Ա�1.��  2.ĸ");
			int c = sc.nextInt();
			String xing = null;
			switch(c){
			case 1:
				xing="��";
				break;
			case 2:
				xing="ĸ";
				break;
			}
			Penguin e=new Penguin(n,100,20,xing);
			e.print();
			break;
		}
*/	
		
/*		UsbUser u = new UsbUser();
		u.lian();
		Scanner sc = new Scanner(System.in);
		UsbUser uu = new UsbUser(sc.nextInt());
		uu.pr();
		uu.yun(sc.nextDouble(), sc.nextDouble());
*/
		
/*		Pet p = new Dog();
		p.cure();
		Pet g = new Penguin();
		g.cure();
*/
//		Scanner sc = new Scanner(System.in);
		Master master = new Master();
		Pet d = new Dog();
		Pet p = new Penguin();
		master.Cure(d);
		master.Eat(d);
		master.wan(d);
		master.Cure(p);
		master.Eat(p);
		master.wan(p);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
