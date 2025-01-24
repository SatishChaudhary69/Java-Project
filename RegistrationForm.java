import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        // Create a panel for the form
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        // Create form components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel regNoLabel = new JLabel("Registration Number:");
        JTextField regNoField = new JTextField();

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JLabel departmentLabel = new JLabel("Department:");
        JTextField departmentField = new JTextField();

        JLabel sexLabel = new JLabel("Sex:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(maleRadio);
        sexGroup.add(femaleRadio);

        // Create a submit button
        JButton submitButton = new JButton("Submit");
        // Add components to the form panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(regNoLabel);
        panel.add(regNoField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(departmentLabel);
        panel.add(departmentField);
        panel.add(sexLabel);
        JPanel sexPanel = new JPanel();
        sexPanel.add(maleRadio);
        sexPanel.add(femaleRadio);
        panel.add(sexPanel);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered details
                String name = nameField.getText();
                String regNo = regNoField.getText();
                String address = addressField.getText();
                String department = departmentField.getText();
                String sex = maleRadio.isSelected() ? "Male" :"Female";

                // Display the details in the text area
                JOptionPane.showMessageDialog(frame, "Student Registration!\n" +
                        "Name:" + name + "\n" +
                        "regNO:" + regNo + "\n" +
                        "Address:" + address + "\n" +
                        "Department:" + department + "\n" +
                        "sex:" + sex);
            }
        });

        // Set frame visibility
        frame.setVisible(true);
        frame.add(panel);
        panel.add(submitButton);
    }
}
