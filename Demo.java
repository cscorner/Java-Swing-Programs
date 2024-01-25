import javax.swing.*;
import java.awt.*;
public class Demo extends JFrame
{
	public Demo()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
JLabel l=new JLabel("Welcome back...sudhar jao!!!");
ImageIcon ii = new ImageIcon("vidya2.jpg"); 
JLabel l1 = new JLabel(ii);
ImageIcon i = new ImageIcon("ok.jpg"); 
JLabel l2 = new JLabel("ok",i,JLabel.CENTER);
cp.add(l1);
cp.add(l2);
cp.add(l);
setTitle("Demo Pgm..");
setSize(400,300);
setVisible(true);	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new Demo();
	}
}