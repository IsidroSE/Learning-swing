package ventanaconfiguras2d;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//@autor Isidro Sotoca Estruch

public class Lamina extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);
        g2.setPaint(Color.BLUE);
        g2.fill(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(Color.GREEN);
        g2.fill(elipse);
        
        g2.setPaint(Color.ORANGE);
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 125;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
        g2.setPaint(new Color(0, 255, 150));
        g2.draw(circulo);
        
    }
}
