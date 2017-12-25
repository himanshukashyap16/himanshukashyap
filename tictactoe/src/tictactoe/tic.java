package tictactoe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class tic 
{
	static String x;
	static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,quit,restart,scores;
	static Container c;
	static JFrame frame;
public static void 	main(String[]args)
{
	Font f=new Font("Arial",Font.BOLD,30);
	tic1 ob=new tic1();
	JFrame frame=new JFrame();
	frame.setVisible(true);
	frame.setBounds(0,0,800,600);
	c=frame.getContentPane();
	GridLayout g=new GridLayout(4,3);
	c.setLayout(g);
	
	 b1=new JButton(""); 
	 c.add(b1);
	 b1.addActionListener(ob); 
	 b1.setFont(f);

	 b2=new JButton("");
	 c.add(b2);
	 b2.addActionListener(ob);
	 b2.setFont(f);
	 

	 b3=new JButton("");
	 c.add(b3);
	 b3.addActionListener(ob);
	 b3.setFont(f);

	 b4=new JButton("");
	 c.add(b4);
	 b4.addActionListener(ob);
	 b4.setFont(f);

	 b5=new JButton("");
	 c.add(b5);
	 b5.addActionListener(ob);
	 b5.setFont(f);

	 b6=new JButton("");
	 c.add(b6);
	 b6.addActionListener(ob);
	 b6.setFont(f);

	 b7=new JButton("");
	 c.add(b7);
	 b7.addActionListener(ob);
	 b7.setFont(f);

	 b8=new JButton("");
	 c.add(b8);
	 b8.addActionListener(ob);
	 b8.setFont(f);

	 b9=new JButton("");
		 c.add(b9);
	 b9.addActionListener(ob);
	 b9.setFont(f);
	 
	 quit=new JButton("QUIT");
	 c.add(quit);
 quit.addActionListener(ob);
 quit.setFont(f);

 restart=new JButton("RESTART");
 c.add(restart);
restart.addActionListener(ob);
restart.setFont(f);
 
scores=new JButton("SCORES");
c.add(scores);
scores.addActionListener(ob);
scores.setFont(f);

}
}
