import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class PopupMenuExample extends JFrame implements PopupMenuListener 
{
	JPopupMenu Pmenu,p1;
  	JMenuItem menuItem,i1;
	JTextField jtf=new JTextField(10);

	public PopupMenuExample()
	{

		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());

		Pmenu = new JPopupMenu();
		p1 = new JPopupMenu();
		menuItem = new JMenuItem("Demo");
		i1 = new JMenuItem("New");
		p1.add(menuItem);
		p1.add(i1);
		
  		menuItem = new JMenuItem("Cut");
  		Pmenu.add(menuItem);
  		menuItem = new JMenuItem("Copy");
 		 Pmenu.add(menuItem);
  		menuItem = new JMenuItem("Paste");
  		Pmenu.add(menuItem);
  		menuItem = new JMenuItem("Delete");
  		Pmenu.add(menuItem);
  		menuItem = new JMenuItem("Undo");
  		Pmenu.add(menuItem);

  		cp.add(jtf);
		JButton jb=new JButton("HEY!!");
		jb.setComponentPopupMenu(p1);
		jtf.setComponentPopupMenu(Pmenu);
		cp.add(jb);

		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Welcome to Swing Programming!");
		setVisible(true);
		p1.addPopupMenuListener(this);
		Pmenu.addPopupMenuListener(this);

		addMouseListener(new MouseAdapter()
		{
  			public void mouseReleased(MouseEvent me)
			{
  				if(me.isPopupTrigger()) 
//This method returns true if the event is generated when the popup is triggered.
				{
  					Pmenu.show(me.getComponent(), me.getX(), me.getY());
					
  				}	
  			}
			
 		 });		
	}
	public static void main(String[] args)
	{
		new PopupMenuExample();
	}
	public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) 
	{
    		System.out.println("Canceled");
  	}

public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) 
	{
    		System.out.println("Becoming Invisible");
  	}

  	public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) 
	{
    		System.out.println("Becoming Visible");
  	}

}
