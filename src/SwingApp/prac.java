package SwingApp;

import javax.swing.*;

public class prac {
    private JTextField textField1;
    private JButton button1;
    private JPanel panel1;

    public prac()
    {
        initialize();
    }

    private void initialize() {

        panel1 = new JPanel();
        panel1.add(button1);
        panel1.add(textField1);

    }

    public static void main(String[] args) {
        prac p = new prac();
        JFrame frame = new JFrame("SI Calculator");
        frame.setContentPane(new prac().panel1);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
    }
}
