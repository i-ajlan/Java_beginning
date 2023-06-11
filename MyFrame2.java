import javax.swing.*;

public class MyFrame2 extends JFrame {
    MyPanel2 panel;

    MyFrame2() {
        panel = new MyPanel2();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}