package day13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem2 extends JFrame {
	Container contentPane;
	
	Problem2(){
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(250, 200);
		setVisible(true);
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("자바는 재밌다.~~", 30, 30);
			g.drawString("얼마나? 하늘만큼 땅만큼 !!!!", 60, 60);
		}
	}
	public static void main(String[] args){
		new Problem2();
	}
}