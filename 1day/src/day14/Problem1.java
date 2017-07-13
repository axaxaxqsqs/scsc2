package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	JLabel timerLabel;

	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1�ʸ��� ������ ���� => ���⿡�� 1�ʸ��� ���� ����
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Problem1 extends JFrame {
	Problem1() {
		setTitle("ThreadTimerEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setSize(300, 150);
		setVisible(true);

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		TimerThread th = new TimerThread(timerLabel);
		c.add(timerLabel);

		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem1();
	}

}
