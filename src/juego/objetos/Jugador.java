
package juego.objetos;

import Base.Objeto;
import javax.swing.ImageIcon;

public class Jugador extends Objeto
{
    public Jugador( String Nombre, int X, int Y,
            int MColumnas, int MFilas,
            int Fila, int Columna, int Ancho, int Alto )
    {
        super( Nombre,  X,  Y,  MColumnas,  MFilas,  Fila,  Columna, Ancho, Alto );
        Textura = new ImageIcon("jugador.png");
    }
}
