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
		// 这个可不可以不写？
	}
	

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}
	


	public void print(){
		System.out.println("宠物名字:"+super.getName()+"\t健康度："+super.getHealth()+
				"\t亲密度："+super.getLove()+"\t品种："+strain);
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
		// 这个可不可以不写？
	}
	

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}
	


	public void print(){
		System.out.println("宠物名字:"+super.getName()+"\t健康度："+super.getHealth()+
				"\t亲密度："+super.getLove()+"\t品种："+strain);
	}

	
	public void cure(){
		System.out.println("打针吃药");
	}
	
	public void catchingFlyDisc(){
		System.out.println("主人和狗狗玩接飞盘游戏，狗狗健康值减少10，与主人亲密度增加5");
	}
	
	public void eat(){
		System.out.println("狗狗吃饱了");
	}


	
	
	
	
}




















/*
 1、数字范围：0-99（包括0和99）。
2、在活动期间（2015-10-22 14:00:00~2015-10-28 14:00:00）
通过“数字开启”点亮面板中的数字，获得数字的同时随机获得一个道具。
当被点亮的数字连成一线（行列皆可）时，即可获得对应的线路奖励。
3、【随机开启】：40点数/次，将随机从0-99中获得一个数字。
4、【开启奇数】【开启偶数】：50点数/次，
将随机从0-99中获得一个奇或者偶数（0当作偶数）。
5、【精确开启】：必定获得25个数字中未点亮的一个数字，
已点亮数字不会被抽取到。（格子开启越多，价格越高，可见弹窗提示）。
6、【重置】：100点数/次，将更换当前面板中的所有数字，
并熄灭已点亮的数字（全部道具获得后自动重置游戏）。
7、路路通奖励：当25个数字全部被点亮后额外获得的奖励。
8、【刷新】：50点数/次，可刷新路路通奖励，详情可见主界面右下方。
9、领取线路奖励后，对应的已点亮数字不会熄灭。


数字开启有概率获得以下道具：
斗宠印章、灵甲精魂、钥匙礼包、秘银包（100个）、
战魂勇气碎片、无限之尘(20个)、英魂之石、小块神谕结晶、
中级命魂经验礼包、神修结晶(每天限5个)、混沌魔晶礼包(10个)。
 */
