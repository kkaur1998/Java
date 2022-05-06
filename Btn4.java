import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;



public class Btn4
{
    public static void main(String... ar)
    {
    SwingUtilities.invokeLater(new Runnable() {
    public void run()
    {
    new A();
    }
});

}//Closing the main method
}//Closing the class A


class A 
{
    JFrame jf;

    JButton button1, button2, button3, button4;

    A()
    {
    jf= new JFrame();

    //Setting an image over a JButton and limited its border space, so that image fits perfectly over JButton.
    button1= new JButton(new ImageIcon("JButton1.jpg"));
    button1.setBorder(new EmptyBorder(2,2,2,2));

    //Setting an image over a JButton with and without text.
    button2 = new JButton(new ImageIcon("Smiley3.jpg"));
    button3 = new JButton("Smiley", new ImageIcon("Smiley3.jpg"));

    //Setting a big image over a JButton
    button4 = new JButton(new ImageIcon("Big Smiley", "BigSmiley.gif"));
    button4.setHorizontalTextPosition(SwingConstants.LEFT);	

    jf.add(button1);
    jf.add(button2);
    jf.add(button3);
    jf.add(button4);


    jf.setLayout(new FlowLayout());
    jf.setSize(300,300);
    jf.setVisible(true);
    }

}