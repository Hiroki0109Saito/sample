package Term_5;

import java.util.Scanner;

public class Ex5_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����:");
		int a=scanner.nextInt();
		
		System.out.println(" 8�i���ł�"+Integer.toOctalString(a)+"�ł��B");
		
//		System.out.println(" 8�i���ł�"+Integer.parseInt("123",8)+"�ł��B");
		System.out.println("16�i���ł�"+Integer.toHexString(a)+"�ł��B");

		scanner.close();
	}

}
