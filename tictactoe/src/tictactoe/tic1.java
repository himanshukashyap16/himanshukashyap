package tictactoe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class tic1 implements ActionListener
{
static int c=0,xscore=0,oscore,tie=0;
static String common;
static boolean win;
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	c++;
			
		if(c==1||c==3||c==5||c==7||c==9)
		common="x";
		else if(c==2||c==4||c==6||c==8)
			common="o";
		
		if(e.getSource()==tic.b1)
		{
	tic.b1.setText(common);
	tic.b1.setEnabled(false);
		}
	
		else if(e.getSource()==tic.b2)
		{
	tic.b2.setText(common);
	tic.b2.setEnabled(false);
		}	
	
		else if(e.getSource()==tic.b3)
		{
	tic.b3.setText(common);
	tic.b3.setEnabled(false);
		}
		else if(e.getSource()==tic.b4)
		{
	tic.b4.setText(common);
	tic.b4.setEnabled(false);
		}
		else if(e.getSource()==tic.b5)
		{
	tic.b5.setText(common);
	tic.b5.setEnabled(false);
		}
		else if(e.getSource()==tic.b6)
		{
	tic.b6.setText(common);
	tic.b6.setEnabled(false);
		}
		else if(e.getSource()==tic.b7)
		{
	tic.b7.setText(common);
	tic.b7.setEnabled(false);
		}
		else if(e.getSource()==tic.b8)
		{
	tic.b8.setText(common);
	tic.b8.setEnabled(false);
		}
		else if(e.getSource()==tic.b9)
		{
	tic.b9.setText(common);
	tic.b9.setEnabled(false);
		}
		
		if(e.getSource()==tic.quit)
		{
System.exit(0);
		}
		 if(e.getSource()==tic.restart)
		{
			tic.b1.setText("");
			tic.b2.setText("");
			tic.b3.setText("");
			tic.b4.setText("");
			tic.b5.setText("");
			tic.b6.setText("");
			tic.b7.setText("");
			tic.b8.setText("");
			tic.b9.setText("");

			tic.b1.setEnabled(true);
			tic.b2.setEnabled(true);
			tic.b3.setEnabled(true);
			tic.b4.setEnabled(true);
			tic.b5.setEnabled(true);
			tic.b6.setEnabled(true);
			tic.b7.setEnabled(true);
			tic.b8.setEnabled(true);
			tic.b9.setEnabled(true);
			
			c=0;
		}
		 
		 if(e.getSource()==tic.scores)
		 {
			 if(c==1)
			 {
				 restart();
			 }
			 String s;
			 s=String.valueOf(xscore)+" "+String.valueOf(oscore)+" "+String.valueOf(tie);
			 JOptionPane.showMessageDialog(null,s," "+"xscore  "+"yscore  "+ "tie", 0);
		 }
		 
				//horizontal check
		if((tic.b1.getText()!=""&&tic.b2.getText()!=""&&tic.b3.getText()!="")&&tic.b1.getText()==tic.b2.getText()&&tic.b2.getText()==tic.b3.getText()&&tic.b1.getText()==tic.b3.getText())
				{
			tic.b1.setBackground(Color.RED);
			tic.b2.setBackground(Color.RED);
			tic.b3.setBackground(Color.RED);
			win=true;
			
		 		 }
		else if((tic.b4.getText()!=""&&tic.b5.getText()!=""&&tic.b6.getText()!="")&&tic.b4.getText()==tic.b5.getText()&&tic.b5.getText()==tic.b6.getText()&&tic.b4.getText()==tic.b6.getText())
				{
			tic.b4.setBackground(Color.RED);
			tic.b5.setBackground(Color.RED);
			tic.b6.setBackground(Color.RED);
			
			win=true;
		
				}
		else if((tic.b7.getText()!=""&&tic.b8.getText()!=""&&tic.b9.getText()!="")&&tic.b7.getText()==tic.b8.getText()&&tic.b8.getText()==tic.b9.getText()&&tic.b7.getText()==tic.b9.getText())
		{
			tic.b7.setBackground(Color.RED);
			tic.b8.setBackground(Color.RED);
			tic.b9.setBackground(Color.RED);
			
	win=true;
	
		}

		//vertical check
		else if((tic.b1.getText()!=""&&tic.b4.getText()!=""&&tic.b7.getText()!="")&&tic.b1.getText()==tic.b4.getText()&&tic.b4.getText()==tic.b7.getText()&&tic.b1.getText()==tic.b7.getText())
		{
			tic.b1.setBackground(Color.RED);
			tic.b4.setBackground(Color.RED);
			tic.b7.setBackground(Color.RED);
			
	win=true;
	
		}
		else if((tic.b3.getText()!=""&&tic.b6.getText()!=""&&tic.b9.getText()!="")&&tic.b3.getText()==tic.b6.getText()&&tic.b6.getText()==tic.b9.getText()&&tic.b3.getText()==tic.b9.getText())
		{
			tic.b3.setBackground(Color.RED);
			tic.b6.setBackground(Color.RED);
			tic.b9.setBackground(Color.RED);
			
	win=true;
	
		}
		//diagonal check
		else if((tic.b1.getText()!=""&&tic.b5.getText()!=""&&tic.b9.getText()!="")&&tic.b1.getText()==tic.b5.getText()&&tic.b5.getText()==tic.b9.getText()&&tic.b1.getText()==tic.b9.getText())
		{
			tic.b1.setBackground(Color.RED);
			tic.b5.setBackground(Color.RED);
			tic.b9.setBackground(Color.RED);
			
	win=true;

		}
		else if((tic.b3.getText()!=""&&tic.b5.getText()!=""&&tic.b7.getText()!="")&&tic.b3.getText()==tic.b5.getText()&&tic.b5.getText()==tic.b7.getText()&&tic.b3.getText()==tic.b5.getText())
		{
			tic.b3.setBackground(Color.RED);
			tic.b5.setBackground(Color.RED);
			tic.b7.setBackground(Color.RED);
			
	win=true;
		}
		else
		{
			win=false;
		}
		
		if(win==true)
		{
			if(common=="x")
			{
				xscore++;
			}
			else if(common=="o")
			{
				oscore++;
			}
			else
			{
				tie++;
			}
			
			JOptionPane.showMessageDialog(null,common," "+"wins", 0);
			restart();	
		}
		else if(c==9&&win==false)
		{
			
				tie++;
			
			
			JOptionPane.showMessageDialog(null,"tie"," "+"game", 0);
			restart();			
		}	
		
	}

	public void restart()
	{
		
		tic.b1.setText("");
		tic.b2.setText("");
		tic.b3.setText("");
		tic.b4.setText("");
		tic.b5.setText("");
		tic.b6.setText("");
		tic.b7.setText("");
		tic.b8.setText("");
		tic.b9.setText("");
	

		tic.b1.setEnabled(true);
		tic.b2.setEnabled(true);
		tic.b3.setEnabled(true);
		tic.b4.setEnabled(true);
		tic.b5.setEnabled(true);
		tic.b6.setEnabled(true);
		tic.b7.setEnabled(true);
		tic.b8.setEnabled(true);
		tic.b9.setEnabled(true);
	
		tic.b1.setBackground(null);
		tic.b2.setBackground(null);
		tic.b3.setBackground(null);
		tic.b4.setBackground(null);
		tic.b5.setBackground(null);
		tic.b6.setBackground(null);
		tic.b7.setBackground(null);
		tic.b8.setBackground(null);
		tic.b9.setBackground(null);
		
		c=0;
	}
	}
