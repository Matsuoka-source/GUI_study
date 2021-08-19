import java.awt.*;
import javax.swing.*;

public class Sample1 extends JFrame {
  Sample1() {
    getContentPane().setLayout(new FlowLayout());

    // テキストを表示
    JLabel labelText = new JLabel("画像を表示");
    getContentPane().add(labelText);

    // 画像を表示（ImageIconの使い方）
    ImageIcon icon1 = new ImageIcon("./徳川家康.jpg");
    JLabel labelIcon = new JLabel(icon1);
    getContentPane().add(labelIcon);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("JLabelを使って画像やテキストを表示");
    setSize(530, 170);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Sample1();
  }
}

// swingで画像を表示しようとしているけれども表示されない