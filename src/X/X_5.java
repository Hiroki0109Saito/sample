package X;

import java.util.Scanner;

public class X_5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("��:");
		int a=scanner.nextInt();
		
		switch(a){
		case 2:System.out.println("28���ł�");
		break;

		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30���ł�");
		break;
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("31���ł�");
		break;

		default:System.out.println("���͂��Ԉ���Ă��܂��B");
		}
		scanner.close();

	}

}
