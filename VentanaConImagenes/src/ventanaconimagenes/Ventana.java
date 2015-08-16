package ventanaconimagenes;

//@autor Isidro Sotoca Estruch

import java.awt.*;
import javax.swing.*;


public class Ventana extends JFrame {
    public Ventana () {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension dimension = pantalla.getScreenSize();
        int ancho = dimension.width;
        int alto = dimension.height;
        setSize(ancho/2, alto/2);
        setLocation(ancho/4, alto/4);
        Image icono = pantalla.getImage("src/graficos/Seta.png");
        setIconImage(icono);
        setTitle("Fondo de imágenes");
        setVisible(true);
        Lamina l1 = new Lamina();
        add(l1);
    }
}
