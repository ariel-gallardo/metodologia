package juego;

import Base.Dibujo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame
{
    private Dimension Resolucion;
    private    String     Titulo;
    
    Ventana( String Titulo )
    {
        setTitle( Titulo );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        Resolucion = new Dimension( 800, 600 );
        setPreferredSize( Resolucion );
        setSize(Resolucion);
        setResizable( false );
        setBackground( Color.black );
        
    }
}

class Video extends JPanel
{
    private ArrayList    Graficos;                                              // Le interesan las figuras de los objetos
    private    Dibujo     Visible;
    
    Video( ArrayList Objetos )
    {
        Graficos = Objetos;
        setPreferredSize( new Dimension( 800,600 ) );
        setBackground( Color.red );
        setVisible( true );
    }
    
    @Override
    public void paint( Graphics g )
    {
        
        for( Object FIGURA : Graficos )
        {
            Visible = (Dibujo)FIGURA;
            Visible.ver( g );
        }
    }
}


