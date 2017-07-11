package day12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Problem5 extends JFrame {
	Container contentPane;
	JRadioButton [] radio = new JRadioButton[4];
	String [] text = {"효린", "소유", "다솜", "보라"};
	ImageIcon [] image = {
			new ImageIcon("./images/LabelEx/hyorin.jpg"),
			new ImageIcon("./images/LabelEx/soyou.jpg"),
			new ImageIcon("./images/LabelEx/dasom.jpg"),
			new ImageIcon("./images/LabelEx/bora.jpg")
	};
	
	JLabel imageLabel = new JLabel();
	
	Problem5(){
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		setSize(550, 500);
		setVisible(true);
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i = 0; i<radio.length; i++){
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[1].setSelected(true);
		contentPane.add(radioPanel, BorderLayout.NORTH);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else if(radio[2].isSelected())
				imageLabel.setIcon(image[2]);
			else
				imageLabel.setIcon(image[3]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem5();
	}

}
