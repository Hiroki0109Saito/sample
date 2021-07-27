package Term_2;

import java.util.Scanner;

public class Ex2_7 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner (System.in);

		System.out.print("整数値:");
		String a=scanner.next();

		System.out.println("最下位桁を除いた値は"+(a.substring(0,(a.length()-1)))+"です。");

		System.out.println("最下位桁は"+a.substring(a.length()-1,(a.length()))+"です。");

		// TODO 自動生成されたメソッド・スタブ
		scanner.close();
	}

}
