package day10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem1_3 extends JFrame {
	Problem1_3() {

		setTitle("2��° ������ �Դϴ�.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		
		Container contantPane = getContentPane();
		contantPane.setBackground(Color.CYAN);
		contantPane.setLayout(new FlowLayout());
		contantPane.add(new JButton("��"));
		contantPane.add(new JButton("�ƴϿ�"));
		contantPane.add(new JButton("�����ϰ� �� �޽��� ���� �ʱ�"));
	}
}
