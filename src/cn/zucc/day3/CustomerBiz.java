package cn.zucc.day3;

import java.util.Scanner;
/*
public class CustomerBiz {
	Scanner sc = new Scanner(System.in);
	String pd;
	public void addName(String[] names){
		
		for(int i = 0;i < names.length;i++){
			System.out.println("输入用户姓名：");
			names[i]=sc.next();
			System.out.println("继续输入？（y/n）：");
			pd = sc.next();
			if(!pd.equals("y")){
				break;
			}
		}
		
	}
	
	public void showNames(String[] names){
		System.out.println("**************************");
		System.out.println("\t\t用户列表");
		System.out.println("**************************");
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				break;
			}
			System.out.println(names[i]+"\t");
		}
	}
}
*/
/*public class CustomerBiz {
	Scanner sc=new Scanner(System.in);
	String[] cus = new String[30];
	public void insert(String name){
		
		for(int i=0;i<cus.length;i++){
			
			if(cus[i]==null){
				cus[i]=name;
				break;
			}
				
			
		}
	}
	public void show(){
		for(int i =0;i<cus.length;i++)
		{
			if(cus[i]==null){
				break;
			}else{
			System.out.print(cus[i]+"\t");
			}
		}
	}
}
*/

/*
错的
 *
	public class CustomerBiz {
	Scanner sc = new Scanner(System.in);
	String pd;
	public void addName(String[] names){
		
		for(int i = 0;i < names.length;i++){
			System.out.println("输入用户姓名：");
			names[i]=sc.next();
			System.out.println("继续输入？（y/n）：");
			pd = sc.next();
			if(!pd.equals("y")){
				break;
			}
		}
		
	}
	
	public void showNames(String[] names){
		System.out.println("**************************");
		System.out.println("\t\t用户列表");
		System.out.println("**************************");
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				break;
			}
			System.out.print(names[i]+"\t");
		}
	}
	
	public boolean search(String na,String[] names){
		for(int i=0;i<names.length;i++){
			if(names.equals(na)){
				return true;
			}
		}
		if(search==true){
			System.out.println("找到");
		}else{
			System.out.println("没找到");
		}
*/		
		
public class CustomerBiz {
	String names[]=new String[30];
	public void sddName(String name){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void show(){
		System.out.println("*********************");
		System.out.println("客户姓名列表");
		System.out.println("*********************");
		for (int i=0;i<names.length;i++){
			if(names[i]!=null){
			System.out.print(names[i]+"   ");
			}
		}
	}
	
	public boolean search(String name){
        boolean find=false;
        for(int i=0;i<names.length;i++){
              if(name.equals(names[i])){
                    find=true;
                    break;
                }
            }
        return find;
    }
}