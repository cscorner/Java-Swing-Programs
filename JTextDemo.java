import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class JTextDemo extends JFrame  implements ActionListener 
{ 
   	JTextField tnm; 
   	JPasswordField tpwd; 
   	JLabel lnm,lpwd,lmsg; 
   	JButton btnok,btnClear; 
   	String msg=""; 
   
   	public JTextDemo() 
  	{  
    		Container cp = getContentPane(); 
    		cp.setLayout(new FlowLayout()); 
     
    		tnm=new JTextField(10); 
       		tpwd=new JPasswordField(6); 
    		tpwd.setEchoChar('$'); 
 
        	lnm=new JLabel("Name:"); 
        	lpwd=new JLabel("Password:"); 
    		lmsg=new JLabel(""); 
        	btnok=new JButton("Ok"); 
                btnClear=new JButton("Reset"); 
     
    		cp.add(lnm); 
    		cp.add(tnm); 
    		cp.add(lpwd); 
    		cp.add(tpwd); 
    		cp.add (btnok); 
		cp.add (btnClear); 
    		cp.add (lmsg); 
    		btnok.addActionListener(this); 
		btnClear.addActionListener(this); 
		setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  	} 
  	public void actionPerformed(ActionEvent ae) 
  	{ 
		if(ae.getSource()==btnok)
		{    		
      			if (tnm.getText().equals("")||tpwd.getText().equals("")) 
                      		lmsg.setText("plz Enter username/password");                  
     
                   	else                                    
        			lmsg.setText("Welcome, "+tnm.getText()); 
		}
		else
		{
			tnm.setText("");
			tpwd.setText("");
			lmsg.setText("");
		}                  
  	}   	
	public static void main(String[] args)  
	{   
         		new  JTextDemo();   
	}  
}

