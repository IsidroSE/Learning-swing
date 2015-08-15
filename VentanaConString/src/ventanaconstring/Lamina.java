package ventanaconstring;
import java.awt.Graphics;
import javax.swing.*;
//@autor Isidro Sotoca Estruch

public class Lamina extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estoy aprendiendo swing", 50, 50);
    }
}
