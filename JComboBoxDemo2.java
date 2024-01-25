import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo2 extends JFrame implements ActionListener,ItemListener
{
	JLabel l,lblMsg;
	JTextField tf;
	JComboBox jc;
	JButton b1,b2;

	public JComboBoxDemo2()	
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		
		l=new JLabel("Enter anything:");
		lblMsg=new JLabel();
		tf=new JTextField(20);		
		jc=new JComboBox();
		jc.addItemListener(this);
		b1=new JButton("Add");
		b2=new JButton("Clear");
		cp.add(l);
		cp.add(tf);
		cp.add(b1);
		cp.add(b2);
		cp.add(jc);
		cp.add(lblMsg);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(300,300);
		setTitle("Combo");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Object obj=ie.getItem();
		lblMsg.setText("You selected:"+obj);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s=tf.getText();
			jc.addItem(s);
		}
		else
			tf.setText("");
	}
	public static void main(String args[])
	{
		new JComboBoxDemo2();	
	}
}
		