package Y;

import java.util.Scanner;

public class Y_2 {
	public static int ururu(int n) {
		if (n % 400 == 0) {
			return 366;
		} else if (n % 100 == 0) {
			return 365;
		} else if (n % 4 == 0) {
			return 366;
		} else {
			return 365;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.print("年:");
		int year = scanner.nextInt();
		System.out.print("月:");
		int month = scanner.nextInt();

		int sum = 0;

		for (int i = 1606; i < year; i++) {
			sum += ururu(i);
		}

		int s = sum % 7;

		int num = 0;
		int r = 0;

		if (ururu(year) == 365) {
			for (int i = 1; i < month; i++) {
				switch (i) {
				case 2:
					num += 28;
					break;

				case 4:
				case 6:
				case 9:
				case 11:
					num += 30;
					break;

				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					num += 31;
					break;
				}
			}
		} else {
			for (int i = 1; i < month; i++) {
				switch (i) {
				case 2:
					num += 29;
					break;

				case 4:
				case 6:
				case 9:
				case 11:
					num += 30;
					break;

				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					num += 31;
					break;
				}
			}
		}

		int p = num % 7;

		int x = 0;

		if (7 <= (s + p)) {
			x = (s + p) - 7;
		} else {
			x = s + p;
		}

		switch (month) {
		case 2:
			r = 28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			r = 30;
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			r = 31;
			break;
		}

		if (ururu(year) == 366) {
			if (month == 2) {
				r = 29;
			}
		}

		System.out.println();
		System.out.println("日" + "\t" + "月" + "\t" + "火" + "\t" + "水" + "\t"
				+ "木" + "\t" + "金" + "\t" + "土" + "\t");

		if (x != 0 && x != 7) {
			for (int i = 0; i < x; i++) {
				System.out.print("\t");
			}
		}

		if (x != 7) {
			for (int i = 1; i <= 7 - x; i++) {
				System.out.print(" " + i + "\t");
				if (i == 7 - x) {
					System.out.println();
				}
			}
		}

		for (int i = 7 - x; i < r;) {
			for (int j = 1; j <= 7; j++) {
				if ((i + j) < 10) {
					System.out.print(" " + (i + j) + "\t");
				} else {
					System.out.print((i + j) + "\t");
				}
				if (i + j == r) {
					break;
				}
			}
			System.out.println();
			i += 7;
		}
		scanner.close();
	}
}
