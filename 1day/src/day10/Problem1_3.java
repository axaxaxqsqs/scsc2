package day10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem1_3 extends JFrame {
	Problem1_3() {

		setTitle("2번째 페이지 입니다.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		
		Container contantPane = getContentPane();
		contantPane.setBackground(Color.CYAN);
		contantPane.setLayout(new FlowLayout());
		contantPane.add(new JButton("예"));
		contantPane.add(new JButton("아니요"));
		contantPane.add(new JButton("일주일간 이 메시지 보지 않기"));
	}
}
