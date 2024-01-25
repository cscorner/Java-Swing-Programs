import java.awt.*; 
import javax.swing.*; 
 
public class JControlsDemo extends JFrame  
{ 
  	public JControlsDemo()  
  	{ 
 
    		Container cp = getContentPane(); 
    		cp.setLayout(new FlowLayout());     
    		JTextField jtf1 = new JTextField("Hello from Swing!",15); 
    		jtf1.setToolTipText("This is a TextField.");  
    		//jtf1.setText("Hello from Swing!");   
    		cp.add(jtf1);     
            		setTitle("JOption Demo"); 
        		setVisible(true); 
        		setSize(500,500); 
        		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}   
	public static void main(String[] args)  
	{   
         		new JControlsDemo ();   
	}  
}
