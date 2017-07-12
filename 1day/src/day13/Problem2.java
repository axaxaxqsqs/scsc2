package day13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem2 extends JFrame {
	Container contentPane;
	
	Problem2(){
		setTitle("drawString ��� ����");
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
			g.drawString("�ڹٴ� ��մ�.~~", 30, 30);
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ !!!!", 60, 60);
		}
	}
	public static void main(String[] args){
		new Problem2();
	}
}