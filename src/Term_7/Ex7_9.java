package Term_7;
import java.util.Scanner;
public class Ex7_9{
	public static int readPlus(){
		Scanner scanner =new Scanner(System.in);
		String str;
		int n=1;
		int y=0;

		do{
			System.out.print("enter number:");
			str=scanner.next();

			n=Integer.parseInt(str);

			if(n<1){
				//no action
			}else if(0<n){
				char []mayu=new char[str.length()];

				for(int i=0;i<str.length();i++){
					mayu[i]=str.charAt(i);
				}

				for(int i=str.length()-1;i>=0;i--){
					System.out.print(mayu[i]);
				}

				System.out.print("\n"+"one more~1//end^0");
				y=scanner.nextInt();
			}

		}while(y!=0);
		scanner.close();
		return 0;
	}

	public static void main(String[] args) {
		readPlus();
	}
}


//public class Ex7_9 {
//
//	public static int readPlusInt(int a){
//		int d=1;
//		int num=1;
//		int y=0;
//
//		String str=""+a;//������String�ɂ����
//
//		for(int i=0;i<str.length()-1;i++){
//			d=d*10;
//		}
//
//		while(true){
//
//			num=a%10;//��̈ʂ�����Z�̂��܂��p���ċ��߂�B
//			a-=num;//a-���܂������10�̔{���ɂ���B
//			a=a/10;//10�Ŋ����āA������������B
//
//			y+=num*d;//y�Ɋi�[
//			d=d/10;//
//
//			if(a<10){
//				y+=a;
//				break;
//			}
//
//		}
//		return y;
//	}
//	public static void main(String[] args) {
//		// TODO �����������ꂽ���\�b�h�E�X�^�u
//		Scanner scanner =new Scanner(System.in);
//
//		int a=0;
//		int q=1;
//
//		while(q==1){
//			while(true){
//				System.out.print("���̐����l:");
//				a=scanner.nextInt();
//				if(a>0){
//					break;
//				}
//			}
//			System.out.println("�t����ǂނ�"+readPlusInt(a));
//			System.out.print("������x?(Yes�c1/No�c0):");
//			q=scanner.nextInt();
//		}
//		scanner.close();
//	}
//
//}
