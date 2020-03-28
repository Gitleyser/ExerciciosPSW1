package leyser1;
import java.awt.Graphics;

import javax.swing.Box.Filler;
import javax.swing.JFrame;

public class Desenhar extends JFrame {
	
	public Desenhar(){
		setSize(1200,900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		}

		public void paint(Graphics c){
		c.drawOval(420, 120, 260, 260);
		//c.fillOval(720, 460, 360, 360 );

		}

	public static void main(String[] args) {
		new Desenhar();

	}

}
