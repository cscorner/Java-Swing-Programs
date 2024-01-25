import java.awt.*;
import javax.swing.*;

public class JTextFieldDemo extends JFrame
{
	public JTextFieldDemo() 
	{

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JLabel jl1 = new JLabel("Name");
		JTextField jtf1 = new JTextField(15);	

		JLabel jl2 = new JLabel("Address");
		JTextArea jta=new JTextArea(10,5);

		JLabel jl3 = new JLabel("Enter pwd");
		JPasswordField jpf=new JPasswordField(10);
		jtf1.setToolTipText("This is a TextField.");	
		jpf.setToolTipText("This is a PasswordField.");			
		jpf.setEchoChar('#');
		cp.add(jl1);
		cp.add(jtf1);

		cp.add(jl2);
		cp.add(jta);

		cp.add(jl3);
		cp.add(jpf);

		setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}
	public static void main(String[] args)  
	{   
         		new  JTextFieldDemo();   
	} 
}
