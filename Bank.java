import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bank extends JFrame
{
   
   JPanel con = new JPanel();   
 
   
	public Bank()
	{
      
	   setResizable(false);
      con.setLayout(new BorderLayout());
      setMENU();
      setBUTTONS();
	}
   
   public void setMENU()
   {
      String menuContent[] = {"About", "Developer", "Help"};
      JMenuBar mainBar = new JMenuBar();
      JMenu menu[] = new JMenu[3];
      
      setJMenuBar(mainBar);

      for(int i = 0; i<menuContent.length; i++)
      {
         mainBar.add(menu[i] = new JMenu(menuContent[i]), BorderLayout.NORTH);
      }            
         
      JTextField field = new JTextField();
      field.setPreferredSize(new Dimension(100,100));
      con.add(field, BorderLayout.NORTH);
   }

   public void setBUTTONS()
   {
      JPanel buttonsPanel = new JPanel();
      buttonsPanel.setLayout(new GridLayout(3, 3));
      
      JButton pad[] = new JButton[10];
      String setPadText[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
      
      for(int i = 0; i<pad.length; i++)
      {  
        buttonsPanel.add(pad[i] = new JButton(setPadText[i]));
        //pad[i].setPreferredSize(new Dimension(5,5));
         
      }
      
         con.add(buttonsPanel, BorderLayout.CENTER);
         setContentPane(con);
   }
   

}