package Term_4;

import java.util.Scanner;

public class Ex4_8 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		int a=-1;

		while(a<0){
		System.out.print("���\�����܂���:");
	    a=scanner.nextInt();
		}


		while(a!=0){
		System.out.print("*");
		a--;
		if(a==0){
			break;

		}
		System.out.print("+");
		a--;
		}
		System.out.println();
		scanner.close();
	}

}
