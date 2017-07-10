package day11;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Problem6 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");
	final int FLYING_UNIT = 10;

	Problem6() {
		setTitle("��, ��, ��, �� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyAdapter());
		la.setLocation(50, 50);
		la.setSize(100, 20);
		contentPane.add(la);
		contentPane.requestFocus();
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			
			switch (keycode){
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				break;
				
			}
		}
	}

	public static void main(String[] args) {
		new Problem6();
	}

}