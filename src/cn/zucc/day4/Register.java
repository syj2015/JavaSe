package cn.zucc.day4;

//import java.util.Scanner;

public class Register {

	public void verify(String n,String m,String m1,int i){
		i = 0;
		if(n.length()<3||m.length()<6){
			System.out.println(">3,>6");
		}else if(!m1.equals(m)){
			System.out.println("要相同");
		}else{
			System.out.println("成功");
			i = 1;
		}

		
	}
}
