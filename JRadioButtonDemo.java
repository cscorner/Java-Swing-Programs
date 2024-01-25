import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JRadioButtonDemo extends JFrame  implements ActionListener 
{
	JTextField tf;
	JLabel l1,l2,l3;
	JRadioButton b1,b2,b3,b4,b5;
	public JRadioButtonDemo() 
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		l1=new JLabel("Select your highest degree:");
		cp.add(l1);
		b1 = new JRadioButton("SSC");
		b1.addActionListener(this);
		cp.add(b1);

		b2 = new JRadioButton("HSC");
		b2.addActionListener(this);
		cp.add(b2);
	
		b3 = new JRadioButton("Graduate",true);
		b3.addActionListener(this);
		cp.add(b3);

		l2=new JLabel("Select gender");
		cp.add(l2);
		b4 = new JRadioButton("Male");
		b4.addActionListener(this);
		cp.add(b4);

		b5 = new JRadioButton("Female");
		b5.addActionListener(this);
		cp.add(b5);

		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);

		ButtonGroup bgs = new ButtonGroup();
		bgs.add(b4);
		bgs.add(b5);		
		
		tf = new JTextField(30);
		tf.setEditable(false);
		l3=new JLabel();
		cp.add(tf);
		cp.add(l3);
		setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		String s=ae.getActionCommand();

		if(ae.getSource()==b1)
			tf.setText("U Clicked "+s);
		
		else if(ae.getSource()==b2)
			tf.setText("U Clicked "+s);

		else if(ae.getSource()==b3)
			tf.setText("U Clicked "+s);

		if(ae.getSource()==b4)
			l3.setText("U Clicked "+b4.getText());
		
		else if(ae.getSource()==b5)
			l3.setText("U Clicked "+b5.getText());

	}
	public static void main(String[] args)  
	{   
         		new  JRadioButtonDemo();   
	}  
}