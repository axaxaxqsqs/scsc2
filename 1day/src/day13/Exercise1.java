package day13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise1 extends JFrame {
	Container contentPane;
	ImageIcon icon = new ImageIcon("./images/LabelEx/night.jpg");
	Image img = icon.getImage();

	int x=0, y=0;
	Exercise1(){
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(img.getHeight(null), img.getHeight(null));
		setVisible(true);
		
		MyPanel panel = new MyPanel();
		panel.addKeyListener(new Mykeyadp());
		contentPane.add(panel, BorderLayout.CENTER);
		panel.requestFocus();
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setClip(x,y,x+100,y+100);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			repaint();

		}
	}
	class Mykeyadp extends KeyAdapter{
				public void keyPressed(KeyEvent e) {
					int keycode = e.getKeyCode();
					
					switch (keycode){
					case KeyEvent.VK_UP:
						if(y == 0)
							break;
						else if((y-100) < 0){
							y = 100- y;
						}else{
							y = y - 100;
						}
						break;
					case KeyEvent.VK_DOWN:
						if(y + 100 == img.getHeight(null))
							break;
						else if((y +100) > img.getHeight(null)){
							y = img.getHeight(null) - 100;
						}else{
							y = y + 100;
						}
						break;
					case KeyEvent.VK_LEFT:
						if(x == 0)
							break;
						else if(x-100 < 0){
							x = 100 - x;
						}
						else{
							x = x - 100;
						}
						break;
					case KeyEvent.VK_RIGHT:
						if(x+100 == img.getWidth(null))
							break;
						else if(x+100 > img.getWidth(null)){
							x = img.getWidth(null) - 100;
						}
						else{
							x = x + 100;
						}
						break;
						
					}
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise1();
	}

}