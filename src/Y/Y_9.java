package Y;

import java.util.Scanner;

public class Y_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.print("いくらまぐろたこ");
		int a = scanner.nextInt();

		for (int i = 1; i <= a; i++) {

			if (i == 1) {
				System.out.println("√" + i + " -> " + "1");
			} else if (i % 100 == 0) {
				System.out.println("√" + i + " -> " + "10");
			} else if (i % 81 == 0) {
				System.out.println("√" + i + " -> " + "9");
			} else if (i % 64 == 0) {
				System.out.println("√" + i + " -> " + "8");
			} else if (i % 49 == 0) {
				if (i != 49) {
					System.out.println("√" + i + " -> " + "7" + "√" + i / 49);
				} else {
					System.out.println("√" + i + " -> " + "7");
				}
			} else if (i % 36 == 0) {
				if (i != 36) {
					System.out.println("√" + i + " -> " + "6" + "√" + i / 36);
				} else {
					System.out.println("√" + i + " -> " + "6");
				}
			} else if (i % 25 == 0) {
				if (i != 25) {
					System.out.println("√" + i + " -> " + "5" + "√" + i / 25);
				} else {
					System.out.println("√" + i + " -> " + "5");
				}
			} else if (i % 16 == 0) {
				if (i != 16) {
					System.out.println("√" + i + " -> " + "4" + "√" + i / 16);
				} else {
					System.out.println("√" + i + " -> " + "4");
				}
			} else if (i % 9 == 0) {
				if (i != 9) {
					System.out.println("√" + i + " -> " + "3" + "√" + i / 9);
				} else {
					System.out.println("√" + i + " -> " + "3");
				}
			} else if (i % 4 == 0) {
				if (i != 4) {
					System.out.println("√" + i + " -> " + "2" + "√" + i / 4);
				} else {
					System.out.println("√" + i + " -> " + "2");
				}
			} else {
				System.out.println("√" + i + " -> " + "√" + i);
			}
		}
		scanner.close();
	}
}
