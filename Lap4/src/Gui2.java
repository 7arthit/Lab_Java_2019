import java.awt.*;
public class Gui2 
{
	public static void main(String[] args) 
	{
		Frame frame = new Frame("Multipel Buttons");
		frame.setLocationRelativeTo(null);
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(8,5));
		Button button[] = new Button[20];
		TextArea textAreas[] = new TextArea [20];
		for (int i = 0 ; i < button.length ; i++) 
		{
				button[i] = new Button("Button"+(i+1));
				textAreas[i] = new TextArea("",10,10,TextArea.SCROLLBARS_NONE);
				frame.add(button[i]);
				frame.add(textAreas[i]);
		}
		frame.setVisible(true);
	}
}