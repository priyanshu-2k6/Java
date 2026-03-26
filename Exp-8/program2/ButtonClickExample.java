import javax.swing.*;

import java.awt.event.*;

public class ButtonClickExample {

    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Button Click Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JButton
        JButton button = new JButton("Click Me!");
        frame.add(button);  // Add button to JFrame

        // Add ActionListener to handle button click
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.setLayout(null);
        button.setBounds(100, 80, 100, 30); // Set button position
        frame.setVisible(true);
    }
}
