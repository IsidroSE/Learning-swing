package ventanaconstring;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

//@autor Isidro Sotoca Estruch

public class Ventana extends JFrame {
    
    public Ventana () {
        setSize(500, 300);
        setLocation(400, 250);
        setVisible(true);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/graficos/Seta.png");
        setIconImage(miIcono);
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
    
}
