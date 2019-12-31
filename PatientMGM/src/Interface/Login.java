package PatientMGM.src.Interface;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Login {
    private JButton btnLogin;
    private JPanel panel1;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JLabel lblPassword;
    private JButton btnClear;
    private JPasswordField txtPassField;


    //Learning how to interact with buttons!



    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Login() {
        //AcitonListener = On Mouse Click
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display Message ---> Used to test button click event works
                //JOptionPane.showMessageDialog(null,"Hello world");
                String userName = txtUsername.getText();
                String password = txtPassField.getText();

                //Hardcoded entry for TEST purposes, this is NOT TO be used once txt is in place!

                if (userName.trim().equals("admin") && password.trim().equals("admin")) {
                    JOptionPane.showMessageDialog(null,"Hello" + " " + userName);
                } else  {
                    JOptionPane.showMessageDialog(null,"Invalid User");
                }
                //username = txtUsername;
                //password = txtPassword;


            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                txtPassField.setText("");
            }
        });

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
