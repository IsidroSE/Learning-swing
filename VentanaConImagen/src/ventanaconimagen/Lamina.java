package ventanaconimagen;
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

//@autor Isidro Sotoca Estruch

public class Lamina extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        try {
            miImagen = ImageIO.read( new File("src/graficos/Gatitos.jpg"));
        }
        catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }
        
        g.drawImage(miImagen, 0, 0, this);
        
    }
    
    Image miImagen;
}
