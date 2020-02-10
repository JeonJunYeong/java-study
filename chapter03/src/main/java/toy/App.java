package toy;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class App extends JFrame {

	
	public static final Graphics Graphics = null;
	JLabel loc;
	
	App(){
		
		 loc=new JLabel("0");
		
		this.setSize(800,500);
		this.setLayout(null);
		
		this.addMouseListener(new myActionListener());
		
		loc.setBounds(700,400,50,50);
		this.add(loc);
		
	}
	
	public static void main(String[] args) {
		
		App app=new App();
		app.setVisible(true);
		app.setLocationRelativeTo(null);
	}
	
	public void paint(Graphics g)
	{
		if(!loc.getText().equals("0"))
		{
			String str=loc.getText();
			String[] arr=loc.getText().split(",");
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			g.fillOval(a, b, 10, 10);
		
		}
	}

	
	public class myActionListener implements MouseListener{


		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			loc.setText(arg0.getX()+","+arg0.getY());
			
		}
		
	}


}
