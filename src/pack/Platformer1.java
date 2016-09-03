/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;






/**
 *
 * @author sampada kaushal
 */

    public class Platformer1 extends JFrame implements KeyListener,Runnable,MouseListener,MouseMotionListener,ActionListener  {



 static JPanel panel,panel1,panel2;
 
 static int marks=0;
 
 static JLabel score=new JLabel();
 
 //static JButton b=new JButton(" "+marks);
  
 
 
 
JMenuBar menu=new JMenuBar();
 JMenu file=new JMenu("File");
 JMenu help=new JMenu("Help");
 static JMenu s=new JMenu("         "+marks);
 
    
JMenuItem menuItem = new JMenuItem("New     Alt+N", KeyEvent.VK_N);
JMenuItem menuItem1=new JMenuItem("Exit     Alt+E",KeyEvent.VK_E);
JMenuItem menuItem2=new JMenuItem("How To     Alt+O",KeyEvent.VK_O);
JMenuItem menuItem3=new JMenuItem("About     Alt+A",KeyEvent.VK_A);
 
// static String[] enemyWalk;
// static String[] eleWalk;
// //static String enemyWalk[]=new String[10];
// //static String eleWalk[]=new String[10];
// static
//{
//     enemyWalk=new String[10];
//     eleWalk=new String[10];
//    enemyWalk[0]="enemy2.png";
//    enemyWalk[1]="enemy3.png";
//    enemyWalk[2]="enemy4.png";
//    enemyWalk[3]="enemy5.png";
//    
//    eleWalk[0]="enemy6.png";
//    eleWalk[1]="enemy7.png";
//    eleWalk[2]="enemy8.png";
//    eleWalk[3]="enemy9.png";
//    eleWalk[4]="enemy10.png";
//    
//
//}
 
static int x=20,bx=0,bx1=1000,bx2=2000,bx3=3000,bx4=4000,y=210,y1=590,bbx=0;
static int ex=720,ey=560;
static int ex1=1240,ey1=560;
static int ex11=1140,ey11=90;
static int ex12=1840,ey12=220;
static int ex13=2090,ey13=220;

static int ex2=50,ey2=540;
static int ex21=840,ey21=210;
static int ex22=1090,ey22=210;
static int ex23=1680,ey23=340;

static int ex3=140,ey3=80;
static int ex31=640,ey31=350;
static int ex32=1700,ey32=540;
static int ex33=2220,ey33=540;
static int ex34=2140,ey34=90;
static int ex35=2640,ey35=350;

static int mainx=4100,mainy=200;

static int mainfx=4150,mainfy=240;



static String enemy="enemy1.png";
static String enemy2="enemy2.png";
static String enemy3="enemy6.png";
static String mainE="mainE1.png";
static String mainF="mainF5.png";
static String charFire=" ";
//static String mainRev="";

//static String f="fight1.png";

static String enemyWalk[]={"enemy2.png","enemy3.png","enemy4.png","enemy5.png"};

static String eleWalk[]={"enemy6.png","enemy7.png","enemy8.png","enemy9.png","enemy10.png"};

static String main_E[]={"mainE1.png","mainE2.png","mainE3.png","mainE4.png","mainE5.png","mainE6.png"};
//static String fight[]={"fight1.png","fight2.png","fight3.png"};

static String main_F[]={"mainF5.png"};
static String charF[]={"mainF1.png","mainF2.png","mainF3.png","mainF4.png"};
 static String picture="characteridle.png";
 static String pictureWalkcopy[]={"characterwalk1.png","characterwalk2.png","characterwalk3.png","characterwalk4.png","characterwalk5.png","characterwalk6.png","fight3_1.png"};
 static String pictureFallcopy="characterfall.png";
 static String pictureJumpcopy="characterjump.png";
// String picture3="kirbywalk3.gif";
// String picture4="kirbywalk4.gif";
// String picture5="kirbywalk5.gif";
// String picture6="kirbywalk6.gif";
static int walk=0;
static int en_walk=0;
static int en_walk1=0;
static int en_walk2=0;
static int en_walk3=0;
static int ele_walk=0;
static int main_walk=0;
static int mainf_walk=0;
static int char_fire=0;
 static boolean game=true;
 static boolean game1=false;
 static boolean gamef=false; 
// static int f1=0;
 static boolean over=true;
 

 
 Thread t;
 Multi t1;
 Multi1 t2;
 Multi11 t9;
 Multi12 t13;
 Multi13 t14;
 Multi2 t3;
 Multi3  t4;
 Multi31 t7;
 Multi32 t8;
 Multi33 t12;
 Multi4 t5;
 Multi41 t6;
 Multi42 t10;
 Multi43 t11;
 Multi44 t15;
 Multi45 t16;
 MainE t17;
 MainF t18;
 
 public Platformer1(){
     t=new Thread(this);
     t1=new Multi();
     t2=new Multi1();
     t3=new Multi2();
     t4=new Multi3();
     t5=new Multi4();
     t6=new Multi41();
     t7=new Multi31();
     t8=new Multi32();
     t9=new Multi11();
     t10=new Multi42();
     t11=new Multi43();
     t12=new Multi33();
     t13=new Multi12();
     t14=new Multi13();
     t15=new Multi44();
     t16=new Multi45();
     t17=new MainE();
     t18=new MainF();
     panel2=new JPanel(null)                         //ENEMY PANEL
     {
       public void paintComponent(Graphics g2)
       {
            try{
      URL  url2 = new URL(this.getClass().getResource(enemy),      enemy);
      Image i2 = ImageIO.read(url2);
      g2.drawImage(i2,ex,ey,60,70, panel2);
      g2.drawImage(i2, ex1, ey1,60,70,panel2);
      g2.drawImage(i2,ex11,ey11,60,70,panel2);
      g2.drawImage(i2, ex12, ey12,60,70,panel2);
      g2.drawImage(i2, ex13, ey13,60,70,panel2);
      
      
      URL url3=new URL(this.getClass().getResource(enemy2), enemy2);
      Image i3=ImageIO.read(url3);
      g2.drawImage(i3,ex2,ey2,80,80,panel2);
      g2.drawImage(i3, ex21, ey21,80,80,panel2);
      g2.drawImage(i3, ex22, ey22,80,80,panel2);
      g2.drawImage(i3, ex23, ey23,80,80,panel2);
      
      
      URL url4=new URL(this.getClass().getResource(enemy3), enemy3);
      Image i4=ImageIO.read(url4);
      g2.drawImage(i4,ex3,ey3,60,70,panel2);
      g2.drawImage(i4, ex31, ey31,60,70,panel2);
      g2.drawImage(i4,ex32,ey32,60,70,panel2);
      g2.drawImage(i4, ex33, ey33,60,70,panel2);
      g2.drawImage(i4, ex34, ey34,60,70,panel2);
      g2.drawImage(i4, ex35, ey35,60,70,panel2);
      
      
      URL url5=new URL(this.getClass().getResource(mainE), mainE);
      Image i5=ImageIO.read(url5);
      g2.drawImage(i5,mainx,mainy,150,150,panel2);
      
      URL url6=new URL(this.getClass().getResource(mainF), mainF);
      Image i6=ImageIO.read(url6);
      g2.drawImage(i6,mainfx,mainfy,140,60,panel2);
      
      URL url7=new URL(this.getClass().getResource(charFire), charFire);                                      //yahan pe take a png file jiska background blank hai
      Image i7=ImageIO.read(url7);
      g2.drawImage(i7,x+90,y+20,50,50,panel2);
      
             } catch (IOException e) {
                 Logger.getLogger(Platformer1.class.getName()).log(Level.SEVERE, null, e);
             } 
             
           
       }
     };
     panel1=new JPanel(new GridLayout()){                 //CHARACTER PANEL
         public void paintComponent(Graphics g1)
         {
           try {
               URL  url1 = new URL(this.getClass().getResource(picture),      picture);
                  //Image i1;
                 
                    Image i1 = ImageIO.read(url1);
                     g1.drawImage(i1,x,y,70,80, panel1);
                   //  g1.setColor(Color.red);
                     //g1.drawString("hykhkhjk"+marks,x+900,30);
                
            
                     
                
            
                     
             } catch (IOException e) {
                 Logger.getLogger(Platformer1.class.getName()).log(Level.SEVERE, null, e);
             } 
             
           
         }
             };
     panel1.setOpaque(false);
     panel2.setOpaque(false);
     
     
     panel =new JPanel(new GridLayout())                        //BACKGROUND PANEL
     {
    public void paintComponent (Graphics g){         
        try {
            
            
            URL url = new URL(this.getClass().getResource("background1copy.jpg"),   "background1copy.jpg");
            Image img = ImageIO.read(url);
            g.drawImage(img,0,0,1000,737,panel);
            g.drawImage(img,1000,0,1000,737,panel);           
            g.drawImage(img,2000,0,1000,737,panel);           
            g.drawImage(img,3000,0,1000,737,panel);           
            g.drawImage(img,4000,0,1000,737,panel);           
            
     //`       URL url1=new URL(this.getClass().getResource(picture),      picture);
        //`   Image i=ImageIO.read(url1);
           //` g.drawImage(i,x,y,70,80, panel);
            
            
//            URL url1=new URL(this.getClass().getResource("kirbyidle.gif"),      "kirbyidle.gif");
//            Image i=ImageIO.read(url1);
//            g.drawImage(i,x,y,30,30, panel);
            
            g.setColor(Color.red);
            g.drawRect(0, 280, 140, 65);
            g.drawRect(155, 415, 140,65);
            g.drawRect(155, 147, 140, 65);
            g.drawRect(346,280,65,65);
            g.drawRect(470,280,65,65);
            g.drawRect(592, 280, 65, 65);
            g.drawRect(430, 415, 140, 65);
            g.drawRect(470, 480, 60, 80);
            g.drawRect(300,560,405,59);
            g.drawRect(705,415,140,65);
            g.drawRect(705, 147, 140, 65);
            g.drawRect(860, 280, 140, 65);
            g.drawLine(0, 619, 300, 619);
            g.drawLine(705, 619, 1005, 619);
            
         
            
            
           // {URL url2=new URL(this.getClass().getResource("kirbyfall.gif"),      "kirbyfall.gif");
          //Image i1=ImageIO.read(url2);
          //g.drawImage(i1,this.getX(),this.getY(),30,30, panel);}
 
        
          }          
          
               
        catch (Exception e) {
            System.out.println(e.getMessage());
            Logger.getLogger(Platformer.class.getName()).log(Level.SEVERE, null, e);
        }
         
    }
   
    };

panel.setBounds(bx, 0, 7000, 700);
panel1.setBounds(x,y,200,200);
panel.add(panel1);
panel1.add(panel2);

//score.setVisible(true);
//score.setBackground(Color.RED);
//score.setForeground(Color.RED);
//score.setBounds(900, 30, 20, 20);
//score.setText(" "+marks);

//b.setBounds(60, 70, 40, 40);

file.setMnemonic(KeyEvent.VK_F);
 help.setMnemonic(KeyEvent.VK_H);
    menu.add(file);
    menu.add(help);
    
   // menu.add(b);
    menu.add(s);
    
menuItem.addActionListener(this);
menuItem1.addActionListener(this);
menuItem2.addActionListener(this);
menuItem3.addActionListener(this);
file.add(menuItem);
file.add(menuItem1);
help.add(menuItem2);
help.add(menuItem3);


//this.add(score,BorderLayout.EAST);

panel2.add(score);
//*panel2.add(score);
//panel2.add(b);
//this.add(b);
    

this.setJMenuBar(menu);
   
     this.setVisible(true);         
     this.setSize(1005,700);
     this.setLayout(null);
     this.setLocationRelativeTo(null);
     this.setResizable(false);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setTitle("2d game");
     this.add(panel);
     this.repaint();
      
            
           
           

     this.addKeyListener(this);
     this.addMouseMotionListener(this);
     t.start();
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     t5.start();
     t6.start();
     t7.start();
     t8.start();
     t9.start();
     t10.start();
     t11.start();
     t12.start();
     t13.start();
     t14.start();
     t15.start();
     t16.start();
     t17.start();
     t18.start();
     }
 
 public static void main (String args[]) throws FileNotFoundException, IOException
 {
     //new Platformer1();
    new First();

     
     
     //     HighScore ob=new HighScore(marks);
//    
//     FileOutputStream fout=new FileOutputStream("Score.txt");
//     ObjectOutputStream out=new ObjectOutputStream(fout);
//     out.writeObject(ob);
//     out.flush();
//     fout.close();
//     System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^success");
     
     
 }
  
 
 static public void mark(int a){
     s.setText(" "+a);
 //b.setText(" "+a);
 }
      
 public void run() {
    while(over)
       {

        if (y==y-5)               //freejump
   {
// picture=pictureJumpcopy;
 y=y-10;
  }
      

           
           
    
        
        
//                   //FIRST PANEL DOWN
//               if (x>=0 && x<=120&&y==210)             //280-30(size of kirby)=250
//               {
//                   y=210;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//           }
//               
//               else if(x>=110 && x<=280 && y==340)
//               {
//                   y=340;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//           }
//                    
//               
//               
//               
//                else  if (x>=100 && x<=280 && y==70)
//                {
//                    y=70;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//           }
//                
//                else if(x>=300 && x<=400 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                  
//                }
//                else if (x>=420 && x<=520 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                  
//                }
//                else if (x>540 && x<=640 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                  
//                }
//                else if (x>=410 && x<=560 &&y==340)
//                {
//                    y=340;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                  
//                   
//                }
//                else if (x>=270 && x<=700 &&y==480)
//                {
//                  
//                    y=480;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if (x>=660 && x<=830 &&y==340)
//                {
//                    y=340;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if (x>=660 && x<=830 &&y==70)
//                {
//                    y=70;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if (x>=810 && x<=1000 &&y==210)
//                {
//                  
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (y==540)
//                {
//                    y=540;
//                }
//                
//                
//                
//               //SECOND PANEL DOWN
//             else  if (x>=1000 && x<=1120&&y==210)             //280-30(size of kirby)=250
//               {
//                   y=210;
//             if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//             }
//               
//               else if(x>=1110 && x<=1280 && y==340)
//               {
//                   y=340;
//                   
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//               }
//               
//               
//                else  if (x>=1100 && x<=1280 && y==70)
//                {
//                    y=70;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if(x>=1300 && x<=1400 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=1420 && x<=1520 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>1540 && x<=1640 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=1410 && x<=1560 &&y==340)
//                {
//                    y=340;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                   
//                }
//                else if (x>=1270 && x<=1700 &&y==480)
//                {
//                    
//                    y=480;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if (x>=1660 && x<=1830 &&y==340)
//                {
//                    y=340;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=1660 && x<=1830 &&y==70)
//                {
//                    y=70;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=1810 && x<=2000 &&y==210)
//                {
//                    
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++; if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//              
//                
//                 
//                 
//          //THIRD PANEL DOWN
//             else  if (x>=2000 && x<=2120&&y==210)             //280-30(size of kirby)=250
//               {
//                   y=210;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
////               if (y>=590)
////                   y=590;
////               else if (y<=306 && x>=3 && x<=142)
////                   y=306;
////               else
////                   y=y+5;
//           }
//               
//               else if(x>=2110 && x<=2280 && y==340)
//               {
//                   y=340;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                  
//               }
//               
//               
//                else  if (x>=2100 && x<=2280 && y==70)
//                {
//                    y=70;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if(x>=2300 && x<=2400 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=2420 && x<=2520 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>2540 && x<=2640 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=2410 && x<=2560 &&y==340)
//                {
//                    y=340;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                   
//                }
//                else if (x>=2270 && x<=2700 &&y==480)
//                {
//                    
//                    y=480;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if (x>=2660 && x<=2830 &&y==340)
//                {
//                    y=340;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=2660 && x<=2830 &&y==70)
//                {
//                    y=70;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=2810 && x<=3000 &&y==210)
//                {
//                    
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }       
//                 
//                 
//                 
//                 
//                 //FOURTH PANEL DOWN
//             else  if (x>=3000 && x<=3120&&y==210)             //280-30(size of kirby)=250
//               {
//                   y=210;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
////               if (y>=590)
////                   y=590;
////               else if (y<=306 && x>=3 && x<=142)
////                   y=306;
////               else
////                   y=y+5;
//           }
//               
//               else if(x>=3110 && x<=3280 && y==340)
//               {
//                   y=340;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//               }
//               
//               
//                else  if (x>=3100 && x<=3280 && y==70)
//                {
//                    y=70;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if(x>=3300 && x<=3400 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=3420 && x<=3520 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>3540 && x<=3640 &&y==210)
//                {
//                    y=210;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                    
//                }
//                else if (x>=3410 && x<=3560 &&y==340)
//                {
//                    y=340;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                   
//                }
//                else if (x>=3270 && x<=3700 &&y==480)
//                {
//                    
//                    y=480;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if (x>=3660 && x<=3830 &&y==340)
//                {
//                    y=340;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++; 
//                }
//                else if (x>=3660 && x<=3830 &&y==70)
//                {
//                    y=70;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++; 
//                }
//                else if (x>=3810 && x<=4000 &&y==210)
//                {
//                    
//                    y=210;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++; 
//                }       
//          
//                 
//                 
//                 
//                 //FIFTH PANEL DOWN
//             else  if (x>=4000 && x<=4120&&y==210)             //280-30(size of kirby)=250
//               {
//                   y=210;
//                    if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
////               if (y>=590)
////                   y=590;
////               else if (y<=306 && x>=3 && x<=142)
////                   y=306;
////               else
////                   y=y+5;
//           }
//               
//               else if(x>=4110 && x<=4280 && y==340)
//               {
//                   y=340;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//               }
//               
//               
//                else  if (x>=4100 && x<=4280 && y==70)
//                {
//                    y=70;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if(x>=4300 && x<=4400 &&y==210)
//                {
//                    y=210;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                }
//                else if (x>=4420 && x<=4520 &&y==210)
//                {
//                    y=210;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                }
//                else if (x>4540 && x<=4640 &&y==210)
//                {
//                    y=210;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                }
//                else if (x>=4410 && x<=4560 &&y==340)
//                {
//                    y=340;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                   
//                }
//                else if (x>=4270 && x<=4700 &&y==480)
//                {
//                    
//                    y=480;
//                     if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
//                }
//                else if (x>=4660 && x<=4830 &&y==340)
//                {
//                    y=340;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                }
//                else if (x>=4660 && x<=4830 &&y==70)
//                {
//                    y=70;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                }
//                else if (x>=4810 && x<=5000 &&y==210)
//                {
//                    
//                    y=210;
//                   if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;  
//                }
//                 
//                 
//                 
//                
//                else
//               {
//                   y=y+5;
//               }

           
           
          
    
              
              
              
            
           
            /* if (y>=0 && y<=115)
          {
            y=y+5;
          }
           else 
             { y=y+5;}
         
             if (y>115 && y<=250)  
           {
               y=y+5;
           }
          /* else  if (y>250 && y<=385)
            {
                y=y+5;
            }
          */
           
               
               
               
               //FIRST PANEL RIGHT
                if (y>210 && y<340 && x==100)
           {
                    
              x=100;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==100)
                {System.out.println("2");
                    x=100;
                }
         else if(y>70 && y<210 && x==100)//x==120)
         {System.out.println("3");
             x=100;
         }
         else if (y>210 && y<340 &&x==290)
         {System.out.println("4");
             x=290;
         }
         else if(y>210 && y<340 && x==410)
         {System.out.println("5");
             x=410;
         }
         else if (y>210 && y<340 && x==530)
         {System.out.println("6");
             x=530;
         }
         else if (y>=345 && y<480 &&x==370)
         {System.out.println("7");
             x=370;
         }
         else if (y>450 && y<560 &&x==410)
         {System.out.println("8");
             x=410;
         }
         else if (y>480 && y<=540 &&x==240)
         {System.out.println("9");
             x=240;
         }
         else if (y>=345 && y<480 &&x==640)
         {System.out.println("10");
             x=640;
         }
         else if (y>70 && y<210 &&x==640)
         {System.out.println("11");
             x=640;
         }
         else if (y>210 && y<340 &&x==800)
         {System.out.println("12");
             x=800;
         }
  
           

         
         
         
               //SECOND PANEL RIGHT
               else if (y>210 && y<340 && x==1130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=1130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==1100)
                {
                    x=1100;
                }
         else if(y>70 && y<210 && x==1100)//x==120)
         {
             x=1100;
         }
         else if (y>210 && y<340 &&x==1290)
         {
             x=1290;
         }
         else if(y>210 && y<340 && x==1410)
         {
             x=1410;
         }
         else if (y>210 && y<340 && x==1530)
         {
             x=1530;
         }
         else if (y>=345 && y<480 &&x==1370)
         {
             x=1370;
         }
         else if (y>450 && y<560 &&x==1410)
         {
             x=1410;
         }
         else if (y>480 && y<=540 &&x==1240)
         {
             x=1240;
         }
         else if (y>=345 && y<480 &&x==1640)
         {
             x=1640;
         }
         else if (y>70 && y<210 &&x==1640)
         {
             x=1640;
         }
         else if (y>210 && y<340 &&x==1800)
         {
             x=1800;
         }
    
         
         
               //THIRD PANEL RIGHT
               else if (y>210 && y<340 && x==2130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=2130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==2100)
                {
                    x=2100;
                }
         else if(y>70 && y<210 && x==2100)//x==120)
         {
             x=2100;
         }
         else if (y>210 && y<340 &&x==2290)
         {
             x=2290;
         }
         else if(y>210 && y<340 && x==2410)
         {
             x=2410;
         }
         else if (y>210 && y<340 && x==2530)
         {
             x=2530;
         }
         else if (y>=345 && y<480 &&x==2370)
         {
             x=2370;
         }
         else if (y>450 && y<560 &&x==2410)
         {
             x=2410;
         }
         else if (y>480 && y<=540 &&x==2240)
         {
             x=2240;
         }
         else if (y>=345 && y<480 &&x==2640)
         {
             x=2640;
         }
         else if (y>70 && y<210 &&x==2640)
         {
             x=2640;
         }
         else if (y>210 && y<340 &&x==2800)
         {
             x=2800;
         }
    
         
         
         
         
               //FOURTH PANEL RIGHT
               else if (y>210 && y<340 && x==3130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=3130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==3100)
                {
                    x=3100;
                }
         else if(y>70 && y<210 && x==3100)//x==120)
         {
             x=3100;
         }
         else if (y>210 && y<340 &&x==3290)
         {
             x=3290;
         }
         else if(y>210 && y<340 && x==3410)
         {
             x=3410;
         }
         else if (y>210 && y<340 && x==3530)
         {
             x=3530;
         }
         else if (y>=345 && y<480 &&x==3370)
         {
             x=3370;
         }
         else if (y>450 && y<560 &&x==3410)
         {
             x=3410;
         }
         else if (y>480 && y<=540 &&x==3240)
         {
             x=3240;
         }
         else if (y>=345 && y<480 &&x==3640)
         {
             x=3640;
         }
         else if (y>70 && y<210 &&x==3640)
         {
             x=3640;
         }
         else if (y>210 && y<340 &&x==3800)
         {
             x=3800;
         }
    
         
         
         
               //FIFTH PANEL RIGHT
               else if (y>210 && y<340 && x==4130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=4130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==4100)
                {
                    x=4100;
                }
         else if(y>70 && y<210 && x==4100)//x==120)
         {
             x=4100;
         }
         else if (y>210 && y<340 &&x==4290)
         {
             x=4290;
         }
         else if(y>210 && y<340 && x==4410)
         {
             x=4410;
         }
         else if (y>210 && y<340 && x==4530)
         {
             x=4530;
         }
         else if (y>=345 && y<480 &&x==4370)
         {
             x=4370;
         }
         else if (y>450 && y<560 &&x==4410)
         {
             x=4410;
         }
         else if (y>480 && y<=540 &&x==4240)
         {
             x=4240;
         }
         else if (y>=345 && y<480 &&x==4640)
         {
             x=4640;
         }
         else if (y>70 && y<210 &&x==4640)
         {
             x=4640;
         }
         else if (y>210 && y<340 &&x==4800)
         {
             x=4800;
         }
     
         else
            {
                x=x+10;
            }  
        
           
         
               bx=bx-10;
               bx1=bx1-10;
               bx2=bx2-10;
               bx3=bx3-10;
               bx4=bx4-10;    
               bbx=bbx+10;
               panel.setLocation(bx,0);
               System.out.println(bx+"  "+x+" "+bbx); 
             if(bbx==x)
         {
             over=false;
                
            }
            if(bbx==4000)
         {
                over=false;
          }            
            
//            bx=bx-10;
//            bx1=bx1-10; 
               
//           if (bx1==0)
//           {
//              bx=1000;
//      
//           }
//          else if(bx==0)
//           {
//               bx1=1000;
//           }
//           
         
         
               
               
         try {
               Thread.sleep(70);
      
           } catch (InterruptedException e) {
               Logger.getLogger(Platformer.class.getName()).log(Level.SEVERE, null, e);
           }
          
         panel.repaint();
      
       
 } }
    
    
    
    
     
    

  

    @Override
    
  public void keyPressed(KeyEvent e){
   
       
       if (KeyEvent.VK_LEFT==e.getKeyCode())
       {
           //FIRST PANEL LEFT
           if (y>210 && y<340 && x==130)
           {
               x=130;
              // JOptionPane.showMessageDialog(null,"GAME OVER");
           }
    
//           else if(y>315 && y<480 && x==145)
//           {
//               x=145;
//           }
         else if(y>=345 && y<480 && x==290)
          {System.out.println("left2");
             x=290;
         }
         else if(y>70 && y<210 && x==290)
         {System.out.println("left3");
             x=290;
         }
         else if (y>210 && y<340 && x==410)
         {System.out.println("left4");
             x=410;
         }
         else if(y>210 && y<340 && x==530)
         {System.out.println("left5");
             x=530;
         }
         else if(y>210 && y<340 &&x==650)
         {System.out.println("left6");
             x=650;
         }
         else if (y>=345 && y<480 &&x==570)
         {System.out.println("left7");
             x=570;
         }
         else if (y>450 && y<560 &&x==530)
         {System.out.println("left8");
           x=530;
         }
         else if(y>480 && y<=540 &&x==700)
         {System.out.println("left9");
             x=700;         
         }
         else if (y>=345 && y<480 &&x==840)
         {System.out.println("left10");
             x=840;
         }
         else if (y>70 && y<210 &&x==840)
         {System.out.println("left11");
             x=840;
         }
         
         
         
       
            //SECOND PANEL LEFT
         else  if (y>210 && y<340 && x==1130)
           {
               x=1130;
              // JOptionPane.showMessageDialog(null,"GAME OVER");
           }
    
//           else if(y>315 && y<480 && x==145)
//           {
//               x=145;
//           }
         else if(y>=345 && y<480 && x==1290)
          {
             x=1290;
         }
         else if(y>70 && y<210 && x==1290)
         {
             x=1290;
         }
         else if (y>210 && y<340 && x==1410)
         {
             x=1410;
         }
         else if(y>210 && y<340 && x==1530)
         {
             x=1530;
         }
         else if(y>210 && y<340 &&x==1650)
         {
             x=1650;
         }
         else if (y>=345 && y<480 &&x==1570)
         {
             x=1570;
         }
         else if (y>450 && y<560 &&x==1530)
         {
           x=1530;
         }
         else if(y>480 && y<=540 &&x==1700)
         {
             x=1700;         
         }
         else if (y>=345 && y<480 &&x==1840)
         {
             x=1840;
         }
         else if (y>70 && y<210 &&x==1840)
         {
             x=1840;
         }
        
         
         
         
               //THIRD PANEL LEFT
         else  if (y>210 && y<340 && x==2130)
           {
               x=2130;
              // JOptionPane.showMessageDialog(null,"GAME OVER");
           }
    
//           else if(y>315 && y<480 && x==145)
//           {
//               x=145;
//           }
         else if(y>=345 && y<480 && x==2290)
          {
             x=2290;
         }
         else if(y>70 && y<210 && x==2290)
         {
             x=2290;
         }
         else if (y>210 && y<340 && x==2410)
         {
             x=2410;
         }
         else if(y>210 && y<340 && x==2530)
         {
             x=2530;
         }
         else if(y>210 && y<340 &&x==2650)
         {
             x=2650;
         }
         else if (y>=345 && y<480 &&x==2570)
         {
             x=2570;
         }
         else if (y>450 && y<560 &&x==2530)
         {
           x=2530;
         }
         else if(y>480 && y<=540 &&x==2700)
         {
             x=2700;         
         }
         else if (y>=345 && y<480 &&x==2840)
         {
             x=2840;
         }
         else if (y>70 && y<210 &&x==2840)
         {
             x=2840;
         }
      
         
         
         
               //FOURTH PANEL LEFT
         else  if (y>210 && y<340 && x==3130)
           {
               x=3130;
              // JOptionPane.showMessageDialog(null,"GAME OVER");
           }
    
//           else if(y>315 && y<480 && x==145)
//           {
//               x=145;
//           }
         else if(y>=345 && y<480 && x==3290)
          {
             x=3290;
         }
         else if(y>70 && y<210 && x==3290)
         {
             x=3290;
         }
         else if (y>210 && y<340 && x==3410)
         {
             x=3410;
         }
         else if(y>210 && y<340 && x==3530)
         {
             x=3530;
         }
         else if(y>210 && y<340 &&x==3650)
         {
             x=3650;
         }
         else if (y>=345 && y<480 &&x==3570)
         {
             x=3570;
         }
         else if (y>450 && y<560 &&x==3530)
         {
           x=3530;
         }
         else if(y>480 && y<=540 &&x==3700)
         {
             x=3700;         
         }
         else if (y>=345 && y<480 &&x==3840)
         {
             x=3840;
         }
         else if (y>70 && y<210 &&x==3840)
         {
             x=3840;
         }
      
         
         
         
         
         //FIFTH PANEL LEFT
         else  if (y>210 && y<340 && x==4130)
           {
               x=4130;
              // JOptionPane.showMessageDialog(null,"GAME OVER");
           }
    
//           else if(y>315 && y<480 && x==145)
//           {
//               x=145;
//           }
         else if(y>=345 && y<480 && x==4290)
          {
             x=4290;
         }
         else if(y>70 && y<210 && x==4290)
         {
             x=4290;
         }
         else if (y>210 && y<340 && x==4410)
         {
             x=4410;
         }
         else if(y>210 && y<340 && x==4530)
         {
             x=4530;
         }
         else if(y>210 && y<340 &&x==4650)
         {
             x=4650;
         }
         else if (y>=345 && y<480 &&x==4570)
         {
             x=4570;
         }
         else if (y>450 && y<560 &&x==4530)
         {
           x=4530;
         }
         else if(y>480 && y<=540 &&x==4700)
         {
             x=4700;         
         }
         else if (y>=345 && y<480 &&x==4840)
         {
             x=4840;
         }
         else if (y>70 && y<210 &&x==4840)
         {
             x=4840;
         }
         
         
         
         
        
         
        else if (bbx==x)
         {
           x=bbx;  
         }
           else
           {
               x=x-10;
               
           }
           
           
           
           
//           bx=bx+10;
//           bx1=bx1+10;     
//           if (bx1==0)
//           {
//              bx=1000;
//      
//           }
//          else if(bx==0)
//           {
//               bx1=1000;
//           }
              
                       
           
           
//           System.out.println("left bx "+bx);
//           System.out.println("left bx1 "+bx1);
//           System.out.println("character y "+y);
//           System.out.println("character x "+x);
//           
           
          
       }
           if (KeyEvent.VK_RIGHT==e.getKeyCode())
           {
               
               //FIRST PANEL RIGHT
                if (y>210 && y<340 && x==130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
           //   x=130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==100)
                {System.out.println("2");
                    x=100;
                }
         else if(y>70 && y<210 && x==100)//x==120)
         {System.out.println("3");
             x=100;
         }
         else if (y>210 && y<340 &&x==290)
         {System.out.println("4");
             x=290;
         }
         else if(y>210 && y<340 && x==410)
         {System.out.println("5");
             x=410;
         }
         else if (y>210 && y<340 && x==530)
         {System.out.println("6");
             x=530;
         }
         else if (y>=345 && y<480 &&x==370)
         {System.out.println("7");
             x=370;
         }
         else if (y>450 && y<560 &&x==410)
         {System.out.println("8");
             x=410;
         }
         else if (y>480 && y<=540 &&x==240)
         {System.out.println("9");
             x=240;
         }
         else if (y>=345 && y<480 &&x==640)
         {System.out.println("10");
             x=640;
         }
         else if (y>70 && y<210 &&x==640)
         {System.out.println("11");
             x=640;
         }
         else if (y>210 && y<340 &&x==800)
         {System.out.println("12");
             x=800;
         }
  
           

         
         
         
               //SECOND PANEL RIGHT
               else if (y>210 && y<340 && x==1130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=1130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==1100)
                {
                    x=1100;
                }
         else if(y>70 && y<210 && x==1100)//x==120)
         {
             x=1100;
         }
         else if (y>210 && y<340 &&x==1290)
         {
             x=1290;
         }
         else if(y>210 && y<340 && x==1410)
         {
             x=1410;
         }
         else if (y>210 && y<340 && x==1530)
         {
             x=1530;
         }
         else if (y>=345 && y<480 &&x==1370)
         {
             x=1370;
         }
         else if (y>450 && y<560 &&x==1410)
         {
             x=1410;
         }
         else if (y>480 && y<=540 &&x==1240)
         {
             x=1240;
         }
         else if (y>=345 && y<480 &&x==1640)
         {
             x=1640;
         }
         else if (y>70 && y<210 &&x==1640)
         {
             x=1640;
         }
         else if (y>210 && y<340 &&x==1800)
         {
             x=1800;
         }
    
         
         
               //THIRD PANEL RIGHT
               else if (y>210 && y<340 && x==2130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=2130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==2100)
                {
                    x=2100;
                }
         else if(y>70 && y<210 && x==2100)//x==120)
         {
             x=2100;
         }
         else if (y>210 && y<340 &&x==2290)
         {
             x=2290;
         }
         else if(y>210 && y<340 && x==2410)
         {
             x=2410;
         }
         else if (y>210 && y<340 && x==2530)
         {
             x=2530;
         }
         else if (y>=345 && y<480 &&x==2370)
         {
             x=2370;
         }
         else if (y>450 && y<560 &&x==2410)
         {
             x=2410;
         }
         else if (y>480 && y<=540 &&x==2240)
         {
             x=2240;
         }
         else if (y>=345 && y<480 &&x==2640)
         {
             x=2640;
         }
         else if (y>70 && y<210 &&x==2640)
         {
             x=2640;
         }
         else if (y>210 && y<340 &&x==2800)
         {
             x=2800;
         }
    
         
         
         
         
               //FOURTH PANEL RIGHT
               else if (y>210 && y<340 && x==3130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=3130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==3100)
                {
                    x=3100;
                }
         else if(y>70 && y<210 && x==3100)//x==120)
         {
             x=3100;
         }
         else if (y>210 && y<340 &&x==3290)
         {
             x=3290;
         }
         else if(y>210 && y<340 && x==3410)
         {
             x=3410;
         }
         else if (y>210 && y<340 && x==3530)
         {
             x=3530;
         }
         else if (y>=345 && y<480 &&x==3370)
         {
             x=3370;
         }
         else if (y>450 && y<560 &&x==3410)
         {
             x=3410;
         }
         else if (y>480 && y<=540 &&x==3240)
         {
             x=3240;
         }
         else if (y>=345 && y<480 &&x==3640)
         {
             x=3640;
         }
         else if (y>70 && y<210 &&x==3640)
         {
             x=3640;
         }
         else if (y>210 && y<340 &&x==3800)
         {
             x=3800;
         }
    
         
         
         
               //FIFTH PANEL RIGHT
               else if (y>210 && y<340 && x==4130)
           {
//                    if (walk==6)
//         {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
               x=4130;//comment it later
 
                       
   
           }
                         
           
         else  if(y>=345 && y<480 &&x==4100)
                {
                    x=4100;
                }
         else if(y>70 && y<210 && x==4100)//x==120)
         {
             x=4100;
         }
         else if (y>210 && y<340 &&x==4290)
         {
             x=4290;
         }
         else if(y>210 && y<340 && x==4410)
         {
             x=4410;
         }
         else if (y>210 && y<340 && x==4530)
         {
             x=4530;
         }
         else if (y>=345 && y<480 &&x==4370)
         {
             x=4370;
         }
         else if (y>450 && y<560 &&x==4410)
         {
             x=4410;
         }
         else if (y>480 && y<=540 &&x==4240)
         {
             x=4240;
         }
         else if (y>=345 && y<480 &&x==4640)
         {
             x=4640;
         }
         else if (y>70 && y<210 &&x==4640)
         {
             x=4640;
         }
         else if (y>210 && y<340 &&x==4800)
         {
             x=4800;
         }
     
         
         
        
         else if (bbx+1000-30==x)
         {
             x=bbx+1000-30;
         }
         
         else
            {
                x=x+10;
            }  
              
             
//             if (y>120 && y<210 && x==150)
//            {
//                x=150;
//            }
//            else
//            {
//                x=x+10;
//            }
//               
               
               
//           bx=bx-10;  
//           bx1=bx1-10;
//           x=x+10;
//           if (bx1==0)
//           {
//              bx=1000;
//      
//         }
//          else if(bx==0)
//           {
//               bx1=1000;
//           }
                
                
                
//               bx=bx-10;
//               bx1=bx1-10;
//               bx2=bx2-10;
//               bx3=bx3-10;
//               bx4=bx4-10;
//               
              
//            System.out.println("right bx "+bx);
//            System.out.println("right bx1 "+bx1);
//            System.out.println("character y "+y);
//            System.out.println("character x "+x);

//panel.setLocation(bx,0);


                  // x=x+5;
     
           }
           if (KeyEvent.VK_UP==e.getKeyCode())
           {
               
               
               //FIRST PANEL UP
              if(x>=0 && x<=120&& y==340)                
               {
                   
               y=340;
            
//                if (y<=0)
//                   y=0;
//                else if ( y>=340 && x>=3 && x<=38)
//                    y=340;
//                else if (x>38)
//                    y=y-5;
//               
//                
               
           }
          
           
              else if(x>=110 && x<=280 && y==480)
              {
                  y=480;
                  System.out.println("up2");
              }
              
        
           
              else if(x>=100 && x<=280 && y==210)
              {
                  y=210;
                  System.out.println("up3");
                  
              }
              else if(x>=320 && x<=400 &&y==340)
              {
                  y=340;
                  System.out.println("up4");
              }
              else if(x>=420 && x<=520 &&y==340)
              {
               y=340;   
                  System.out.println("up5");
              }
              else if (x>540 && x<=640 &&y==340)
              {
                  y=340;
                  System.out.println("up6");
              }
              else if (x>=380 && x<=560 &&y==480)
              {
                  y=480;
                  System.out.println("up7");
                  
              }
              else if (x>=270 && x<=700 &&y==620)
              {
                  y=620;
                  System.out.println("up");
              }
              else if (x>=660 && x<=830 &&y==480)
              {
                  y=480;
                  System.out.println("up10");
              }
              else if (x>=660 && x<=830 &&y==210)
              {
                  y=210;
                  System.out.println("up11");
              }
              else if (x>=810 && x<=1000 &&y==340)
              {
                  y=340;
                  System.out.println("up12");
              }
              else if(y==0)
              {
                  y=0;
              }
              


              //SECOND PANEL UP
              else if(x>=1000 && x<=1120&& y==340)                
               {
                   
               y=340;
            
//                if (y<=0)
//                   y=0;
//                else if ( y>=340 && x>=3 && x<=38)
//                    y=340;
//                else if (x>38)
//                    y=y-5;
//               
//                
               
           }
          
           
              else if(x>=1110 && x<=1280 && y==480)
              {
                  y=480;
                  
              }
              
        
           
              else if(x>=1100 && x<=1280 && y==210)
              {
                  y=210;
                  
                  
              }
              else if(x>=1320 && x<=1400 &&y==340)
              {
                  y=340;
                  
              }
              else if(x>=1420 && x<=1520 &&y==340)
              {
               y=340;   
                  
              }
              else if (x>1540 && x<=1640 &&y==340)
              {
                  y=340;
                 
              }
              else if (x>=1380 && x<=1560 &&y==480)
              {
                  y=480;
                  
                  
              }
              else if (x>=1270 && x<=1700 &&y==620)
              {
                  y=620;
                  
              }
              else if (x>=1660 && x<=1830 &&y==480)
              {
                  y=480;
                  
              }
              else if (x>=1660 && x<=1830 &&y==1210)
              {
                  y=210; 
                  
              }
              else if (x>=1810 && x<=2000 &&y==340)
              {
                  y=340;
                  
              }
              else if(y==0)
              {
                  y=0;
              }
              

                 
                 //THIRD PANEL UP
              else if(x>=2000 && x<=2120&& y==340)                
               {
                   
               y=340;
            
//                if (y<=0)
//                   y=0;
//                else if ( y>=340 && x>=3 && x<=38)
//                    y=340;
//                else if (x>38)
//                    y=y-5;
//               
//                
               
           }
          
           
              else if(x>=2110 && x<=2280 && y==480)
              {
                  y=480;
                  
              }
              
        
           
              else if(x>=2100 && x<=2280 && y==210)
              {
                  y=210;
                  
                  
              }
              else if(x>=2320 && x<=2400 &&y==340)
              {
                  y=340;
                  
              }
              else if(x>=2420 && x<=2520 &&y==340)
              {
               y=340;   
                  
              }
              else if (x>2540 && x<=2640 &&y==340)
              {
                  y=340;
                 
              }
              else if (x>=2380 && x<=2560 &&y==480)
              {
                  y=480;
                  
                  
              }
              else if (x>=2270 && x<=2700 &&y==620)
              {
                  y=620;
                  
              }
              else if (x>=2660 && x<=2830 &&y==480)
              {
                  y=480;
                  
              }
              else if (x>=2660 && x<=2830 &&y==1210)
              {
                  y=210;
                  
              }
              else if (x>=2810 && x<=3000 &&y==340)
              {
                  y=340;
                  
              }
              else if(y==0)
              {
                  y=0;
              }
              
                 
                 
             //FOURTH PANEL UP
              else if(x>=3000 && x<=3120&& y==340)                
               {
                   
               y=340;
            
//                if (y<=0)
//                   y=0;
//                else if ( y>=340 && x>=3 && x<=38)
//                    y=340;
//                else if (x>38)
//                    y=y-5;
//               
//                
               
           }
          
           
              else if(x>=3110 && x<=3280 && y==480)
              {
                  y=480;
                  
              }
              
        
           
              else if(x>=3100 && x<=3280 && y==210)
              {
                  y=210;
                  
                  
              }
              else if(x>=3320 && x<=3400 &&y==340)
              {
                  y=340;
                  
              }
              else if(x>=3420 && x<=3520 &&y==340)
              {
               y=340;   
                  
              }
              else if (x>3540 && x<=3640 &&y==340)
              {
                  y=340;
                 
              }
              else if (x>=3380 && x<=3560 &&y==480)
              {
                  y=480;
                  
                  
              }
              else if (x>=3270 && x<=3700 &&y==620)
              {
                  y=620;
                  
              }
              else if (x>=3660 && x<=3830 &&y==480)
              {
                  y=480;
                  
              }
              else if (x>=3660 && x<=3830 &&y==1210)
              {
                  y=210;
                  
              }
              else if (x>=3810 && x<=4000 &&y==340)
              {
                  y=340;
                  
              }
              else if(y==0)
              {
                  y=0;
              }    
                 
                 
                 
              //FIFTH PANEL UP
              else if(x>=4000 && x<=4120&& y==340)                
               {
                   
               y=340;
            
//                if (y<=0)
//                   y=0;
//                else if ( y>=340 && x>=3 && x<=38)
//                    y=340;
//                else if (x>38)
//                    y=y-5;
//               
//                
               
           }
          
           
              else if(x>=4110 && x<=4280 && y==480)
              {
                  y=480;
                  
              }
              
        
           
              else if(x>=4100 && x<=4280 && y==210)
              {
                  y=210;
                  
                  
              }
              else if(x>=4320 && x<=4400 &&y==340)
              {
                  y=340;
                  
              }
              else if(x>=4420 && x<=4520 &&y==340)
              {
               y=340;   
                  
              }
              else if (x>4540 && x<=4640 &&y==340)
              {
                  y=340;
                 
              }
              else if (x>=4380 && x<=4560 &&y==480)
              {
                  y=480;
                  
                  
              }
              else if (x>=4270 && x<=4700 &&y==620)
              {
                  y=620;
                  
              }
              else if (x>=4660 && x<=4830 &&y==480)
              {
                  y=480;
                  
              }
              else if (x>=4660 && x<=4830 &&y==1210)
              {
                  y=210;
                  
              }
              else if (x>=4810 && x<=5000 &&y==340)
              {
                  y=340;
                  
              }
              else if(y==0)
              {
                  y=0;
              }    
                
              
              
              
                 
               else
               {
                   //picture=pictureJumpcopy;
                   y=y-5;
               }
              
              
              
           }
           if (KeyEvent.VK_DOWN==e.getKeyCode())
           {
               
               
               //FIRST PANEL DOWN
               
               if (x>=0 && x<=120&&y==210)             //280-30(size of kirby)=250
               {
                   y=210;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
//                   y=y+5;
           }
               
               else if(x>=110 && x<=280 && y==340)
               {
                   y=340;
                    System.out.println("down2");
               }
               
               
                else  if (x>=100 && x<=280 && y==70)
                {
                    y=70;
                }
                else if(x>=300 && x<=400 &&y==210)
                {
                    y=210;
                    System.out.println("down4");
                }
                else if (x>=420 && x<=520 &&y==210)
                {
                    y=210;
                    System.out.println("down5");
                }
                else if (x>540 && x<=640 &&y==210)
                {
                    y=210;
                    System.out.println("down6");
                }
                else if (x>=410 && x<=560 &&y==340)
                {
                    y=340;
                    System.out.println("down7");
                   
                }
                else if (x>=270 && x<=700 &&y==480)
                {
                    System.out.println("down9");
                    y=480;
                }
                else if (x>=660 && x<=830 &&y==340)
                {
                    y=340;
                    System.out.println("down10");
                }
                else if (x>=660 && x<=830 &&y==70)
                {
                    y=70;
                    System.out.println("down11");
                }
                else if (x>=810 && x<=1000 &&y==210)
                {
                    System.out.println("down12");
                    y=210;
                    
                }
                else if (y==540)
                {
                    y=540;
                }
                
                
                
               //SECOND PANEL DOWN
             else  if (x>=1000 && x<=1120&&y==210)             //280-30(size of kirby)=250
               {
                   y=210;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
//                   y=y+5;
           }
               
               else if(x>=1110 && x<=1280 && y==340)
               {
                   y=340;
                  
               }
               
               
                else  if (x>=1100 && x<=1280 && y==70)
                {
                    y=70;
                }
                else if(x>=1300 && x<=1400 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=1420 && x<=1520 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>1540 && x<=1640 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=1410 && x<=1560 &&y==340)
                {
                    y=340;
                    
                   
                }
                else if (x>=1270 && x<=1700 &&y==480)
                {
                    
                    y=480;
                }
                else if (x>=1660 && x<=1830 &&y==340)
                {
                    y=340;
                    
                }
                else if (x>=1660 && x<=1830 &&y==70)
                {
                    y=70;
                    
                }
                else if (x>=1810 && x<=2000 &&y==210)
                {
                    
                    y=210;
                    
                }
              
                
                 
                 
          //THIRD PANEL DOWN
             else  if (x>=2000 && x<=2120&&y==210)             //280-30(size of kirby)=250
               {
                   y=210;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
//                   y=y+5;
           }
               
               else if(x>=2110 && x<=2280 && y==340)
               {
                   y=340;
                  
               }
               
               
                else  if (x>=2100 && x<=2280 && y==70)
                {
                    y=70;
                }
                else if(x>=2300 && x<=2400 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=2420 && x<=2520 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>2540 && x<=2640 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=2410 && x<=2560 &&y==340)
                {
                    y=340;
                    
                   
                }
                else if (x>=2270 && x<=2700 &&y==480)
                {
                    
                    y=480;
                }
                else if (x>=2660 && x<=2830 &&y==340)
                {
                    y=340;
                    
                }
                else if (x>=2660 && x<=2830 &&y==70)
                {
                    y=70;
                    
                }
                else if (x>=2810 && x<=3000 &&y==210)
                {
                    
                    y=210;
                    
                }       
                 
                 
                 
                 
                 //FOURTH PANEL DOWN
             else  if (x>=3000 && x<=3120&&y==210)             //280-30(size of kirby)=250
               {
                   y=210;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
//                   y=y+5;
           }
               
               else if(x>=3110 && x<=3280 && y==340)
               {
                   y=340;
                  
               }
               
               
                else  if (x>=3100 && x<=3280 && y==70)
                {
                    y=70;
                }
                else if(x>=3300 && x<=3400 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=3420 && x<=3520 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>3540 && x<=3640 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=3410 && x<=3560 &&y==340)
                {
                    y=340;
                    
                   
                }
                else if (x>=3270 && x<=3700 &&y==480)
                {
                    
                    y=480;
                }
                else if (x>=3660 && x<=3830 &&y==340)
                {
                    y=340;
                    
                }
                else if (x>=3660 && x<=3830 &&y==70)
                {
                    y=70;
                    
                }
                else if (x>=3810 && x<=4000 &&y==210)
                {
                    
                    y=210;
                    
                }       
          
                 
                 
                 
                 //FIFTH PANEL DOWN
             else  if (x>=4000 && x<=4120&&y==210)             //280-30(size of kirby)=250
               {
                   y=210;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
//                   y=y+5;
           }
               
               else if(x>=4110 && x<=4280 && y==340)
               {
                   y=340;
                  
               }
               
               
                else  if (x>=4100 && x<=4280 && y==70)
                {
                    y=70;
                }
                else if(x>=4300 && x<=4400 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=4420 && x<=4520 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>4540 && x<=4640 &&y==210)
                {
                    y=210;
                    
                }
                else if (x>=4410 && x<=4560 &&y==340)
                {
                    y=340;
                    
                   
                }
                else if (x>=4270 && x<=4700 &&y==480)
                {
                    
                    y=480;
                }
                else if (x>=4660 && x<=4830 &&y==340)
                {
                    y=340;
                    
                }
                else if (x>=4660 && x<=4830 &&y==70)
                {
                    y=70;
                    
                }
                else if (x>=4810 && x<=5000 &&y==210)
                {
                    
                    y=210;
                    
                }
                 
                 
                 
                
                else
               {
                   y=y+5;
               }
              
              panel.repaint();  
           }
           
           
           if (KeyEvent.VK_ENTER==e.getKeyCode())
           {
               game=false;
               game1=true;
               gamef=true;
           
               if(gamef==true)
               {
                   if (char_fire==4)
           {
               char_fire=3;
           
           }
                try{
                    charFire=charF[char_fire];
                   
               }
            catch(Exception ex){
                char_fire=3;
                
            }
             //System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
           char_fire++; 
           
           panel.repaint();
               }
              if(game1==true){
               if (walk==7)
           {
               walk=6;
           
                   
               
                //System.out.println("###############################################################");
           }
               try{
                    picture=pictureWalkcopy[walk];
                   
               }
            catch(Exception ex){
                walk=6;
                
            }
             //System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
           walk++;
           
           //System.out.println("********************************************************************");
           panel.repaint();
            //System.out.println("000000000000000000000000000000000000000000000000000000000000000000000");
           }}
           
//           if (Platformer1.ele_walk==4)
//        {
//               Platformer1.ele_walk=0;
//           }
//       try{
//            Platformer1.enemy3=Platformer1.eleWalk[Platformer1.ele_walk];}
//       catch(Exception e){Platformer1.ele_walk=0;}
//           Platformer1.ele_walk++;
           
           
           this.repaint();
  }
  
   @Override
   public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

    @Override
  public void keyReleased(KeyEvent e) {
        if (KeyEvent.VK_ENTER==e.getKeyCode())
        {
            game=true;
            game1=false;
            gamef=false;
            if(gamef==false)
            {
                charFire=" ";
            }
            if(game==true){
            if (walk==6)
           {
               walk=0;
           }
            try
            {
            Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception ex)
            {
                walk=0;
            }
          Platformer1.walk++;
        }}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools 
  }

   

 
    @Override
    public void mouseClicked(MouseEvent e) {
  
       //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
   
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void mouseExited(MouseEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        System.out.println("x "+e.getX());
//    System.out.println("y "+e.getY());

 
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource()==menuItem1)
       {
       int option= JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO EXIT???");
       if (option == JOptionPane.YES_OPTION ) {

           System.exit(0);
           
           // The user chose YES.
           
       }
else if (option == JOptionPane.NO_OPTION) {
   // JOptionPane.showMessageDialog (null, "This is your answer for NO...'");
    
    }
       }
       
       if(e.getSource()==menuItem)
           
       {
           JOptionPane.showMessageDialog(this,"new");
       }
       
       if(e.getSource()==menuItem2)
       {
           JOptionPane.showMessageDialog(this,"BEWARE OF THE ENEMIES");
       }
       
       if(e.getSource()==menuItem3)
       {
           JOptionPane.showMessageDialog(this," SAMPADA KAUSHAL");
       }


      //else  if (option == JOptionPane.CANCEL_OPTION)  {
      // do something if they cancel it.
      //throw new UnsupportedOperationException("Not supported yet.");}
       
       
       
    }}
    




class Multi extends Thread
{


    public void run()
    {
        while(true){  
        //FIRST PANEL DOWN
               if (Platformer1.x>=0 && Platformer1.x<=120&& Platformer1.y==210)             //280-30(size of kirby)=250
               {
                   Platformer1.y=210;
                   if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
                   try{
            Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
                   
                   Platformer1.walk++;
                   }
          
          
//          if (Platformer1.f1==2)
//           {
//               Platformer1.f1=0;
//           }
//            Platformer1.f=Platformer1.fight[Platformer1.f1];
//           Platformer1.f1++;
           }

           
               
               else if(Platformer1.x>=110 && Platformer1.x<=280 && Platformer1.y==340)
               {
                   Platformer1.y=340;
                   if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
                    
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
           
           }
                    
               }
               
               
                else  if (Platformer1.x>=100 && Platformer1.x<=280 && Platformer1.y==70)
                {
                    Platformer1.y=70;
                    if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   
                   try
                   {
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
           }}
                
                else if(Platformer1.x>=300 && Platformer1.x<=400 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
             if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                  
                }}
                else if (Platformer1.x>=420 && Platformer1.x<=520 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                  if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                  
                }}
                
                else if (Platformer1.x>540 && Platformer1.x<=640 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                  
                }}
                else if (Platformer1.x>=410 && Platformer1.x<=560 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                  if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                  
                   
                }}
                else if (Platformer1.x>=270 && Platformer1.x<=700 &&Platformer1.y==480)
                {
                  
                    Platformer1.y=480;
                  if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }}
                
                else if (Platformer1.x>=660 && Platformer1.x<=830 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }
                }
                else if (Platformer1.x>=660 && Platformer1.x<=830 &&Platformer1.y==70)
                {
                    Platformer1.y=70;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }
                }
                else if (Platformer1.x>=810 && Platformer1.x<=1000 &&Platformer1.y==210)
                {
                  
                    Platformer1.y=210;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                 }
                }
                else if (Platformer1.y==540)
                {
                    Platformer1.y=540;
                }
                
                
                
               //SECOND PANEL DOWN
             else  if (Platformer1.x>=1000 && Platformer1.x<=1120&&Platformer1.y==210)             //280-30(size of kirby)=250
               {
                   Platformer1.y=210;
             if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
             }
             }
             
               else if(Platformer1.x>=1110 && Platformer1.x<=1280 && Platformer1.y==340)
               {
                   Platformer1.y=340;
                 
                   if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
              
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
               }}
               
               
                else  if (Platformer1.x>=1100 && Platformer1.x<=1280 && Platformer1.y==70)
                {
                    Platformer1.y=70;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }}
                
                else if(Platformer1.x>=1300 && Platformer1.x<=1400 &&Platformer1.y==210)
                {
                   Platformer1.y=210;
                   if(Platformer1.game==true){  
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
                     try{
            Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
                     Platformer1.walk++;
                    
                }
                }
                else if (Platformer1.x>=1420 && Platformer1.x<=1520 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                else if (Platformer1.x>1540 && Platformer1.x<=1640 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try{
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                else if (Platformer1.x>=1410 && Platformer1.x<=1560 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                   
                }
                }
                else if (Platformer1.x>=1270 && Platformer1.x<=1700 &&Platformer1.y==480)
                {
                    
                    Platformer1.y=480;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }
                }
                
                else if (Platformer1.x>=1660 && Platformer1.x<=1830 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
         }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                
                else if (Platformer1.x>=1660 && Platformer1.x<=1830 &&Platformer1.y==70)
                {
                    Platformer1.y=70;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                else if (Platformer1.x>=1810 && Platformer1.x<=2000 &&Platformer1.y==210)
                {
                    
                    Platformer1.y=210;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
         Platformer1.walk++; 
         //if (walk==6)
//           {
//               walk=0;
//           }
//            picture=pictureWalkcopy[walk];
//           walk++;
                    
                }}
              
                
               
                 
          //THIRD PANEL DOWN
             else  if (Platformer1.x>=2000 && Platformer1.x<=2120&&Platformer1.y==210)             //280-30(size of kirby)=250
               {
                   Platformer1.y=210;
                  if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try{
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
////                   y=y+5;
           }}
               
               else if(Platformer1.x>=2110 && Platformer1.x<=2280 && Platformer1.y==340)
               {
                   Platformer1.y=340;
             if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try{
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                  
               }
               
               }
               
                else  if (Platformer1.x>=2100 && Platformer1.x<=2280 && Platformer1.y==70)
                {
                    Platformer1.y=70;
               if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }
                }
                
                else if(Platformer1.x>=2300 && Platformer1.x<=2400 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                else if (Platformer1.x>=2420 && Platformer1.x<=2520 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                else if (Platformer1.x>2540 && Platformer1.x<=2640 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                else if (Platformer1.x>=2410 && Platformer1.x<=2560 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                 if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                   
                }
                }
                
                else if (Platformer1.x>=2270 && Platformer1.x<=2700 &&Platformer1.y==480)
                {
                    
                    Platformer1.y=480;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }
                }
                
                else if (Platformer1.x>=2660 && Platformer1.x<=2830 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                
                
                else if (Platformer1.x>=2660 && Platformer1.x<=2830 &&Platformer1.y==70)
                {
                    Platformer1.y=70;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }
                }
                
                
                else if (Platformer1.x>=2810 && Platformer1.x<=3000 &&Platformer1.y==210)
                {
                    
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                   
                }   }    
                 
                 
                 
                 
                 //FOURTH PANEL DOWN
             else  if (Platformer1.x>=3000 && Platformer1.x<=3120&&Platformer1.y==210)             //280-30(size of kirby)=250
               {
                   Platformer1.y=210;
                   if(Platformer1.game==true){ 
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try{
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
//                   y=y+5;
           }
             }
             
             
               else if(Platformer1.x>=3110 && Platformer1.x<=3280 && Platformer1.y==340)
               {
                   Platformer1.y=340;
                if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
               }
               
               }
               
                else  if (Platformer1.x>=3100 && Platformer1.x<=3280 && Platformer1.y==70)
                {
                    Platformer1.y=70;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
           
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }
                }
                
                else if(Platformer1.x>=3300 && Platformer1.x<=3400 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
                     try{
           Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
                     Platformer1.walk++;
                    
                }
                }
                
                
                else if (Platformer1.x>=3420 && Platformer1.x<=3520 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }}
                
                else if (Platformer1.x>3540 && Platformer1.x<=3640 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
          }
            try{
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                    
                }}
                
                
                else if (Platformer1.x>=3410 && Platformer1.x<=3560 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;  
                   
                }}
                
                
                else if (Platformer1.x>=3270 && Platformer1.x<=3700 &&Platformer1.y==480)
                {
                    
                    Platformer1.y=480;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }
                }
                
                
                else if (Platformer1.x>=3660 && Platformer1.x<=3830 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try{
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++; 
                }
                }
                
                else if (Platformer1.x>=3660 && Platformer1.x<=3830 &&Platformer1.y==70)
                {
                    Platformer1.y=70;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try{
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++; 
                }}
                
                else if (Platformer1.x>=3810 && Platformer1.x<=4000 &&Platformer1.y==210)
                {
                    
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try
                    {
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++; 
                }       
                }
                
                 
                 
                 
                 //FIFTH PANEL DOWN
             else  if (Platformer1.x>=4000 && Platformer1.x<=4120&&Platformer1.y==210)             //280-30(size of kirby)=250
               {
                   Platformer1.y=210;
                if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                    try{
                        Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                    }
                    catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
//               if (y>=590)
//                   y=590;
//               else if (y<=306 && x>=3 && x<=142)
//                   y=306;
//               else
//                   y=y+5;
           }
             }
             
               else if(Platformer1.x>=4110 && Platformer1.x<=4280 && Platformer1.y==340)
               {
                   Platformer1.y=340;
             if(Platformer1.game==true){
                   if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
               }
               
               }
               
               
                else  if (Platformer1.x>=4100 && Platformer1.x<=4280 && Platformer1.y==70)
                {
                    Platformer1.y=70;
               if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
          }
                     try{
            Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
                     Platformer1.walk++;
                }
                }
                
                else if(Platformer1.x>=4300 && Platformer1.x<=4400 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try
                   {
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;  
                }}
                
                else if (Platformer1.x>=4420 && Platformer1.x<=4520 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;  
                }}
                
                else if (Platformer1.x>4540 && Platformer1.x<=4640 &&Platformer1.y==210)
                {
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;  
                }}
                
                
                else if (Platformer1.x>=4410 && Platformer1.x<=4560 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
           
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                                          
             catch(Exception e)
            {
                Platformer1.walk=0;
            }          

           Platformer1.walk++;  
                   
                }}
                
                else if (Platformer1.x>=4270 && Platformer1.x<=4700 &&Platformer1.y==480)
                {
                    
                    Platformer1.y=480;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
           
                     try{
                         Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                     }
                     catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;
                }}
                
                else if (Platformer1.x>=4660 && Platformer1.x<=4830 &&Platformer1.y==340)
                {
                    Platformer1.y=340;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
            
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;  
                }}
                
                else if (Platformer1.x>=4660 && Platformer1.x<=4830 &&Platformer1.y==70)
                {
                    Platformer1.y=70;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
              Platformer1.walk=0;
           }
           
                   try{
                       Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
                   }
                   catch(Exception e)
            {
                Platformer1.walk=0;
            }
           Platformer1.walk++;  
                }}
                
                
                else if (Platformer1.x>=4810 && Platformer1.x<=5000 &&Platformer1.y==210)
                {
                    
                    Platformer1.y=210;
                if(Platformer1.game==true){
                    if (Platformer1.walk==6)
           {
               Platformer1.walk=0;
           }
                   
            try
            {
                Platformer1.picture=Platformer1.pictureWalkcopy[Platformer1.walk];
            }
            catch(Exception e)
            {
                Platformer1.walk=0;
            }
            Platformer1.walk++;  
                }
                }
                 
                
                
                else
               {
                    Platformer1.y= Platformer1.y+5;
                    Platformer1.picture=Platformer1.pictureFallcopy;
                    
                    //Platformer1.score.setLocation(900, 30);
                    
                    if(Platformer1.over==true){
                       
                    Platformer1.marks=Platformer1.marks+10;
                     Platformer1.mark(Platformer1.marks);           //calling mark() method
                    }
                    else
                        Platformer1.marks=Platformer1.marks;
               }
  try {
        Thread.sleep(70);
    } catch (InterruptedException ex) {
        Logger.getLogger(Multi.class.getName()).log(Level.SEVERE, null, ex);
    }
       Platformer1.panel.repaint(); 
        }

    }
}

class Multi1 extends Thread
{
    public void run()
    {
   while(true)
   {

       if( Platformer1.ex<1240)
       {
        Platformer1.ex=Platformer1.ex+10; 
        
//         System.out.println("yellow1   "+Platformer1.ex+"  "+Platformer1.ey);
//           System.out.println("characterYellow   "+Platformer1.x+"  "+Platformer1.y);
//          
          if (Platformer1.y>=540 && Platformer1.y<=560 && Platformer1.x+70==Platformer1.ex)
           {
                     
           
              //System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
              HighScore ob=new HighScore(Platformer1.marks);
             try{
               FileOutputStream fout=new FileOutputStream("Score.txt");
               ObjectOutputStream out=new ObjectOutputStream(fout);
               out.writeObject(ob);
               out.flush();
               //fout.close();
               ObjectInputStream in=new ObjectInputStream(new FileInputStream("Score.txt"));
               ob=(HighScore) in.readObject();
               
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^success"+ob.high);
               in.close();
             }
               catch(Exception e)
             {
                //System.out.println(e);
             }

             // JOptionPane.showMessageDialog(null, "over   x");
              
 
           }
          else if(Platformer1.x+70>720 && Platformer1.x<=1240 && Platformer1.y+70==Platformer1.ey )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
            
              
              
              HighScore ob=new HighScore(Platformer1.marks);
             try{
               FileOutputStream fout=new FileOutputStream("Score.txt");
               ObjectOutputStream out=new ObjectOutputStream(fout);
               out.writeObject(ob);
               out.flush();
               
               //fout.close();
               ObjectInputStream in=new ObjectInputStream(new FileInputStream("Score.txt"));
               ob=(HighScore) in.readObject();
               
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^success"+ob.high);
               in.close();
               }
               catch(Exception e)
             {
                System.out.println(e);
             }
           //  JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
          
       }
       else if(Platformer1.ex==1240)
           
       {
           for(Platformer1.ex=1240;Platformer1.ex>=720;)
           {
               Platformer1.ex=Platformer1.ex-10;
      
           }
      }
       
//       for(Platformer1.ex=720;Platformer1.ex<1000;)
//       {
//           Platformer1.ex=Platformer1.ex+10;
//           for(Platformer1.ex=1000;Platformer1.ex>720;)
//           {
//               Platformer1.ex=Platformer1.ex-10;
//           }
//       }
      
        try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
   }
}

}


class Multi11 extends Thread
{
    public void run()
    {
        while(true)
        {
            if (Platformer1.ex11<1260)
            {
                 

                Platformer1.ex11=Platformer1.ex11+10;
                
                
         //  System.out.println("yellow3   "+Platformer1.ex11+"  "+Platformer1.ey11);
           //System.out.println("characterYellow   "+Platformer1.x+"  "+Platformer1.y);
          
          if (Platformer1.y>=70 && Platformer1.y<=90 && Platformer1.x+70==Platformer1.ex11)
           {
                     
           
             // System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
            //  JOptionPane.showMessageDialog(null, "over   x");
              
 
           }
          else if(Platformer1.x+70>1150 && Platformer1.x<=1280 && Platformer1.y+70==Platformer1.ey11 )
           {
              //System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
              //JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
              
            }
             else if(Platformer1.ex11==1260)
           
       {
           for(Platformer1.ex11=1260;Platformer1.ex11>=1140;)
           {
             Platformer1.ex11=Platformer1.ex11-10;
               
               
           }
           
//           if (Platformer1.y>=70 && Platformer1.y<=90 && Platformer1.x+70==Platformer1.ex11 )
//           {
//                     
//           
//              System.out.println("oooooooooooooooooooover            x");
//              Platformer1.over=false;
//              JOptionPane.showMessageDialog(null, "over   x back");
//              
//           }
          
            }
             try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
        }
    }
}

class Multi12 extends Thread
{
    public void run()
    {
        while(true)
        {
            if(Platformer1.ex12<2090)
            {
                Platformer1.ex12=Platformer1.ex12+10;
                
                if (Platformer1.y>=210 && Platformer1.y<230 && Platformer1.x+140==Platformer1.ex12)
           {
                     
           
              //System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
            // JOptionPane.showMessageDialog(null, "over   xcrab");
              
 
           }
          else if(Platformer1.x+70>1840 && Platformer1.x<=2090 && Platformer1.y+70==Platformer1.ey12 )
           {
              //System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
                
            }
             else if(Platformer1.ex12==2090)
           
       {
           for(Platformer1.ex12=2090;Platformer1.ex12>=1840;)
           {
             Platformer1.ex12=Platformer1.ex12-10;
               
               
           }
      }
             try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
            
            
        }
    }
}


class Multi13 extends Thread
{
    public void run()
    {
        while(true)
        {
            if (Platformer1.ex13>1840)
       {
           Platformer1.ex13=Platformer1.ex13-10;
           
           
           
            if (Platformer1.y>=210 && Platformer1.y<230 && Platformer1.x+140==Platformer1.ex13)
           {
                     
           
              //System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
            JOptionPane.showMessageDialog(null, "over   xcrab");
              
 
           }
          else if(Platformer1.x+70>1840 && Platformer1.x<=2090 && Platformer1.y+70==Platformer1.ey13 )
           {
              //System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
           //   JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
       }
             else if(Platformer1.ex13==1840)
           
       {
           for(Platformer1.ex13=1840;Platformer1.ex13<=2090;)
           {
               Platformer1.ex13=Platformer1.ex13+10;
               
               
           }
           
           
      }
        
        try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
            
        }
    }
}

class Multi2 extends Thread
{
    public void run()
    {
        while(true)
        {
             if (Platformer1.ex1>720)
       {
           Platformer1.ex1=Platformer1.ex1-10;
           
           if (Platformer1.y>=540 && Platformer1.y<=560 && Platformer1.x+70==Platformer1.ex1)
           {
                     
           
              System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over   x1");
              
 
           }
          else if(Platformer1.x+70>720 && Platformer1.x<=1240 && Platformer1.y+70==Platformer1.ey1 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
           
           
           
           
          
          
       }
        else if(Platformer1.ex1==720)
           
       {
           for(Platformer1.ex1=720;Platformer1.ex1<=1240;)
           {
               Platformer1.ex1=Platformer1.ex1+10;
               
               
           }
           
           
      }
        
        try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
   }
    }
}





class Multi3 extends Thread
{
    public void run()
    {
        while(true)
        {
            if(Platformer1.ex2<240)
            {
                Platformer1.ex2=Platformer1.ex2+10;
                
//                  while(Platformer1.en_walk<=2)
//                {
//                    Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];
//                    Platformer1.en_walk++;
//                    if (Platformer1.en_walk==3)
//         {
//             
//               Platformer1.en_walk=0;
//            
//          }
//                }
                
                
                
                
                
                if (Platformer1.en_walk==3)
         {
               Platformer1.en_walk=0;
           }
                try{
            Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];
                }catch(Exception e){
                     Platformer1.en_walk=0;
                }
           Platformer1.en_walk++;
           
           
            if (Platformer1.y>=540 && Platformer1.y<=560 && Platformer1.x+70==Platformer1.ex2)
           {
                     
           
              System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over   x");
              
 
           }
          else if(Platformer1.x+70>50 && Platformer1.x<=240 && Platformer1.y+70==Platformer1.ey2 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over    y"); 
           }
           
          }
             else if(Platformer1.ex2==240)
           
       {
           for(Platformer1.ex2=240;Platformer1.ex2>=50;)
           {
             Platformer1.ex2=Platformer1.ex2-10;
               
               
           }
      }
             try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
        }
    }
}

class Multi31 extends Thread
{
    public void run()
    {
        while(true)
        {
            if(Platformer1.ex21<1090)
            {
                Platformer1.ex21=Platformer1.ex21+10;
                
                
                
//                while(Platformer1.en_walk<=2)
//                {
//                    Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];
//                    Platformer1.en_walk1++;
//                    if (Platformer1.en_walk==3)
//         {
//               Platformer1.en_walk=0;
//               
//          }
//                }
                
                if (Platformer1.en_walk==3)
         {
               Platformer1.en_walk=0;
          }
              

                try{
            Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];}
                catch(Exception e)
                {
                     Platformer1.en_walk=0;
                }
          Platformer1.en_walk++;
          
          System.out.println("red1 "+Platformer1.ex21+" "+Platformer1.ey21);
          System.out.println("character Red "+Platformer1.x+" "+Platformer1.y);
          
           if (Platformer1.y>=210 && Platformer1.y<220 && Platformer1.x+70==Platformer1.ex21)
           {
                     
           
              System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
            //  JOptionPane.showMessageDialog(null, "over   x1");
              
 
           }
          else if(Platformer1.x+70>840 && Platformer1.x<=1090 && Platformer1.y+70==Platformer1.ey21 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
            //  JOptionPane.showMessageDialog(null, "over    y"); 
           }
           
            }
             else if(Platformer1.ex21==1090)
           
       {
           for(Platformer1.ex21=1090;Platformer1.ex21>=840;)
           {
             Platformer1.ex21=Platformer1.ex21-10;
               
               
           }
      }
             try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
        
        }
    }
}

class Multi32 extends Thread

{
    public void run()
    {
        while(true)
        {
            if(Platformer1.ex22>840)
            {
                Platformer1.ex22=Platformer1.ex22-10;
                
                
//                  while(Platformer1.en_walk<=2)
//                {
//                    Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];
//                    Platformer1.en_walk++;
//                    if (Platformer1.en_walk==3)
//         {
//               Platformer1.en_walk=0;
//               
//          }
//                
                
                
                
                
                
                
                
                
                if (Platformer1.en_walk==3)
         {
               Platformer1.en_walk=0;
           }
                try{
            Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];}
                catch(Exception e)
                {
                     Platformer1.en_walk=0;
                }
           Platformer1.en_walk++;
           
           
           if (Platformer1.y>=210 && Platformer1.y<220 && Platformer1.x+70==Platformer1.ex22)
           {
                     
           
              System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
            //  JOptionPane.showMessageDialog(null, "over   ex22");
              
 
           }
          else if(Platformer1.x+70>840 && Platformer1.x<=1090 && Platformer1.y+70==Platformer1.ey22 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
            //  JOptionPane.showMessageDialog(null, "over    ey22"); 
          
           }
            }
             else if(Platformer1.ex22==840)
           
       {
           for(Platformer1.ex22=840;Platformer1.ex22<=1090;)
           {
             Platformer1.ex22=Platformer1.ex22+10;
               
               
           }
      }
             try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
        
        }
    }
}


class Multi33 extends Thread
{
    public void run()
    {
        while(true)
        {
             if(Platformer1.ex23<1800)
            {
                Platformer1.ex23=Platformer1.ex23+10;
                
//                  while(Platformer1.en_walk<=2)
//                {
//                    Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];
//                    Platformer1.en_walk++;
//                    if (Platformer1.en_walk==3)
//         {
//             
//             Platformer1.en_walk=0;
//             
//          }}
                
                
                
                
                
                
                 if (Platformer1.en_walk==3)
         {
               Platformer1.en_walk=0;
           }
            try{
                 Platformer1.enemy2=Platformer1.enemyWalk[Platformer1.en_walk];}
            catch(Exception e)
            {
                 Platformer1.en_walk=0;
            }
           Platformer1.en_walk++;
           
           
            if (Platformer1.y>=340 && Platformer1.y<350 && Platformer1.x+70==Platformer1.ex23)
           {
                    
          
            //  System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
            //  JOptionPane.showMessageDialog(null, "over   ex23");
              
 
           }
          else if(Platformer1.x+70>=1670 && Platformer1.x<1840 && Platformer1.y+80==Platformer1.ey23 )
           {
              //System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over    ey23"); 
           }

          }
              else if(Platformer1.ex23==1800)
           
       {
           for(Platformer1.ex23=1840;Platformer1.ex23>=1680;)
           {
             Platformer1.ex23=Platformer1.ex23-10;
               
               
           }
            }
             try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
             
        }
    }
}

class Multi4 extends Thread
{
    public void run()
    {
        while(true)
        {
            if (Platformer1.ex3<290)
            {
                 

                Platformer1.ex3=Platformer1.ex3+10;
                
                if (Platformer1.ele_walk==4)
         {
               Platformer1.ele_walk=0;
           }
                try{
            Platformer1.enemy3=Platformer1.eleWalk[Platformer1.ele_walk];}
                catch(Exception e)
                {
                    Platformer1.ele_walk=0;
                }
           Platformer1.ele_walk++;
          
           
//           System.out.println("blue1   "+Platformer1.ex3+"  "+Platformer1.ey3);
//          System.out.println("character   "+Platformer1.x+"  "+Platformer1.y);
          
          if (Platformer1.y>=70 && Platformer1.y<=80 && Platformer1.x+70==Platformer1.ex3)
           {
                    
           
              System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
           // JOptionPane.showMessageDialog(null, "over   x");
              

           }
          else if(Platformer1.x+70>=150 && Platformer1.x<=280 && Platformer1.y+70==Platformer1.ey3 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
         //     JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
           
           
    }
             else if(Platformer1.ex3==290)
           
       {
           for(Platformer1.ex3=290;Platformer1.ex3>=140;)
           {
             Platformer1.ex3=Platformer1.ex3-10;
               
               
           }
           
          
           
          // System.out.println("blue1   "+Platformer1.ex3+"  "+Platformer1.ey3);
           //System.out.println("character   "+Platformer1.x+"  "+Platformer1.y);
           
            }
             try {
            Thread.sleep(40);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
        }
    }
}

class Multi41 extends Thread
{
    public void run()
    {
        while(true)
        {
            if(Platformer1.ex31<840)
            {
                Platformer1.ex31=Platformer1.ex31+10;
                
                if (Platformer1.ele_walk==4)
         {
               Platformer1.ele_walk=0;
           }
                try{
            Platformer1.enemy3=Platformer1.eleWalk[Platformer1.ele_walk];}
                catch(Exception e){Platformer1.ele_walk=0;}
           Platformer1.ele_walk++;
            
           
         //  System.out.println("blue2   "+Platformer1.ex31+"  "+Platformer1.ey31);
          //System.out.println("character   "+Platformer1.x+"  "+Platformer1.y);
           
           
           
           if (Platformer1.y>=340 && Platformer1.y<350 && Platformer1.x+70==Platformer1.ex31)
           {
                    
            //  Platformer1.x=Platformer1.ex31;
            //  System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
              //JOptionPane.showMessageDialog(null, "over   x");
              
 
           }
          else if(Platformer1.x+70>=670 && Platformer1.x<840 && Platformer1.y+80==Platformer1.ey31 )
           {
              //System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
              //JOptionPane.showMessageDialog(null, "over    y"); 
           }
            }
            else if(Platformer1.ex31==840)
           
       {
           for(Platformer1.ex31=840;Platformer1.ex31>=680;)
           {
             Platformer1.ex31=Platformer1.ex31-10;
               
               
           }
           // System.out.println("blue2     "+Platformer1.ex31+"  "+Platformer1.ey31);
            //System.out.println("character   "+Platformer1.x+"  "+Platformer1.y);
            
            
             
            
            
            }
             try {
            Thread.sleep(40);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
        }
        
    }
}



class Multi42 extends Thread
{
    public void run()
    {
        while(true)
        {
            if( Platformer1.ex32<2220)
       {
           
        Platformer1.ex32=Platformer1.ex32+10;
       
              if (Platformer1.ele_walk==4)
             {
               Platformer1.ele_walk=0;
           }
              try{
            Platformer1.enemy3=Platformer1.eleWalk[Platformer1.ele_walk];}
               catch(Exception e){Platformer1.ele_walk=0;}
           Platformer1.ele_walk++;
           
           // System.out.println("blue3  "+Platformer1.ex32+"  "+Platformer1.ey32);
          
          
           if (Platformer1.y>=540 && Platformer1.y<=560 && Platformer1.x+70==Platformer1.ex32)
           {
                     
           
              System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over   x blue3");
              
 
           }
          else if(Platformer1.x+70>1720 && Platformer1.x<=2240 && Platformer1.y+70==Platformer1.ey32 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
            //  JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
          

       }
       else if(Platformer1.ex32==2220)
           
       {
           for(Platformer1.ex32=2220;Platformer1.ex32>=1700;)
           {
               Platformer1.ex32=Platformer1.ex32-10;
      
           }
          // System.out.println("blue3   "+Platformer1.ex32+"  "+Platformer1.ey32);
           
      }
            try {
            Thread.sleep(40);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
       
        }
    }
}



class Multi43 extends Thread
{
    public void run()
    {
        while(true)
        {
                         
            if (Platformer1.ex33>1700)
            {
                 

                Platformer1.ex33=Platformer1.ex33-10;
        
       if (Platformer1.ele_walk==4)
        {
               Platformer1.ele_walk=0;
           }
       try{
            Platformer1.enemy3=Platformer1.eleWalk[Platformer1.ele_walk];}
       catch(Exception e){Platformer1.ele_walk=0;}
           Platformer1.ele_walk++;
           
           
           
            //System.out.println("blue4  "+Platformer1.ex33+"  "+Platformer1.ey33); 
           
           
            if (Platformer1.y>=540 && Platformer1.y<=560 && Platformer1.x+70==Platformer1.ex33)
           {
                     
           
              System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
           //   JOptionPane.showMessageDialog(null, "over   x 4");
              
 
           }
          else if(Platformer1.x+70>1720 && Platformer1.x<=2240 && Platformer1.y+70==Platformer1.ey33 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
             // JOptionPane.showMessageDialog(null, "over    y4"); 
           }
          
           }
             else if(Platformer1.ex33==1700)
           
       {
           for(Platformer1.ex33=1700;Platformer1.ex33<=2220;)
           {
             Platformer1.ex33=Platformer1.ex33+10;
               
               
           }
           
           //System.out.println("blue4   "+Platformer1.ex33+"  "+Platformer1.ey33);
           
            }
             try {
            Thread.sleep(40);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();
       
    }
}
}



    



class Multi44 extends Thread
{
    public void run()
    {
        while(true)
        {
            if (Platformer1.ex34<2280)
            {
                 

                Platformer1.ex34=Platformer1.ex34+10;
                
                if (Platformer1.ele_walk==4)
         {
               Platformer1.ele_walk=0;
           }
                try{
            Platformer1.enemy3=Platformer1.eleWalk[Platformer1.ele_walk];}
                catch(Exception e)
                {
                    Platformer1.ele_walk=0;
                }
           Platformer1.ele_walk++;
          
           
//           System.out.println("blue1   "+Platformer1.ex3+"  "+Platformer1.ey3);
//          System.out.println("character   "+Platformer1.x+"  "+Platformer1.y);
          
          if (Platformer1.y>=70 && Platformer1.y<=80 && Platformer1.x+70==Platformer1.ex34)
           {
                    
           
              //System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
         //  JOptionPane.showMessageDialog(null, "over   x blue");
              

           }
          else if(Platformer1.x+70>=2140 && Platformer1.x<=2280 && Platformer1.y+70==Platformer1.ey34 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
           //   JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
           
           
    }
             else if(Platformer1.ex34==2280)
           
       {
           for(Platformer1.ex34=2280;Platformer1.ex34>=2140;)
           {
             Platformer1.ex34=Platformer1.ex34-10;
               
               
           }
           
          
           
           
            }
            try {
            Thread.sleep(40);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();

        }}
}

    
    class Multi45 extends Thread
    {
        public void run()
        {
            while(true)
            {
                
                
                if (Platformer1.ex35<2840)
            {
                 

                Platformer1.ex35=Platformer1.ex35+10;
                
                if (Platformer1.ele_walk==4)
         {
               Platformer1.ele_walk=0;
           }
                try{
            Platformer1.enemy3=Platformer1.eleWalk[Platformer1.ele_walk];}
                catch(Exception e)
                {
                    Platformer1.ele_walk=0;
                }
           Platformer1.ele_walk++;
          
           
//           System.out.println("blue1   "+Platformer1.ex3+"  "+Platformer1.ey3);
//          System.out.println("character   "+Platformer1.x+"  "+Platformer1.y);
          
          if (Platformer1.y>=340 && Platformer1.y<350 && Platformer1.x+70==Platformer1.ex35)
           {
                    
           
              //System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
          // JOptionPane.showMessageDialog(null, "over   x blue");
              

           }
          else if(Platformer1.x+70>=2670 && Platformer1.x<2840 && Platformer1.y+80==Platformer1.ey35 )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
              JOptionPane.showMessageDialog(null, "over    y"); 
           }
          
           
           
    }
             else if(Platformer1.ex35==2840)
           
       {
           for(Platformer1.ex35=2840;Platformer1.ex35>=2680;)
           {
             Platformer1.ex35=Platformer1.ex35-10;
               
               
           }
           
          
           
           
            }
            try {
            Thread.sleep(40);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();

            }
        }
    }

class MainE extends Thread
{
public void run()
{
    while(true)
    {
        if (Platformer1.mainx<4900)
            {
                 

                Platformer1.mainx=Platformer1.mainx+10;
                System.out.println("villian****************************************1");
                
                if (Platformer1.main_walk==6)
         {
               Platformer1.main_walk=0;
           }
                System.out.println("villian****************************************2");
                try{
            Platformer1.mainE=Platformer1.main_E[Platformer1.main_walk];}
                catch(Exception e)
                {
                    Platformer1.main_walk=0;
                }
           Platformer1.main_walk++;
          System.out.println("villian****************************************3");
           
//           System.out.println("blue1   "+Platformer1.ex3+"  "+Platformer1.ey3);
//          System.out.println("character   "+Platformer1.x+"  "+Platformer1.y);
          
          if (Platformer1.y>=220 && Platformer1.y<=230 && Platformer1.x+70==Platformer1.mainx)
           {
                    
           
              //System.out.println("oooooooooooooooooooover            x");
              Platformer1.over=false;
         //  JOptionPane.showMessageDialog(null, "over   x blue");
              
System.out.println("villian****************************************4");
           }
          else if(Platformer1.x+70>=4100 && Platformer1.x<=4900 && Platformer1.y+70==Platformer1.mainy )
           {
              System.out.println("oooooooooooooooooooover             y");
              Platformer1.over=false;
           //   JOptionPane.showMessageDialog(null, "over    y");
              System.out.println("villian****************************************5");
           }
          
           
           
    }
             else if(Platformer1.mainx==4900)
           
       {
           for(Platformer1.mainx=4900;Platformer1.mainx>=4100;)
           {
             Platformer1.mainx=Platformer1.mainx-10;
               System.out.println("villian****************************************6");
               
           }
           
          
           
           
            }
            try {
            Thread.sleep(100);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();

        
    }
}
}


class MainF extends Thread
{
    public void run()
{
    while(true)
    {
        if(Platformer1.mainE==Platformer1.main_E[4] || Platformer1.mainE==Platformer1.main_E[5])
        {
            Platformer1.mainfx=Platformer1.mainx+110;
            Platformer1.mainF=Platformer1.main_F[0];

        }
        else
        {
            Platformer1.mainF=" ";

        }
        try {
            Thread.sleep(100);
            
        } catch (InterruptedException e) {
            Logger.getLogger(Multi1.class.getName()).log(Level.SEVERE, null, e);
        }
        Platformer1.panel2.repaint();

    }
    
    }
}

class First extends JFrame
{
    JPanel p;
    
    JLabel label1=new JLabel();
    First(){
     p =new JPanel(null)                        //BACKGROUND PANEL
                                            //DO NOT ADD ANY LAYOUT IF SETBOUNDS AND SETLOCATION IS TO BE DONE
     {
         
    public void paintComponent (Graphics g){         
        try {
            
            
            URL url = new URL(this.getClass().getResource("background1copy.jpg"),   "background1copy.jpg");
            Image image = ImageIO.read(url);
            g.drawImage(image,0,0,1000,737,p);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, e);
        }
         
    }
   
    };
     
//label1.setVisible(true);
label1.setForeground(Color.GREEN);
label1.setFont(new Font("AR Julian", Font.BOLD, 42));
//label1.setBounds(100, 100, 80, 60);
label1.setText("NEW GAME");
label1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
              First.this.dispose();
               new Platformer1();
                   
               
                // throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mousePressed(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
               
                   label1.setForeground(Color.CYAN);
               
                // throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label1.setForeground(Color.GREEN);
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });

//label1.setText("  "+label1.getFont());
p.add(label1);
label1.setBounds(400, 100, 400, 100);

     this.setVisible(true);         
     this.setSize(1005,700);
     this.setLayout(new GridLayout());
     this.setLocationRelativeTo(null);
     this.setResizable(false);
     this.setTitle("2d game");
     this.add(p);
    
}
    
    
}



class HighScore implements Serializable

{
           int high;
           public HighScore(int marks)
           {
               high=marks;
           }
}