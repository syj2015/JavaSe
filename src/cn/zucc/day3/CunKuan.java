package cn.zucc.day3;

import java.util.Scanner;

public class CunKuan {
	public void zhu(double sum, int a) {
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("1.���\t2.ȡ��\t0.�˳�\n" + "��������ҵ��");
			a = sc.nextInt();
			if (a == 1) {
				System.out.println("�������");
				double b = sc.nextDouble();
				System.out.println("���ɹ�");
				sum = sum + b;
				System.out.println("***��" + sum + "***");
			} else if (a == 2) {
				System.out.println("����ȡ���");
				double c = sc.nextDouble();
				System.out.println("ȡ��ɹ�");
				sum = sum - c;
				System.out.println("***��" + sum + "***");
			}

		} while (a != 0);
		System.out.println("ллʹ��!!");
	}
}
