package Term_3;

import java.util.Scanner;

public class Ex3_12 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("����a:");
		double a=scanner.nextDouble();
		System.out.print("����b:");
		double b=scanner.nextDouble();

		double n=0;
		
			if(a>b){
				n =a;
			}else{
				n=b;
			}
				System.out.println("�傫���ق��̒l��"+n+"�ł��B");
			
		scanner.close();

	}

}
