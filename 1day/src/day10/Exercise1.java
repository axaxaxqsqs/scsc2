package day10;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercise1 extends JFrame {
	Exercise1() {

		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 150);
		setVisible(true);
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(1,10));
		
		//ArrayList<JButton> buttonList = new ArrayList<JButton>();
		//buttonList.add(new JButton(""+i));
		//c.add(buttonList.get(i)); 이런식으로 배열 정리 가능
		for(int i=0;i<10;i++){
			JButton button = new JButton(""+i);
			button.setSize(60, 150);
			switch(i){
			case 0 : 
				button.setBackground(Color.RED);
				break;
			case 1 : 
				button.setBackground(Color.ORANGE);
				break;
			case 2 : 
				button.setBackground(Color.YELLOW);
				break;
			case 3 : 
				button.setBackground(Color.GREEN);
				break;
			case 4 : 
				button.setBackground(Color.CYAN);
				break;
			case 5 : 
				button.setBackground(Color.BLUE);
				break;
			case 6 : 
				button.setBackground(Color.MAGENTA);
				break;
			case 7 : 
				button.setBackground(Color.DARK_GRAY);
				break;
			case 8 : 
				button.setBackground(Color.PINK);
				break;
			case 9 : 
				button.setBackground(Color.GRAY);
				break;
			}
			cp.add(button);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise1();

	}

}