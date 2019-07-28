package com.jrdomingos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloWorld {
	
	  private static  JFrame frame ;
	  private static JLabel lblHello ;
	  
     public static void main(String[] args) {
    	     
    	 frame = new JFrame( );
    	 
    	 lblHello  = new JLabel("Hello world Java Swing", SwingConstants.CENTER);
    	//  lblHello.setText("Hello world Java Swing")  // other  option
    	 
    	 frame.setBounds(100, 100, 250, 200);
    	 
    	 frame.add(lblHello);
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setTitle("first frame");
    	 frame.setVisible(true);
    	  
        }
     
}
