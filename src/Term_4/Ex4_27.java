package Term_4;

import java.util.Scanner;

public class Ex4_27 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);

		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂���:");
		int a=scanner.nextInt();

		int b=a;
		int count=0;
		int num=0;
		int sum=0;

		do{
			System.out.print("����:");
			num=scanner.nextInt();
			sum+=num;
			if(sum>1000){
				System.out.println("���v��1,000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				sum-=num;
				break;
			}
			count++;
			b--;
		}while(b!=0);

		System.out.println("���v��"+sum+"�ł��B");
		System.out.println("���ς�"+sum/count+"�ł��B");

		scanner.close();

	}

}
