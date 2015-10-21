package cn.zucc.day3;

import java.util.Scanner;

public class CunKuan {
	public void zhu(double sum, int a) {
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("1.存款\t2.取款\t0.退出\n" + "输入办理的业务：");
			a = sc.nextInt();
			if (a == 1) {
				System.out.println("输入存款金额：");
				double b = sc.nextDouble();
				System.out.println("存款成功");
				sum = sum + b;
				System.out.println("***余额：" + sum + "***");
			} else if (a == 2) {
				System.out.println("输入取款金额：");
				double c = sc.nextDouble();
				System.out.println("取款成功");
				sum = sum - c;
				System.out.println("***余额：" + sum + "***");
			}

		} while (a != 0);
		System.out.println("谢谢使用!!");
	}
}
