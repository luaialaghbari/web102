import javax.swing.*;

/**
 * Write a program that draws two solid squares: one in pink and one in purple.
 * Use a standard color for one of them and a custom color for the other.
 * Provide a class TwoSquareViewer and a class TwoSquareComponent.
 */
public class TwoSquareViewer {
    public static void main (String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent square = new TwoSquareComponent();

        frame.add(square);
        frame.setVisible(true);
    }
}
