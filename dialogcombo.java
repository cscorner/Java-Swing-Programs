import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<APPLET CODE = dialogcombo.class WIDTH = 350 HEIGHT = 280></APPLET>*/
public class dialogcombo extends JFrame implements ActionListener
{
	JButton b;
		JLabel l1;
	public dialogcombo()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		b = new JButton("Display dialog");
		cp.add(b);
		b.addActionListener(this);
		l1=new JLabel();
		cp.add(l1);
		setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}	
	public void actionPerformed(ActionEvent e)
	{
		String title = "Dialog";
		String message = "Which one do you like best?";
		String[] desserts = {"cheesecake", "ice cream", "mousse", "carrot cake"};
		Object s=JOptionPane.showInputDialog(this, message, title,JOptionPane.QUESTION_MESSAGE, null,desserts, desserts[3]);
		if(s == null)
			l1.setText("You clicked Cancel");
		else
		l1.setText("Your favorite: " + s);
	}
	
public static void main(String[] args)  
{   
         new dialogcombo();   
}   
}
