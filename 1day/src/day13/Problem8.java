package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem8 extends JFrame {
	Container contentPane;
	
	Problem8(){
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(300, 400);
		setVisible(true);
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("./images/LabelEx/image0.jpg");
		Image img = icon.getImage();
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setClip(100,20,150,150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go~~ Gator!!", 10, 150);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem8();
	}

}