import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDetail {
    public static void main(String[]args) {
        JFrame frame = new JFrame("RegistrationForm ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,1,1));

        JLabel FullNameLabel = new JLabel("FullName :");
        JTextField FullNameField = new JTextField();

        JLabel EmailLabel = new JLabel("EmailID :");
        JTextField EmailField = new JTextField();

        JLabel PasswordLabel = new JLabel("Password :");
        JTextField PasswordField = new JTextField();

        JButton submitButton = new JButton("Submit");
        panel.add(FullNameLabel);
        panel.add(FullNameField);
        panel.add(EmailLabel);
        panel.add(EmailField);
        panel.add(PasswordLabel);
        panel.add(PasswordField);

        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String FullName = FullNameField.getText();
                String Email= EmailField.getText();
                String Password = PasswordField.getText();

                JOptionPane.showMessageDialog(frame,"Student Details :\n"+
                        "FullName :"+FullName+"\n"+
                        "EmailID :"+ Email+"\n"+
                        "Password : "+Password);
            }
        });
        frame.setVisible(true);
        frame.add(panel,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        frame.add(buttonPanel,BorderLayout.SOUTH);

    }
}