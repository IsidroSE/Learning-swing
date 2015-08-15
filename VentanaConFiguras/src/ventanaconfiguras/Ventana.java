package ventanaconfiguras;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

//@autor Isidro Sotoca Estruch

public class Ventana extends JFrame {
    
    public Ventana () {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        Image miIcono = miPantalla.getImage("src/graficos/Seta.png");
        setIconImage(miIcono);
        setTitle("Ventana con figuras");
        setVisible(true);
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
    
}
