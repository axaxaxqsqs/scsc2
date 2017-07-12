package day13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem5 extends JFrame {
	Container contentPane;
	
	Problem5(){
		setTitle("drawImage 사용 예제1");
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
			g.drawImage(img, 20, 20, this);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem5();
	}

}
