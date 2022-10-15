import javax.swing.*;

/**
 *9. Write a graphical program that draws a traffic light.
 */

public class TrafficLightViewer {
    private static TrafficLightComponent light = new TrafficLightComponent();

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setTitle("Traffic Light");
        frame.setSize(500, 400);
        frame.setLocation(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  TwoSquareComponent light = new TwoSquareComponent();
        frame.add(light);
        frame.setVisible(true);

    }
}
