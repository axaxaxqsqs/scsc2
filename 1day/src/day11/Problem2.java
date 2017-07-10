package day11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem2 extends JFrame {
	Problem2() {
		setTitle("�͸� Ŭ������ inner Ŭ���� �Դϴ�.");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		JButton btn = new JButton("���Ƹ�");
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();

			if (b.getText().equals("���Ƹ�"))
				b.setText("���߸�");
			else
				b.setText("���Ƹ�");
			
			setTitle(b.getText());
		}

	}

	public static void main(String[] args) {
		new Problem2();
	}
}
