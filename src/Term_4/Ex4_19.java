package Term_4;

import java.util.Scanner;

public class Ex4_19 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("n�̒l:");
		int n=scanner.nextInt();

		for(int i=1;i<n+1;i++){
			System.out.println(i+"��2���"+i*i);
//			System.out.println(i+"��2���"+(int)Math.pow(i,2));
		}
		scanner.close();
	}
}
