package calci;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calci1 implements ActionListener
{
static double a=0,b=0,result=0;
static String str="";
static int op=0;
public   void actionPerformed(ActionEvent e)
	{
	int c=0;
		String s=calci.in.getText();
		if(e.getSource()==calci.b0)
		{
			calci.in.setText(s.concat("0"));
		}

		else if(e.getSource()==calci.b1)
		{
			calci.in.setText(s.concat("1"));
		}
		else if(e.getSource()==calci.b2)
		{
			calci.in.setText(s.concat("2"));
		}
		else if(e.getSource()==calci.b3)
		{
			calci.in.setText(s.concat("3"));
		}
		else if(e.getSource()==calci.b4)
		{
			calci.in.setText(s.concat("4"));	
			}
		else if(e.getSource()==calci.b5)
		{
			calci.in.setText(s.concat("5"));
		}
		else if(e.getSource()==calci.b6)
		{
			calci.in.setText(s.concat("6"));
		}
		else if(e.getSource()==calci.b7)
		{
			calci.in.setText(s.concat("7"));
		}
		else if(e.getSource()==calci.b8)
		{
			calci.in.setText(s.concat("8"));
		}
		else if(e.getSource()==calci.b9)
		{
			calci.in.setText(s.concat("9"));
		}
		else if(e.getSource()==calci.dot)
		{
			if(calci.in.getText().contains("."))
			{
				calci.dot.setEnabled(false);
			}
			else
			{
			calci.in.setText(s.concat("."));
			
			}
		}
		
		else if(e.getSource()==calci.add)
		{
			op=1;
			a=Double.parseDouble(calci.in.getText());
			calci.in.setText("");
			calci.dot.setEnabled(true);
		}	
		else if(e.getSource()==calci.sub)
		{
			op=2;
			a=Double.parseDouble(calci.in.getText());
			calci.in.setText("");
			calci.dot.setEnabled(true);
		}
		else if(e.getSource()==calci.mul)
		{
			op=3;
			a=Double.parseDouble(calci.in.getText());
			calci.in.setText("");
			calci.dot.setEnabled(true);
		}
		else if(e.getSource()==calci.div)
		{
			op=4;
			a=Double.parseDouble(calci.in.getText());
			calci.in.setText("");
			calci.dot.setEnabled(true);
		}
		else if(e.getSource()==calci.clr)
		{
			calci.in.setText("");
			calci.dot.setEnabled(true);
		}
		else if(e.getSource()==calci.del)
		{
			String s1=calci.in.getText();
			String s2="";
			double len=s1.length();
			len=len-1;
			while(c!=len)
			{
		s2=s2+(s1.charAt(c));
			c++;
			}
			calci.in.setText(s2);
		}
		
		else if(e.getSource()==calci.eq)
		{
			calci.dot.setEnabled(true);
			b=Double.parseDouble(calci.in.getText());
			switch(op)
			{
			case 1:
				result=a+b;
				break;
		   case 2:
			result=a-b;
			break;
		   case 3:
				result=a*b;
				
				break;
		   case 4:
			   if((a==0&&b==0)||b==0)
				 str="math error";
			   else
				result=a/b;
				break;
		default:
			result=0.0;
		}
			
			   if(((a==0&&b==0)||b==0)&&op==4)//check that multiply 0 and 0 
			   {
				calci.in.setText(str);
			   }
				else
				{
			String h=Double.toString(result);
			calci.in.setText(h);
				}
		}
		
	}	
}
