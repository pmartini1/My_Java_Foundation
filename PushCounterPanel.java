
import java.util.*;
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class PushCounterPanel extends JPanel { 
	private int count; 
	private JButton push; 
	private JLabel label;


public PushCounterPanel() {
	count = 0;
	
	push = new JButton("Push Me!"); 
	label = new JLabel(); 
	push.addActionListener(new ButtonListener());
	add(push); 
	add(label);
	
	setBackground(Color.red); 
	setPreferredSize(new Dimension(300, 40));
	
	

	}
private class ButtonListener implements ActionListener { 
	
	public void actionPerformed(ActionEvent event) { 
		
		//////////////////////////////////////////////////
		//This Part creates and displays a random number//
		//////////////////////////////////////////////////
		Random randNum = new Random();
		count = randNum.nextInt((100 - 1) + 1) + 1;
		
		label.setText("Pushes: " + count); 
		
		}
	}	
}

	
	
	
