import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

public class test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MyTitle");
    frame.setBounds(100, 100, 600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button = new JButton("Push");

    frame.getContentPane().add(button, BorderLayout.NORTH);
    frame.setVisible(true);
  }
}

// GUIの表示するための記述
// javac -encoding UTF8 test.java をした後にjava testと記述するとGUIが表示される。