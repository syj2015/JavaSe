package cn.zucc.day3;

import java.util.Scanner;

public class Text {



	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int a = sc.nextInt();
		System.out.println("������ţ�");
		String b = sc.next();
		Image wsw = new Image();
		wsw.im(a,b);
*/
	
/*	Scanner sc = new Scanner(System.in);
	System.out.println("����ѧ��������");
	String name1 = sc.next();
	System.out.println("����ѧ��������");
	String name2 = sc.next();
	System.out.println("����ѧ��������");
	String name3 = sc.next();
	System.out.println("����ѧ��������");
	String name4 = sc.next();
	System.out.println("����ѧ��������");
	String name5 = sc.next();
	String[] lb = new String[5];
	lb[0]=name1;
	lb[1]=name2;
	lb[2]=name3;
	lb[3]=name4;
	lb[4]=name5;
	ChaXue p=new ChaXue();
	p.cx(lb);
*/	
	
/*		Scanner sc = new Scanner(System.in);
		CunKuan qq = new CunKuan();
		double sum=0;
		int a = 0;
		qq.zhu(sum,a);
*/	
		
/*		//CustomerBiz 1
 * 		String[] names = new String[10];
		CustomerBiz k = new CustomerBiz();
		k.addName(names);
		k.showNames(names);
*/
/*		//CustomerBiz 2
		Scanner sc = new Scanner(System.in);
		String flag=null;
		CustomerBiz cs = new CustomerBiz();
		do{
		System.out.println("������ͻ�������");
		cs.insert(sc.next());
		System.out.println("���������𣿣�y/n��");
		flag=sc.next();
		}while(flag.equals("y"));
		cs.show();
*/

		
/* 		
���
 * 		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		CustomerBiz k = new CustomerBiz();
		k.addName(names);
		k.showNames(names);
		
		
		System.out.println("\n������ң�");
		k.search(sc.next(),names);
		boolean search = false;
		if(search==true){
			System.out.println("�ҵ�");
		}else{
			System.out.println("û�ҵ�");
		}
*/	
	
/*		boolean con=true;
		CustomerBiz cust = new CustomerBiz();
		Scanner input = new Scanner(System.in);
		while(con){
			for(int i=0;i<cust.names.length;i++){
				System.out.print("������ͻ���������");
				String newName=input.next();
				cust.sddName(newName);
				System.out.print("��������");
				String answer=input.next();
				if("n".equals(answer)){
					con=false;
					break;
				}
			}
		}
		cust.show();
		System.out.print("\n������Ҫ���ҵĿͻ�������");
		String findName=input.next();
		if(cust.search(findName)){
			System.out.println("�ҵ���");
		}else {
			System.out.println("û�ҵ�");
		}
*/
		
/*		��VipManager  Vip
 * 
 * 		Scanner sc = new Scanner(System.in);
		VipManager vm = new VipManager();
		String flag;
		do{
			Vip vip=new Vip();
			System.out.println("�����Ա��ţ�");
			String num=sc.next();
			System.out.println("�����Ա���֣�");
			int score=sc.nextInt();
			vip.num=num;
			vip.score=score;
			vm.addVip(vip);
			System.out.println("�Ƿ�������룿��y/n��");
			flag=sc.next();
		}while(flag.equals("y"));
		System.out.println("***��Ա�б�***");
		vm.showVips();
*/	
	
		
/*		Xp pai = new Xp();
		String[] names ={"afasd","safh","yhab","usahfu","sugaf"};
		pai.pxm(names);
		String[] newpxm = pai.pxm(names);
		for(int i=0;i<newpxm.length;i++){
			System.out.println(newpxm[i]);
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		Score ss = new Score();
		Students stu = new Students();
		System.out.println("�����һ�ſεĳɼ���");
		int as = sc.nextInt();
		System.out.println("����ڶ��ſεĳɼ���");
		int bs = sc.nextInt();
		System.out.println("��������ſεĳɼ���");
		int cs = sc.nextInt();
		stu.as=as;
		stu.bs=bs;
		stu.cs=cs;
		float d=ss.avg(stu);
		System.out.println("��ѧ��ƽ���֣�"+d);
*/		
		
	
	//	Scanner sc = new Scanner(System.in);
	/*	Students stu = new Students();
		String flag;
		int k=1;
		do{
			Height he = new Height();
			System.out.print("�������"+k+"λѧ������ߣ�cm����");
			double h=sc.nextDouble();
			System.out.println("�Ƿ�������룿��y/n��");
			flag=sc.next();
			k++;
		}while(flag.equals("y"));
 	*/

/*		Height stu = new Height();
		for(int i=0;i<5;i++){
			Students stu1=new Students();
			System.out.println("������ѧ�����");
			double hg=sc.nextDouble();
			stu1.h=hg;
			stu.add(stu1);
		}
		System.out.println("ƽ������ǣ�"+stu.avg());
*/
		
/*		Scanner sc = new Scanner(System.in);
		HuiYuanCaoZuo cz = new HuiYuanCaoZuo();
		String flag;
		do{
			HuiYuan hh = new HuiYuan();
			System.out.print("�����ţ�");
			int number = sc.nextInt();
			System.out.print("������֣�");
			int jifen = sc.nextInt();
			hh.number=number;
			hh.jifen=jifen;
			cz.add(cz,hh);
			cz.show();
			System.out.println("�Ƿ���ӣ���y/n��");
			flag=sc.next();
		}while(flag.equals("y"));
*/	
	
	
		Scanner sc = new Scanner(System.in);
		VipManager vm = new VipManager();
		String flag;
		do{
			Vip vip=new Vip();
			System.out.println("�����Ա��ţ�");
			String num=sc.next();
			System.out.println("�����Ա���֣�");
			int score=sc.nextInt();
			vip.num=num;
			vip.score=score;
			vm.addVip(vip);
			System.out.println("�Ƿ�������룿��y/n��");
			flag=sc.next();
		}while(flag.equals("y"));
		System.out.println("***��Ա�б�***");
		vm.showVips();
	
	
	
	
	
	
	
	
	
	
	
	}

}
