package Term_3;

import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner=new Scanner(System.in);

		System.out.print("実数a:");
		int a=scanner.nextInt();
		System.out.print("実数b:");
		int b=scanner.nextInt();

		int n=0;
		
			if(a>b){
				n =a-b;
			}else{
				n=b-a;
			}
				System.out.println("それらの差は"+n+"です。");
			
		scanner.close();

	}

}
