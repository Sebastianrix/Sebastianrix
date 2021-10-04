    //We import the option panels and scanner tools

    import javax.swing.JOptionPane;
    import java.util.Scanner;


    public class NumberAnalyzer { 
      public static void main(String[] args) {

    /*Here we make the panel, ask for a number,
    and take an input which is a string
    */
    String s1 = JOptionPane.showInputDialog("Input a number");

    /*Here we make the string an int called value*/

    int value = Integer.parseInt(s1);

    /* We make two string's which's is gonna change phrease
    based on some mathematical critia we make */

    String Part1 = null;
    String Part2 = null;

     if (value % 2 == 0 ){Part2 = "even";}else
        Part2 = "odd";
     if (value == 0)     {Part1 =     "zero";} else
     if (value <  0)     {Part1 = "negative";} else
     if (value >  0)     {Part1 =  "positiv";}


    // At the end, we show a dialog pannel with the two strings,
     if (value == value){
    JOptionPane.showMessageDialog(null,"Your number is "+ Part2+" and "+Part1);
    }
    }
    }