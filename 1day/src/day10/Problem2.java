package day10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem2 extends JFrame {
	Problem2() {

		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("calculate"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem2();
	}

}
