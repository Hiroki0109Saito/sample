package Term_3;

import java.util.Scanner;

public class Ex3_14 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("����a:");
		double a=scanner.nextDouble();
		System.out.print("����b:");
		double b=scanner.nextDouble();

		double n=0;
		
			if(a>b){
				n =a-b;
				if(n<=10){
					System.out.println("�����̒l�̍���10�ȉ��ł��B");
				}else{
					System.out.println("�����̒l�̍���11�ȏ�ł��B");
				}
			}else{
				n=b-a;
				if(n<=10){
					System.out.println("�����̒l�̍���10�ȉ��ł��B");
				}else{
					System.out.println("�����̒l�̍���11�ȉ��ł��B");
				}
				}
			
				
		scanner.close();
	}
	}

