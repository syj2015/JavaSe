package cn.zucc.day3;

public class HuiYuanCaoZuo {
	HuiYuan hy[] = new HuiYuan[20];
	public void add(HuiYuanCaoZuo cz,HuiYuan hh){
		for(int i=0;i<hy.length;i++){
			if(hy[i]==null){
				hy[i]= hh;
				break;
			}
		}
	}

	public void show(){
		System.out.print("±àºÅ\t");
		System.out.println("»ý·Ö");
		for(int i=0;i<hy.length;i++){
			HuiYuan hh=hy[i];
			if(hh==null){
				break;
			}
			System.out.println(hh.number+"\t"+hh.jifen);
		}
	}


}
