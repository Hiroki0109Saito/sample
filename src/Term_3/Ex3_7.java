package Term_3;

import java.util.Scanner;

public class Ex3_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner=new Scanner(System.in);

		System.out.print("変数a:");
		int a=scanner.nextInt();
		System.out.print("変数b:");
		int b=scanner.nextInt();

		if(a>b){
			System.out.println("aの方が大きいです。");
		}else if(a<b){
			System.out.println("bの方が大きいです。");
		}else{
			System.out.println("aとｂは同じ値です。");
		}
		scanner.close();

	}

}
