
package Base;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author ariel
 */
public class Objeto
{
    protected       String    Nombre;
    public   Coordenada  Posicion;
    
        protected       int MColumnas;
        protected       int    MFilas;
    protected       int      Fila;
    protected       int   Columna;
        protected       int     CFila;
    protected       int      CCol;
    
    protected ImageIcon   Textura;
    
    protected  int     Ancho;
    protected  int      Alto;
    
    protected Objeto( String Nombre, int X, int Y,
            int MColumnas, int MFilas,
            int Fila, int Columna,
            final int Ancho, int Alto )
    {
        this.Nombre = Nombre;
        Posicion = new Coordenada( X, Y );
        
        this.MColumnas = MColumnas;
           this.MFilas =    MFilas;
           
            this.Ancho = Ancho;
             this.Alto =  Alto;
           
              this.Fila =    Fila;
           this.Columna = Columna;
    }
    
    protected Objeto( String Nombre, int X, int Y, int Ancho, int Alto )
    {
        this.Nombre = Nombre;
        Posicion = new Coordenada( X, Y );
        
        this.Alto  =  Alto;
        this.Ancho = Ancho;
    }
    
    protected Objeto( int X, int Y, int Ancho, int Alto )
    {
        Posicion = new Coordenada( X, Y );
        this.Alto  =  Alto;
        this.Ancho = Ancho;
    }

    public void ver( Graphics g )
    {
        if( Textura != null )
        {
            if( Fila != 0 && Columna != 0 )
            {
                CCol  = ( Posicion.X() + (Columna*Ancho) ) ;
                CFila = ( Posicion.Y() +   (Fila*Alto)   ) ;
            }
            else if( Fila == 0 && Columna == 0)
            {
                CCol  =  Posicion.X() ;
                CFila =  Posicion.Y() ;
            }
            else
            {
                if( Columna == 0 && Fila != 0 )
                {
                    CCol = Posicion.X(); CFila = Posicion.Y() + (Fila*Alto);
                }
                else if( Fila == 0 && Columna != 0 )
                {
                    CFila = Posicion.Y(); CCol = Posicion.X() + (Columna*Ancho);
                }
            }
            g.setClip( CCol, CFila, Ancho, Alto );
            Textura.paintIcon( null, g, Posicion.X(), Posicion.Y() );
        }
        else
        {
            
        }
    }
    
}
