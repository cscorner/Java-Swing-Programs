import java.awt.*; 
import javax.swing.*; 
 
/*<applet code="JLabelDemo" width=250 height=150></applet>*/ 
public class JLabelDemo extends JApplet  
{ 
  public void init()  
  { 
 
    Container cp = getContentPane(); 
    cp.setLayout(new FlowLayout()); 
    ImageIcon ii = new ImageIcon("images.jpg"); 

    JLabel jl1 = new JLabel("Image", ii, JLabel.CENTER); 

    cp.add(jl1);     
  } 
} 
