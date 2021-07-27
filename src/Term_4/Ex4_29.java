package Term_4;

import java.util.Scanner;

public class Ex4_29 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("整数を加算します。");
		
		int a=0;
		int i=1;
		int sum=0;
		
		do{
			System.out.println("■第"+i+"グループ");
			do{
			System.out.print("整数:");
			a=scanner.nextInt();
			sum+=a;
			if(a==88888){
				sum-=a;
			}else if(a==99999){
				sum-=a;
			}
			}while(a!=88888&&a!=99999);
			i++;
		}while(a!=99999);
		
		System.out.println("合計は"+sum+"です。");		
		scanner.close();

	}

}
