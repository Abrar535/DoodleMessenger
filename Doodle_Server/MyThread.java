/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doodle_Server;

import static Doodle_Server.design.canvas;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taran
 */
public class MyThread extends Thread {

  public ArrayList<Line> list;
  boolean rubber_flag;
  int rubber_x;
  int rubber_y;
  
  MyThread()
  {
     list = new ArrayList();
     rubber_flag = false;
     rubber_x = 0;
     rubber_y = 0;
  }

   public void run()
   { 
       while(true)
       {
         //System.out.println("Hello");   
        try
        {
         
          Graphics g = canvas.getGraphics();
          
          
          for(Line l:list)
          {  
           // g.setColor(Color.BLACK);
              
              
          
            //g.setColor(new Color(l.r,l.g,l.b));    
            //g.drawLine(l.start_x,l.start_y,l.end_x,l.end_y);
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
