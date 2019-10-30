import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LonginForm extends JFrame {
    private JTextField txtAccount;
    private JPanel popup1;
    private JPasswordField txtPassword;
    private JButton registerButton;
    private JCheckBox chbSave;
    private JButton btnSignin;


    public LonginForm() {
        btnSignin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //tai khaon, mat khau
                String name = txtAccount.getText();
                String password = txtPassword.getText();

                if (name.equals("thinhhhbn1234")){
                    if(password.equals("01667908130a")){
                        System.out.println("Hello");
                    } else {
                        System.out.println("Wrong password");
                    }
                }
                else {
                    System.out.println("Please register ");
                }

            }
        });
    }

    public static void main(String[] args) {
        LonginForm longinForm = new LonginForm();

        longinForm.setContentPane(longinForm.popup1);
        longinForm.setSize(500, 250);
        longinForm.setVisible(true);
    }
}

