package Term_3;

import java.util.Scanner;

public class Ex3_7 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		Scanner scanner=new Scanner(System.in);

		System.out.print("�ϐ�a:");
		int a=scanner.nextInt();
		System.out.print("�ϐ�b:");
		int b=scanner.nextInt();

		if(a>b){
			System.out.println("a�̕����傫���ł��B");
		}else if(a<b){
			System.out.println("b�̕����傫���ł��B");
		}else{
			System.out.println("a�Ƃ��͓����l�ł��B");
		}
		scanner.close();

	}

}
