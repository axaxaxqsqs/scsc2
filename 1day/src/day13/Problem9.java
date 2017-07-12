package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem9 extends JFrame {
	Container contentPane;
	
	Problem9(){
		setTitle("Drawing Line by Mouse ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(300, 300);
		setVisible(true);
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}
	class MyPanel extends JPanel{
		Vector<Point> vStart = new Vector<Point>();
		Vector<Point> vEnd = new Vector<Point>();
		
		MyPanel(){
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e){
					Point endP = e.getPoint();
					vEnd.add(endP);
					
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i=0;i<vStart.size();i++){
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem9();
	}

}