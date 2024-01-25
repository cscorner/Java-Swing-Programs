import java.awt.*;
import javax.swing.*;

public class Buttonicons extends JFrame
{
	public Buttonicons()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		ImageIcon normal = new ImageIcon("s1.jpg");
		ImageIcon rollover = new ImageIcon("s2.png");
		ImageIcon pressed = new ImageIcon("s3.jpg");
		JButton jbutton = new JButton("Click ME",normal);
		jbutton.setRolloverEnabled(true);
		//jbutton.setIcon(normal);
		jbutton.setRolloverIcon(rollover);
		jbutton.setPressedIcon(pressed);
		cp.add(jbutton);
		setTitle("JButton Demo"); 
        		setVisible(true); 
        		setSize(500,500); 
        		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}   
	public static void main(String[] args)  
	{   
         		new Buttonicons();   
	}   
} 