package day11;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Problem7 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la;

	Problem7() {
		setTitle("MouseListener¿Í MouseMotionListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseAdapter());
		contentPane.addMouseMotionListener(new MyMouseAdapter());

		la = new JLabel("no Mouse Event");
		contentPane.add(la);

	}

	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			la.setText("MousePressed (" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseReleased(MouseEvent e){
			la.setText("MouseReleased (" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseClicked(MouseEvent e){}
		public void mouseExited(MouseEvent e){
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e){
			la.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseMoved(MouseEvent e){
			la.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
		}
	}

	public static void main(String[] args) {
		new Problem7();

	}
}
