package Term_7;

import java.util.Scanner;

public class Ex7_4 {
	
	public static int sumUp(int n){
		
		int sum=0;
		for(int i=1;i<n+1;i++){
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("1����x�܂ł̘a�����߂܂��B");
		System.out.print("x�̒l:");
		int x=scanner.nextInt();
		
		System.out.println("1����"+x+"�܂ł̘a��"+sumUp(x)+"�ł��B");
		scanner.close();

	}

}
