import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;


public class JFileChooserDemo extends JFrame implements ActionListener
{
	JFileChooser chooser;
	JButton btnopen,btnsave;
	JTextArea tf ;

	public JFileChooserDemo()
	{
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		chooser = new JFileChooser();
		btnopen = new JButton("Open file");
		btnsave = new JButton("Save file");

		tf = new JTextArea(30,30);
		JScrollPane jsp=new JScrollPane(tf);
		
		chooser.setDialogTitle("Choose a file");

		tf.setFont(new Font("Arial",Font.BOLD,18));
		cp.add(btnopen);
		cp.add(btnsave);
		cp.add(jsp);
		btnopen.addActionListener(this);
		btnsave.addActionListener(this);

		setSize(200, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("File Chooser");
	}

	public void actionPerformed(ActionEvent ae)
	{
		
try
{		int result;
		File fileobj;
		if(ae.getSource()==btnopen)
		{
			result=chooser.showOpenDialog(this);
			fileobj = chooser.getSelectedFile();
			if(result == JFileChooser.APPROVE_OPTION) 
			{
tf.setText("");
FileInputStream fis=new FileInputStream(fileobj);
int i;
while((i=fis.read())!=-1)
{
	tf.append(""+(char)i);
}
			} 
			else if(result == JFileChooser.CANCEL_OPTION) 
			{
				tf.setText("You clicked Cancel");
			}
		}

		if(ae.getSource()==btnsave)
		{
			result=chooser.showSaveDialog(this);
			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			fileobj = chooser.getSelectedFile();
			if(result == JFileChooser.APPROVE_OPTION) 
			{
				
String data=tf.getText();
byte b[]=data.getBytes();
FileOutputStream fos=new FileOutputStream(fileobj);

	fos.write(b);
fos.close();
			} 
			else if(result == JFileChooser.CANCEL_OPTION) 
			{
				tf.setText("You clicked Cancel");
			}
		}
}
catch(Exception e)
{
	System.out.println(e);
}
		
	}
	public static void main(String args[])
	{
		new JFileChooserDemo();
	}
}
