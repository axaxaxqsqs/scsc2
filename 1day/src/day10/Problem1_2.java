package day10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem1_2 extends JFrame {
	Problem1_2() {

		setTitle("회원가입이 필요한 페이지 입니다. 회원가입 하시겠습니까?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 150);
		setVisible(true);
		
		Container contantPane = getContentPane();
		contantPane.setBackground(Color.BLUE);
		contantPane.setLayout(new FlowLayout());
		contantPane.add(new JButton("예"));
		contantPane.add(new JButton("아니요"));
		contantPane.add(new JButton("일주일간 이 메시지 보지 않기"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem1_2();
		new Problem1_3();
	}

}
