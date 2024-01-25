

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JSpiltExample extends JFrame
{

	public JSpiltExample() 
	{
		Container cp=getContentPane();
					
		setLayout(new FlowLayout());

		String sometext = "This is a simple text string that is long enough "
      + "to wrap over a few lines in the simple demo we're about to build.  "
      + "We'll put two text areas side by side in a split pane.";
    		
		JTextArea jt1 = new JTextArea(sometext,15,15);
    		JTextArea jt2 = new JTextArea(sometext,10,10);

		jt1.setLineWrap(true);
    		jt2.setLineWrap(true);
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jt1, jt2);
		sp.setOneTouchExpandable(true);
		sp.setDividerSize(10);

    		cp.add(sp);
      setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new  JSpiltExample();   
}   
	
		
}




