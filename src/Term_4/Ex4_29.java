package Term_4;

import java.util.Scanner;

public class Ex4_29 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		
		int a=0;
		int i=1;
		int sum=0;
		
		do{
			System.out.println("����"+i+"�O���[�v");
			do{
			System.out.print("����:");
			a=scanner.nextInt();
			sum+=a;
			if(a==88888){
				sum-=a;
			}else if(a==99999){
				sum-=a;
			}
			}while(a!=88888&&a!=99999);
			i++;
		}while(a!=99999);
		
		System.out.println("���v��"+sum+"�ł��B");		
		scanner.close();

	}

}
