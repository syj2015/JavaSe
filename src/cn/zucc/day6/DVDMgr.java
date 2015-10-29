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
	public void initial() { // ��ʼ��
		DVD lmjr = new DVD("�������", 0, "2010-07-10");
		DVD fshl = new DVD("�������", 1, "");
		DVD lmmw = new DVD("��������", 1, "");
		dvd.add(lmjr);
		dvd.add(fshl);
		dvd.add(lmmw);
	}

	// ***************************************************
	Scanner sc = new Scanner(System.in);

	public void startMeun() throws ParseException {// ��ʼ�˵����л�
		initial();
		System.out.println("====================");
		System.out.println("��ӭʹ������DVD������");
		System.out.println("--------------------");
		System.out.println("1.����DVD");
		System.out.println("2.�鿴DVD");
		System.out.println("3.ɾ��DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("6.��        ��");
		System.out.println("--------------------");
		System.out.print("��ѡ��");
		switch (sc.nextInt()) {
		case 1:// ����DVD
			break;
		case 2:// �鿴DVD
			search();
			break;
		case 3:// ɾ��DVD
			delete();
			break;
		case 4:// ���DVD
			borrow();
			break;
		case 5:// �黹DVD
			returnDvd();
			break;
		case 6:// �� ��
			System.out.println("ллʹ�ã�");
			break;
		case 0:// �� ��
			startMeun();
			break;
		default:
			System.out.println("����������������룺");
			startMeun();
		}
	}

	// *****************************************************

	public void search() throws ParseException {// ��ѯ
		System.out.println("--->�鿴DVD");
		System.out.println("���\t״̬\t����\t\t�������");
		String dfgh;
		for (int i = 0; i < dvd.size(); i++) {
			if (dvd.get(i).getState() == 0) {
				dfgh = "�ѽ��";
			} else {
				dfgh = "�ɽ�";
			}
			System.out.println(i + 1 + "\t" + dfgh + "\t��"
					+ dvd.get(i).getName() + "��\t" + dvd.get(i).getData() );
		}
		System.out.println("********************");
		System.out.println("����0���أ�");
		switch (sc.nextInt()) {
		case 0:// �� ��
			startMeun();
			break;
		default:
			System.out.println("����������������룺");
			startMeun();
		}
	}

	// *****************************************************
	public void add() throws ParseException {// ����
		System.out.println("--->����DVD");
		System.out.print("������DVD���ƣ�");
		String amy = "������ƫ��";
		DVD amypj = new DVD(amy, 1, "");
		dvd.add(amypj);
		System.out.println("������" + amy + "���ɹ���");
		System.out.println("********************");
		System.out.println("����0���أ�");
		switch (sc.nextInt()) {
		case 0:// �� ��
			startMeun();
			break;
		default:
			System.out.println("����������������룺");
			startMeun();
		}
	}

	// *******************************************************
	public void delete() throws ParseException {// ɾ��3
		System.out.println("--->ɾ��DVD");
		System.out.print("������DVD���ƣ�");
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
			System.out.println("ɾ���ɹ���");
		} else if (k != 0) {
			System.out.println("���ѽ��");
		} else {
			System.out.println("�鲻����");
		}

		System.out.println("********************");
		System.out.println("����0���أ�");
		switch (sc.nextInt()) {
		case 0:// �� ��
			startMeun();
			break;
		default:
			System.out.println("����������������룺");
			startMeun();
		}

		System.out.println("���ѽ���򲻴��ڣ����������룺");
		startMeun();

	}

	// *******************************************
	public void returnDvd() throws ParseException {// 5
		System.out.println("--->�黹DVD");
		System.out.print("������DVD���ƣ�");
		String gui = sc.next();
		System.out.print("������黹���ڣ���-��-�գ���");
		String huan = sc.next();
//		double money;
		int j = 0, k = 0;
		for (int i = 0; i < dvd.size(); i++) {
			if (dvd.get(i).getName().equals(gui)) {
				if (dvd.get(i).getState() == 0) {
					dvd.get(i).setState(1);
//					money = sdf.parse(huan) - sdf.parse(dvd.get(i).setDate());
					System.out.println("�黹��" + gui + "���ɹ���");
					System.out.println("������ڣ���-��-�գ���" + dvd.get(i).getData());
					System.out.println("�黹���ڣ���-��-�գ���" + huan);
					j++;
				} else {
					k++;
				}
			}
		}
		if (j != 0) {
			System.out.println("�黹�ɹ���");
		} else if (k != 0) {
			System.out.println("�ѹ黹");
		} else {
			System.out.println("�鲻����");
		}
		System.out.println("********************");
		System.out.println("����0���أ�");
		switch (sc.nextInt()) {
		case 0:// �� ��
			startMeun();
			// break;
		default:
			System.out.println("����������������룺");
			startMeun();
		}
		System.out.println("���������룺");
		startMeun();

	}

	// ********************************************

	public void borrow() throws ParseException {//4
		System.out.println("--->��DVD");
		System.out.print("������DVD���ƣ�");
		String jie = sc.next();
		System.out.print("�����������ڣ���-��-�գ���");
		String chu = sc.next();
		int j = 0, k = 0;
		for (int i = 0; i < dvd.size(); i++) {
			if (dvd.get(i).getName().equals(jie)) {
				if (dvd.get(i).getState() == 1) {
					dvd.get(i).setState(0);
					dvd.get(i).setData(chu);
					System.out.println("�黹��" + jie + "���ɹ���");
					System.out.println("������ڣ���-��-�գ���" + dvd.get(i).getData());
					System.out.println("�黹���ڣ���-��-�գ���" + chu);
					j++;
				} else {
					k++;
				}
			}
		}
		if (j != 0) {
			System.out.println("�黹�ɹ���");
		} else if (k != 0) {
			System.out.println("�ѽ��");
		} else {
			System.out.println("�鲻����");
		}
		System.out.println("********************");
		System.out.println("����0���أ�");
		switch (sc.nextInt()) {
		case 0:// �� ��
			startMeun();
			// break;
		default:
			System.out.println("����������������룺");
			startMeun();
		}
		System.out.println("���������룺");
		startMeun();

	}

	// ************************************************************//

}
