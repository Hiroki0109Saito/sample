package Term_3;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Scanner scanner=new Scanner(System.in);

		System.out.print("�����l:");
		int a=scanner.nextInt();

		if(a>0){
			System.out.println("���̒l�͐��ł��B");
		}
			else if(a==0){
			System.out.println("���̒l��0�ł��B");
		}else{
			System.out.println("���̒l�͕��ł��B");
		}
		scanner.close();
	}

}
