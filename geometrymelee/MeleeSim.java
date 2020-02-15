/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrymelee;

import java.util.ArrayList;
/**
 *
 * @author Jason Dendy, Brian Catter
 */
public class MeleeSim
{
    ArrayList<SimObject> objects; 
    
    public ArrayList<SimObject> getList()
    {
        return objects;
    }
    
    public MeleeSim()
    {
        objects = new ArrayList<SimObject>();
        
        for(int i = 0; i < 10; ++i)
        {
            Shape s1 = new Shape(i,i);
            objects.add(s1);
        }
        
    }
    
    public void wiggle()
    {
        for(SimObject s : objects)
        {
            s.wiggle();
        }
    }
    
    public void StartSim()
    {
        
    }
    public void PauseSim()
    {
        
    }
    public void ResetSim()
    {
        
    }
    public void QuitSim()
    {
        
    }
    
    //Draw to pixels 0,101 to 800, 500
}
