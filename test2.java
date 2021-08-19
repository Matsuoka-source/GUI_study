import javax.swing.*;
import java.awt.*;

class test2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MyTitle");
    frame.setBounds(100, 100, 600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    JButton btn1 = new JButton("Save");
    JButton btn2 = new JButton("Cancel");
    JButton btn3 = new JButton("Help");

    p.add(btn1);
    p.add(btn2);
    p.add(btn3);

    frame.getContentPane().add(p, BorderLayout.SOUTH);
    frame.setVisible(true);
  }
}
// ボタンが３つ作成される