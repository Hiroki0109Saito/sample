package Term_7;

import java.util.Scanner;

public class Ex7_1 {

	public static int signOf(int a){
		if(a>0){
			return 1;
		}else if(a<0){
			return -1;
		}else{
			return 0;

		}
	}

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.print("����x:");
		int x=scanner.nextInt();

		int a=signOf(x);

		System.out.println("signOf(x)��"+a+"�ł��B");

		scanner.close();
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
