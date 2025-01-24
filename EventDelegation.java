import javax.swing.*;
import java.awt.event.*;

public class EventDelegation {

    public static void main(String[] args) {
        // Create the JFrame (main window)
        JFrame frame = new JFrame("Event Delegation Example");

        // Create a JButton (event source)
        JButton button = new JButton("Click Me");

        // Register the ActionListener (event listener) to the button
        button.addActionListener(new ButtonClickListener());

        // Set up the frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);
    }
}

// Event Listener class implementing ActionListener
class ButtonClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the event when the button is clicked
        System.out.println("Button was clicked!");
    }
}