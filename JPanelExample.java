import java.awt.*;
import javax.swing.*;


public class  JPanelExample extends JFrame
{
	JPanel p1,p2;
	public JPanelExample()
	{    
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
        		// An empty panel with FlowLayout
		 p1=new JPanel();
        
        		// Panel with custom layout
       	 	p2=new JPanel();
        
		        // Set some background
       		 p1.setBackground(Color.GREEN);
       		 p2.setBackground(Color.YELLOW);

        // Set some border
        // Here a line border of 5 thickness, dark gray color and rounded edges
        	p1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));

        p2.setBorder(BorderFactory.createTitledBorder("SYCS 20-21"));
        // Set some tooltip text
        p1.setToolTipText("Panel 1");
        p2.setToolTipText("Panel 2");
        p1.add(new JButton("I'm Button"));
p2.add(new JTextField(30));
        // Add panels
        cp.add(p1,BorderLayout.SOUTH);
        cp.add(p2,BorderLayout.NORTH);
        
        
           setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JPanelExample();   
}   
}