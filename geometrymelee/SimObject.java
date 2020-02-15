/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrymelee;

import java.util.Random;
/**
 *
 * @author Jason Dendy, Brian Catter
 */
public abstract class SimObject 
{
    protected int posX, posY, velX = 0, velY = 0;
    private int wig = 1;
    
    
    public int[] getPos()
    {
        int[] ret = new int[2];
        ret[0] = posX;
        ret[1] = posY;
        
        return ret;
    }
    public void nextPos()
    {
        posX += velX;
        posY += velY;
    }
    
    public void wiggle()
    {
        velX = 0;
        velY = 0;
        
        Random r = new Random();
        double rX = r.nextDouble();
        
        if(rX > 0.8)
            velX = 1;
        if(rX > 0.9)
            velX = -1;
        if(rX < 0.2)
            velY = 1;
        if(rX < 0.1)
            velY = -1;
            
        
        this.nextPos();
                    
        if(posX < 0)
            posX = 1;
        if(posX > 31)
            posX = 30;
        if(posY < 0)
            posY = 1;
        if(posY > 23)
            posY = 22;
    }
}
