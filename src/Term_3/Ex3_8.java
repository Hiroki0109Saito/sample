package Term_3;

import java.util.Scanner;

public class Ex3_8 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("�����l:");
		int a=scanner.nextInt();

		if(a>0){
			if(a%5==0){
				System.out.println("���̒l��5�Ŋ���؂�܂��B");
			}else{
				System.out.println("���̒l��5�ł͊���؂�܂���B");
			}
		}else{
			System.out.println("���łȂ��l�����͂���܂����B");
		}
		scanner.close();

	}

}
