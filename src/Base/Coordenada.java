
package Base;


public class Coordenada 
{
    private int x;
    private int y;
    
    Coordenada( int X, int Y )
    {
        x = X;
        y = Y;
    }
    
    public void X( int X ){ x = X; }
    public void Y( int Y ){ y = Y; }
    
    public int X(){ return x; }
    public int Y(){ return y; }
    
}
