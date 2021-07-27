package Y;

public class Y_18 {
	 
    // 王妃数
    private static final int QUEENS = 4;
    // 王妃の配置位置 
    private static final int [] VERTICAL = new int [QUEENS];
    // 行に王妃が配置されてるかチェック用  
    private static final boolean [] HORIZONTAL = new boolean [QUEENS]; 
    // 右４５度斜めラインに王妃が配置されているかチェック用
    private static final boolean [] DIP_POSITIVE = new boolean [QUEENS * 2 -1]; 
    // 左４５度斜めラインに王妃が配置されているかチェック用
    private static final boolean [] DIP_NEGATIVE = new boolean [QUEENS * 2 - 1];
    // 安全 
    private static final boolean SAFE = false;
    // 危険 
    private static final boolean OUT = true;
    // トータルパターン数 
    private static int counter; 
 
    public static void main(String[] args) {
        trySet(0);
        if(counter < 1){
            System.out.println("配置不可能でした。");
        }else{
            System.out.println(counter + " パターン配置可能でした。");
        }
    }
    
    // 全ての可能な王妃の配置位置を取得、そしてトータルパターン数も取得する。
    private static void trySet(int i) {
        for (int j = 0; j < QUEENS; j++) {
            // 行 ( j )、／右４５度斜めライン ( i + j )、＼左４５度斜めライン (i - j + ( QUEENS -1 )) 配置チェック
         if (HORIZONTAL [j] == SAFE && DIP_POSITIVE [i + j] == SAFE && DIP_NEGATIVE [i - j + ( QUEENS -1)] == SAFE) { 
            VERTICAL [i] = j; // 王妃 i 列 j 行に配置
            if (i == ( QUEENS -1)) { // 王妃の配置完了
                 counter++; // トータルパターン数カウンター
                 printBoard(); // 盤面を表示
             }else {
                // 王妃の利き筋（行、斜め）をセット
               HORIZONTAL [j] = DIP_POSITIVE [i + j] = DIP_NEGATIVE [i - j + ( QUEENS -1)] = OUT;
               // 次の列を配置
               trySet(i + 1);
               // 王妃の利き筋（行、斜め）を解除
               HORIZONTAL [j] = DIP_POSITIVE [i + j] = DIP_NEGATIVE [i - j + ( QUEENS -1)] = SAFE;
            }
         }
      }
    }
 
    // 全ての可能な王位配置位置を出力　●が王妃が置かれた場所である。
    private static void printBoard() {
        System.out.println("第 " + counter + " パターン"); 
        for (int i = 0; i < QUEENS; i++) {
         for (int j = 0; j < QUEENS; j++) {
                System.out.printf("%s", j == VERTICAL [i] ? "● " : "□ ");
            }
         System.out.println();
      }
      System.out.println();
 
    }
}