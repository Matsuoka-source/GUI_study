import javax.swing.JFrame;

class test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MyTitle");
    frame.setBounds(100, 100, 600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

// GUIの表示するための記述
// javac -encoding UTF8 test.java をした後にjava testと記述するとGUIが表示される。
// ちなみに中身は何も表示されない状態