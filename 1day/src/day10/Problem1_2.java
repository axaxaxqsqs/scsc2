package day10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem1_2 extends JFrame {
	Problem1_2() {

		setTitle("ȸ�������� �ʿ��� ������ �Դϴ�. ȸ������ �Ͻðڽ��ϱ�?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 150);
		setVisible(true);
		
		Container contantPane = getContentPane();
		contantPane.setBackground(Color.BLUE);
		contantPane.setLayout(new FlowLayout());
		contantPane.add(new JButton("��"));
		contantPane.add(new JButton("�ƴϿ�"));
		contantPane.add(new JButton("�����ϰ� �� �޽��� ���� �ʱ�"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem1_2();
		new Problem1_3();
	}

}
