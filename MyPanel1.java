import java.awt.*;

import javax.swing.*;

public class MyPanel1 extends JPanel {
    MyPanel1() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        // g2D.setPaint(Color.blue);
        // g2D.setStroke(new BasicStroke(5));

        // // g2D.drawLine(0, 0, 500, 500);
        // // g2D.drawRect(0, 0, 100, 200)

        // g2D.fillRect(0, 0, 200, 200);
        // g2D.setPaint(Color.orange);
        // // g2D.drawOval(0, 0, 100, 100);

        // g2D.drawArc(0, 0, 100, 100, 0, 180);

        // int[] xPoints = { 150, 250, 350 };
        // int[] yPoints = { 300, 150, 300 };
        // g2D.setPaint(Color.yellow);
        // g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setPaint(Color.yellow);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U're a WINNER :D", 50, 50);
        // g2D.drawImage(null, null, ALLBITS, ABORT);
    }

}