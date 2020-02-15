/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrymelee;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;


import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.ArrayList;
import java.lang.Thread;
import java.awt.event.*;
import javax.swing.SwingUtilities;
/**
 *
 * @author Jason Dendy, Brian Catter
 */
public class GeometryMelee extends JFrame {
    
    private MeleeSim sim;
    private boolean quit = false, run = false;
    
    public GeometryMelee() {
        
        sim = new MeleeSim();
        JMenu start; 
        JMenu pause;
        JMenu reset;
        JMenu close;
        
        setName("GEOMETRY MELEE");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(655, 543));
        setBackground(Color.WHITE);
        JMenuBar topMenu = new JMenuBar();
        start = new JMenu("START");
        pause = new JMenu("PAUSE");
        reset = new JMenu("RESET");
        close = new JMenu("CLOSE");
        topMenu.add(start);
        topMenu.add(pause);
        topMenu.add(reset);
        topMenu.add(close);
        add(new RenderArea(sim.getList()), BorderLayout.CENTER);
        setJMenuBar(topMenu);
        setVisible(true);
        
        close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                quit = true;
            }
        });
    }
    
    private void startSim() {
        
    }
    
    private void pauseSim() {
        
    }
    
    private void resetSim() {
        
    }
    
    private void closeSim() {
        
    }
    
    public void wiggle()
    {
        sim.wiggle();
    }
    public boolean quitCheck()
    {
        return quit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GeometryMelee game = new GeometryMelee();
                
        while(!game.quitCheck())
        {
            game.repaint();
            game.wiggle();
            
            try
            {
                Thread.sleep(50);
                
            }
            catch(Exception e)
            {
                //There is currently no response to an exception here.
            }
        }
    }
    
}

class RenderArea extends JComponent {
    private static final int GRID_GAP = 20;
    
    /*Added */
    private ArrayList<SimObject> toRender;
    
    /*End of added*/
    public RenderArea(ArrayList<SimObject> linkToRender) 
    {
        setPreferredSize(new Dimension(655, 543));
        toRender = linkToRender;
    }
    
    @Override
    protected void paintComponent(Graphics obj) {
        super.paintComponent(obj);
        
        drawSimObjects(obj);
        
        // Vertical lines of grid
        obj.setColor(Color.BLACK);
        obj.drawLine(1  * (GRID_GAP), 0, 1  * (GRID_GAP), 480);
        obj.drawLine(2  * (GRID_GAP), 0, 2  * (GRID_GAP), 480);
        obj.drawLine(3  * (GRID_GAP), 0, 3  * (GRID_GAP), 480);
        obj.drawLine(4  * (GRID_GAP), 0, 4  * (GRID_GAP), 480);
        obj.drawLine(5  * (GRID_GAP), 0, 5  * (GRID_GAP), 480);
        obj.drawLine(6  * (GRID_GAP), 0, 6  * (GRID_GAP), 480);
        obj.drawLine(7  * (GRID_GAP), 0, 7  * (GRID_GAP), 480);
        obj.drawLine(8  * (GRID_GAP), 0, 8  * (GRID_GAP), 480);
        obj.drawLine(9  * (GRID_GAP), 0, 9  * (GRID_GAP), 480);
        obj.drawLine(10 * (GRID_GAP), 0, 10 * (GRID_GAP), 480);
        obj.drawLine(11 * (GRID_GAP), 0, 11 * (GRID_GAP), 480);
        obj.drawLine(12 * (GRID_GAP), 0, 12 * (GRID_GAP), 480);
        obj.drawLine(13 * (GRID_GAP), 0, 13 * (GRID_GAP), 480);
        obj.drawLine(14 * (GRID_GAP), 0, 14 * (GRID_GAP), 480);
        obj.drawLine(15 * (GRID_GAP), 0, 15 * (GRID_GAP), 480);
        obj.drawLine(16 * (GRID_GAP), 0, 16 * (GRID_GAP), 480);
        obj.drawLine(17 * (GRID_GAP), 0, 17 * (GRID_GAP), 480);
        obj.drawLine(18 * (GRID_GAP), 0, 18 * (GRID_GAP), 480);
        obj.drawLine(19 * (GRID_GAP), 0, 19 * (GRID_GAP), 480);
        obj.drawLine(20 * (GRID_GAP), 0, 20 * (GRID_GAP), 480);
        obj.drawLine(21 * (GRID_GAP), 0, 21 * (GRID_GAP), 480);
        obj.drawLine(22 * (GRID_GAP), 0, 22 * (GRID_GAP), 480);
        obj.drawLine(23 * (GRID_GAP), 0, 23 * (GRID_GAP), 480);
        obj.drawLine(24 * (GRID_GAP), 0, 24 * (GRID_GAP), 480);
        obj.drawLine(25 * (GRID_GAP), 0, 25 * (GRID_GAP), 480);
        obj.drawLine(26 * (GRID_GAP), 0, 26 * (GRID_GAP), 480);
        obj.drawLine(27 * (GRID_GAP), 0, 27 * (GRID_GAP), 480);
        obj.drawLine(28 * (GRID_GAP), 0, 28 * (GRID_GAP), 480);
        obj.drawLine(29 * (GRID_GAP), 0, 29 * (GRID_GAP), 480);
        obj.drawLine(30 * (GRID_GAP), 0, 30 * (GRID_GAP), 480);
        obj.drawLine(31 * (GRID_GAP), 0, 31 * (GRID_GAP), 480);
        // Horizontal lines of grid
        obj.drawLine(0, 1  * (GRID_GAP), 640, 1  * (GRID_GAP));
        obj.drawLine(0, 2  * (GRID_GAP), 640, 2  * (GRID_GAP));
        obj.drawLine(0, 3  * (GRID_GAP), 640, 3  * (GRID_GAP));
        obj.drawLine(0, 4  * (GRID_GAP), 640, 4  * (GRID_GAP));
        obj.drawLine(0, 5  * (GRID_GAP), 640, 5  * (GRID_GAP));
        obj.drawLine(0, 6  * (GRID_GAP), 640, 6  * (GRID_GAP));
        obj.drawLine(0, 7  * (GRID_GAP), 640, 7  * (GRID_GAP));
        obj.drawLine(0, 8  * (GRID_GAP), 640, 8  * (GRID_GAP));
        obj.drawLine(0, 9  * (GRID_GAP), 640, 9  * (GRID_GAP));
        obj.drawLine(0, 10 * (GRID_GAP), 640, 10 * (GRID_GAP));
        obj.drawLine(0, 11 * (GRID_GAP), 640, 11 * (GRID_GAP));
        obj.drawLine(0, 12 * (GRID_GAP), 640, 12 * (GRID_GAP));
        obj.drawLine(0, 13 * (GRID_GAP), 640, 13 * (GRID_GAP));
        obj.drawLine(0, 14 * (GRID_GAP), 640, 14 * (GRID_GAP));
        obj.drawLine(0, 15 * (GRID_GAP), 640, 15 * (GRID_GAP));
        obj.drawLine(0, 16 * (GRID_GAP), 640, 16 * (GRID_GAP));
        obj.drawLine(0, 17 * (GRID_GAP), 640, 17 * (GRID_GAP));
        obj.drawLine(0, 18 * (GRID_GAP), 640, 18 * (GRID_GAP));
        obj.drawLine(0, 19 * (GRID_GAP), 640, 19 * (GRID_GAP));
        obj.drawLine(0, 20 * (GRID_GAP), 640, 20 * (GRID_GAP));
        obj.drawLine(0, 21 * (GRID_GAP), 640, 21 * (GRID_GAP));
        obj.drawLine(0, 22 * (GRID_GAP), 640, 22 * (GRID_GAP));
        obj.drawLine(0, 23 * (GRID_GAP), 640, 23 * (GRID_GAP));
    }
    
    /*Added */
    public void drawSimObjects(Graphics g)
    {
        Color save = g.getColor();
        
        g.setColor(Color.RED);
        for(SimObject s : toRender)
        {
            int[] drawPos = s.getPos();
            g.fillRect((drawPos[0] * 20) + 3, (drawPos[1] * 20) + 3, 15, 15);
        }
        
        g.setColor(save);
    }
    
    /*End of added*/
}
