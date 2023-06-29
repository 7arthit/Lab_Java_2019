import java.awt.*;
public class Gui4 
{
	public static void main(String[] args) 
	{
		Frame frame = new Frame();
		frame.setTitle("Multiple Buttons");
		frame.setLocationRelativeTo(null);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		
		TextArea center = new TextArea("",100,100,TextArea.SCROLLBARS_NONE);
		Panel panel = new Panel();
		Panel west = new Panel();
		Panel east = new Panel();
		Button Open = new Button("Open File");
		Button Save = new Button("Save File");
		Button clear = new Button("Clear Screen");
		
		panel.add(Open);
		panel.add(Save);
		panel.add(clear);

		panel.setLayout(new FlowLayout());
		west.setPreferredSize(new Dimension(50,500));
		east.setPreferredSize(new Dimension(50,500));
		
		frame.add(center,BorderLayout.CENTER );
		frame.add(east,BorderLayout.EAST);
		frame.add(west,BorderLayout.WEST);
		frame.add(panel,BorderLayout.SOUTH);
		frame.setVisible(true);
	}
}