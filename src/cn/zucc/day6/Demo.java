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
		Animal cat = new Cat("喵了个咪");
		Animal duc = new Duck("可达鸭");
		Animal dol = new Dolphin("什么名字好");
		an.add(cat);
		an.add(duc);
		an.add(dol);
		System.out.println("动物名字"+"\t\t"+"腿数"+"\t"+"叫声");
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
