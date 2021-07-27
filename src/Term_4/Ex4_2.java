package Term_4;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		String a="";

		while(a.length()!=3){
			System.out.print("3桁の正の整数値:");
			a=scanner.next();
		}
		System.out.println(a+"と入力しましたね。");
		scanner.close();
	}

}
