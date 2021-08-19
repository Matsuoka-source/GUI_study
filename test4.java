import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class test4 extends JFrame implements ActionListener {
  public static void main(String args[]) {
    test4 frame = new test4("MyTitle");
    frame.setVisible(true);
  }

  test4(String title) {
    setTitle(title);
    setBounds(100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    JButton btn = new JButton("Push");
    btn.addActionListener(this);

    p.add(btn);
    getContentPane().add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e) {
    JLabel label = new JLabel("ボタンが押下されました。");
    JOptionPane.showMessageDialog(this, label);
  }
}