import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo extends JFrame implements ItemListener
{
	JLabel jl;
	JCheckBox c1,c2,c3,c4;
	String msg="You Selected:";
	public JCheckBoxDemo()
	{
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
	
		ImageIcon normal = new ImageIcon("s11.jpg");
		ImageIcon rollover = new ImageIcon("s22.png");
		ImageIcon selected = new ImageIcon("s33.png");

		c1 = new JCheckBox("C");
		//cb.setRolloverIcon(rollover);
		//cb.setSelectedIcon(selected);
		c1.addItemListener(this);
		contentPane.add(c1);

		c2 = new JCheckBox("C++");
		//cb.setRolloverIcon(rollover);
		//cb.setSelectedIcon(selected);
		c2.addItemListener(this);
		contentPane.add(c2);

		c3 = new JCheckBox("Java");
		//cb.setRolloverIcon(rollover);
		//cb.setSelectedIcon(selected);
		c3.addItemListener(this);
		contentPane.add(c3);

		c4 = new JCheckBox("Perl");
		//cb.setRolloverIcon(rollover);
		//cb.setSelectedIcon(selected);
		c4.addItemListener(this);
		contentPane.add(c4);
// Add text field to the content pane

		jl = new JLabel();
		contentPane.add(jl);

		setTitle("JButton Demo"); 
        		setVisible(true); 
        		setSize(500,500); 
        		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox cb = (JCheckBox)ie.getItem();
		if(cb.isSelected()==true)
			msg+=cb.getText()+" ";
		
		jl.setText(msg);
	}
	public static void main(String[] args)  
	{   
         		new JCheckBoxDemo();   
	}  
}