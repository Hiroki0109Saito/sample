package Term_3;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("�����l:");
		int a=scanner.nextInt();

		if(a>0){
			if(a%3==0){
				System.out.println("���̒l��3�Ŋ���؂�܂��B");
			}else if(a%3==1){
				System.out.println("���̒l��3�Ŋ��������܂��1�ł��B");
			}else if(a%3==2){
				System.out.println("���̒l��3�Ŋ��������܂��2�ł��B");
			}
		}else{
				System.out.println("���łȂ��l�����͂���܂����B");
			}
		scanner.close();
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
