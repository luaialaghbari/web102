import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
public class NameComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        //input size box in construct
        Rectangle box = new Rectangle(80, 130, 100, 30);
        //Call The Coloring Function
        g2.setColor(Color.blue);
        //Coloring Box
        g2.fill(box);
        //coloring the line
        g2.setColor(Color.red);
        //Recover The line Function
        g2.drawString("Najm Harrash", 95, 150);

    }
}
