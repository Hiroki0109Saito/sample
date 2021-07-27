package Term_3;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		
Scanner scanner=new Scanner(System.in);
		
		System.out.print("整数値:");
		int a=scanner.nextInt();
		
		if(a>0){
			System.out.println("その絶対値は"+a+"です。");
		}else{
			System.out.println("その絶対値は"+-a+"です。");
		}

		scanner.close();
	}
}
