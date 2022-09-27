import java.awt.FlowLayout;

import javax.swing.JFrame;

public class IncDec {
	
	public static void main(String[] args) {
	
    JFrame frame = new JFrame("Increment and Decrement");
    
    FlowLayout flow = new FlowLayout();
    frame.getContentPane().setLayout(flow);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,300);
    frame.setTitle("Button Modifier");


    IncrementPanel panel = new IncrementPanel();
    DecrementPanel panel1 = new DecrementPanel();

    frame.add(panel);
    frame.add(panel1);

    frame.setVisible(true);
	}
}
