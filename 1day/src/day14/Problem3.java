package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		super(text);
		setOpaque(true);
		
		Thread th = new Thread(this);
		
		th.start();
	}
	
	public void run(){
		int n;
		while(true){
			n = (int) (Math.random() * 5)+1;
			switch (n){
			case 1 : setBackground(Color.YELLOW); break;
			case 2 : setBackground(Color.RED); break;
			case 3 : setBackground(Color.BLUE); break;
			case 4 : setBackground(Color.GREEN); break;
			case 5 : setBackground(Color.MAGENTA); break;
			
			}
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				return;
			}
		}
	}
}

public class Problem3 extends JFrame  {
	Problem3(){
		setTitle("FlickeringLabelEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setSize(300, 150);
		setVisible(true);
		
		FlickeringLabel fLabel = new FlickeringLabel("±ô¹Ú");
		JLabel label = new JLabel("¾È±ô¹Ú");
		FlickeringLabel fLabel2 = new FlickeringLabel("¿©±âµµ ±ô¹Ú");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
	}
	public static void main(String[] args){
		new Problem3();
	}
}
