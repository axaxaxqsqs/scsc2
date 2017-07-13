package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class RandomThread2 extends Thread {
	JPanel p1, p2;
	int fin = 5;
	int fin2 = 20;
	public RandomThread2(JPanel p1, JPanel p2){
		this.p1 = p1; this.p2 = p2;
	}
	public void run(){
		int cnt = 0;
		int cnt2 = 0;
		while(true){
			int x1 = ((int)(Math.random()*p1.getWidth()));
			int y1 = ((int)(Math.random()*p1.getHeight()));
			JLabel label1 = new JLabel("Java");
			label1.setSize(80, 30);
			label1.setLocation(x1, y1);
			p1.add(label1);
			p1.repaint();
			
			int x2 = ((int)(Math.random()*p2.getWidth()));
			int y2 = ((int)(Math.random()*p2.getHeight()));
			JLabel label2 = new JLabel("Programming");
			label2.setSize(80, 30);
			label2.setLocation(x2, y2);
			p2.add(label2);
			p2.repaint();
			
			cnt++;
			cnt2++;
			try{
				Thread.sleep(200);
				if(fin <= cnt){
					p1.removeAll();
					label1 = new JLabel("finish");
					label1.setSize(80, 30);
					label1.setLocation(100, 100);
					label1.setForeground(Color.RED);
					p1.add(label1);
					p1.repaint();
					return;
				}else if(fin2 == cnt2){
					p2.removeAll();
					label2 = new JLabel("finish");
					label2.setSize(80, 30);
					label2.setLocation(100, 100);
					label2.setForeground(Color.RED);
					p2.add(label2);
					p2.repaint();
					return;
				}
			}catch(InterruptedException e){
				return;
			}
		}
	}
}

public class Exercise1 extends JFrame {
	RandomThread2 th;
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	Exercise1() {
		setTitle("Exercise1 ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 2));
		setSize(300, 200);
		setVisible(true);
		
		c.add(p1);
		c.add(p2);
		
		th = new RandomThread2(p1, p2);
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise1();
	}

}
