package Term_3;

import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
Scanner scanner=new Scanner(System.in);

		System.out.print("�ϐ�A:");
		int a=scanner.nextInt();
		System.out.print("�ϐ�B:");
		int b=scanner.nextInt();

		if(a%b==0){
			System.out.println("B��A�̖񐔂ł��B");
		}else{
			System.out.println("B��A�̖񐔂ł͂���܂���B");
		}
		scanner.close();
	}

}
