package cn.zucc.day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������γ̴��ţ�1~3֮������֣�");
		try {
			switch (sc.nextInt()) {

			case 1:
				System.out.println("C#���");
				break;
			case 2:
				System.out.println("java���");
				break;
			case 3:
				System.out.println("QSL���");
				break;
			default:
				int a=1/0;
				break;
			}

		} catch (Exception e) {
			System.out.println("�������");

		} finally {
			System.out.println("��ӭ����");
		}
		
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("�����뱻����:");
			int num1 = in.nextInt();
			System.out.print("���������:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d", 
					num1, num2, num1/ num2));
		} catch (InputMismatchException e) {
			System.err.println("�������ͳ���������������");
		} catch (ArithmeticException e) {
			System.err.println("��������Ϊ�㡣");
		} catch (Exception e) {
			System.err.println("����δ֪�쳣��");
		} 



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
