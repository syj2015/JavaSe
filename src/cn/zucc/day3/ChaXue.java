package cn.zucc.day3;

import java.util.Arrays;
import java.util.Scanner;

public class ChaXue {
	// TODO Auto-generated constructor stub

	public void cx(String[] lb) {
		Scanner ss = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print(lb[i] + "\t");
		}
		System.out.println("输入开始查找位置：");
		int v = ss.nextInt();
		System.out.println("输入结束查找位置：");
		int b = ss.nextInt();
		System.out.println("输入结束查找学生：");
		String h = ss.next();
		int p = 0;
		for(int j=v-1;j<+b;j++){
			if(lb[j].equals(h)){
				System.out.println("找到");
				p++;
			}else if(p>=b-v+1){
				System.out.println("没找到");
			}
		}

	}

}
