package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread {
	Container contentPane;
	boolean flag = false;
	
	public RandomThread(Container contentPane){
		this.contentPane = contentPane;
	}
	void finish(){
		flag = true;
	}
	public void run(){
		while(true){
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try{
				Thread.sleep(300);
				if(flag == true){
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			}catch(InterruptedException e){
				return;
			}
		}
	}
}

public class Problem6 extends JFrame {
	RandomThread th;
	Problem6() {
		setTitle("ThreadFinishFlagEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		setSize(300, 200);
		setVisible(true);

		c.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				th.finish();
			}
		});
		
		th = new RandomThread(c);
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem6();
	}

}