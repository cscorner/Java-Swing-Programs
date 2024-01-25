import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComboBoxDemo1 extends JFrame implements ActionListener 
{
	JLabel jl1,jl2,jl3;
	JComboBox jc,jc1;
	JButton b1;
	public JComboBoxDemo1() 
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		jl1 = new JLabel("Select juice  name:");
		jc = new JComboBox();
		jc.addItem("Juices");
		jc.addItem("Mango");
		jc.addItem("Orange");
		jc.addItem("Pineapple");
		//jc.setEditable(true); 
	
		cp.add(jl1);
		cp.add(jc);
		
		jl2 = new JLabel("Select no. of glasses:");
		jc1 = new JComboBox();
		jc1.addItem("No. of glasses");
		for(int i=1;i<=10;i++)
			jc1.addItem(""+i);
		cp.add(jl2);
		cp.add(jc1);
		jl3 = new JLabel();
		cp.add(jl3);
		b1=new JButton("Order");
		b1.addActionListener(this);	
		cp.add(b1);
	setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JComboBoxDemo1 ();   
}   
	public void actionPerformed(ActionEvent ie) 
	{
		String j=(String)jc.getSelectedItem();
		String gls=(String)jc1.getSelectedItem();
		int g=Integer.parseInt(gls);
		if(j.equals("Mango"))
		{
			jl3.setText("Total cost is:"+(40*g));
		}
		else if(j.equals("Orange"))
		{
		jl3.setText("Total cost is:"+(30*g));
		}
		else if(j.equals("Pineapple"))
		{		
		jl3.setText("Total cost is:"+(50*g));
		}
		else
			jl3.setText("Choice not proper!!!!");

	}


}