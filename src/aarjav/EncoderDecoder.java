package aarjav;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncoderDecoder  extends JFrame{
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTextField textField1;
    private JButton ENCRYPTButton;
    private JLabel Enc;
    private JTextField textField2;
    private JButton decryptButton;
    private JLabel Dec;
    private JPanel panel;
    int key = 5;
    EncoderDecoder()
    {

        initialise();
        ENCRYPTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enc = textField1.getText().toString();
                String encrypted="";
                for(int i=0;i<enc.length();i++)
                {
                    char c = enc.charAt(i);
                    if(c==' ')
                    {
                        encrypted += ' ';
                        continue;
                    }
                    int as = c+key;

                    if(Character.isLowerCase(c)==true && as>122 )
                    {
                        as = as-26;
                    }
                    else
                    {
                        if(Character.isUpperCase(c)==true && as>90)
                            as=as-26;
                    }

                    encrypted = encrypted + (char)as;
                }

                Enc.setText("Encrypted String : "+encrypted);
            }
        });
        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dec = textField2.getText().toString();
                String decrypted ="";

                for(int i=0;i<dec.length();i++)
                {
                    char c = dec.charAt(i);
                    if(c==' ')
                    {
                        decrypted += ' ';
                        continue;
                    }
                    int as = c-key;

                    if(Character.isLowerCase(c)==true && as<97 )
                    {
                        as = as+26;
                    }
                    else
                    {
                        if(Character.isUpperCase(c)==true && as<65)
                            as=as+26;
                    }

                    decrypted = decrypted + (char)as;
                }
                Dec.setText("Decrypted String : "+decrypted);

            }
        });
    }

    private void initialise() {

//        setContentPane(panel);
        setSize(500,500);
        setTitle("Encoder-Decoder Tool");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panel);
    }

    public static void main(String[] args) {
        EncoderDecoder ed= new EncoderDecoder();
    }
}
