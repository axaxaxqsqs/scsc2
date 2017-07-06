package day10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("ContentPaneExample");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setVisible(true);

		Container c = f.getContentPane();

		c.setLayout(new FlowLayout());
		c.setBackground(Color.ORANGE);
		c.add(new JButton("2017"));
		c.add(new JButton("07"));
		c.add(new JButton("06"));
	}

}
