
package juego;
import java.util.ArrayList;
import java.util.Timer;
import juego.niveles.Nivel01;
import javax.swing.JFrame;


public class Main 
{

    public static void main(String[] args) 
    {
        Ventana Interfaz  = new Ventana( "Metodologia de Sistemas" );
        ArrayList Objetos = new ArrayList();
        
        Objetos.add( new Nivel01() );
        
          Video Juego = new Video( Objetos );

          
          Interfaz.add(Juego);
          Interfaz.setVisible(true);
        
    }
    
}
