package Term_4;

import java.util.Scanner;

public class Ex4_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("何cmから:");
		int a=scanner.nextInt();
		System.out.print("何cmまで:");
		int b=scanner.nextInt();
		System.out.print("何cmごと:");
		int c=scanner.nextInt();
		System.out.println("身長 標準体重");
		System.out.println("--------------");

		int n=1+(b-a)/c;

		while(n!=0){
			System.out.println(a+" "+(a-100)*0.9);
			a=a+c;
			n--;
		}
		scanner.close();
	}
}
