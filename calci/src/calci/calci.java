package calci;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calci {
	static JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,eq,clr,dot,del;
	static Container c;
	static JTextField in,out;
	public static void main(String[]args)
	{
		
	JFrame frame=new JFrame("CALCULATOR");
	frame.setVisible(true);
	frame.setBounds(0, 0, 700, 700);
	 c=frame.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.YELLOW);
	
 c.setLayout(null)	;
	 in=new JTextField();
	 in.setBounds(0, 50, 400, 100);
	 c.add(in);

	 calci1 ob=new calci1();
	 b0=new JButton("0");
	 b0.setBounds(20, 200, 50, 50);
	 c.add(b0);
	b0.addActionListener(ob);
	
	 b1=new JButton("1");
	 b1.setBounds(100, 200, 50, 50);
	 c.add(b1);
	 b1.addActionListener(ob); 

	 b2=new JButton("2");
	 b2.setBounds(180, 200, 50, 50);
	 c.add(b2);
	 b2.addActionListener(ob);
	 
	 b3=new JButton("3");
	 b3.setBounds(260, 200, 50, 50);
	 c.add(b3);
	 b3.addActionListener(ob);

	 b4=new JButton("4");
	 b4.setBounds(20, 300, 50, 50);
	 c.add(b4);
	 b4.addActionListener(ob);
	 
	 b5=new JButton("5");
	 b5.setBounds(100, 300, 50, 50);
	 c.add(b5);
	 b5.addActionListener(ob);

	 b6=new JButton("6");
	 b6.setBounds(180, 300, 50, 50);
	 c.add(b6);
	 b6.addActionListener(ob);
	 
	 b7=new JButton("7");
	 b7.setBounds(260, 300, 50, 50);
	 c.add(b7);
	 b7.addActionListener(ob);
	 
	 b8=new JButton("8");
	 b8.setBounds(20, 400, 50, 50);
	 c.add(b8);
	 b8.addActionListener(ob);
	 
	 b9=new JButton("9");
	 b9.setBounds(100, 400, 50, 50);
	 c.add(b9);
	 b9.addActionListener(ob);

	 add=new JButton("+");
	 add.setBounds(180, 400, 50, 50);
	 c.add(add);
	 add.addActionListener(ob);
	 
	 sub=new JButton("-");
	 sub.setBounds(260, 400, 50, 50);
	 c.add(sub);
	 sub.addActionListener(ob);
	 
	 mul=new JButton("*");
	 mul.setBounds(20, 500, 50, 50);
	 c.add(mul);
	 mul.addActionListener(ob);
	 
	 div=new JButton("/");
	 div.setBounds(100, 500, 50, 50);
	 c.add(div);
	 div.addActionListener(ob);
	 
	 dot=new JButton(".");
	 dot.setBounds(260, 500, 50, 50);
	 c.add(dot);
	 dot.addActionListener(ob);

	 eq=new JButton("=");
	 eq.setBounds(180, 500, 50, 50);
	 c.add(eq);
	 eq.addActionListener(ob);

	 del=new JButton("del");
	 del.setBounds(20, 600, 100, 50);
	 c.add(del);
	 del.addActionListener(ob);


	 clr=new JButton("CLr");
	 clr.setBounds(180, 600, 100, 50);
	 c.add(clr);
	 clr.addActionListener(ob);

	 
}
}
