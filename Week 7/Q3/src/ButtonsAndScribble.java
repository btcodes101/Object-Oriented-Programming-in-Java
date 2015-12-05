/**
@author Bhaskar Tejaswi

*/import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButtonsAndScribble extends JFrame implements ActionListener, MouseMotionListener  {

	public static int PANEL_WIDTH = 550;
	public static int PANEL_HEIGHT = 120;
	
	public static String PANEL_TITLE = "Lab #07 Question #3 ";
	public static String WAS_CLICKED_AT = " was clicked at ";
	
	private JButton[] buttons;
	private JLabel label;
	
	// former mouse position and current mouse position
	int x0, y0, x, y;
	
	public static void main(String args[]) {
		        
		ButtonsAndScribble frame = new ButtonsAndScribble();
	}

	
	public ButtonsAndScribble() {
		
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
		
		// add MouseMotionListener
		this.addMouseMotionListener(this);
	}
	
	
	/*
	 * From ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// prepare info on button clicked, with time stamp
		StringBuffer myBuffer = new StringBuffer();
		myBuffer.append(e.getActionCommand()).append(WAS_CLICKED_AT);
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.setTimeInMillis(e.getWhen());
		myBuffer.append(myCalendar.getTime().toString());
		
		label.setText(myBuffer.toString());	
	}

	
	public void paint(Graphics g) {
		
		g.drawLine(x0, y0, x, y);
		//super.paint(g);
	}
	
	/*
	 * From MouseMotionListener
	 */
	@Override
	public void mouseDragged(MouseEvent arg0) {

		x0 = arg0.getX();
		y0 = arg0.getY();
		x = x0;
		y = y0;
		repaint();
	}

	/*
	 * From MouseMotionListener
	 */	
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// do nothing
	}

}
