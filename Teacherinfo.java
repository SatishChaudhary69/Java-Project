import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Teacherinfo {
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/College1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Rahul@125";

    public static void main(String[] args) {
        // Frame setup
        JFrame frame = new JFrame("Teacher Information Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        // Components
        JLabel IdLabel = new JLabel("Tchild:");
        JTextField IdField = new JTextField();

        JLabel NameLabel = new JLabel("Teacher Name:");
        JTextField NameField = new JTextField();

        JLabel AddressLabel = new JLabel("Teacher Address:");
        JTextField AddressField = new JTextField();

        JLabel PhoneLabel = new JLabel("Teacher Phone:");
        JTextField PhoneField = new JTextField();

        JButton AddButton = new JButton("Add");
        JLabel AddStatus = new JLabel("");

        // Adding components to the frame
        panel.add(IdLabel);
        panel.add(IdField);

        panel.add(NameLabel);
        panel.add(NameField);

        panel.add(AddressLabel);
        panel.add(AddressField);

        panel.add(PhoneLabel);
        panel.add(PhoneField);

        panel.add(AddButton);
        panel.add(AddStatus);

        // Button Action
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(IdField.getText());
                String name = NameField.getText();
                String address = AddressField.getText();
                String phone = PhoneField.getText();

                // Insert into database
                try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                    String sql = "INSERT INTO Teachers (Tchild, TchName, TchAdd, TchPhone) VALUES (?, ?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, id);
                    pstmt.setString(2, name);
                    pstmt.setString(3, address);
                    pstmt.setString(4, phone);

                    int rows = pstmt.executeUpdate();
                    if (rows > 0) {
                        AddStatus.setText("Teacher added successfully!");
                        AddStatus.setForeground(Color.GREEN);
                    }
                } catch (SQLException ex) {
                    AddStatus.setText("Error: " + ex.getMessage());
                    AddStatus.setForeground(Color.RED);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
        frame.add(panel);
    }
}
