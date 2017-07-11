package day12;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem3 extends JFrame {
	Container contentPane;
	Problem3(){
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		setSize(250, 100);
		setVisible(true);
		
		ImageIcon normalIcon = new ImageIcon("./images/LabelEx/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("./images/LabelEx/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("./images/LabelEx/pressedIcon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		contentPane.add(btn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem3();
	}

}
