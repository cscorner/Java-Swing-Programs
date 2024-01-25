import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Details extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JPasswordField jp;
	JTextArea ta;
	JButton b;
	public Details()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
l1=new JLabel("Enter user name:");
l2=new JLabel("Enter user password:");
l3=new JLabel("Enter mobile no.:");
l4=new JLabel("Enter address:");
l5=new JLabel("");

t1=new JTextField(20);
t2=new JTextField(10);
jp=new JPasswordField(20);
ta=new JTextArea(10,20);
b=new JButton("Submit");

cp.add(l1);
cp.add(t1);
cp.add(l2);
cp.add(jp);
cp.add(l3);
cp.add(t2);
cp.add(l4);
cp.add(ta);
cp.add(b);
cp.add(l5);

b.addActionListener(this);
setTitle("Login..");
setSize(400,300);
setVisible(true);	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s;
		s="User Name:"+t1.getText()+" \nPassword:"+jp.getText();
		s+="\n Mobile:"+t2.getText()+"\n Address:"+ta.getText();
	l5.setText(s);
	}
	public static void main(String args[])
	{
		new Details();
	}
}