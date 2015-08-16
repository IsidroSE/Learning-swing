/*Ejercicio: mostrar todas las fuentes instaladas en el equipo*/
package verfuentes;
import java.awt.GraphicsEnvironment;

//@autor Isidro Sotoca Estruch


public class VerFuentes {

    public static void main(String[] args) {
        
        String fuentes [] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        for (String nombreFuente: fuentes) {
           System.out.println(nombreFuente);
        }
        
    }
    
}
