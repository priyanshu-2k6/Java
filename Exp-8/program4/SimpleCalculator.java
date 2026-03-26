import javax.swing.*;

import java.awt.event.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels & Text Fields
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(30, 30, 80, 25);
        frame.add(label1);

        JTextField num1 = new JTextField();
        num1.setBounds(120, 30, 120, 25);
        frame.add(num1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(30, 70, 80, 25);
        frame.add(label2);
        JTextField num2 = new JTextField();
        num2.setBounds(120, 70, 120, 25);
        frame.add(num2);

        JButton addButton = new JButton("Add");
        addButton.setBounds(90, 110, 100, 30);
        frame.add(addButton);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 150, 200, 25);
        frame.add(resultLabel);

        // Button Click Event
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int sum = number1 + number2;
                resultLabel.setText("Result: " + sum);
            }
        });

        frame.setVisible(true);
    }
}
