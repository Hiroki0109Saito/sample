package Y;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Y_10 extends Frame {

    int times = 1;                                    // 繰り返しの初期値
    Choice timesChoice;                               // 繰り返し数のChoice

    Y_10() {
        setLayout(new FlowLayout());
        setTitle("Gasket");
        setSize(600, 650);
        timesChoice = new Choice();                   // Choiceオブジェクトの生成
        for (int i = 1; i <= 10; i++) {               // Choiceの設定
            timesChoice.addItem("" + i);
        }
        add(timesChoice);                             // Choiceのアプレットへの追加
        add(new Label("times"));                      // ラベルのアプレットへの追加
        timesChoice.select(times - 1);                // Choiceの選択アイテム設定
        timesChoice.addItemListener(new ItemAdp());   // アイテムリスナーの設定
        setVisible(true);
        addWindowListener(new WinAdapter());
    }

    public void paint(Graphics g) {
        int width = getSize().width - 20;             // 三角形の底辺の長さを設定
        int height= getSize().height - 40;            // 三角形の高さを設定
        int xSift = 20;                               // x座標のシフト
        int ySift = 70;                               // y座標のシフト
        int x [] = {xSift, width + xSift, width / 2 + xSift};    // 三角形のx座標
        int y [] = {height, height, ySift};           // 三角形のy座標
        g.drawPolygon(x, y, 3);                       // 一番大きな三角形の描画
        drawTriangle(g, times - 1, x, y);             // 三角形描画の呼び出し
    }

    public void drawTriangle(Graphics g, int times, int x[], int y[]) {

        if (times < 1) { return; }                    // 繰り返しが1未満なら終了

        int x1 [], y1 [], x2 [], y2 [];

        /* 各辺の中点を結んだ三角形の描画 */
        x1 = new int[]{(x[0] + x[1]) / 2, (x[1] + x[2]) / 2, (x[2] + x[0]) / 2};
        y1 = new int[]{(y[0] + y[1]) / 2, (y[1] + y[2]) / 2, (y[2] + y[0]) / 2};
        g.drawPolygon(x1, y1, 3);

        /* 真ん中以外の三角形に対して繰り返し三角形を描画 */
        x2 = new int[]{x1[0], x[1], x1[1]};
        y2 = new int[]{y1[0], y[1], y1[1]};
        drawTriangle(g, times - 1, x2, y2);           // 三角形描画の再帰呼び出し

        x2 = new int[]{x1[2], x1[1], x[2]};
        y2 = new int[]{y1[2], y1[1], y[2]};
        drawTriangle(g, times - 1, x2, y2);           // 三角形描画の再帰呼び出し

        x2 = new int[]{x[0], x1[0], x1[2]};
        y2 = new int[]{y[0], y1[0], y1[2]};
        drawTriangle(g, times - 1, x2, y2);           // 三角形描画の再帰呼び出し

    }

    class ItemAdp implements ItemListener {           // 内部クラスによるItemListenerの実装
        public void itemStateChanged(ItemEvent e) {
            times = timesChoice.getSelectedIndex() + 1;  // 繰り返し数を獲得
            repaint();                                // 図形の再描画
        }
    }

    class WinAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new Y_10();
    }

}