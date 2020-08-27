/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doodle_client;
import java.awt.Color;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 *
 * @author Abrar-ThInK_PaD
 */
public class Com implements java.io.Serializable{
    int x;
    int y;
    boolean f;
    int r,g,b;
    String msg;
    Boolean send_flag;
    int sendstrokesize;
    //Boolean size_flag;
    Com()
    {
        x = 0;
        y = 0;
        f = false;
        r = 0;
        g = 0;
        b = 0;
        send_flag = false;
        msg = null;
        sendstrokesize = 0;
        //size_flag = false; 
    }
    
     void writeObject(java.io.ObjectOutputStream stream) throws IOException, NullPointerException{
        
        stream.writeInt(x);
        stream.writeInt(y);
        stream.writeBoolean(f);
        stream.writeInt(r);
        stream.writeInt(g);
        stream.writeInt(b);
        stream.writeUTF(msg);
        stream.writeBoolean(send_flag);
        stream.writeInt(sendstrokesize);
        stream.flush();
    }

    void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {
        x = stream.readInt();
        y = stream.readInt();
        f = stream.readBoolean();
        r = stream.readInt();
        g = stream.readInt();
        b = stream.readInt();
        msg = stream.readUTF();
        send_flag = stream.readBoolean();
        sendstrokesize = stream.readInt();
       
        
    }
    
}
