/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doodle_Server;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Taran
 */
public class Line implements Serializable {
     public int start_x,start_y,end_x,end_y;
     public int r,g,b;
     public int strokesize;
    public Line()
    {
        start_x = 0;
        start_y=0;
        end_x=0;
        end_y=0;
        r = 0;
        g = 0;
        b  = 0;
        strokesize = 1;
    }
    public Line(int x,int y, int w, int z,int s)
    {
        start_x = x;
        start_y=y;
        end_x=w;
        end_y=z;
        r = 0;
        g = 0;
        b = 0;
        strokesize = s;
    }
}
