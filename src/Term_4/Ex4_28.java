package Term_4;

import java.util.Scanner;

public class Ex4_28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか:");
		int a=scanner.nextInt();
		
		int b=a;
		int count=0;
		int num=0;
		int sum=0;
		
		do{
			System.out.print("整数:");
			num=scanner.nextInt();
			sum+=num;
			if(num<0){
				System.out.println("負の値は加算しません。");
				sum-=num;
				count--;
			}
			count++;
			b--;
		}while(b!=0);
		
		System.out.println("合計は"+sum+"です。");
		System.out.println("平均は"+sum/count+"です。");
		
		scanner.close();

	}

}
