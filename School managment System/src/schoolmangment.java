import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import person.* ;


public class schoolmangment extends JFrame  {
    FileWriter F = new FileWriter("School mangment.txt");

    private  int Counter;
    private JPanel mainpanel;
    private JLabel First_name;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel number;
    private JTextField textField3;
    private JLabel Gender;
    private JTextField textField4;
    private JLabel Eduction;
    private JTextField textField5;
    private JButton ok;

    Students Peoplestudnets[] = new Students[10];
    List<Students> x = new ArrayList<>();
    public schoolmangment() throws IOException {
        setContentPane(mainpanel);
        setTitle("School Mangment");
        setBounds(0,0,400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Counter++ ;
                Peoplestudnets[0]= new Students(Counter,textField1.getText(),textField3.getText(),Integer.parseInt(textField2.getText()) , textField4.getText() ,textField5.getText()) ;
                try {
                    F.write(Peoplestudnets[0].toString());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    F.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                JOptionPane.showMessageDialog(null , "add is done");

            }
        });
    }
}
