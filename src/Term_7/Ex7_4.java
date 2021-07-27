package Term_7;

import java.util.Scanner;

public class Ex7_4 {
	
	public static int sumUp(int n){
		
		int sum=0;
		for(int i=1;i<n+1;i++){
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("1からxまでの和を求めます。");
		System.out.print("xの値:");
		int x=scanner.nextInt();
		
		System.out.println("1から"+x+"までの和は"+sumUp(x)+"です。");
		scanner.close();

	}

}
