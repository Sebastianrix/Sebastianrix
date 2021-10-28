import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class BorderPanel {
 JFrame frame;
 JButton button;
 JLabel label;


public BorderPanel()
{

 int x = 10;
boolean right = true;
   frame = new JFrame (" Det bedste program i verden");
  button = new JButton("23123213");
   label = new JLabel ("Please be moving "+x);  
   frame.setLayout(null);
   frame.getContentPane().setBackground(Color.red);
   frame.add(button);
   frame.add(label);
  button.setBounds(50,100,305,100);
  
       frame.setVisible(true);



   frame.setSize(500,400);  
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
  while(true){
   //System.out.println("im working");
try{
   TimeUnit.MILLISECONDS.sleep(100);
 System.out.println(x);
   if(right){ 
      x++;
      if(x>400){
         right = !right;


      }
   }
    if(!right){ 
      x--;
      if(x==0){
         right = !right;


      }
   }
   
   
       label.setText("I am the Player");
       
  
       label.setBounds(x,50,205,500);
       label.setVisible(false); 
       label.setVisible(true);
  frame.repaint();
  } catch (Exception e){}

}




}



public static void main(String[] args) 
{
new BorderPanel();




 }


   
}