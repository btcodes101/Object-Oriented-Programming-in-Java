
/**
 * @author ProgJazz
 * Assignment 8 : Question 1
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Applet2 extends JApplet implements ActionListener, MouseMotionListener {
	
	JButton[] buttons;
	JLabel label;
	public static String WAS_CLICKED_AT = " was clicked at ";
	int x, y, x0, y0;
	
	public Applet2() {
		buttons = new JButton[6];
		for (int i=0;i<6;i++) {
			buttons[i] = new JButton("Button" + String.valueOf(i));
			buttons[i].addActionListener(this);
		}
		
		label = new JLabel();
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		for (int i=0;i<3;i++) {
			p1.add(buttons[i]);
		}
		for (int i=3;i<6;i++) {
			p2.add(buttons[i]);
		}
		
		c.add(p1);
		c.add(p2);
		c.add(label);
		this.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g) {
		g.drawLine(x0, y0, x0, y0);
	}
	
	public void mouseDragged(MouseEvent arg0) {
		x0 = arg0.getX();
		y0 = arg0.getY();
		repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StringBuffer myBuffer = new StringBuffer();
		myBuffer.append(e.getActionCommand()).append(WAS_CLICKED_AT);
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.setTimeInMillis(e.getWhen());
		myBuffer.append(myCalendar.getTime().toString());
		label.setText(myBuffer.toString());	
	}
	
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}

