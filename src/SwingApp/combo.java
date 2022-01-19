package SwingApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class combo {
    private JComboBox cb;
    private JTextField textField1;
    private JButton cALCButton;
    private JPanel panel;

    public combo() {
        JFrame frame = new JFrame("RegistrationForm");
        frame.setContentPane(new combo().panel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel = new JPanel();
        panel.add(textField1);
        panel.add(cALCButton);
        cb = new JComboBox();
        cb.addItem("Celcius to Fahrenheit");
        cb.addItem("Fahrenheit to Celcius");
        cb.setSelectedItem(null);
        panel.add(cb);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cb.getSelectedIndex();
                String temp = textField1.getText();
                double ans = 0;
                if(index == 0)
                {
                    ans = Double.parseDouble(temp)*(9/5) + 32;}
                textField1.setText(ans+" ");
            }
        });
        cALCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public static void main(String[] args) {
       combo c = new combo();
    }
}
