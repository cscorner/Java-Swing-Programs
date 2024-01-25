import java.awt.*; 
import javax.swing.*;  
public class JFrameExample extends JFrame  
{    
public JFrameExample () 
{   
	Container cp=getContentPane();
	cp.setLayout(new FlowLayout());
	JLabel l1=new JLabel("WELCOME TO JFC");
	cp.add(l1);
               	setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JFrameExample ();   
}   
} 
