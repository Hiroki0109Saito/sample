package Term_2;

import java.util.Scanner;

public class Ex2_7 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner (System.in);

		System.out.print("�����l:");
		String a=scanner.next();

		System.out.println("�ŉ��ʌ����������l��"+(a.substring(0,(a.length()-1)))+"�ł��B");

		System.out.println("�ŉ��ʌ���"+a.substring(a.length()-1,(a.length()))+"�ł��B");

		// TODO �����������ꂽ���\�b�h�E�X�^�u
		scanner.close();
	}

}
