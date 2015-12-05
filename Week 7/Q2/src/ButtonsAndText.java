/**

@author Bhaskar Tejaswi


*/

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButtonsAndText extends JFrame implements ActionListener {

	public static int PANEL_WIDTH = 550;
	public static int PANEL_HEIGHT = 120;
	
	public static String PANEL_TITLE = "Lab #7 Question #1 ";
	public static String WAS_CLICKED_AT = " was clicked at ";
	
	private JButton[] buttons;
	private JLabel label;
	
	public static void main(String args[]) {
		        
		ButtonsAndText frame = new ButtonsAndText();
	}

	
	public ButtonsAndText() {
		
		// initialise buttons, add ActionListener
		buttons = new JButton[6];
		for (int i=0; i<6; i++) {
			buttons[i] = new JButton("Button " + String.valueOf(i));
			buttons[i].addActionListener(this);
		}
		
		// initialise label
		label = new JLabel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		this.setTitle(PANEL_TITLE);
		this.setVisible(true);
		
		Container myContainer = getContentPane();
		myContainer.setLayout(new FlowLayout());
		
		// use 2 panels, 3 buttons each
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		for (int i=0; i<3; i++) {
			p1.add(buttons[i]);
		}
		
		for (int j=3; j<buttons.length ;j++) {
			p2.add(buttons[j]);
		}
		
		// add panels to container
		myContainer.add(p1);
		myContainer.add(p2);
		
		// add label to container
		myContainer.add(label);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		// prepare info on button clicked, with time stamp
		StringBuffer myBuffer = new StringBuffer();
		myBuffer.append(arg0.getActionCommand()).append(WAS_CLICKED_AT);
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.setTimeInMillis(arg0.getWhen());
		myBuffer.append(myCalendar.getTime().toString());
		
		label.setText(myBuffer.toString());										
	}	
}
