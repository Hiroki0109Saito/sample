package Term_6;
import java.util.Scanner;


public class Ex6_9 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		double[] ten=new double[a];
		double sum=0;

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]=");
			ten[i]=scanner.nextDouble();
			sum+=ten[i];
		}

		double ave=sum/a;

		System.out.printf("�S�v�f�̍��v��"+"%.1f"+"�_�ł��B%n",sum);
		System.out.printf("�S�v�f�̕��ς�"+"%.2f"+"�_�ł��B%n",ave);

		// TODO �����������ꂽ���\�b�h�E�X�^�u

		scanner.close();

	}

}
