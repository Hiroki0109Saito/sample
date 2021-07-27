package Term_3;

import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
Scanner scanner=new Scanner(System.in);

		System.out.print("変数A:");
		int a=scanner.nextInt();
		System.out.print("変数B:");
		int b=scanner.nextInt();

		if(a%b==0){
			System.out.println("BはAの約数です。");
		}else{
			System.out.println("BはAの約数ではありません。");
		}
		scanner.close();
	}

}
