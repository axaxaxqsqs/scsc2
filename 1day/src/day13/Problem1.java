package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem1 extends JFrame {
	Container contentPane;
	
	Problem1(){
		setTitle("JPanel paintComponent ¿¹Á¦");
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
			
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.drawRect(90, 90, 50, 50);
			g.drawLine(10, 10, 60, 60);
		}
	}
	public static void main(String[] args){
		new Problem1();
	}
}
