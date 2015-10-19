package cn.zucc.day1;
import java.util.Scanner;
public class PeiXun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jrf=20;
		int asf=30;
		int tbf=10;
		int qrf=30;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("输入参加java软件培训的学员人数：");
		int jr=sc.nextInt();
		System.out.println("输入参加android手机开发培训的学员人数：");
		int as=sc.nextInt();
		System.out.println("输入参加淘宝开店营销培训的学员人数：");
		int tb=sc.nextInt();
		System.out.println("输入参加嵌入式工程师培训的学员人数：");
		int qr=sc.nextInt();
		System.out.println("!!!您享受的折扣是8折优惠!!!");
		
		double zxf=jrf*jr+asf*as+tbf*tb+qrf*qr;
		System.out.println("打折前应支付总学费："+zxf);
		
		double dzf=zxf*0.8;
		System.out.println("打折后应支付总学费："+dzf);
		
		System.out.println("请支付：");
		double zf=sc.nextDouble();
		System.out.println("实际支付："+zf);
		double aaaaa=zf-dzf;
		if(aaaaa>=0){
			double zl=aaaaa;
			System.out.println("找零："+zl);
		}else{
			double bq=0-aaaaa;
			System.out.println("应补交："+bq);
		}
		
		int jf=(int)(dzf/100);
		System.out.println("您获得的积分："+jf+"\n祝您学习愉快！");
		
		
	}

}
