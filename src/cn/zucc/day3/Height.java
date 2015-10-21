package cn.zucc.day3;
public class Height {
	Students[] stus = new Students[5];
	int i=0;
public void add(Students stu)
{
	stus[i]=stu;
	i++;
}	
public double avg()
	{
		double all=0;	
		for(int j=0; j<i;j++)
		{ all=all+stus[j].h;}			
		return (all/i);	
	}
}
