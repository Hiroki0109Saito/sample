package Term_4;
import java.util.Scanner;
public class Ex4_15 {
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.println("1����n�܂ł̘a�����߂܂��B");
		System.out.print("n�̒l:");
		int a=scanner.nextInt();

		int sum=0;

		for(int i=1;i<a+1;i++){
			System.out.print(i);
			sum+=i;

			if(i==a)  //���[�v�E�o
				break;

			System.out.print("+");
		}

		System.out.println("="+sum);
		scanner.close();
	}
}
