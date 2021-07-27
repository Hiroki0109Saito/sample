package Term_4;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner=new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		System.out.print("nの値:");
		int a=scanner.nextInt();

		int sum=0;

		for(int i=0;i<a+1;i++){
			sum+=i;
		}
		System.out.println("1から"+a+"までの和は"+sum+"です。");
		scanner.close();

	}
}