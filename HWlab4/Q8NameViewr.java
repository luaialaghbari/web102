import javax.swing.*;

/**
 * 8. Write a graphics program that draws your name in red,
 *    contained inside a blue rectangle.
 *    Provide a class NameViewer and a class NameComponent.
 */
public class NameViewer {
    public static void main (String[] args)
    {
        //Create Object With Call Construct From Class JFrame
        //
        JFrame frame = new JFrame();
            //Frame Size(Width, Height)
        frame.setSize(300, 400);
           //Frame Title
        frame.setTitle("Name Viewer");
          //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          // Call NameComponent
        NameComponent name = new NameComponent();
           //Input NameComponent To The Frame
        frame.add(name);
        //Show The Frame
        frame.setVisible(true);
    }
}
