package Term_4;

import java.util.Scanner;

public class Ex4_10 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("���̐����l:");
		int a=scanner.nextInt();

		int s=1;

		for(int i=1;i<a+1;i++){
			s=i*s;
		}
		System.out.println("1����"+a+"�܂ł̐ς�"+s+"�ł��B");
		scanner.close();
	}

}
