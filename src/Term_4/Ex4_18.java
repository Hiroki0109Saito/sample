package Term_4;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		System.out.print("�����l:");
		int a=scanner.nextInt();

		int count=0;

		for(int i=1;i<=a;i++){
			if(a%i==0){
				System.out.print(i+" ");
				count++;
			}
		}

		System.out.println("\n�񐔂�"+count+"�ł��B");
		scanner.close();
	}
}