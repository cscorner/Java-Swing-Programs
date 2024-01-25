import java.awt.*;
import javax.swing.*;
public class LabelDemo1 extends JFrame
{
	public LabelDemo1()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl=new JLabel("Welcoem to facianting world of SWING!!!!");
		cp.add(jl);
		ImageIcon ii = new ImageIcon("ok.jpg"); 
		JLabel l1 = new JLabel(ii);
		ImageIcon ii1 = new ImageIcon("s33.png"); 
		JLabel l2 = new JLabel("ok",ii1	,JLabel.LEADING);
		JLabel l3 = new JLabel();
		l3.setIcon(ii);
		cp.add(l1);
		cp.add(l2);
		cp.add(l3);
		setSize(300,300);
		setTitle("Label");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
	public static void main(String args[])
	{
		 new LabelDemo1();
	}
}