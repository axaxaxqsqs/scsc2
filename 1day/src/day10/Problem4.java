package day10;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Problem4 extends JFrame {
	Problem4() {

		setTitle("프로필 작성란");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);
		setVisible(true);

		Container c = getContentPane();
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		c.setLayout(grid);

		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 취미"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 특기"));
		c.add(new JTextField(""));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem4();
	}

}
