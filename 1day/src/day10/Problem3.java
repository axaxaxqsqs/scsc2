package day10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem3 extends JFrame {
	Problem3() {

		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		ExPanel b = new ExPanel();
		
		c.add(b, BorderLayout.CENTER);
		b.add(new JButton("calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
	}
	class ExPanel extends JPanel{
		public ExPanel(){
			setBackground(Color.GREEN);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem3();
	}

}
