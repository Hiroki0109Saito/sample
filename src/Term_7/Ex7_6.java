package Term_7;

import java.util.Scanner;

public class Ex7_6 {
	public static void printSeason(int m){
		switch(m){
		case 1:
		case 2:
		case 12:System.out.print("その月の季節は冬です。");
		break;

		case 3:
		case 4:
		case 5:System.out.print("その月の季節は春です。");
		break;


		case 6:
		case 7:
		case 8:System.out.print("その月の季節は夏です。");
		break;

		case 9:
		case 10:
		case 11:System.out.print("その月の季節は秋です。");
		break;

		default:System.out.print("");


		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner=new Scanner(System.in);

		System.out.print("何月ですか(1~12):");
		int a=scanner.nextInt();

		printSeason(a);

		scanner.close();
	}
}
