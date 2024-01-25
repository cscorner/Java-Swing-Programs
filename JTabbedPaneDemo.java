import javax.swing.*;

public class JTabbedPaneDemo extends JFrame
{
	public JTabbedPaneDemo() 
	{
		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
JPanel jp=new JPanel();
jp.add(new JLabel("Enter something"));
jp.add(new JTextField(20));
		jtp.addTab("Cities",jp);
		
JPanel jp1=new JPanel();

	JCheckBox cb1 = new JCheckBox("Red");
	JCheckBox cb2 = new JCheckBox("Green");
	jp1.add(cb1);
	jp1.add(cb2);
		jtp.addTab("Colors",jp1);

	CitiesPanel cp=new CitiesPanel ();
	ColorsPanel colp=new ColorsPanel();
	 FlavorsPanel fp=new  FlavorsPanel ();

	jtp.addTab("New Cities",cp);
	jtp.addTab("New Colors",colp);
	jtp.addTab("New Flavours",fp);

		getContentPane().add(jtp);
		setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	} 
	public static void main(String[] args)  
	{   
         		new JTabbedPaneDemo();   
	}    
}

class CitiesPanel extends JPanel 
{
	public CitiesPanel() 
	{
		JButton b1 = new JButton("New York");
		add(b1);
		JButton b2 = new JButton("London");
		add(b2);
		JButton b3 = new JButton("Hong Kong");
		add(b3);
		JButton b4 = new JButton("Tokyo");
		add(b4);
	}
}

class ColorsPanel extends JPanel 
{
	public ColorsPanel() 
	{
		JCheckBox cb1 = new JCheckBox("Red");
		add(cb1);
		JCheckBox cb2 = new JCheckBox("Green");
		add(cb2);
		JCheckBox cb3 = new JCheckBox("Blue");
		add(cb3);
	}
}

class FlavorsPanel extends JPanel 
{
	public FlavorsPanel() 
	{
		JComboBox jcb = new JComboBox();
		jcb.addItem("Vanilla");
		jcb.addItem("Chocolate");
		jcb.addItem("Strawberry");
		add(jcb);
	}
}
