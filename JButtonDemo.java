import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo extends JFrame implements ActionListener
{
	JLabel lbl;
	public JButtonDemo()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		ImageIcon Bulge = new ImageIcon("s1.jpg");
		ImageIcon Zollner = new ImageIcon("s2.png");
		ImageIcon Wheels = new ImageIcon("s3.jpg");
		ImageIcon ii= new ImageIcon("s33.jpg");
		JButton buClk = new JButton("Click me",Bulge);
		buClk.setRolloverIcon(Zollner);
		buClk.setPressedIcon(Wheels);
		buClk.setRolloverSelectedIcon(ii);
		//buClk.setActionCommand("Optical Illusion - Bulging");
		buClk.addActionListener(this);
		cp.add(buClk);

		
		buClk = new JButton(Wheels);
		buClk.setActionCommand("Optical Illusion - Wheels Rotating");
		buClk.addActionListener(this);
		cp.add(buClk);

		
		buClk = new JButton(Zollner);
		buClk.setActionCommand("Zollner-illusion");
		buClk.addActionListener(this);
		cp.add(buClk);
		lbl = new JLabel();
		cp.add(lbl);
		setTitle("JButton Demo"); 
        		setVisible(true); 
        		setSize(500,500); 
        		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}   

	public void actionPerformed(ActionEvent ae)
	{
		lbl.setText(ae.getActionCommand());
	}
	public static void main(String[] args)  
	{   
         		new JButtonDemo();   
	}   
} 