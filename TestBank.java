import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestBank
{
 public static void main(String[] args)
	{
	
		JFrame.setDefaultLookAndFeelDecorated(true);

	
		Bank x = new Bank();
		x.setVisible(true);
		x.setBounds(450,200,500,500);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}