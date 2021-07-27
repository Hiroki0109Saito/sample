package Term_4;

import java.util.Scanner;

public class Ex4_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("正の整数値:");
		int a=scanner.nextInt();

		int s=1;

		for(int i=1;i<a+1;i++){
			s=i*s;
		}
		System.out.println("1から"+a+"までの積は"+s+"です。");
		scanner.close();
	}

}
