import java.awt.*;

import javax.swing.JButton;
public class Gui1 
{
	public static void main(String[] args) 
	{
			Frame frame = new Frame("Multipel Buttons");
			frame.setLocation(200, 150);
			frame.setSize(400,400);
			frame.setLayout(new GridLayout(5,4));
//			frame.setLayout(null);
			JButton [] button = new JButton[20];
			for (int i = 0 ; i < button.length; i++) 
			{
					button[i] = new JButton("Button"+i);
					frame.add(button[i]);
			}
//			Button button1 = new Button("Button1") ;
//			Button button2 = new Button("Button2") ;
//			Button button3 = new Button("Button3") ;
//			Button button4 = new Button("Button4") ;
//			Button button5 = new Button("Button5") ;
//			Button button6 = new Button("Button6") ;
//			Button button7 = new Button("Button7") ;
//			Button button8 = new Button("Button8") ;
//			Button button9 = new Button("Button9") ;
//			Button button10 = new Button("Button10") ;
//			Button button11 = new Button("Button11") ;
//			Button button12 = new Button("Button12") ;
//			Button button13 = new Button("Button13") ;
//			Button button14 = new Button("Button14") ;
//			Button button15 = new Button("Button15") ;
//			Button button16 = new Button("Button16") ;
//			Button button17 = new Button("Button17") ;
//			Button button18 = new Button("Button18") ;
//			Button button19 = new Button("Button19") ;
//			Button button20 = new Button("Button20") ;
//			button1.setSize (100, 100);
//			button1.setLocation(0,0);
//			button1.setBounds(5, 30, 100, 100);
//			button2.setBounds(105, 30, 100, 100);
//			button3.setBounds(205, 30, 100, 100);
//			button4.setBounds(305, 30, 100, 100);
//			button5.setBounds(5, 130, 100, 100);
//			button6.setBounds(105, 130, 100, 100);
// 			button7.setBounds(205, 130, 100, 100);
//			button8.setBounds(305, 130, 100, 100);
//			button9.setBounds(5,230, 100, 100);
//			button10.setBounds(105,230, 100, 100);
//			button11.setBounds(205,230, 100, 100);
//			button12.setBounds(305,230, 100, 100);
//			button13.setBounds(5,330, 100, 100);
//			button14.setBounds(105,330, 100, 100);
//			button15.setBounds(205,330, 100, 100);
//			button16.setBounds(305,330, 100, 100);
//			button17.setBounds(5,430, 100, 100);
//			button18.setBounds(105,430, 100, 100);
//			button19.setBounds(205,430, 100, 100);
//			button20.setBounds(305,430, 100, 100);
//			frame. add(button1) ;
//			frame. add(button2) ;
//			frame. add(button3) ;
//			frame. add(button4) ;
//			frame. add(button5) ;
//			frame. add(button6) ;
//			frame. add(button7) ;
//			frame. add(button8) ;
//			frame. add(button9) ;
//			frame. add(button10) ;
//			frame. add(button11) ;
//			frame. add(button12) ;
//			frame. add(button13) ;
//			frame. add(button14) ;
//			frame. add(button15) ;
//			frame. add(button16) ;
//			frame. add(button17) ;
//			frame. add(button18) ;
//			frame. add(button19) ;
//			frame. add(button20) ;	
			frame.setVisible(true);
	}
}