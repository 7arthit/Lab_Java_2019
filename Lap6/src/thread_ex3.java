import java.awt.Color;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class thread_ex3 {
	public static void main(String[] args) {
		letter lt = new letter();
		lt.setVisible(true);
	}
}

@SuppressWarnings("serial")
class letter extends JFrame {
	Icon xIcon3 = new ImageIcon(this.getClass().getResource("runner.png"));
	Icon xIcon2 = new ImageIcon(this.getClass().getResource("finish.png"));
	JLabel Label_linefinnish = new JLabel(xIcon2);
	JLabel[] lbs = new JLabel[20];
	JButton btn = new JButton("Start / Stop");
	letters[] let = new letters[20];
	int number = 20;
	int x[] = new int[number];
	int y[] = new int[number];
	
	public letter() {
		setSize(500, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.BLACK);
		for (int i = 0; i < lbs.length; i++) {
			
			x[i] = new Random().nextInt(450) - 140;
			y[i] = new Random().nextInt(10) + 520;
			
			lbs[i] = new JLabel(xIcon3);
			
			lbs[i].setSize(300, 300);
			lbs[i].setLocation(x[i] , y[i]);
			add(lbs[i]);
			
			Label_linefinnish.setBounds(0, 50, 485, 300);
			getContentPane().add(Label_linefinnish);
			
			btn.setBounds(175, 0, 150, 30);
			
			let[i] = new letters(lbs[i]);
			let[i].setTime(new Random().nextInt(100) + 20);
			let[i].start();
		}
	}
}

class letters extends Thread {
	JLabel lb;
	private int time = 0;
	private boolean flag = true;

	public letters(JLabel lb) {
		this.lb = lb;
	}

	public void run() {
		while (true) {
			if (flag) {
				lb.setLocation(lb.getX(), lb.getY() - 1);
				if (lb.getY() < 200) {
					this.time = new Random().nextInt(300) + 20;
					lb.setLocation(lb.getX(), 10);
				}
			}
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
			}
		}

	}

	int getTime() {
		return time;
	}

	void setTime(int time) {
		this.time = time;
	}

	boolean isFlag() {
		return flag;
	}

	void setFlag(boolean flag) {
		this.flag = flag;
	}
}
