package Term_5;

import java.util.Scanner;

public class Ex5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("整数:");
		int a=scanner.nextInt();
		
		System.out.println(" 8進数では"+Integer.toOctalString(a)+"です。");
		
//		System.out.println(" 8進数では"+Integer.parseInt("123",8)+"です。");
		System.out.println("16進数では"+Integer.toHexString(a)+"です。");

		scanner.close();
	}

}
