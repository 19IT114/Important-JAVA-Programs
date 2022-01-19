import SwingApp.RegistrationForm;

import javax.management.MBeanAttributeInfo;
import javax.swing.*;

public class si extends JFrame{
    private JPanel mainpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton cALCButton;
    si()
    {

        setContentPane(mainpanel);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        add(mainpanel);
    }
    public static void main(String[] args) {

    si s = new si();
    }
}
