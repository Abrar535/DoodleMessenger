/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doodle_client;

import static doodle_client.design.canvas;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import javafx.scene.shape.Line;


import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Taran
 */
public class MyThread extends Thread{
    public ArrayList<Line1> list;
  MyThread()
  {
     list = new ArrayList();
    
  }

   public void run()
   {  Graphics g = canvas.getGraphics();
       while(true)
       {
         //System.out.println("Hello");   
        try
        {
         
         
       
          for(Line1 l : list)
          {  
         g.setColor(new Color(l.r,l.g,l.b));
         Graphics2D g2 = (Graphics2D) g;
         g2.setStroke(new BasicStroke(l.strokesize));
         g2.draw(new Line2D.Float(l.start_x,l.start_y,l.end_x,l.end_y)); 
          }
        
        }
        catch(Exception e)
        {
            
        }
      /* try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {
           Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
       }*/
       
       }
   }
}
