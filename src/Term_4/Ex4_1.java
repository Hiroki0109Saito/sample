package Term_4;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		int b=1;

		while(b==1){
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
		System.out.print("������x? 1�cYes/0�cNo");
		b=scanner.nextInt();
		}
		scanner.close();
	}
}
