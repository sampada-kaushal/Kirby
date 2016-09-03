/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author sampada kaushal
 */
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class Frame1 {
   
     

public static void main(String args[])
{
     JFrame f=new JFrame();
     f.setVisible(true);         
     f.setSize(900,700);
     f.setLayout(new GridLayout());
     f. setLocationRelativeTo(null);
     f.setResizable(false);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setTitle("2d game");
     f.add(new Platformer1());
     System.out.println("platformer has ran");
     
     
}

    
}