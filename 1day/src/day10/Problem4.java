package day10;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Problem4 extends JFrame {
	Problem4() {

		setTitle("������ �ۼ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);
		setVisible(true);

		Container c = getContentPane();
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		c.setLayout(grid);

		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ���"));
		c.add(new JTextField(""));
		c.add(new JLabel(" Ư��"));
		c.add(new JTextField(""));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem4();
	}

}
