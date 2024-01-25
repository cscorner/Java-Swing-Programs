import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JSplitPaneDemo extends JFrame implements ActionListener
{
	JButton jb, jb2, jb3;
	JTextField text1 ,text2;
	JSplitPane jsp ;
	
	public JSplitPaneDemo()
	{
		Container cp = getContentPane();
		text1 = new JTextField("Text 1");
		text2 = new JTextField("Text 2");
		jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT,text1, text2);

		JPanel jp = new JPanel();
		jb = new JButton("Make one-touch expandable");
		jb.addActionListener(this);
		jp.add(jb);

		jb2 = new JButton("Make split horizontal");
		jb2.addActionListener(this);
		jp.add(jb2);

		jb3 = new JButton("Increase divider size");
		jb3.addActionListener(this);
		jp.add(jb3);

		cp.add(jsp, BorderLayout.CENTER);
		cp.add(jp, BorderLayout.SOUTH);
		setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == jb) 
		{
			jsp.setOneTouchExpandable(true);
		}
		if(e.getSource() == jb2) 
		{
			jsp.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		}
		if(e.getSource() == jb3) 
		{
			jsp.setDividerSize(jsp.getDividerSize() + 10);
		}
	}
	public static void main(String[] args)  
	{   
         	new  JSplitPaneDemo();   
	}
}
