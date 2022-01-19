package SwingApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistrationForm extends JFrame {
    private JPanel mainpanel;
    private JFormattedTextField tfuser;
    private JFormattedTextField tfpass;
    private JButton btnreset;
    private JButton btnconfirm;
    private JLabel luser;
    private JLabel lpass;

    public RegistrationForm() {
//        setSize(500,500);
//        add(mainpanel);
//        setTitle("Login");
        btnreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfpass.setText(null);
                tfuser.setText(null);
                tfpass.setForeground(Color.black);
                tfuser.setForeground(Color.black);
            }
        });
        btnreset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnreset.setBackground(Color.WHITE);
                btnreset.setForeground(Color.BLACK);


            }
        });
        btnconfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnconfirm.setBackground(Color.WHITE);
                btnconfirm.setForeground(Color.BLACK);

            }
        });
        btnreset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnreset.setBackground(Color.BLACK);
                btnreset.setForeground(Color.WHITE);
            }
        });
        btnconfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnconfirm.setBackground(Color.BLACK);
                btnconfirm.setForeground(Color.WHITE);
            }
        });
        btnconfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tfuser.getText());
                System.out.println(tfpass.getText());
                if(tfuser.getText().equals("")) {
                    tfuser.setForeground(Color.RED);
                    tfuser.setText("!--this field cannot be empty--!");
                }
                if(tfpass.getText().equals("")) {
                    tfpass.setForeground(Color.RED);
                    tfpass.setText("!--this field cannot be empty--!");
                }
            }
        });
        btnconfirm.addMouseListener(new MouseAdapter() {
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RegistrationForm");
        frame.setContentPane(new RegistrationForm().mainpanel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
