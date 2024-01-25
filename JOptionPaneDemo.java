import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JOptionPaneDemo extends JFrame implements ActionListener
{
	JButton jbutton1 = new JButton("Display information dialog");
	JButton jbutton2 = new JButton("Display error dialog");
	JButton jbutton3 = new JButton("Display warning dialog");
	JButton jbutton4 = new JButton("Display question dialog");
	JButton jbutton5 = new JButton("Display plain dialog");
	JButton jbutton6 = new JButton("Display input dialog");
	JLabel lbl;
	public JOptionPaneDemo()
	{
		Container contentPane = getContentPane();
	
		
		contentPane.setLayout(new FlowLayout());
	lbl=new JLabel();
	contentPane.add(lbl);
		contentPane.add(jbutton1);
		contentPane.add(jbutton2);
		contentPane.add(jbutton3);
		contentPane.add(jbutton4);
		contentPane.add(jbutton5);
		contentPane.add(jbutton6);

		jbutton1.addActionListener(this);
		jbutton2.addActionListener(this);
		jbutton3.addActionListener(this);
		jbutton4.addActionListener(this);
		jbutton5.addActionListener(this);
		jbutton6.addActionListener(this);
	setTitle("Frame Demo");
    		setSize(250, 120);
       		setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		
	}

	public void actionPerformed(ActionEvent e)
	{
		String dialogtitle = "Dialog";
		String dialogmessage = "Hello from Swing!";
		int dialogtype = JOptionPane.PLAIN_MESSAGE;

		if(e.getSource() == jbutton1) 
		{
			dialogtype = JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog(this,dialogmessage, dialogtitle, dialogtype);
		} 
		else if(e.getSource() == jbutton2)
		 {
			dialogtype = JOptionPane.ERROR_MESSAGE;
			JOptionPane.showMessageDialog(this,dialogmessage, dialogtitle, dialogtype);
		}
		 else if(e.getSource() == jbutton3) 
		{
			dialogtype = JOptionPane.WARNING_MESSAGE;
			JOptionPane.showMessageDialog(this,dialogmessage, dialogtitle, dialogtype);
		}
		 else if(e.getSource() == jbutton4) 
		{
			dialogtype = JOptionPane.QUESTION_MESSAGE;
			JOptionPane.showMessageDialog(this,dialogmessage, dialogtitle, dialogtype);
		}
		 else if(e.getSource() == jbutton5) 
		{
			dialogtype = JOptionPane.PLAIN_MESSAGE;
			JOptionPane.showMessageDialog(this,dialogmessage, dialogtitle, dialogtype);
		}
		
		else if(e.getSource() == jbutton6) 
		{

			String result = JOptionPane.showInputDialog("Enter name");
			if(result == null)
				lbl.setText("You clicked Cancel");
			else
				lbl.setText("You typed: " + result);
			
		}		

		
	}

	public static void main(String[] args) 	
	{
		new JOptionPaneDemo() ;
	}
    
}
