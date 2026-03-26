import java.awt.*;
import javax.swing.*;

class DrawShapes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw Shapes
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);  // Filled Rectangle

        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 50, 100); // Oval

        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 250, 200); // Line
    }
}
public class ShapeDrawing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawShapes());
        frame.setVisible(true);
    }
}
