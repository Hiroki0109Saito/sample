package Term_4;

import java.util.Scanner;

public class Ex4_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		String a="";

		System.out.println("正の整数値の桁数を求めます。");
		System.out.print("正の整数値:");
		a=scanner.next();
		
		System.out.println("その数は"+a.length()+"です。");
		scanner.close();
	}
}
