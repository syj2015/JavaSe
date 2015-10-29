package cn.zucc.day6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVDMgr extends DVD {
	List<DVD> dvd = new ArrayList<DVD>();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	// **************************************************
	public void initial() { // 初始化
		DVD lmjr = new DVD("罗马假日", 0, "2010-07-10");
		DVD fshl = new DVD("风声鹤唳", 1, "");
		DVD lmmw = new DVD("浪漫满屋", 1, "");
		dvd.add(lmjr);
		dvd.add(fshl);
		dvd.add(lmmw);
	}

	// ***************************************************
	Scanner sc = new Scanner(System.in);

	public void startMeun() throws ParseException {// 开始菜单，切换
		initial();
		System.out.println("====================");
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("--------------------");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退        出");
		System.out.println("--------------------");
		System.out.print("请选择：");
		switch (sc.nextInt()) {
		case 1:// 新增DVD
			break;
		case 2:// 查看DVD
			search();
			break;
		case 3:// 删除DVD
			delete();
			break;
		case 4:// 借出DVD
			borrow();
			break;
		case 5:// 归还DVD
			returnDvd();
			break;
		case 6:// 退 出
			System.out.println("谢谢使用！");
			break;
		case 0:// 返 回
			startMeun();
			break;
		default:
			System.out.println("输入错误，请重新输入：");
			startMeun();
		}
	}

	// *****************************************************

	public void search() throws ParseException {// 查询
		System.out.println("--->查看DVD");
		System.out.println("序号\t状态\t名称\t\t借出日期");
		String dfgh;
		for (int i = 0; i < dvd.size(); i++) {
			if (dvd.get(i).getState() == 0) {
				dfgh = "已借出";
			} else {
				dfgh = "可借";
			}
			System.out.println(i + 1 + "\t" + dfgh + "\t《"
					+ dvd.get(i).getName() + "》\t" + dvd.get(i).getData() );
		}
		System.out.println("********************");
		System.out.println("输入0返回：");
		switch (sc.nextInt()) {
		case 0:// 返 回
			startMeun();
			break;
		default:
			System.out.println("输入错误，请重新输入：");
			startMeun();
		}
	}

	// *****************************************************
	public void add() throws ParseException {// 增加
		System.out.println("--->增加DVD");
		System.out.print("请输入DVD名称：");
		String amy = "傲慢与偏见";
		DVD amypj = new DVD(amy, 1, "");
		dvd.add(amypj);
		System.out.println("新增《" + amy + "》成功！");
		System.out.println("********************");
		System.out.println("输入0返回：");
		switch (sc.nextInt()) {
		case 0:// 返 回
			startMeun();
			break;
		default:
			System.out.println("输入错误，请重新输入：");
			startMeun();
		}
	}

	// *******************************************************
	public void delete() throws ParseException {// 删除3
		System.out.println("--->删除DVD");
		System.out.print("请输入DVD名称：");
		String shan = sc.next();
		int j = 0, k = 0;
		for (int i = 0; i < dvd.size(); i++) {
			if (dvd.get(i).getName().equals(shan)) {
				if (dvd.get(i).getState() == 1) {
					dvd.remove(i);
					j++;
				} else {
					k++;
				}
			}
		}
		if (j != 0) {
			System.out.println("删除成功！");
		} else if (k != 0) {
			System.out.println("书已借出");
		} else {
			System.out.println("书不存在");
		}

		System.out.println("********************");
		System.out.println("输入0返回：");
		switch (sc.nextInt()) {
		case 0:// 返 回
			startMeun();
			break;
		default:
			System.out.println("输入错误，请重新输入：");
			startMeun();
		}

		System.out.println("书已借出或不存在，请重新输入：");
		startMeun();

	}

	// *******************************************
	public void returnDvd() throws ParseException {// 5
		System.out.println("--->归还DVD");
		System.out.print("请输入DVD名称：");
		String gui = sc.next();
		System.out.print("请输入归还日期（年-月-日）：");
		String huan = sc.next();
//		double money;
		int j = 0, k = 0;
		for (int i = 0; i < dvd.size(); i++) {
			if (dvd.get(i).getName().equals(gui)) {
				if (dvd.get(i).getState() == 0) {
					dvd.get(i).setState(1);
//					money = sdf.parse(huan) - sdf.parse(dvd.get(i).setDate());
					System.out.println("归还《" + gui + "》成功！");
					System.out.println("借出日期（年-月-日）：" + dvd.get(i).getData());
					System.out.println("归还日期（年-月-日）：" + huan);
					j++;
				} else {
					k++;
				}
			}
		}
		if (j != 0) {
			System.out.println("归还成功！");
		} else if (k != 0) {
			System.out.println("已归还");
		} else {
			System.out.println("书不存在");
		}
		System.out.println("********************");
		System.out.println("输入0返回：");
		switch (sc.nextInt()) {
		case 0:// 返 回
			startMeun();
			// break;
		default:
			System.out.println("输入错误，请重新输入：");
			startMeun();
		}
		System.out.println("请重新输入：");
		startMeun();

	}

	// ********************************************

	public void borrow() throws ParseException {//4
		System.out.println("--->借DVD");
		System.out.print("请输入DVD名称：");
		String jie = sc.next();
		System.out.print("请输入借出日期（年-月-日）：");
		String chu = sc.next();
		int j = 0, k = 0;
		for (int i = 0; i < dvd.size(); i++) {
			if (dvd.get(i).getName().equals(jie)) {
				if (dvd.get(i).getState() == 1) {
					dvd.get(i).setState(0);
					dvd.get(i).setData(chu);
					System.out.println("归还《" + jie + "》成功！");
					System.out.println("借出日期（年-月-日）：" + dvd.get(i).getData());
					System.out.println("归还日期（年-月-日）：" + chu);
					j++;
				} else {
					k++;
				}
			}
		}
		if (j != 0) {
			System.out.println("归还成功！");
		} else if (k != 0) {
			System.out.println("已借出");
		} else {
			System.out.println("书不存在");
		}
		System.out.println("********************");
		System.out.println("输入0返回：");
		switch (sc.nextInt()) {
		case 0:// 返 回
			startMeun();
			// break;
		default:
			System.out.println("输入错误，请重新输入：");
			startMeun();
		}
		System.out.println("请重新输入：");
		startMeun();

	}

	// ************************************************************//

}
