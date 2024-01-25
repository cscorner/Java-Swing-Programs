import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JColorChooserDemo extends JFrame implements ActionListener
{
	JPanel jpanel = new JPanel();
	JButton jbutton;
	JLabel jl;
	public JColorChooserDemo()
	{
		Container cp=getContentPane();
		jbutton = new JButton("Click here to change colors.");
		jbutton.addActionListener(this);
		 jl=new JLabel("Hello");
		jpanel.add(jl);
		jpanel.add(jbutton);
		cp.add(jpanel);
	setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JColorChooserDemo ();   
}   
	public void actionPerformed(ActionEvent e)
	{
		Color c= JColorChooser.showDialog(this,"Select a new color...", Color.cyan);
		jpanel.setBackground(c);
	//jl.setForeground(c);
	}
}
