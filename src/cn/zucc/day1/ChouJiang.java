package cn.zucc.day1;
import java.util.Scanner;
public class ChouJiang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ѧ�Ÿ�λ�ϵ�����֮�͵���20�ı�������ѧ��" +
				"\n������ѧԱ����λ��ѧ�ţ�");
		int xuehao=sc.nextInt();
		int one=(int)(xuehao/1000);
		int two=(int)((xuehao-one*1000)/100);
		int three=(int)((xuehao-one*1000-two*100)/10);
		int four=(int)((xuehao-one*1000-two*100-three*10)/1);
		int xy=one+two+three+four;
		boolean isTure=xy==20;
		System.out.println("��������ѧ����"+isTure);
	}

}
