import java.awt.*;
import javax.swing.*;

public class JScrollPaneDemo extends JFrame  
{
	public JScrollPaneDemo () 
	{

		Container cp = getContentPane();
		cp.setLayout(new GridLayout(5, 20));

		//JPanel jp = new JPanel();
		//jp.setLayout(new GridLayout(5, 20));
		int b = 1;
		for(int i = 0; i < 5; i++) 
		{
			for(int j = 0; j < 20; j++) 
			{
				cp.add(new JButton("Button " + b));
				++b;
			}
		}


		JScrollPane jsp = new JScrollPane(cp);

		cp.add(jsp);
	setTitle("JScrollPane Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JScrollPaneDemo ();   
}   
}