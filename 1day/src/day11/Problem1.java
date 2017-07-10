package day11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem1 extends JFrame {
	Problem1() {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);

		MyMouseListener listener2 = new MyMouseListener();
		btn.addMouseListener(listener2);

		add(btn);

		setSize(300, 150);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();

			if (b.getText().equals("Action")) {
				b.setText("액션");
				setTitle("액션");
			} else {
				b.setText("Action");
				setTitle("Action");
			}

		}

	}

	public static void main(String[] args) {
		new Problem1();
	}
}

class MyMouseListener implements MouseListener {
	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.RED);
	}

	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.YELLOW);
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

}