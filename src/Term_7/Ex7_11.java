package Term_7;
import java.util.Scanner;


public class Ex7_11 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("����x��n�r�b�g�V�t�g���܂��B");
		System.out.print("x:");
		int a=scanner.nextInt();
		System.out.print("n:");
		int b=scanner.nextInt();
		
		System.out.println("[a]x*(2��"+b+"��)="+a*(int)Math.pow(2,b));
		System.out.println("[b]x/(2��"+b+"��)="+a/(int)Math.pow(2,b));
		int n=a<<b;
		int m=a>>b;
		System.out.println("[c]x<<"+b+"="+n);
		System.out.println("[d]x>>"+b+"="+m);
		System.out.println("[a]��[c]�̒l�͈�v���܂��B");
		System.out.println("[b]��[d]�̒l�͈�v���܂��B");
		
		scanner.close();
	}

}
