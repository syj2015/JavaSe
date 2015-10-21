package cn.zucc.day3;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			System.out.print(i + ",");
			while (++i < 5) {
				continue;
			}
			System.out.print(i);
		}

	}

}
