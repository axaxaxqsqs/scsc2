package day10;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Problem5 extends JFrame {
	Problem5() {

		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("재미있는 Swing... ... .");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);

		JButton a = new JButton("내 위치는 100, 20");
		a.setLocation(100, 20);
		a.setSize(250, 20);
		c.add(a);

		JButton b = new JButton("내 위치는 180, 200");
		b.setLocation(180, 200);
		b.setSize(250, 20);
		c.add(b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem5();
	}

}