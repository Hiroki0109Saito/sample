package Term_4;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.println("�J�E���g�_�E�����܂�");
		int a=0;
		
		while(a<=0){
		System.out.print("���̐����l:");
		a=scanner.nextInt();
		}
		
		for(int i=a;i>=0;i--){
			System.out.println(i);
		}
		scanner.close();

	}

}
