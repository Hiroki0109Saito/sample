package Term_2;

import java.util.Scanner;

public class Ex2_10 {
	public static void main(String []args){
	
	Scanner scanner=new Scanner(System.in);

	System.out.println("���̕\�ʐςƑ̐ς����߂܂��B");
	System.out.print("���a:");
	double a=scanner.nextDouble();
	
	double p=Math.PI;
	
	System.out.println("�\�ʐς�"+4*p*Math.pow(a, 2)+"�ł��B");
	System.out.println("�̐ς�"+4*p*Math.pow(a, 3)/3+"�ł��B");
	
	scanner.close();

	}
}
