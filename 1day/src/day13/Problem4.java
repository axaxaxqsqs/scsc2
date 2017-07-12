package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem4 extends JFrame {
	Container contentPane;
	
	Problem4(){
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(100, 500);
		setVisible(true);
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(30, 10, 50, 50);
			
			g.setColor(Color.BLUE);
			g.fillOval(30, 70, 50, 50);
			
			g.setColor(Color.GREEN);
			g.fillRoundRect(30, 130, 50, 50, 20, 20);
			
			g.setColor(Color.MAGENTA);
			g.fillArc(30, 190, 50, 50, 0, 270);
			
			g.setColor(Color.ORANGE);
			int x [] = {30, 10, 30, 60};
			int y [] = {250, 275, 300, 275};
			g.fillPolygon(x, y, 4);
			
			g.setColor(Color.RED);
			g.fillArc(30, 320, 80, 80, 90, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(30, 320, 80, 80, -30, 120);
			g.setColor(Color.BLUE);
			g.fillArc(30, 320, 80, 80, 210, 120);
			}
		}
	public static void main(String[] args){
		new Problem4();
	}
}