package day12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import day12.Problem2.MyMouseListener;

public class Exercise1 extends JFrame {

	Container contentPane;
	JPanel panel = new JPanel();
	
	Exercise1(){
		setTitle("미래의 애린과 통화할 수 있는 전화기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		setSize(400, 600);
		setVisible(true);
		
		contentPane.add(panel, BorderLayout.CENTER);
		
		panel.setLayout(new GridLayout(4, 3));
		
		for(int i=1;i<10;i++){
			addFunction("" + i, new JButton());
		}
		addFunction("star", new JButton());
		addFunction("0", new JButton());
		addFunction("#", new JButton());
		
		ImageIcon normalIcon = new ImageIcon("./images/LabelEx/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("./images/LabelEx/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("./images/LabelEx/pressedIcon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.addMouseListener(new MyMouseListener());
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		contentPane.add(btn, BorderLayout.SOUTH);
	}
	private void addFunction(String iconNumber, JButton button) {
		// TODO Auto-generated method stub
		ImageIcon tempIcon = new ImageIcon("./images/LabelEx/" + iconNumber + ".jpg");
		button.setIcon(tempIcon);
		button.setText(iconNumber);
		button.setForeground(Color.WHITE);
		button.addActionListener(new ButtonActionListener());
		panel.add(button);
	}
	class ButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			
			if(b.getText().equals("0")){
				System.out.println("0");
			} else if(b.getText().equals("1")){
				System.out.println("1");
			} else if(b.getText().equals("2")){
					System.out.println("2");
			} else if(b.getText().equals("3")){
				System.out.println("3");
			} else if(b.getText().equals("4")){
					System.out.println("4");
			} else if(b.getText().equals("5")){
				System.out.println("5");
			} else if(b.getText().equals("6")){
					System.out.println("6");
			} else if(b.getText().equals("7")){
				System.out.println("7");
			} else if(b.getText().equals("8")){
					System.out.println("8");
			} else if(b.getText().equals("9")){
				System.out.println("9");
			} else if(b.getText().equals("#")){
					System.out.println("#");
			} else if(b.getText().equals("star")) {
					System.out.println("*");
			} else {
			}
		}
		
	}
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			System.out.println("\n My Daring : 여보세요?");
		}
		public void mouseEntered(MouseEvent e){
			JButton p = (JButton) e.getSource();
			p.setText("이번에는 걸릴 것만 같아");
		}
		public void mouseExited(MouseEvent e){
			JButton p = (JButton) e.getSource();
			p.setText("");
		}
	}
	public static void main(String[] args) {
		new Exercise1();
	}

}
