package Term_2;

import java.util.Scanner;

public class Ex2_10 {
	public static void main(String []args){
	
	Scanner scanner=new Scanner(System.in);

	System.out.println("球の表面積と体積を求めます。");
	System.out.print("半径:");
	double a=scanner.nextDouble();
	
	double p=Math.PI;
	
	System.out.println("表面積は"+4*p*Math.pow(a, 2)+"です。");
	System.out.println("体積は"+4*p*Math.pow(a, 3)/3+"です。");
	
	scanner.close();

	}
}
