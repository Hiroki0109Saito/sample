package Term_3;

import java.util.Scanner;

public class Ex3_11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("�_��:");
		int a=scanner.nextInt();

		if(0<=a&&a<=100){
			if(0<=a&&a<=59){
				System.out.println("�s��");
			}else if(60<=a&&a<=69){
				System.out.println("��");
			}else if(70<=a&&a<=79){
				System.out.println("��");
			}else if(80<=a&&a<=100){
				System.out.println("�D");
			}
		}else{
				System.out.println("�s���ȓ_���ł��B");
			}
		scanner.close();
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
