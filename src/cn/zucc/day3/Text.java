package cn.zucc.day3;

import java.util.Scanner;

public class Text {



	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("输入行数：");
		int a = sc.nextInt();
		System.out.println("输入符号：");
		String b = sc.next();
		Image wsw = new Image();
		wsw.im(a,b);
*/
	
/*	Scanner sc = new Scanner(System.in);
	System.out.println("输入学生姓名：");
	String name1 = sc.next();
	System.out.println("输入学生姓名：");
	String name2 = sc.next();
	System.out.println("输入学生姓名：");
	String name3 = sc.next();
	System.out.println("输入学生姓名：");
	String name4 = sc.next();
	System.out.println("输入学生姓名：");
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
		System.out.println("请输入客户的姓名");
		cs.insert(sc.next());
		System.out.println("继续输入吗？（y/n）");
		flag=sc.next();
		}while(flag.equals("y"));
		cs.show();
*/

		
/* 		
错的
 * 		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		CustomerBiz k = new CustomerBiz();
		k.addName(names);
		k.showNames(names);
		
		
		System.out.println("\n输入查找：");
		k.search(sc.next(),names);
		boolean search = false;
		if(search==true){
			System.out.println("找到");
		}else{
			System.out.println("没找到");
		}
*/	
	
/*		boolean con=true;
		CustomerBiz cust = new CustomerBiz();
		Scanner input = new Scanner(System.in);
		while(con){
			for(int i=0;i<cust.names.length;i++){
				System.out.print("请输入客户的姓名：");
				String newName=input.next();
				cust.sddName(newName);
				System.out.print("还继续吗？");
				String answer=input.next();
				if("n".equals(answer)){
					con=false;
					break;
				}
			}
		}
		cust.show();
		System.out.print("\n请输入要查找的客户姓名：");
		String findName=input.next();
		if(cust.search(findName)){
			System.out.println("找到了");
		}else {
			System.out.println("没找到");
		}
*/
		
/*		例VipManager  Vip
 * 
 * 		Scanner sc = new Scanner(System.in);
		VipManager vm = new VipManager();
		String flag;
		do{
			Vip vip=new Vip();
			System.out.println("输入会员编号：");
			String num=sc.next();
			System.out.println("输入会员积分：");
			int score=sc.nextInt();
			vip.num=num;
			vip.score=score;
			vm.addVip(vip);
			System.out.println("是否继续输入？（y/n）");
			flag=sc.next();
		}while(flag.equals("y"));
		System.out.println("***会员列表***");
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
		System.out.println("输入第一门课的成绩：");
		int as = sc.nextInt();
		System.out.println("输入第二门课的成绩：");
		int bs = sc.nextInt();
		System.out.println("输入第三门课的成绩：");
		int cs = sc.nextInt();
		stu.as=as;
		stu.bs=bs;
		stu.cs=cs;
		float d=ss.avg(stu);
		System.out.println("该学生平均分："+d);
*/		
		
	
	//	Scanner sc = new Scanner(System.in);
	/*	Students stu = new Students();
		String flag;
		int k=1;
		do{
			Height he = new Height();
			System.out.print("请输入第"+k+"位学生的身高（cm）：");
			double h=sc.nextDouble();
			System.out.println("是否继续输入？（y/n）");
			flag=sc.next();
			k++;
		}while(flag.equals("y"));
 	*/

/*		Height stu = new Height();
		for(int i=0;i<5;i++){
			Students stu1=new Students();
			System.out.println("请输入学生身高");
			double hg=sc.nextDouble();
			stu1.h=hg;
			stu.add(stu1);
		}
		System.out.println("平均身高是："+stu.avg());
*/
		
/*		Scanner sc = new Scanner(System.in);
		HuiYuanCaoZuo cz = new HuiYuanCaoZuo();
		String flag;
		do{
			HuiYuan hh = new HuiYuan();
			System.out.print("输入编号：");
			int number = sc.nextInt();
			System.out.print("输入积分：");
			int jifen = sc.nextInt();
			hh.number=number;
			hh.jifen=jifen;
			cz.add(cz,hh);
			cz.show();
			System.out.println("是否添加？（y/n）");
			flag=sc.next();
		}while(flag.equals("y"));
*/	
	
	
		Scanner sc = new Scanner(System.in);
		VipManager vm = new VipManager();
		String flag;
		do{
			Vip vip=new Vip();
			System.out.println("输入会员编号：");
			String num=sc.next();
			System.out.println("输入会员积分：");
			int score=sc.nextInt();
			vip.num=num;
			vip.score=score;
			vm.addVip(vip);
			System.out.println("是否继续输入？（y/n）");
			flag=sc.next();
		}while(flag.equals("y"));
		System.out.println("***会员列表***");
		vm.showVips();
	
	
	
	
	
	
	
	
	
	
	
	}

}
