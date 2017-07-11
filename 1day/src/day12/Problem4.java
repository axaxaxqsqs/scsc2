package day12;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Problem4 extends JFrame {
	Container contentPane;
	JCheckBox[] fruits = new JCheckBox[3];
	String [] name = {"사과", "배", "체리"};
	JLabel sumLabel;
	int sum = 0;
	
	Problem4(){
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		setSize(250, 200);
		setVisible(true);
		
		contentPane.add(new JLabel("사과 100원, 배 500원, 체리 2000원"));
		
		for(int i = 0; i<fruits.length; i++){
			fruits[i] = new JCheckBox(name[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		sumLabel = new JLabel("현재 0원입니다.");
		contentPane.add(sumLabel);
	}
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			int selected = 1;
			
			if(e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else 
				selected = -1;
			
			if((e.getItem() == fruits[0]))
				sum = sum + selected*100;
			else if(e.getItem() == fruits[1])
				sum = sum + selected*500;
			else
				sum = sum + selected*2000;
			
			sumLabel.setText("현재 " + sum + "원입니다.");
		}
		
	}
	public static void main(String[] args){
		new Problem4();
	}
}
