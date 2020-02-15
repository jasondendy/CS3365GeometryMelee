/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrymelee;

/**
 *
 * @author wulfo
 */
public class Bullet extends SimObject
{
    Bullet(int direction)
    {
        switch(direction)
        {
            case 0: velX = 1; velY = 1; break;
            case 1: velX = 1; velY = -1; break;
            case 2: velX = -1; velY = 1; break;
            case 3: velX = -1; velY = -1; break;
            default: velX = 0; velY = 1;
        }
    }
    
    
}
