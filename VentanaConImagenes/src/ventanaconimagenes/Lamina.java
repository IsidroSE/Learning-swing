package ventanaconimagenes;

//@autor Isidro Sotoca Estruch

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Lamina extends JPanel {
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        
        try {
           imagenDeFondo = ImageIO.read(new File("src/graficos/gato.jpg"));
        }
        catch (IOException e) {
            System.out.println("No se ha encontrado la imagen");
        }
        int ancho = imagenDeFondo.getWidth(this);
        int altura = imagenDeFondo.getHeight(this);
        g.drawImage(imagenDeFondo, 0, 0, null);
        for(int i = 0 ; i < 300 ; i++) {
            for (int j = 0 ; j < 200 ; j++) {
                g.copyArea(0, 0, ancho, altura, i*ancho, j*altura);
            }
        }
    }
    
    Image imagenDeFondo;
}
