
package Base;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Nivel extends JPanel
{
    
    
    public Nivel(){}
    
    protected void marco( Graphics g )
    {
        g.setColor(Color.black);
        g.drawRect(24, 10, 730, 60);
        
        
        g.setColor( Color.white );
        g.fillRect(25, 11, 729, 59);
        
        g.setColor(Color.black);
        g.drawRect(24, 100, 730, 400 );
        
        g.setColor(Color.white);
        g.fillRect(25, 101, 729, 399 );
    }
    
}
