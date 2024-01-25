import java.awt.*;
import javax.swing.*;

public class  JPanelExample1 extends JFrame
{
	JPanel p1,p2;
	public JPanelExample1()
	{    
		Container cp = getContentPane();
		//cp.setLayout(new BorderLayout());
        		// An empty panel with FlowLayout
		p1=new JPanel();
		p1.setLayout(new FlowLayout());

        	JLabel l1=new JLabel("Your name:");
		JTextField tf=new JTextField(20);
		p1.add(l1);
		p1.add(tf);
        		// Panel with custom layout
       	 	p2=new JPanel();
        	p2.setLayout(new FlowLayout());
		JComboBox jc=new JComboBox();
		jc.addItem("Choclate");
		jc.addItem("Icecreame");
		p2.add(jc);

	        p1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2.setBorder(BorderFactory.createTitledBorder("favourite"));


		cp.add(p1,BorderLayout.NORTH);
		cp.add(p2,BorderLayout.SOUTH);


	setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JPanelExample1 ();   
}   
}

		
