package ventanaconstringcoloreado;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//@autor Isidro Sotoca Estruch

public class Lamina extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        g2.setPaint(Color.BLUE);
        g2.drawString("Times New Roman en azul y negrita, tamaño 15", 100, 100);
        g2.setFont(new Font("Arial", Font.ITALIC, 20));
        g2.setPaint(Color.RED);
        g2.drawString("Arial en rojo y itálica, tamaño 20", 100, 200);
        
    }
}
