import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());

        // Create GridBagConstraints object
        GridBagConstraints gbc = new GridBagConstraints();

        // Button 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Button 1"), gbc);

        // Button 2
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 2;
        gbc.weighty = 1;
        frame.add(new JButton("Button 2"), gbc);

        // Button 3
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Spans across two columns
        gbc.weightx = 1;
        gbc.weighty = 2;
        frame.add(new JButton("Button 3"), gbc);
        frame.setVisible(true);
    }
}
