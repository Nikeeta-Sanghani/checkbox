/*THIS IS A SIMPLE CHECKBOX PROGRAM USING MOUSELISTENER
 * 
 */
package checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class myframe extends JFrame implements ActionListener{
    JCheckBox cb,cb1,cb2;
    
    myframe(){

	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	//CREATING CHECKBOXES
	cb=new JCheckBox();
	cb1=new JCheckBox();
	cb2=new JCheckBox();
	
	cb.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    System.out.println( "First Option Selected is ->"+ cb.isSelected());
		}
	});
	cb1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    System.out.println( "Second Option Selected is ->"+ cb1.isSelected());            
		}
	});
	
	cb2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    System.out.println( "Third Option Selected is ->"+ cb2.isSelected());
		    System.out.println("\n");
		    System.out.println("Name of CheckBox2 Component is ->"+cb2.getName());
		    System.out.println("Text of CheckBox2 Component 2 is ->"+cb2.getText());
		    cb.doClick();
		    cb.setToolTipText("ABC TOOL TIP");
		    System.out.println("First Option is also now Selected ->"+cb.isSelected());
		}
	});
	cb.setText("Fist Option");
	cb.setFont(new Font("Serg UI", Font.PLAIN,24));
	cb2.createToolTip();
	
	cb1.setText("Second Option");
	cb1.setFont(new Font("Serg UI", Font.PLAIN,24));
	
	cb2.setText("Third Option");
	cb2.setName("Check Box Number 3");
	cb2.setFont(new Font("Serg UI", Font.PLAIN,24));
	
	this.add(cb);
	this.add(cb1);
	this.add(cb2);
	this.pack();
	this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	System.out.println(cb.getAction());
	System.out.println(cb.isSelected());
    }
    private static final long serialVersionUID = 1643011092305629040L;
}