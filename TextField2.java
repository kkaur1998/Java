import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TextField2
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


class A //implements ActionListener
{

    JButton button;
    JLabel label1, label2, label3, label4, label5;
    JTextField field1, field2, field3, field4, field5;
    String str ="";
    JFrame jf;

    A()
    {
        jf = new JFrame("Hello");
        jf.setSize(440,150);

        label1= new JLabel("First Textfield");
        label2= new JLabel("Second Textfield ");
        label3= new JLabel("Third TextField");
        label4= new JLabel("Fourth TextField");
        label5= new JLabel("Fifth TextField");


        field1 = new JTextField();			     //calling TextField() constructor
        field2 = new JTextField("World peace is important"); //calling TextField(String) Constructor
        field3 = new JTextField(5);			     //calling TextField(int) constructor
        field4 = new JTextField("Smile and spread it",15);   //calling TextField(String, int) constructor

        //Setting the font color to blue, in a JTextField
        field2.setForeground(Color.BLUE);		   

        field4.setEditable(false); 			     //Making a text field uneditable
        field4.setFont(new Font("Serif", Font.BOLD, 10));    //Setting a font style in a TextField

        jf.setLayout(new FlowLayout());
        jf.add(label1);
        jf.add(field1);
        jf.add(label2);
        jf.add(field2);
        jf.add(label3);
        jf.add(field3);
        jf.add(label4);
        jf.add(field4);


        //button.addActionListener(this);

        jf.setVisible(true);
    }

}