package Term_4;
import java.util.Scanner;
public class Ex4_23 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);

		System.out.println("�s���~�b�h��\�����܂��B");
		System.out.print("�i����:");
		int n=scanner.nextInt();
		int r=n;

		for(int i=1;i<n+1;i++){
			for(int q=1;q<r;q++){
				System.out.print(" ");
			}
			r--;
			for(int j=0;j<(i-1)*2+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}