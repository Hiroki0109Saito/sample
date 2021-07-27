package Y;

import java.util.Scanner;

public class Y_14 {

	    // 島の地図的なもの
	    static char[][] islandMap;

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // 島の地図的なもの
	        islandMap = new char[10][10];

	        // 島のマスの数
	        int countIsland = 0;

	        // 最終的な出力
	        String ans = "NO";

	        // 入力を受け取って島の地図完成、島マスの個数カウント
	        for (int i = 0; i < 10; i++) {
	            islandMap[i] = sc.next().toCharArray();
	            for (int j = 0; j < 10; j++) {
	                if (islandMap[i][j] == 'o') {
	                    countIsland++;
	                }
	            }
	        }

	        // 二重ループでマス目を左上のマスから探索
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {

	                // 島数カウント一時変数
	                int countIslandInLoop = countIsland;

	                // 海の場合、陸地にする。また島の数を一つ増やす
	                if (islandMap[i][j] == 'x') {
	                    islandMap[i][j] = 'o';
	                    countIslandInLoop = countIsland + 1;
	                }

	                /*
	                 *  深さ優先探索を行う。
	                 *  dfsCountIsland・・・dfsでカウントしている、陸続きの島の数
	                 *  checked・・・dfsによりマス目が探索済みかどうかの判定
	                 */
	                dfsIslandCount = 0;
	                boolean[][] checked = new boolean[10][10];

	                dfs(i, j, checked);

	                if (dfsIslandCount == countIslandInLoop) {
	                    ans = "YES";
	                    break;
	                }

	                // 埋め立てたマスを元に戻して次のループへ
	                if (countIslandInLoop == countIsland + 1) {
	                    islandMap[i][j] = 'x';
	                }
	            }
	            if ("YES".equals(ans)) {
	                break;
	            }
	        }

	        System.out.println(ans);

	    }

	    // 現在dfsでカウントしている陸続きの島のマス目数
	    static int dfsIslandCount;

	    // 深さ優先探索
	    static void dfs(int i, int j, boolean[][] checked) {
	        // マス目を超えている・探索済み・海であるならば方向転換。
	        if (i < 0 || i > 9 || j < 0 || j > 9 || checked[i][j] || islandMap[i][j] == 'x') {
	            return;
	        }

	        // 今探索しているマスが陸地であれば陸地カウントをインクリメントする
	        if (islandMap[i][j] == 'o') {
	            dfsIslandCount++;
	        }

	        // 現在のマス目を探索済みにする
	        checked[i][j] = true;

	        // 上下左右のマスを探索する
	        dfs(i + 1, j, checked);
	        dfs(i - 1, j, checked);
	        dfs(i, j + 1, checked);
	        dfs(i, j - 1, checked);

	        return;

	    }
	}
