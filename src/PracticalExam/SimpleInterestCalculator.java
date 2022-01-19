package PracticalExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SimpleInterestCalculator extends JFrame {
    private JTextField amount;
    private JTextField Rate;
    private JTextField time;
    private JButton calculateButton;
    private JLabel Ans;
    private JPanel panel;

    SimpleInterestCalculator()
    {
        initialise();
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amt = Double.parseDouble(amount.getText().toString());
                double r = Double.parseDouble(Rate.getText().toString());
                double t = Double.parseDouble(time.getText().toString());

                double sinterest = (amt*r*t);
                Ans.setText("Simple Interest : "+sinterest);
            }
        });

        amount.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if(amount.getText().equals("Principal Amount")){
                    amount.setText("");
                    amount.setForeground(new Color(0, 0, 0));
                }
            }
        });
        amount.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if((amount.getText().equals("")))
                {
                    amount.setText("Principal Amount");
                    amount.setForeground(new Color(140,140,140));
                }
            }
        });
        Rate.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if(Rate.getText().equals("Rate of Interest")){
                    Rate.setText("");
                    Rate.setForeground(new Color(0, 0, 0));
                }
            }
        });
        Rate.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if(Rate.getText().equals("")){
                    Rate.setText("Rate of Interest");
                    Rate.setForeground(new Color(140,140,140));
                }
            }
        });
        time.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if(time.getText().equals("Time Period")){
                    time.setText("");
                    time.setForeground(new Color(0, 0, 0));
                }
            }
        });
        time.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if(time.getText().equals("")){
                    time.setText("Time Period");
                    time.setForeground(new Color(140,140,140));
                }
            }
        });
    }

    private void initialise() {

//        setContentPane(panel);
        setSize(300,300);
        setTitle("Simple Interest Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        add(panel);
    }

    public static void main(String[] args) {
        SimpleInterestCalculator si = new SimpleInterestCalculator();
    }
}
