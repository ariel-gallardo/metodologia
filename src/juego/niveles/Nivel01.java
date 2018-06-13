/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.niveles;

import Base.Dibujo;
import Base.Nivel;
import java.awt.Graphics;
import juego.objetos.*;

/**
 *
 * @author ariel
 */
public class Nivel01 extends Nivel implements Dibujo
{
    private Jugador pj;
    
    public Nivel01()
    {
        super();
        pj = new Jugador( "Ariel",  300,  300,  4,  4,  1,  0, 32, 32 );   
    }

    @Override
    public void ver(Graphics g)
    {
        marco(g);
        pj.ver(g);
        update(g);
    }
}
