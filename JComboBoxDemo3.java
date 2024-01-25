import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo3 extends JFrame implements ItemListener
{
JLabel jl;
ImageIcon france, germany, italy, japan;
public JComboBoxDemo3()
{
Container cp = getContentPane();
cp.setLayout(new FlowLayout());
JComboBox jc = new JComboBox();
jc.addItem("India");
jc.addItem("France");
jc.addItem("Italy");
jc.addItem("Japan");
jc.addItemListener(this);
jc.setEditable(true);
cp.add(jc);
jl = new JLabel(new ImageIcon("India.jpg"));
cp.add(jl);
setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JComboBoxDemo3();   
}   
public void itemStateChanged(ItemEvent ie)
{
String s = (String)ie.getItem();
jl.setIcon(new ImageIcon(s + ".jpg"));
}
}