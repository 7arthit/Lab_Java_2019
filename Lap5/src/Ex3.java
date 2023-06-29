import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex3 {
	public static void main(String[] args) {
		ColerFream frame = new ColerFream();
		frame.setVisible(true);
	}
}

@SuppressWarnings("serial")
class ColerFream extends JFrame {
	JTextField show = new JTextField();
	JPanel pncolor = new JPanel();

	public ColerFream() {
		setSize(512, 512);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		add(show, BorderLayout.NORTH);
		add(pncolor, BorderLayout.CENTER);
		pncolor.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				colorMouseMoved(e);
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
	}

	private void colorMouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		int r = x / 2;
		int g = y / 2;
		int b = (x + y) / 4;
		Color color = new Color(r, g, b);
		show.setText("x=" + x + " y=" + y + " Color=(" + "r=" + r + ",g=" + g + ",b=" + b + ")");
		pncolor.setBackground(color);
	}

}