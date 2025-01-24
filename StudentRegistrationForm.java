import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm {

    public static void main(String[] args) {
        // Create the frame for the registration form
        JFrame frame = new JFrame("Student Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create the panel to hold form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address :");
        JTextField addressField = new JTextField(20);

        JLabel genderLabel = new JLabel("Gender :");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);


        JLabel cityLabel = new JLabel("city:");
        String[] cities = {"ktm", "Lalbandi", "Butwal"};
        JComboBox<String> cityComboBox = new JComboBox<>(cities);

        JLabel phoneLabel = new JLabel("Phone :");
        JTextField phoneField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(addressLabel);
        panel.add(addressField);

        panel.add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        panel.add(genderPanel);

        panel.add(cityLabel);
        panel.add(cityComboBox);

        panel.add(phoneLabel);
        panel.add(phoneField);

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the details entered by the user
                String name = nameField.getText();
                String address = addressField.getText();
                String gender = maleRadio.isSelected() ? "Male" : "Female";
                String city = (String) cityComboBox.getSelectedItem();
                String phone = phoneField.getText();
                String email = emailField.getText();

                // Display the entered details in the display area
                JOptionPane.showMessageDialog(frame, "Student Registration!\n" +
                        "Name:" + name + "\n" +
                        "Address:" + address + "\n" +
                        "Gender:" + gender + "\n" +
                        "city:" + city + "\n" +
                        "phone:" + phone + "\n" +
                        "Email:" + email);
            }

        });
        frame.add(panel);
        frame.setVisible(true);

    }
}



