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
		System.out.println("����μ�java�����ѵ��ѧԱ������");
		int jr=sc.nextInt();
		System.out.println("����μ�android�ֻ�������ѵ��ѧԱ������");
		int as=sc.nextInt();
		System.out.println("����μ��Ա�����Ӫ����ѵ��ѧԱ������");
		int tb=sc.nextInt();
		System.out.println("����μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ������");
		int qr=sc.nextInt();
		System.out.println("!!!�����ܵ��ۿ���8���Ż�!!!");
		
		double zxf=jrf*jr+asf*as+tbf*tb+qrf*qr;
		System.out.println("����ǰӦ֧����ѧ�ѣ�"+zxf);
		
		double dzf=zxf*0.8;
		System.out.println("���ۺ�Ӧ֧����ѧ�ѣ�"+dzf);
		
		System.out.println("��֧����");
		double zf=sc.nextDouble();
		System.out.println("ʵ��֧����"+zf);
		double aaaaa=zf-dzf;
		if(aaaaa>=0){
			double zl=aaaaa;
			System.out.println("���㣺"+zl);
		}else{
			double bq=0-aaaaa;
			System.out.println("Ӧ������"+bq);
		}
		
		int jf=(int)(dzf/100);
		System.out.println("����õĻ��֣�"+jf+"\nף��ѧϰ��죡");
		
		
	}

}
