package cn.zucc.day2;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Demo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner sc = new Scanner(System.in);
		System.out.println("�����źƵ�JAVA�ɼ���");
		int a = sc.nextInt();
		if(a >= 98){
			System.out.println("����MP4");
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("�����źƵ�JAVA�ɼ���");
		int a = sc.nextInt();
		System.out.println("�����źƵ����ֳɼ���");
		int b = sc.nextInt();
		if((a>98&&b>80)||(a==100&&b>70)){
			System.out.println("����MP4");
		}else if(a<=98){
			System.out.println("�ͷ����б���");
*/
		
/*		int x=1+(int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		int xuehao = sc.nextInt();
		int bai = (int)(xuehao/100)%10;
		System.out.println("��������"+x);
		if(bai == x){
			System.out.println("����MP3");
		}else{
			System.out.println("лл����");
		}
*/	
		
/*		Scanner sc = new Scanner(System.in);
		int chengji = sc.nextInt();
		if(chengji >= 80){
			System.out.println("����");
		}else if(chengji>=60){
			System.out.println("�е�");
		}else{
			System.out.println("��");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		System.out.print("�ҵĴ��"+q+"Ԫ������");
		if(q >= 5000000){
			System.out.println("��������");
		}else if(q>=1000000){
			System.out.println("������");
		}else if(q>=500000){
			System.out.println("������");
		}else if(q>=100000){
			System.out.println("����");
		}else{
			System.out.println("�ݰ���");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("����ɼ���");
		double f = sc.nextDouble();
		System.out.println("�����Ա�");
		String x = sc.next();
		if(f<10){
			if(x.equals("��")){
				System.out.println("�������������");
			}else{
				System.out.println("����Ů�������");
			}
		}else{
			System.out.println("δ�������");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ƿ��ǻ�Ա���ǣ�y��" +
				"�������ַ���");
		String a = sc.next();
		System.out.println("�����빺���");
		double b = sc.nextDouble();
		double c;
		if(a.equals("y")){
			if(b>=200){
				c=0.75;
			}else{
				c=0.8;
			}
		}else if(b>=100){
			c=0.9;
		}else{
			c=1;
		}
		double zf = b*c;
		System.out.println("ʵ��֧��"+zf);
*/
		
/*		System.out.print("�����Ա���֣�");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if(q >= 8000){
			System.out.println("�û�Ա���ܵ��ۿ���0.6");
		}else if(q>=4000){
			System.out.println("�û�Ա���ܵ��ۿ���0.7");
		}else if(q>=2000){
			System.out.println("�û�Ա���ܵ��ۿ���0.8");
		}else{
			System.out.println("�û�Ա���ܵ��ۿ���0.9");
		}
*/
		
/*		System.out.print("�������Σ�");
		Scanner sc = new Scanner(System.in);
		int mingCi = sc.nextInt();
		switch (mingCi){
		case 1:
			System.out.println("�μ���ʡ����ѧ��֯��" +
					"1��������Ӫ"); 
			break;
		case 2:
			System.out.println("�������ձʼǱ�����һ��"); 
			break;
		case 3:
			System.out.println("�����ƶ�Ӳ��һ��");
			break;
			default:
				System.out.println("û���κν��� ");
		 }
*/
		
/*		System.out.println("\t\t\t��ӭʹ��123456ϵͳ");
		System.out.println("\t\t\t\t1.��½ϵͳ");
		System.out.println("\t\t\t\t2.�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѡ��");
		int a = sc.nextInt();
		switch(a){
		case 1:
			System.out.println("��ӭ");
		case 2:
			System.out.println("ллʹ��");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("���������ѽ�");
		double q = sc.nextDouble();
		System.out.println("�Ƿ�μ��Żݻ������\n" +
				"1����50Ԫ����2Ԫ�������¿���һƿ\n"+
				"2����100Ԫ����3Ԫ����500ml����һƿ\n"+
				"3����100Ԫ����10Ԫ����5�������\n"+
				"4����200Ԫ����10Ԫ����1���ղ������˹�\n"+
				"5����200Ԫ����20Ԫ����ŷ����ˬ��ˮ1ƿ\n"+
				"0��������");
		System.out.println("��ѡ��");
		int x = sc.nextInt();
		System.out.print("���������ܽ�");
		if(q>=200){
			switch(x){
			case 1:
				System.out.println(q+2+"\n�ɹ��������¿���һƿ");
				break;
			case 2:
				System.out.println(q+3+"\n�ɹ�����500ml����һƿ");
				break;
			case 3:
				System.out.println(q+10+"\n�ɹ�����5�������");
				break;
			case 4:
				System.out.println(q+10+"\n�ɹ�����1���ղ������˹�");
				break;
			case 5:
				System.out.println(q+20+"\n�ɹ�����ŷ����ˬ��ˮ1ƿ");
				break;
			case 0:
				System.out.println(q+"\nδѡ�񻻹�");
				break;
			}
		}else if(q>=100){
			switch(x){
			case 1:
				System.out.println(q+2+"\n�ɹ��������¿���һƿ");
				break;
			case 2:
				System.out.println(q+3+"\n�ɹ�����500ml����һƿ");
				break;
			case 3:
				System.out.println(q+10+"\n�ɹ�����5�������");
				break;
			case 0:
				System.out.println(q+"\nδѡ�񻻹�");
				break;
			}
		}else if(q>=50){
			switch(x){
			case 1:
				System.out.println(q+2+"\n�ɹ��������¿���һƿ");
				break;
			case 0:
				System.out.println(q+"\nδѡ�񻻹�");
				break;
			}
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a<80){
			System.out.println("���縴ϰ�����翼�ԡ�");
			a = sc.nextInt();
		}
*/
		
		
/*		Scanner sc = new Scanner(System.in);
		int a = 0;
		do{
			System.out.println("���縴ϰ�����翼�ԡ�");
			a = sc.nextInt();
		}while(a<80);
*/
	
		
/*		for(int i=1;i<=10;i++){
			System.out.println("��"+i+"�죬"+"���縴ϰ���翼�ԡ�");
*/
		
/*		int i=0,j=0;
		for(i=1;i<10;i++){
			for(j=1;j<i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println(i+"*"+j+"="+i*j);
		}
*/	
	
/*		int a[]={8,4,2,1,23,344,12};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");//////
		
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = 0;
		for(int i=0;i<a.length;i++){
			if(b==a[i]){
				System.out.println("����");
			}else{
				c++;
			}
			if(c>=a.length){
				System.out.println("������");
			}
		}
*/		
		
/*		Scanner sc = new Scanner(System.in);
		double gw[]=new double[5];
		System.out.println("���뱾�����Ѽ�¼");
		System.out.print("�����һ�ʹ����");
		gw[0]=sc.nextDouble();
		System.out.print("����ڶ��ʹ����");
		gw[1]=sc.nextDouble();
		System.out.print("��������ʹ����");
		gw[2]=sc.nextDouble();
		System.out.print("������ıʹ����");
		gw[3]=sc.nextDouble();
		System.out.print("�������ʹ����");
		gw[4]=sc.nextDouble();
		System.out.println("���\t\t���");
		int k=0;
		double sum=0;
		for(int i=0;i<gw.length;i++){
			k=i+1;
			System.out.println(k+"\t\t"+gw[i]);
			sum=sum+gw[i];
		}
		System.out.println("�ܽ��\t\t"+sum);
*/		
		
/*		int xue[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("������5λͬѧ�ĳɼ�");
		xue[0]=sc.nextInt();
		xue[1]=sc.nextInt();
		xue[2]=sc.nextInt();
		xue[3]=sc.nextInt();
		xue[4]=sc.nextInt();
		Arrays.sort(xue);
		for(int i=0;i<xue.length;i++){
			System.out.print(xue[i]+" ");
		}
*/
		
/*		Scanner sc = new Scanner(System.in);
		int a[]=new int[]{99,85,82,63,60};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--){//����
			System.out.print(a[i]+" ");
		}
		System.out.println("�����ɼ���");
		int r=sc.nextInt();
		int b[]=new int[]{99,85,82,63,60,r};//��
		Arrays.sort(b);
		int j=-1;
		for(int i=b.length-1;i>=0;i--){
			j++;//�±����
			if(r==b[i]){//�ж�λ��
				System.out.println("����ɼ����±꣺"+j);
			}
		}
		System.out.println("�����ĳɼ���");
		for(int i=b.length-1;i>=0;i--){//����
			System.out.print(b[i]+" ");
		}
*/
		
		
/*		char[] xv=new char[]{'s','f','j','y','a','x','r','h'};
		System.out.print("ԭ��\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		Arrays.sort(xv);//����
		System.out.print("����\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		System.out.print("����\t");//����
		for(int i=xv.length-1;i>=0;i--){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
*/
		
		String[] xv=new String[]{"s","f","j","y",
				"a","x","r","h"};
		System.out.print("ԭ��\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		Arrays.sort(xv);//                          ����
		System.out.print("����\t");
		for(int i=0;i<xv.length;i++){
			System.out.print(xv[i]+"\t");
		}
		System.out.print("\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ַ��ǣ�");
		String xin = sc.next();
		System.out.print("\n");
		
		System.out.println("�²�����ַ���"+xin);
		String[] xxx = new String[]{"s","f","j","y",
				"a","x","r","h",xin};
		Arrays.sort(xxx);
		int j=0;
		for(int i=0;i<xxx.length;i++){
			if(xin==xxx[i]){
				System.out.println("�����ַ����±꣺"+j);
			}else{
				j++;
			}
		}
		System.out.print("������ַ����У�\t");
		for(int i=0;i<xxx.length;i++){
			System.out.print(xxx[i]+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
