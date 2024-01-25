import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;  
public class SnacksCheckBox extends JFrame implements ActionListener
{  
    	JLabel l;  
    	JCheckBox cb1,cb2,cb3;  
   	JButton b;  
    	SnacksCheckBox()
	{  
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
        	l=new JLabel("Food Ordering System");         		
        	cb1=new JCheckBox("Mini Pizza @ 250");        
        	cb2=new JCheckBox("Burger @ 300");          		
        	cb3=new JCheckBox("Tea @ 20",true);         		
        	b=new JButton("Order");         
        	b.addActionListener(this);  
       		cp.add(l);
		cp.add(cb1);
		cp.add(cb2);
		cp.add(cb3);
		cp.add(b);  
        	setSize(400,400);  
        	setTitle("Chai Time");  
       		setVisible(true);        		
		setDefaultCloseOperation(EXIT_ON_CLOSE);  
    	}  
    	public void actionPerformed(ActionEvent e)
	{  
        	float amount=0;  
        	String msg="";  
        	if(cb1.isSelected()==true)
		{  
            			amount+=250;  
           			msg+="Pizza: 250\n";  
        	}  
        	if(cb2.isSelected())
		{  
            			amount+=300;  
           			 msg+="Burger: 300\n";  
        	}  
        	if(cb3.isSelected())
		{  
            			amount+=20;  
            			msg+="Tea: 20\n";  
        	}  
        	msg+="-----------------\nTotal: "+amount;  
        	JOptionPane.showMessageDialog(this,msg);  
    	}  
   	public static void main(String[] args) 
	{  
       		new SnacksCheckBox();  
    	}  
}  