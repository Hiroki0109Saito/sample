package X;

import java.util.Scanner;

public class X_4 {

	public static void main(String[] args) {
		// TODO ©“®¶¬‚³‚ê‚½ƒƒ\ƒbƒhEƒXƒ^ƒu
		Scanner scanner =new Scanner(System.in);

		System.out.print("—j“ú:");
		int a=scanner.nextInt();
		System.out.print("ŠÔ:");
		int b=scanner.nextInt();

		int c=0;

		if(a==0){//“ú—j“ú‚Íc=0
		}else if(a==1){//Œ—j“ú‚Íc=1
			c=1;
		}else if(a==2||a==5){//‰Î—jA‹à—j‚Í“¯‚¶
			if(b==0){
			}else{
				c=1;
			}
		}else if(a==3){//…—j“ú
			if(b==2){
			}else{
				c=1;
			}
		}else if(a==4){//–Ø—j“ú
			c=1;
		}else{//“y—j“ú
			if(b==0){
				c=1;
			}else{
			}
		}

		if(c==0){
			System.out.println("‹xf‚Å‚·B");
		}else{
			System.out.println("f@‚µ‚Ä‚¢‚Ü‚·B");
		}
		scanner.close();
	}
}

