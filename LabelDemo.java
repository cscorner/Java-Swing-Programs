import java.awt.*;
import javax.swing.*;

//<applet code=LabelDemo width=300 height=400></applet>

public class LabelDemo extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl=new JLabel("Welcoem to facianting world of SWING!!!!");
		cp.add(jl);



	}
}