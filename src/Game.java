import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
public class Game extends JFrame{
    public static void main(String[] args) {
        Game frame = new Game();
        frame.setDefaultCloseOperation(2);
        frame.setBounds(100, 100, 800, 600);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("x: " + e.getX() + ",y: " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Куличкин Иннокентий ИВТ-22-2", 100, 60);
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.pink);
            int x = 80 + i * 120;
            int y = 180 - i * 10;
            g.fillOval(x, y, 50, 50);
        }
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.blue);
            int x = 76 + i * 120;
            int y = 228 - i * 10;
            g.fillRect(x, y, 60, 70);
        }
        for (int i = 0; i < 5; i++) {
            int x1 = 76 + i * 120;
            int y1 = 228 - i * 10;
            int x2 = 55 + i * 120;
            int y2 = 275 - i * 10;

            g.drawLine(x1, y1, x2, y2);
        }
        for (int i = 0; i < 5; i++) {
            int x3 = 136 + i * 120;
            int y3 = 228 - i * 10;
            int x4 = 157 + i * 120;
            int y4 = 272 - i * 10;

            g.drawLine(x3, y3, x4, y4);
        }
        for (int i = 0; i < 5; i++) {
            int x1 = 86 + i * 120;
            int y1 = 298 - i * 10;
            int x2 = 65 + i * 120;
            int y2 = 335 - i * 10;

            g.drawLine(x1, y1, x2, y2);

            int x3 = 126 + i * 120;
            int y3 = 298 - i * 10;
            int x4 = 126 + i * 120;
            int y4 = 335 - i * 10;

            g.drawLine(x3, y3, x4, y4);
        }

        Color[] arrColor = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE};


        for (int i = 0; i < 5; i++) {
            g.setColor(arrColor[i]);
            int x1 = 75 + i * 120;
            int y1 = 184 - i * 10;
            int x2 = 140 + i * 120;
            int y2 = 205 - i * 10;
            g.drawLine(x1, y1 + 6, x2, y2 + 7);
            g.fillArc(x1 + 8, y1 - 8, 50, 50, 340, 180);
        }


    }
}
