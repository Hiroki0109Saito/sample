package Term_4;

import java.util.Scanner;

public class Ex4_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("何個*を表示しますか:");
	    int a=scanner.nextInt();
		
		for(int i=0;i<a;i++){
		System.out.print("*");
		}
		System.out.println();
		scanner.close();

	}

}
