package Term_4;

import java.util.Scanner;

public class Ex4_19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("nの値:");
		int n=scanner.nextInt();

		for(int i=1;i<n+1;i++){
			System.out.println(i+"の2乗は"+i*i);
//			System.out.println(i+"の2乗は"+(int)Math.pow(i,2));
		}
		scanner.close();
	}
}
