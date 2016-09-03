/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*public class Platformer extends Canvas
{
    
    public void paint(Graphics g)
    {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("C:\\Users\\sampada kaushal\\Desktop\\game\\background1.jpg");
        g.drawImage(i, 0, 0, this);
        
    }
    Person p=new Person();
}

*/











public class Platformer extends JPanel implements Runnable,KeyListener  {

 JPanel panel=new JPanel();
    


Thread t;


int x=20,bx=0,y=570;        //bx,by are background coordinates

                              //anonymous inner class. We are overriding paintComponent()method 
    public void paintComponent (Graphics g){         
        try {
            
            URL url = new URL(this.getClass().getResource("background1.jpg"),   "background1.jpg");
            Image img = ImageIO.read(url);
            g.drawImage(img,bx,0,1000,737,this);
                         //g.fillRect(200, 400, 40, 40);
            
        URL url1=new URL(this.getClass().getResource("kirbyidle.gif"),      "kirbyidle.gif");
          Image i=ImageIO.read(url1);
        g.drawImage(i,x,y,30,30, panel);
          
            
           /* URL url2=new URL(this.getClass().getResource("kirbywalk.gif"),       "kirbywalk.gif");
           Image i1=ImageIO.read(url2);
           g.drawImage(i1, x, y,30,30, panel);
     
        /* URL url3=new URL(this.getClass().getResource("kirbyjump.gif"),        "kirbyjump.gif");
         Image i2=ImageIO.read(url3);
        g.drawImage(i2,x,y,30,30,panel);
*/       
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Platformer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
public Platformer(){
  
    // t=new Thread(this);  
     //t.start();
    }
    

    
     //panel.addKeyListener(this);
    

     
     
   

  
      
  

    @Override
    public void run() {
    while(true)
       {
            bx=bx-10;
      
           if (bx==-900)
           {
               bx=0;
      
           }
           
           try {
               Thread.sleep(50);
      
           } catch (InterruptedException ex) {
               Logger.getLogger(Platformer.class.getName()).log(Level.SEVERE, null, ex);
           }
           panel.repaint();
      
       }
}
    

    @Override
    
  public void keyPressed(KeyEvent e){
   
       int key=e.getKeyCode();
       if (key==KeyEvent.VK_LEFT)
       {
           if (x<20)
           {
               x=20;
      
           }
           else
           {
               x=x-5;
      
           }
       }
           if (key==KeyEvent.VK_RIGHT)
           {
               bx=bx+5;
               x=x+5;
      
           }
               if (key==KeyEvent.VK_UP)
               {
                   if (y==0)
                   {
                       y=0;
      
                   }
                   else
                   {
                       y=y-5;
      
                   }
               }
       if (key==KeyEvent.VK_DOWN)
       {
           if(y==570)
           {
               y=570;
      
           }
           else
           {
               y=y+5;
      
           }
       }
       this.repaint();  
  }
       

   @Override
   public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

    @Override
  public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
}