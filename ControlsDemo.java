import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code=ControlsDemo width=300 height=300></applet>*/

public class ControlsDemo extends JApplet implements ActionListener
{
	String msg;
	JTextField tf;
	JLabel l1,l2,l3,l4,l5;
	JRadioButton rb1,rb2;
	JCheckBox cb1,cb2,cb3,cb4;
	JButton btnok;
	JTextArea ta;
	public void init() 
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

l1=new JLabel("Enter name:");
l2=new JLabel("Your Hobbies:");
l3=new JLabel("Gender:");
l4=new JLabel("Your Address:");
l5=new JLabel();
tf = new JTextField(15);
cb1 = new JCheckBox("Reading"); 
cb2 = new JCheckBox("Music"); 
cb3 = new JCheckBox("Dancing"); 
cb4 = new JCheckBox("Traveling"); 

rb1 = new JRadioButton("Male");
rb2 = new JRadioButton("Female");
ta=new JTextArea(5,10);
btnok=new JButton("Ok");

ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);

cp.add(l1);
cp.add(tf);
cp.add(l2);
cp.add(cb1);
cp.add(cb2);
cp.add(cb3);
cp.add(cb4);
cp.add(l3);
cp.add(rb1);
cp.add(rb2);
cp.add(l4);
cp.add(ta);
cp.add(btnok);
cp.add(l5);

btnok.addActionListener(this);
/*cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
cb4.addItemListener(this);
rb1.addActionListener(this);
*/rb2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) 
{
	msg="";
	msg+="Details are:"+tf.getText()+"Ur hobbies are:";
	if(cb1.isSelected()==true)
		msg+=" "+cb1.getText();
	if(cb2.isSelected()==true)
		msg+=" "+cb2.getText();
	if(cb3.isSelected()==true)
		msg+=" "+cb3.getText();
	if(cb4.isSelected()==true)
		msg+=" "+cb4.getText();
	if(rb1.isSelected()==true)
		msg+="Gender:"+rb1.getText()+" ";
else 
		msg+="Gender:"+rb2.getText()+" ";

msg+="Address:"+ta.getText();

l5.setText(msg);

}
/*public void itemStateChanged(ItemEvent ie) 
{
	
}*/
}