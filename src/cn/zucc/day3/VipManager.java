package cn.zucc.day3;


public class VipManager {
	Vip vs[] = new Vip[30];
	
	public void addVip(Vip vip){
		for(int i=0;i<vs.length;i++){
			if(vs[i]==null){
				vs[i]=vip;
				break;
			}
		}
	}
	public void showVips(){
		System.out.print("±àºÅ\t");
		System.out.println("»ý·Ö");
		for(int i=0;i<vs.length;i++){
			Vip vip=vs[i];
			if(vip==null){
				break;
			}
			System.out.println(vip.num+"\t"+vip.score);
		}
	}

	

}
