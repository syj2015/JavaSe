package cn.zucc.day3;

public class Score {
	Students[] sk = new Students[20];
	public float avg(Students stu){
		float avg=0;
		avg=(stu.as+stu.bs+stu.cs)/3;
		return avg;
	}
	

}
