package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem3 extends JFrame {
	Container contentPane;
	
	Problem3(){
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(350, 450);
		setVisible(true);
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("I Love Java.~~~", 30, 30);
			
			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How Much?", 30, 60);
			
			g.setColor(new Color(0x00ff00ff));
			for(int i=0;i<=5;i++){
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*60);
			}
		}
	}
	public static void main(String[] args){
		new Problem3();
	}
}