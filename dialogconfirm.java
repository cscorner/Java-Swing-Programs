import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class dialogconfirm extends JFrame implements ActionListener
{
	JLabel l1;
	public dialogconfirm ()
	{
		 Container cp = getContentPane();
		JButton b = new JButton("Display dialog");
		cp.setLayout(new FlowLayout());
		cp.add(b);
		l1=new JLabel();
		cp.add(l1);
		b.addActionListener(this);
		setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public void actionPerformed(ActionEvent e)
		{
		int result = JOptionPane.showConfirmDialog(this, "Choose yes or no", "yes or no",JOptionPane.YES_NO_CANCEL_OPTION);
		if (result == JOptionPane.YES_OPTION) 
		{
			l1.setText("You clicked yes.");
			System.exit(0);
		} 
		else if (result == JOptionPane.NO_OPTION) 
		{
			l1.setText("You clicked no.");
		}
		else 
		{
		l1.setText("You clicked CANCEL");
		}
	
}   
public static void main(String[] args)  
{   
         new dialogconfirm();   
}   
		
}

