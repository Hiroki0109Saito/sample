package Term_3;

import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		Scanner scanner=new Scanner(System.in);

		System.out.print("����a:");
		int a=scanner.nextInt();
		System.out.print("����b:");
		int b=scanner.nextInt();

		int n=0;
		
			if(a>b){
				n =a-b;
			}else{
				n=b-a;
			}
				System.out.println("�����̍���"+n+"�ł��B");
			
		scanner.close();

	}

}
