import java.awt.*;
import java.util.*;
public class Gui3 
{
	public static void main(String[] args) 
	{
		Frame frame = new Frame();
		frame.setTitle("Multiple Buttons");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(500,500);
		frame.setLayout (null);
		Button button[] = new Button[50];
		for (int i = 0; i < button.length; i++) 
		{
			button[i] = new Button(""+i);
			Random random = new Random();
			int x = random.nextInt(450);
			int y = random.nextInt(450);
			int r = random.nextInt(255);
			int g = random.nextInt(255);
			int b = random.nextInt(255);
			button[i].setBackground(new Color(r,g,b));
			button[i].setBounds(x,y,40,40);
			frame.add(button[i]);
		}
	}
}
