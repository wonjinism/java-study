package global.sesoc.ui;

import java.util.List;
import java.util.Scanner;

import global.sesoc.manager.ToyManagerMgr;
import global.sesoc.vo.Bicycle;
import global.sesoc.vo.Drone;
import global.sesoc.vo.GameConsole;
import global.sesoc.vo.Toy;

public class ToyManagerUI {
	Scanner input = new Scanner(System.in);
	ToyManagerMgr manager = new ToyManagerMgr();

	/**
	 * ������
	 */
	public ToyManagerUI() {
		int mNum = 0;

		while (true) {
			try {
				mainMenu();
				mNum = input.nextInt();

				switch (mNum) {
				case 1:
					insertToy();
					break;
				case 2:
					searchToy();
					break;
				case 3:
					deleteToy();
					break;
				case 4:
					searchForPrice();
					break;
				case 5:
					printToyInfo();
					break;
				case 9: // ���� �� ����
					System.out.println("������ ���� �� ���α׷� �����մϴ�.");
					manager.saveFile();
					return;
				}
			} catch (Exception e) {
				System.out.println("���� >>>>> �ٽ� �Է��� �ּ���.");
				input.nextLine();
				continue;
			}
		}

	}

	/**
	 * �ָ޴��� ȭ�鿡 ����Ѵ�.
	 */
	public void mainMenu() {
		System.out.println("\n===== Toy Manager ======");
		System.out.println("1. �峭�� ���");
		System.out.println("2. �峭�� �˻�");
		System.out.println("3. �峭�� ����");
		System.out.println("4. ���ݴ� �˻�");
		System.out.println("5. �峭�� ���� ���");
		System.out.println("9. ����");
		System.out.println("=======================");
		System.out.print("[ �޴�  ����  ] ");
	}

	/**
	 * �峭�� �߰��� ���� �޴��� ȣ���ϰ� �ش� �޴��� ���� ������ �Է¹��� �� Toy ��ü�� �����ϴ� makeToy() �޼��带 ȣ�� �� ��
	 * ���ϵ� Toy ��ü�� List�� �����Ѵ�.
	 */

	public void insertToy() {
		while (true) {
			try {
				int select = 0;
				insertMenu();
				select = input.nextInt();
				switch (select) {
				case 1:
				case 2:
				case 3:
					Toy makeToy = makeToy(select);
					boolean result = manager.insertToy(makeToy);
					if (result == false) {
						System.out.println("[ �̹� ��ϵ� ������ȣ ]");
					} else {
						System.out.println("[ ��� ���� ]");
					}
					break;
				case 9:
					return;
				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("���� >>>>> �ٽ� �Է��� �ּ���.");
				input.nextLine();
				continue;
			}
		}

	}

	/**
	 * �峭�� ��ü�� ����ϱ� ���� �޴��� ȭ�鿡 ���
	 */
	public void insertMenu() {
		System.out.println("\n===== �峭�� ��� �޴� =====");
		System.out.println("1. ������");
		System.out.println("2. ���");
		System.out.println("3. ���ӱ�");
		System.out.println("9. �����޴�");
		System.out.print("[ �峭�� ���� ] ");
	}

	public Toy makeToy(int toyType) {
		Toy toy = null;
		String name, serialNum;
		int price = 0;

		while (true) {
			try {
				System.out.print("> ������ȣ:");
				serialNum = input.next();
				System.out.print("> �̸�:");
				name = input.next();
				System.out.print("> ����:");
				price = input.nextInt();
				switch (toyType) {
				case 1:
					String type = null;
					while (true) {
						System.out.print("> ������ ����(1. ���ο�, 2. ��ǿ�) => ");
						int select = input.nextInt();
						if (select == 1) {
							type = "road";
							break;
						} else if (select == 2) {
							type = "mountain";
							break;
						} 
					}
					toy = new Bicycle(serialNum, name, price, type);
					break;
				case 2:
					System.out.print("> ���(���� ����) => ");
					int wingCount = input.nextInt();
					toy = new Drone(serialNum, name, price, wingCount);
					break;
				case 3:
					boolean isPortable = true;
					while (true) {
						System.out.print("> ���ӱ�(�޴밡�� ���� y/n) => ");
						String check = input.next();
						if (check.equals("Y") || check.equals("y")) {
							break;
						} else if (check.equals("N") || check.equals("n")) {
							isPortable = false;
							break;
						}
					}
					toy = new GameConsole(serialNum, name, price, isPortable);
					break;
				default:
				}
				return toy;
			} catch (Exception e) {
				System.out.println("���� >>>>> �ٽ� �Է��� �ּ���.");
				input.nextLine();
				continue;
			}
		}
	}

	/**
	 * ������ȣ�� �ش��ϴ� �峭���� �˻��Ͽ� ȭ�鿡 ����Ѵ�. �˻��� ���� ���� ��� �޽��� ���
	 */
	public void searchToy() {
		while (true) {
			System.out.print("\n> �峭�� ������ȣ: ");
			String serialNum = input.next();
			Toy sToy = manager.searchToy(serialNum);

			if (sToy != null) {
				System.out.println(sToy.toString());
			} else {
				System.out.println("�˻� ���� >>>>> �Է��Ͻ� ������ȣ�� �峭���� �������� �ʽ��ϴ�.\n");
			}
			return;
		}
	}

	/**
	 * �峭���� �ø����ȣ�� �Է¹޾� �ش��ϴ� �峭�� ������ �����Ѵ�.
	 */
	public void deleteToy() {
		System.out.println("\n===== �峭�� ���� �޴� =====");
		System.out.print("> �峭�� ���� ��ȣ: ");
		String serialNum = input.next();

		if (manager.deleteToy(serialNum)) {
			System.out.println("[ ���� ���� ]\n");
		} else {
			System.out.println("���� ���� >>>>> �Է��Ͻ� ������ȣ�� �峭���� �������� �ʽ��ϴ�.\n");
		}
	}

	/**
	 * ���ݴ� �˻� �ּ� ���ݰ� �ִ� ������ �Է¹޾� �ش��ϴ� ���� ���� ���� ��� �峭���� �˻��ؼ� ���
	 */
	public void searchForPrice() {
		System.out.println("\n===== ���� �˻� �޴� =====");

		System.out.print("> �ּҰ���: ");
		int minPrice = input.nextInt();

		System.out.print("> �ִ밡��: ");
		int maxPrice = input.nextInt();

		int count = 0;

		System.out.println("[ " + minPrice + "�� ~ " + maxPrice + "�� ������ ��ǰ �˻� ���");
		List<Toy> searchForPrice = manager.toyListForPrice(minPrice, maxPrice);
		for (Toy toy : searchForPrice) {
			System.out.println(toy.toString());
			count++;
		}
		System.out.println("�� �峭�� ����: [" + count + "] ��");
	}

	/**
	 * �峭�� ������ ȭ�鿡 ��� �峭�� ������ ����ϰ� �� �� �˻��� �峭���� ���� ��� �˻��� ���� ���� ��� ��ϵ� �峭���� ���ٴ� �޽���
	 * ���
	 */
	public void printToyInfo() {
		while (true) {
			printMenu();
			int pNum = input.nextInt();
			String msg = null;

			switch (pNum) {
			case 1:
				msg = "�� �峭�� ����: [";
				break;
			case 2:
				msg = "�� ������ ���: [";
				break;
			case 3:
				msg = "�� ��� ���: [";
				break;
			case 4:
				msg = "�� �����ܼ� ���: [";
				break;
			case 9:
				return;
			default:
				System.out.println("[ �޴��� �ٽ� ������ �ּ���. ] ");
				continue;
			}

			int count = 0;
			List<Toy> printToyInfo = manager.printToyInfo(pNum);
			if (printToyInfo.size() == 0) {
				System.out.println("��ϵ� �峭���� �����ϴ�.");
			} else {
				for (Toy toy : printToyInfo) {
					System.out.println(toy.toString());
					count++;
				}
				System.out.println("�� �峭�� ����: [" + count + "] ��");	
			}
		}
	}

	/**
	 * �峭�� ���� ��� ���� �޼���
	 */
	public void printMenu() {
		System.out.println("\n===== �峭�� ���� ��� =====");
		System.out.println("1. ��ü ���");
		System.out.println("2. ������ ���� ���");
		System.out.println("3. ��� ���� ���");
		System.out.println("4. �����ܼ� ���� ���");
		System.out.println("9. ���� �޴�");
		System.out.print("[ ���� ] ");

	}
}
