package Term_3;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		
Scanner scanner=new Scanner(System.in);
		
		System.out.print("�����l:");
		int a=scanner.nextInt();
		
		if(a>0){
			System.out.println("���̐�Βl��"+a+"�ł��B");
		}else{
			System.out.println("���̐�Βl��"+-a+"�ł��B");
		}

		scanner.close();
	}
}
