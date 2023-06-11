import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel2 extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 1000;
    final int PANEL_HEIGHT = 700;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel2() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("enemy.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g); // paint backGround
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        if (y >= PANEL_WIDTH - enemy.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }

}
