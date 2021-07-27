package Term_4;

import java.util.Scanner;

public class Ex4_22 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("左下直角の二等辺三角形を表示します。");
		System.out.print("段数は:");

		int a=scanner.nextInt();

		for(int i=0;i<a;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}

}