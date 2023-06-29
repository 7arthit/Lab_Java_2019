import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class thread_ex2 extends JFrame implements ActionListener {

	JLabel lblTime = new JLabel();
	JButton startBtn, resetBtn;
	WatchThread wt;

	boolean started = false;

	public thread_ex2() {
		setSize(300, 220);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		lblTime.setText("00:00:00:000");
		lblTime.setFont(new Font("Verdana", Font.BOLD, 18));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(lblTime, BorderLayout.CENTER);

		JPanel sp = new JPanel();
		sp.setPreferredSize(new Dimension(0, 50));
		this.add(sp, BorderLayout.SOUTH);
		sp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 1));

		startBtn = new JButton("START");
		startBtn.setFocusable(false);
		startBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sp.add(startBtn);

		resetBtn = new JButton("RESET");
		resetBtn.setFocusable(false);
		resetBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sp.add(resetBtn);

		wt = new WatchThread(lblTime);
		wt.start();

		startBtn.addActionListener(this);
		resetBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startBtn) {
			if (started == false) {
				started = true;
				wt.setFlag(true);
				startBtn.setText("STOP");
			} else {
				stop();
				startBtn.setText("START");
				started = false;
			}
		}

		if (e.getSource() == resetBtn) {
			reset();
		}
	}

	private void stop() {
		wt.setFlag(false);

	}

	private void reset() {
		wt.setFlag(false);
		started = false;
		wt.first = 0;
		wt.ms = 0;
		wt.sec = 0;
		wt.min = 0;
		wt.hr = 0;
		lblTime.setText("00:00:00:000");
		startBtn.setText("START");
	}

	public static void main(String[] args) {
		thread_ex2 frame = new thread_ex2();
		frame.setVisible(true);
	}

}

class WatchThread extends Thread {
	private JLabel lbl;
	private boolean flag;
	public int first = 0;
	public int hr = 0;
	public int min = 0;
	public int sec = 0;
	public int ms = 0;

	public WatchThread(JLabel lbl) {
		this.lbl = lbl;
	}

	@Override
	public void run() {
		while (true) {
			if (isFlag()) {
				String msFm = String.format("%03d", ms);
				String secFm = String.format("%02d", sec);
				String minFm = String.format("%02d", min);
				String hrFm = String.format("%02d", hr);
				lbl.setText(hrFm + ":" + minFm + ":" + secFm + ":" + msFm);

				first++;
				if (first > 999) {
					first = 0;
					ms = 0;
					sec++;
				} else if (sec > 59) {
					sec = 0;
					min++;
				} else if (min > 59) {
					min = 0;
					hr++;
				} else {
				}
				ms = first;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
	}

	boolean isFlag() {
		return flag;
	}

	void setFlag(boolean flag) {
		this.flag = flag;
	}
}