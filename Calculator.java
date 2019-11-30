import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Calculator  extends JFrame {
	
    private JButton calcButton;

    private JTextField displayBar;
	
	   
public Calculator() {   
	
	super("Calculator"); 

	 JPanel p2 = new JPanel();
	    p2.setLayout(new FlowLayout());
	    p2.add(displayBar = new JTextField(25));

	JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4, 3));
    p1.add(calcButton = new JButton("7"));
    p1.add(calcButton = new JButton("8"));
    p1.add(calcButton = new JButton("9"));
    p1.add(calcButton = new JButton("/"));
    p1.add(calcButton = new JButton("4"));
    p1.add(calcButton = new JButton("5"));
    p1.add(calcButton = new JButton("6"));
    p1.add(calcButton = new JButton("*"));
    p1.add(calcButton = new JButton("1"));
    p1.add(calcButton = new JButton("2"));
    p1.add(calcButton = new JButton("3"));
    p1.add(calcButton = new JButton("-"));
    p1.add(calcButton = new JButton("0"));
    p1.add(calcButton = new JButton("."));
    p1.add(calcButton = new JButton("="));
    p1.add(calcButton = new JButton("+"));

   add(p1, BorderLayout.CENTER); 
   add(p2, BorderLayout.NORTH); 

  
} 
 

}
