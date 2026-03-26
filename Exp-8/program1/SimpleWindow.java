
import javax.swing.*;

public class SimpleWindow {

    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("My First Swing Window");

        // Set frame size
        frame.setSize(400, 300);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}
