import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JToolbarDemo extends JFrame implements ActionListener,ItemListener 
{
	JLabel jl;
	JButton b1,b2;
	JComboBox jc ;
	JTextField tf;
	public JToolbarDemo() 
	{
		Container cp = getContentPane();
		jl=new JLabel();
		ImageIcon ii=new ImageIcon("ok.jpg");
		b1 = new JButton("Button 1",ii);
		b2 = new JButton("Button 2");

		jc = new JComboBox();
		jc.addItem("Verdana");
		jc.addItem("Arial");

		tf=new JTextField(20);
		JToolBar tb = new JToolBar();
		b1.addActionListener(this);
		b2.addActionListener(this);
		jc.addItemListener(this);
		tb.add(b1);
		tb.addSeparator();
		tb.add(b2);
		tb.addSeparator();
		tb.add(jc);
		cp.add(jl, BorderLayout.SOUTH);
		cp.add(tb, BorderLayout.NORTH);
		cp.add(tf, BorderLayout.CENTER);
	setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JToolbarDemo ();   
}   
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1) 
		{
			jl.setText("You clicked button 1");
		} 
		else if (e.getSource() == b2) 
		{
			jl.setText("You clicked button 2");
		}
	}
	public void itemStateChanged(ItemEvent e) 
	{
		String face=(String)e.getItem();
		if(face.equals("Verdana"))
			tf.setFont(new Font(face,Font.BOLD,18));
		else 
			tf.setFont(new Font(face,Font.BOLD,18));
		//if(e.getStateChange() == ItemEvent.SELECTED)
		
			//tf.setFont(new Font(face,Font.BOLD,18));
	}
}
