package Term_2;

import java.util.Random;
import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		System.out.print("�����l:");
		int a=scanner.nextInt();

		int b=rand.nextInt(11)+a-5;

		System.out.println("���̒l�}5�̗����𐶐����܂����B");
		System.out.println("�l��"+b+"�ł��B");

		scanner.close();
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
