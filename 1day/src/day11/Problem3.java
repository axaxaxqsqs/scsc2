package day11;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Problem3 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la;

	Problem3() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());

		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);

	}

	class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		public void mouseReleased(MouseEvent e) {
		}

	}

	public static void main(String[] args) {
		new Problem3();
	}

}
