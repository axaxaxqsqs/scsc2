package day11;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Problem8 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HERE");

	Problem8() {
		setTitle("Click and DoubleClick ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseAdapter2());
		contentPane.addMouseWheelListener(new MyMouseAdapter2());

		la.setLocation(100, 100);
		contentPane.add(la);

	}

	class MyMouseAdapter2 extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);

				JPanel p = (JPanel) e.getSource();
				p.setBackground(new Color(r, g, b));
			}
		}

		public void mouseWheelMoved(MouseWheelEvent e) {
			int number = (int) (Math.random() * 10) + 1;

			switch (number) {
			case 1:
				la.setText("����");
				break;
			case 2:
				la.setText("����");
				break;
			case 3:
				la.setText("���");
				break;
			case 4:
				la.setText("�ٳ���");
				break;
			case 5:
				la.setText("����");
				break;
			case 6:
				la.setText("���ξ���");
				break;
			case 7:
				la.setText("����");
				break;
			case 8:
				la.setText("����");
				break;
			case 9:
				la.setText("�޷�");
				break;
			case 10:
				la.setText("��");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Problem8();

	}
}