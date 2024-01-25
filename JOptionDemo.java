import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionDemo extends JFrame implements ActionListener
{
	JButton b1;
	public JOptionDemo() 
	{
	
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		b1=new JButton("CLICK ME");
		cp.add(b1);
		b1.addActionListener(this);
		setTitle("Frame Demo");
    		setSize(250, 120);
       		setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		
	}
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this,"Simle Message");
		JOptionPane.showMessageDialog(this,"Are u sure you want to exit?","2nd Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
	}

	public static void main(String[] args) 	
	{
		new JOptionDemo() ;
	}
    
    		
}