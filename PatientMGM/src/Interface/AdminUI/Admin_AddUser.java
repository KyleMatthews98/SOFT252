package Interface.AdminUI;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Admin_AddUser {
    private JButton btnLogin;
    public JPanel panel1;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JLabel lblPassword;
    private JButton btnClear;
    private JPasswordField txtPassField;


    //Learning how to interact with buttons!



    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Admin_AddUser().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Admin_AddUser() {
        //AcitonListener = On Mouse Click
        btnLogin.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {

                                           try {
                                               StringBuilder sb = new StringBuilder();
                                               StringBuilder sb2 = new StringBuilder();
                                               sb.append(txtUsername.getText() + "\n");
                                              // sb.append(txtPassword.getText());

                                               File file = new File("login.txt");
                                               FileWriter W = new FileWriter(file);
                                               W.write(sb.toString());
                                               //W.write(sb2.toString());
                                               W.close();
                                           } catch (IOException ex) {
                                               ex.printStackTrace();
                                           }
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
        };
    }



