//If you want to dynamically update your table data, you can work with a TableModelListener to find out when the data changes. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class JTableEx extends JFrame implements ActionListener
{
	JTable tbl;			
	
	public JTableEx() 
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		String dataValues[][] =
		{
			{ "12", "234", "67" },
			{ "-123", "43", "853" },
			{ "93", "89.2", "109" },
			{ "279", "9033", "3092" }
		};
		String columnNames[] = { "Column 1", "Column 2", "Column 3" };

		tbl=new JTable( dataValues, columnNames );
		//tbl.setCellSelectionEnabled(true);
		tbl.setColumnSelectionAllowed(true);
		//tbl.setShowGrid(false);
    		tbl.setShowVerticalLines(true);
		tbl.setGridColor(Color.red); 
		tbl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		tbl.getModel().addTableModelListener(new TableModelListener() 
		{
			public void tableChanged(TableModelEvent e) 
			{
			         System.out.println(e.toString());
      			}
    		});

		JScrollPane scroll = new JScrollPane( tbl );
		
    		JButton button = new JButton("Print");
		button.addActionListener(this);
		cp.add(scroll);

		cp.add(button);
		

		
	setTitle("JOption Demo"); 
        	setVisible(true); 
        	setSize(500,500); 
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}   
public static void main(String[] args)  
{   
         new JTableEx();   
}   
	public void actionPerformed(ActionEvent e) 
	{
        	try 
		{
          		//tbl.print();
					Object o = tbl.getValueAt(tbl.getSelectedRow() ,tbl.getSelectedColumn());
		System.out.println(o);


        	} 
		catch (Exception pe) 
		{
		          System.err.println("Error printing: " + pe.getMessage());
        	}
      }
	
		
}




