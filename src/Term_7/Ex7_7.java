package Term_7;
import java.util.Scanner;


public class Ex7_7 {

	public static void putChars(int r,char a){
		for(int i=0;i<r;i++){
			System.out.print(a);
		}
	}

	public static void putStarS(int b){
		putChars(b,'��');
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("�������p�̎O�p�`��\�����܂�");
		System.out.print("�i����:");
		int q=scanner.nextInt();

		for(int i=0;i<q;i++){
			putStarS(i+1);
			System.out.println();
		}
		scanner.close();
	}

}
