package cn.zucc.day2;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Demo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner sc = new Scanner(System.in);
		System.out.println("输入张浩的JAVA成绩：");
		int a = sc.nextInt();
		if(a >= 98){
			System.out.println("奖励MP4");
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("输入张浩的JAVA成绩：");
		int a = sc.nextInt();
		System.out.println("输入张浩的音乐成绩：");
		int b = sc.nextInt();
		if((a>98&&b>80)||(a==100&&b>70)){
			System.out.println("奖励MP4");
		}else if(a<=98){
			System.out.println("惩罚进行编码");
*/
		
/*		int x=1+(int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		int xuehao = sc.nextInt();
		int bai = (int)(xuehao/100)%10;
		System.out.println("幸运数是"+x);
		if(bai == x){
			System.out.println("奖励MP3");
		}else{
			System.out.println("谢谢参与");
		}
*/	
		
/*		Scanner sc = new Scanner(System.in);
		int chengji = sc.nextInt();
		if(chengji >= 80){
			System.out.println("良好");
		}else if(chengji>=60){
			System.out.println("中等");
		}else{
			System.out.println("差");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		System.out.print("我的存款"+q+"元，我买");
		if(q >= 5000000){
			System.out.println("凯迪拉克");
		}else if(q>=1000000){
			System.out.println("帕萨特");
		}else if(q>=500000){
			System.out.println("依兰特");
		}else if(q>=100000){
			System.out.println("奥托");
		}else{
			System.out.println("捷安特");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("输入成绩：");
		double f = sc.nextDouble();
		System.out.println("输入性别：");
		String x = sc.next();
		if(f<10){
			if(x.equals("男")){
				System.out.println("进入男子组决赛");
			}else{
				System.out.println("进入女子组决赛");
			}
		}else{
			System.out.println("未进入决赛");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("输入是否是会员：是（y）" +
				"否（其他字符）");
		String a = sc.next();
		System.out.println("请输入购物金额：");
		double b = sc.nextDouble();
		double c;
		if(a.equals("y")){
			if(b>=200){
				c=0.75;
			}else{
				c=0.8;
			}
		}else if(b>=100){
			c=0.9;
		}else{
			c=1;
		}
		double zf = b*c;
		System.out.println("实际支付"+zf);
*/
		
/*		System.out.print("输入会员积分：");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if(q >= 8000){
			System.out.println("该会员享受的折扣是0.6");
		}else if(q>=4000){
			System.out.println("该会员享受的折扣是0.7");
		}else if(q>=2000){
			System.out.println("该会员享受的折扣是0.8");
		}else{
			System.out.println("该会员享受的折扣是0.9");
		}
*/
		
/*		System.out.print("输入名次：");
		Scanner sc = new Scanner(System.in);
		int mingCi = sc.nextInt();
		switch (mingCi){
		case 1:
			System.out.println("参加麻省理工大学组织的" +
					"1个月夏令营"); 
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部"); 
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
			default:
				System.out.println("没有任何奖励 ");
		 }
*/
		
/*		System.out.println("\t\t\t欢迎使用123456系统");
		System.out.println("\t\t\t\t1.登陆系统");
		System.out.println("\t\t\t\t2.退出系统");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入选择：");
		int a = sc.nextInt();
		switch(a){
		case 1:
			System.out.println("欢迎");
		case 2:
			System.out.println("谢谢使用");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		double q = sc.nextDouble();
		System.out.println("是否参加优惠换购活动：\n" +
				"1：满50元，加2元换购百事可乐一瓶\n"+
				"2：满100元，加3元换购500ml可乐一瓶\n"+
				"3：满100元，加10元换购5公斤面粉\n"+
				"4：满200元，加10元换购1个苏泊尔炒菜锅\n"+
				"5：满200元，加20元换购欧莱雅爽肤水1瓶\n"+
				"0：不换购");
		System.out.println("请选择：");
		int x = sc.nextInt();
		System.out.print("本次消费总金额：");
		if(q>=200){
			switch(x){
			case 1:
				System.out.println(q+2+"\n成功换购百事可乐一瓶");
				break;
			case 2:
				System.out.println(q+3+"\n成功换购500ml可乐一瓶");
				break;
			case 3:
				System.out.println(q+10+"\n成功换购5公斤面粉");
				break;
			case 4:
				System.out.println(q+10+"\n成功换购1个苏泊尔炒菜锅");
				break;
			case 5:
				System.out.println(q+20+"\n成功换购欧莱雅爽肤水1瓶");
				break;
			case 0:
				System.out.println(q+"\n未选择换购");
				break;
			}
		}else if(q>=100){
			switch(x){
			case 1:
				System.out.println(q+2+"\n成功换购百事可乐一瓶");
				break;
			case 2:
				System.out.println(q+3+"\n成功换购500ml可乐一瓶");
				break;
			case 3:
				System.out.println(q+10+"\n成功换购5公斤面粉");
				break;
			case 0:
				System.out.println(q+"\n未选择换购");
				break;
			}
		}else if(q>=50){
			switch(x){
			case 1:
				System.out.println(q+2+"\n成功换购百事可乐一瓶");
				break;
			case 0:
				System.out.println(q+"\n未选择换购");
				break;
			}
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a<80){
			System.out.println("上午复习，下午考试。");
			a = sc.nextInt();
		}
*/
		
		
/*		Scanner sc = new Scanner(System.in);
		int a = 0;
		do{
			System.out.println("上午复习，下午考试。");
			a = sc.nextInt();
		}while(a<80);
*/
	
		
/*		for(int i=1;i<=10;i++){
			System.out.println("第"+i+"天，"+"上午复习下午考试。");
*/
		
/*		int i=0,j=0;
		for(i=1;i<10;i++){
			for(j=1;j<i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println(i+"*"+j+"="+i*j);
		}
*/	
	
/*		int a[]={8,4,2,1,23,344,12};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");//////
		
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = 0;
		for(int i=0;i<a.length;i++){
			if(b==a[i]){
				System.out.println("包含");
			}else{
				c++;
			}
			if(c>=a.length){
				System.out.println("不包含");
			}
		}
*/		
		
/*		Scanner sc = new Scanner(System.in);
		double gw[]=new double[5];
		System.out.println("输入本月消费记录");
		System.out.print("输入第一笔购物金额：");
		gw[0]=sc.nextDouble();
		System.out.print("输入第二笔购物金额：");
		gw[1]=sc.nextDouble();
		System.out.print("输入第三笔购物金额：");
		gw[2]=sc.nextDouble();
		System.out.print("输入第四笔购物金额：");
		gw[3]=sc.nextDouble();
		System.out.print("输入第五笔购物金额：");
		gw[4]=sc.nextDouble();
		System.out.println("序号\t\t金额");
		int k=0;
		double sum=0;
		for(int i=0;i<gw.length;i++){
			k=i+1;
			System.out.println(k+"\t\t"+gw[i]);
			sum=sum+gw[i];
		}
		System.out.println("总金额\t\t"+sum);
*/		
		
/*		int xue[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5位同学的成绩");
		xue[0]=sc.nextInt();
		xue[1]=sc.nextInt();
		xue[2]=sc.nextInt();
		xue[3]=sc.nextInt();
		xue[4]=sc.nextInt();
		Arrays.sort(xue);
		for(int i=0;i<xue.length;i++){
			System.out.print(xue[i]+" ");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		int a[]=new int[]{99,85,82,63,60};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--){//倒序
			System.out.print(a[i]+" ");
		}
		System.out.println("新增成绩：");
		int r=sc.nextInt();
		int b[]=new int[]{99,85,82,63,60,r};//新
		Arrays.sort(b);
		int j=-1;
		for(int i=b.length-1;i>=0;i--){
			j++;//下标计算
			if(r==b[i]){//判断位置
				System.out.println("插入成绩的下标："+j);
			}
		}
		System.out.println("插入后的成绩：");
		for(int i=b.length-1;i>=0;i--){//倒序
			System.out.print(b[i]+" ");
		}
*/
		
		
/*		char[] xv=new char[]{'s','f','j','y','a','x','r','h'};
		System.out.print("原序：\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		Arrays.sort(xv);//升序
		System.out.print("升序：\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		System.out.print("降序：\t");//降序
		for(int i=xv.length-1;i>=0;i--){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
*/
		
		String[] xv=new String[]{"s","f","j","y",
				"a","x","r","h"};
		System.out.print("原序：\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		Arrays.sort(xv);//                          升序
		System.out.print("升序：\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("待插入字符是：");
		String xin = sc.next();
		System.out.print("\n");
		
		System.out.println("新插入的字符："+xin);
		String[] xxx = new String[]{"s","f","j","y",
				"a","x","r","h",xin};
		Arrays.sort(xxx);
		int j=0;
		for(int i=0;i<xxx.length;i++){
			if(xin==xxx[i]){
				System.out.println("插入字符的下标："+j);
			}else{
				j++;
			}
		}
		System.out.print("插入后字符序列：\t");
		for(int i=0;i<xxx.length;i++){
			System.out.print(xxx[i]+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
