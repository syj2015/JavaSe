package cn.zucc.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//******************************************************//
		Scanner sc = new Scanner(System.in);
		List<Animal> an = new ArrayList<Animal>();
		Animal cat = new Cat("���˸���");
		Animal duc = new Duck("�ɴ�Ѽ");
		Animal dol = new Dolphin("ʲô���ֺ�");
		an.add(cat);
		an.add(duc);
		an.add(dol);
		System.out.println("��������"+"\t\t"+"����"+"\t"+"����");
		for(Animal asdf : an){
			System.out.print(asdf.getName()+"\t");
			if(asdf instanceof Cat){
				System.out.print("\t"+((Cat) asdf).getLegNum()+"\t");
			}else if(asdf instanceof Duck){
				System.out.print("\t"+((Duck) asdf).getLegNum()+"\t");
			}else if(asdf instanceof Dolphin){
				System.out.print("\t");
			}
			asdf.shout();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//********************************************************//	
	}

}
