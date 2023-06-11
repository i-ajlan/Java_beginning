import java.awt.*;
import javax.swing.*;

public class GraphicsClass extends JFrame {
    MyPanel1 panel;

    GraphicsClass() {
        panel = new MyPanel1();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(500, 500);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsClass();
    }

}