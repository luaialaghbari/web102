import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class TwoSquareComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct a square and draw it

        Rectangle square2 = new Rectangle(50, 50, 200, 200);
        Color purple = new Color(160, 32, 240);
        g2.setColor(purple);
        g2.fill(square2);

        Rectangle square = new Rectangle(100, 100, 100, 100);
        g2.setColor(Color.pink);
        g2.fill(square);


    }
}
