package Term_4;

import java.util.Scanner;

public class Ex4_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scanner=new Scanner(System.in);
		
		System.out.println("カウントアップします");
		System.out.print("正の整数値:");
	    int a=scanner.nextInt();
	    
		for(int i=0;i<a+1;i++){
		System.out.println(i);
		}
		System.out.println();
		scanner.close();

	}

}
