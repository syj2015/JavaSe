/*package cn.zucc.day4;

public class Dog extends Pet {
	private String strain;
	
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}


	public Dog() {
		super();
		// ����ɲ����Բ�д��
	}
	

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}
	


	public void print(){
		System.out.println("��������:"+super.getName()+"\t�����ȣ�"+super.getHealth()+
				"\t���ܶȣ�"+super.getLove()+"\tƷ�֣�"+strain);
	}

}*/


package cn.zucc.day4;

public class Dog extends Pet {
	private String strain;
	
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}


	public Dog() {
		super();
		// ����ɲ����Բ�д��
	}
	

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}
	


	public void print(){
		System.out.println("��������:"+super.getName()+"\t�����ȣ�"+super.getHealth()+
				"\t���ܶȣ�"+super.getLove()+"\tƷ�֣�"+strain);
	}

	
	public void cure(){
		System.out.println("�����ҩ");
	}
	
	public void catchingFlyDisc(){
		System.out.println("���˺͹�����ӷ�����Ϸ����������ֵ����10�����������ܶ�����5");
	}
	
	public void eat(){
		System.out.println("�����Ա���");
	}


	
	
	
	
}




















/*
 1�����ַ�Χ��0-99������0��99����
2���ڻ�ڼ䣨2015-10-22 14:00:00~2015-10-28 14:00:00��
ͨ�������ֿ�������������е����֣�������ֵ�ͬʱ������һ�����ߡ�
������������������һ�ߣ����нԿɣ�ʱ�����ɻ�ö�Ӧ����·������
3���������������40����/�Σ��������0-99�л��һ�����֡�
4��������������������ż������50����/�Σ�
�������0-99�л��һ�������ż����0����ż������
5������ȷ���������ض����25��������δ������һ�����֣�
�ѵ������ֲ��ᱻ��ȡ���������ӿ���Խ�࣬�۸�Խ�ߣ��ɼ�������ʾ����
6�������á���100����/�Σ���������ǰ����е��������֣�
��Ϩ���ѵ��������֣�ȫ�����߻�ú��Զ�������Ϸ����
7��··ͨ��������25������ȫ��������������õĽ�����
8����ˢ�¡���50����/�Σ���ˢ��··ͨ����������ɼ����������·���
9����ȡ��·�����󣬶�Ӧ���ѵ������ֲ���Ϩ��


���ֿ����и��ʻ�����µ��ߣ�
����ӡ�¡���׾��ꡢԿ���������������100������
ս��������Ƭ������֮��(20��)��Ӣ��֮ʯ��С�����ͽᾧ��
�м����꾭����������޽ᾧ(ÿ����5��)������ħ�����(10��)��
 */
