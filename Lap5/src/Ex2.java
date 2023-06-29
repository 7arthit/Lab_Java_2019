import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex2 {
	public static void main(String[] args) {
		MathFream frame = new MathFream();
		frame.setVisible(true);
	}
}

@SuppressWarnings("serial")
class MathFream extends JFrame {
	JTextField Input = new JTextField();
	JTextArea Result = new JTextArea();
	JButton OK = new JButton("OK");

	public MathFream() {
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		add(Result, BorderLayout.NORTH);
		add(Input, BorderLayout.CENTER);
		add(OK, BorderLayout.SOUTH);
		OK.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				btnOKPressed(e);
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}

	private void btnOKPressed(MouseEvent e) {
		String input = Input.getText();
		int m = Integer.parseInt(input);
		try {
			Result.setText("");
			for (int i = 1; i <= 12; i++) {
				Result.append(m + " x " + i + " = " + (m * i) + "\n");
			}
		} catch (NumberFormatException ex) {
			Result.setText("Error");
		}
	}
}
