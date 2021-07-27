package Y;

import java.util.Scanner;

public class Y_11 {
	public static void kai(int a,int b,int c){
		System.out.println((-b+Math.sqrt(b*b-4*a*c))/(2*a));
		System.out.println((-b-Math.sqrt(b*b-4*a*c))/(2*a));
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ax^2+bx+c=0");
		System.out.print("a:");
		int a=scanner.nextInt();
		System.out.print("b:");
		int b=scanner.nextInt();
		System.out.print("c:");
		int c=scanner.nextInt();
		
		kai(a,b,c);
		scanner.close();
	}

}
