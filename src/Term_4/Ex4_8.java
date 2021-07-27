package Term_4;

import java.util.Scanner;

public class Ex4_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		int a=-1;

		while(a<0){
		System.out.print("何個表示しますか:");
	    a=scanner.nextInt();
		}


		while(a!=0){
		System.out.print("*");
		a--;
		if(a==0){
			break;

		}
		System.out.print("+");
		a--;
		}
		System.out.println();
		scanner.close();
	}

}
