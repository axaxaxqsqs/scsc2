package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable2 implements Runnable {
	JLabel timerLabel;

	public TimerRunnable2(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1초마다 스레드 중지 => 보기에는 1초마다 숫자 증가
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Problem4 extends JFrame {
	Thread th;
	Problem4() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setSize(300, 150);
		setVisible(true);

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		Runnable runnable = new TimerRunnable2(timerLabel);
		th = new Thread(runnable);
		c.add(timerLabel);
		
		JButton btn = new JButton("kill timer");
		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
			
		});
		
		c.add(btn);

		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem4();
	}

}