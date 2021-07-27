//package Y;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Scanner;
//
//public class Y_16 {
//
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		Scanner scanner=new Scanner(System.in);
//
//		Path path=Paths.get("data1.txt");
//		String []str=new String[10];
//		int i=0;
//
//		try(BufferedReader in=Files.newBufferedReader(path)){
//			String line;
//
//			while((line =in.readLine())!=null){
//				str[i]=line ;
//				i++;
//			}
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//
//		for(int j=0;j<10;j++){
//			System.out.println(str[j]);
//		}
//
//		//ここからはじめるよ～
//		//strに格納したよ～～
//		//迷路始めるよ～～～
//
//
//
//		for(int j=0;j<10;j++){
//			System.out.println(str[j]);
//		}
//
//		scanner.close();
//	}
//}
private void move(){
	  /* まず左に行けるかどうかチェック */
	  int leftd = marud + 1;
	  if (leftd == 4){
	    leftd = 0;
	  }

	  int left = block[maruy + dy[leftd]][marux + dx[leftd]];

	  if (left == 0){
	    marud = leftd;

	    oldx = marux;
	    oldy = maruy;
	    marux += dx[marud];
	    maruy += dy[marud];

	    return;
	  }

	  /* 次に現在の進行方向に行けるかチェック */
	  int next = block[maruy + dy[marud]][marux + dx[marud]];

	  while(next == 1){
	    /* 行けなければ右へ右へと向きを変えて行けるかどうかチェック */
	    marud--;
	    if (marud == -1){
	      marud = 3;
	    }

	    next = block[maruy + dy[marud]][marux + dx[marud]];
	  }

	  oldx = marux;
	  oldy = maruy;
	  marux += dx[marud];
	  maruy += dy[marud];
	}
}