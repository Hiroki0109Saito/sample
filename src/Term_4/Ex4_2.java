package Term_4;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		String a="";

		while(a.length()!=3){
			System.out.print("3���̐��̐����l:");
			a=scanner.next();
		}
		System.out.println(a+"�Ɠ��͂��܂����ˁB");
		scanner.close();
	}

}
