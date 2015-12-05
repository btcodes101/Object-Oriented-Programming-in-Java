import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;


/**
 * This panel arranges the buttons in a text flow fashion
 * Component orientation LEFT_TO_RIGHT or RIGHT_TO_LEFT
 * alignment LEFT, RIGHT or CENTER
 * 
 * @author Bhaskar Tejaswi
 */
public class MyLayout extends JFrame{
	
	// create panel
	// add buttons to panel
	
	public static int PANEL_WIDTH = 550;
	public static int PANEL_HEIGHT = 120;
	
	public static String PANEL_TITLE = "Lab 7";
	public static String FLOW_LAYOUT_NAME = " Flow Layout";
	public static String BORDER_LAYOUT_NAME = " Border Layout";
	public static String GRID_LAYOUT_NAME = " Grid Layout";
	
	public static int NUM_ROWS = 2;
	public static int NUM_COLS = 3;
	public static int GAP = 0;
	
	
	private JButton[] buttons;
	
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Choice");
        System.out.println("1.FlowLayoutManager\n2.BorderLayoutManager\n3.GridLayoutManager");   
        
        int layoutChoice = sc.nextInt();
        
		MyLayout tutorial1 = new MyLayout();	
		
        switch (layoutChoice) {
        	
	        case 1:
	        	tutorial1.doFlowLayout();
	        	break;
	        case 2:
	        	tutorial1.doBorderLayout();
	        	break;
	        case 3:
	        	tutorial1.doGridLayout();
	        	break;
	        case 4:
	        	tutorial1.doFlowLayout1();
	        	break;
	        case 5:
	        	tutorial1.doBorderLayout1();
	        	break;
	        default:
	        	break;
        }
	}
	
	
	public MyLayout() {
		
		buttons = new JButton[6];
		for (int i=0; i<6; i++) {
			buttons[i] = new JButton("Button " + String.valueOf(i));
		}
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		this.setVisible(true);
	}

	/**
	 * Adds buttons in Flow Layout
	 */
	public void doFlowLayout() {
		
		this.setTitle(PANEL_TITLE + FLOW_LAYOUT_NAME);
		Container myContainer = getContentPane();
		myContainer.setLayout(new FlowLayout());
		
		for(int i=0; i<buttons.length; i++) {
			myContainer.add(buttons[i]);
		}
	}
	
	/**
	 * Adds buttons in Flow Layout in 2 rows
	 */
	public void doFlowLayout1() {
		
		this.setTitle(PANEL_TITLE + FLOW_LAYOUT_NAME);
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
		
	}	
	
	
	/**
	 * Adds buttons in Border Layout
	 */
	public void doBorderLayout() {
		
		this.setTitle(PANEL_TITLE + BORDER_LAYOUT_NAME);
		Container myContainer = getContentPane();
		myContainer.setLayout(new BorderLayout(GAP,GAP));
		
		myContainer.add(buttons[0], BorderLayout.NORTH);
		myContainer.add(buttons[1], BorderLayout.EAST);
		myContainer.add(buttons[2], BorderLayout.SOUTH);
		myContainer.add(buttons[3], BorderLayout.WEST);
		myContainer.add(buttons[4], BorderLayout.CENTER);
	}
	
	/**
	 * Adds buttons in Border Layout in 2 rows
	 */
	public void doBorderLayout1() {
		
		this.setTitle(PANEL_TITLE + BORDER_LAYOUT_NAME);
		Container myContainer = getContentPane();
		myContainer.setLayout(new BorderLayout(GAP,GAP));
		
		// use 2 panels, 3 buttons each
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout(0,0));
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout(0,0));
		
		// add buttons to panels
		p1.add(buttons[0], BorderLayout.WEST);
		p1.add(buttons[1], BorderLayout.CENTER);
		p1.add(buttons[2], BorderLayout.EAST);
		p2.add(buttons[3], BorderLayout.WEST);
		p2.add(buttons[4], BorderLayout.CENTER);
		p2.add(buttons[5], BorderLayout.EAST);

		// add panels to container
		myContainer.add(p1, BorderLayout.NORTH);
		myContainer.add(p2, BorderLayout.CENTER);
	}
	
	/**
	 * Adds buttons in Grid Layout in 2 rows
	 */
	public void doGridLayout() {
		
		this.setTitle(PANEL_TITLE + GRID_LAYOUT_NAME);
		Container myContainer = getContentPane();
		myContainer.setLayout(new GridLayout(NUM_ROWS,NUM_COLS,GAP,GAP));
		
		for(int i=0; i<buttons.length; i++) {
			myContainer.add(buttons[i]);
		}
	}
	
}
