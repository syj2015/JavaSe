package cn.zucc.day4;

public class Goods {
	public void dfg(){
		System.out.println("*********************");
		System.out.println("编号\t\t商品\t\t价格");
		System.out.println("*********************");
	}
	public void qwe(int v,int b){

		String[] zz ={"A","B","C","D","E"};
		double[] xx = {54,65,41,51,63};
		double sum = 0;
		for(int j=0;j<zz.length;j++){
			System.out.println(j+1+"\t\t"+zz[j]+"\t\t"+xx[j]);
			if(b==j+1){
				sum = xx[j]*v;
			}
		}	
		System.out.println(sum);

		
	}

}
