package Term_4;
import java.util.Scanner;


public class Ex4_21 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("�����`��\�����܂��B");
		System.out.print("�i����:");
		int a=scanner.nextInt();

		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
