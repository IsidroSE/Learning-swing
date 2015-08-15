package ventanaconfiguras;
import java.awt.Graphics;
import javax.swing.*;
//@autor Isidro Sotoca Estruch

public class Lamina extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200);
        g.drawLine(100, 100, 300, 200);
        g.drawArc(50, 100, 100, 200, 120, 150);
    }
}
