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
		System.out.println("���뿪ʼ����λ�ã�");
		int v = ss.nextInt();
		System.out.println("�����������λ�ã�");
		int b = ss.nextInt();
		System.out.println("�����������ѧ����");
		String h = ss.next();
		int p = 0;
		for(int j=v-1;j<+b;j++){
			if(lb[j].equals(h)){
				System.out.println("�ҵ�");
				p++;
			}else if(p>=b-v+1){
				System.out.println("û�ҵ�");
			}
		}

	}

}
