package Term_3;

import java.util.Scanner;

public class Ex3_17 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("����a:");
		int a=scanner.nextInt();
		System.out.print("����b:");
		int b=scanner.nextInt();

		if(a>b){
			System.out.println("�傫���ق��̒l��"+a+"�ł��B");
			System.out.println("�������ق��̒l��"+b+"�ł��B");
		}else if(a<b){
			System.out.println("�傫���ق��̒l��"+b+"�ł��B");
			System.out.println("�������ق��̒l��"+a+"�ł��B");
		}else{
			System.out.println("��̒l�͓����ł��B");
		}

		// TODO �����������ꂽ���\�b�h�E�X�^�u

		scanner.close();
	}

}
