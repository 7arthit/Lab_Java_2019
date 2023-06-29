import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class thread_ex1 {
	public static void main(String[] args) {
		random rdcoler = new random();
		rdcoler.setVisible(true);
	}
}

@SuppressWarnings("serial")
class random extends JFrame {
	JLabel[] lb = new JLabel[4];

	public random() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 2));
		for (int i = 0; i < lb.length; i++) {
			lb[i] = new JLabel();
			if (i == 0) {
				lb[i].setText("              Change Coler in 5 sec");
				threads t = new threads(lb[i], 5);
				t.start();
			} else if (i == 1) {
				lb[i].setText("              Change Coler in 10 sec");
				threads t = new threads(lb[i], 10);
				t.start();
			} else if (i == 2) {
				int rd = new Random().nextInt(5);
				lb[i].setText("              Change Coler in " + rd + " sec");
				threads t = new threads(lb[i], rd);
				t.start();
			} else if (i == 3) {
				int rd = new Random().nextInt(5 + 5);
				lb[i].setText("              Change Coler in " + rd + " sec");
				threads t = new threads(lb[i], rd);
				t.start();
			}
			add(lb[i]);
		}
	}
}

class threads extends Thread {
	JLabel lbs;
	int time = 0;

	public threads(JLabel lbs, int time) {
		this.lbs = lbs;
		this.time = time;
	}

	public void run() {
		while (true) {
			Color coler = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
			lbs.setForeground(coler);
			try {
				Thread.sleep(time * 1000);
			} catch (InterruptedException e) {
			}
		}
	}
}