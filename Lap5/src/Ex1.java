import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setVisible(true);
	}
}

@SuppressWarnings("serial")
class Frame extends JFrame implements ActionListener {
	JTextField input = new JTextField("");
	JButton ok = new JButton("OK");

	public Frame() {
		setTitle("Hello Word!!!");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 1));
		add(input);
		add(ok);
		ok.addActionListener(this);
	}

	@Override // ที่ยังสร้างไม่เสร็จ
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == input) {
			//Show window = new Show();
			input.setText("Hello Word!!!");
		}
	}
}