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
		System.out.print("请输入课程代号（1~3之间的数字）");
		try {
			switch (sc.nextInt()) {

			case 1:
				System.out.println("C#编程");
				break;
			case 2:
				System.out.println("java编程");
				break;
			case 3:
				System.out.println("QSL编程");
				break;
			default:
				int a=1/0;
				break;
			}

		} catch (Exception e) {
			System.out.println("输入错误");

		} finally {
			System.out.println("欢迎建议");
		}
		
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("请输入被除数:");
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d", 
					num1, num2, num1/ num2));
		} catch (InputMismatchException e) {
			System.err.println("被除数和除数必须是整数。");
		} catch (ArithmeticException e) {
			System.err.println("除数不能为零。");
		} catch (Exception e) {
			System.err.println("其他未知异常。");
		} 



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
