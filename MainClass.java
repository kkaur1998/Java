import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GSTCalc extends JFrame implements ActionListener
{
JPanel jp,jp2;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField t1,t2,t3,t4,t5,t6;
JButton b1,b2;
public void createWindow()
{
setSize(700,700);
setTitle("GST CalC");
getContentPane().setBackground(Color.WHITE);
jp=new JPanel();

jp2=new JPanel();

l1=new JLabel("GST CALCULATOR");
jp.setBounds(0,0,700,40);
l1.setBounds(248,27,50,80);

jp.setBackground(Color.BLUE);
l1.setForeground(Color.WHITE);
jp.add(l1);

add(jp);
l2=new JLabel("Item");
l2.setBounds(143,50,50,80);

l3=new JLabel("Quantity");
l3.setBounds(339,50,50,80);

l4=new JLabel("Price");
l4.setBounds(532,50,50,80);
add(l2);add(l3);add(l4);

t1=new JTextField("LAPTOP");
t2=new JTextField();
t3=new JTextField("35000");
t4=new JTextField();
t5=new JTextField();
t6=new JTextField();

t1.setBounds(144,100,120,30);
add(t1);
t2.setBounds(339,100,120,30);
add(t2);
t3.setBounds(532,100,120,30);
add(t3);

l5=new JLabel("Total Price:");
l5.setBounds(143,150,150,30);
add(l5);
t4.setBounds(532,150,120,30);
add(t4);

l5=new JLabel("GST 5%");
l5.setBounds(143,200,80,30);
add(l5);

l6=new JLabel("CGST 2.5%");
l6.setBounds(143,250,80,30);
add(l6);
l7=new JLabel("SGST 2.5%");
l7.setBounds(143,280,80,30);
add(l7);
t5.setBounds(339,250,120,30);
add(t5);
t6.setBounds(339,280,120,30);
add(t6);
b1=new JButton("CALCULATE");
b1.setBounds(143,320,120,30);
add(b1);
    jp2.setBackground(Color.BLUE);
    jp2.setBounds(143,370,300,120);
    add(jp2);
    l8=new JLabel("Your gross price will be:");
    l8.setBounds(0,0,120,30);
    l8.setForeground(Color.WHITE);
    jp2.add(l8);
    b1.addActionListener(this);

    l9=new JLabel();
    l9.setBounds(30,0,120,30);
    l9.setForeground(Color.WHITE);
    l9.setFont(new Font("Arial", Font.BOLD, 24));
    jp2.add(l9);
    setLayout(null);
    setResizable(false);
    setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
    int quantity=Integer.parseInt(t2.getText());
    double price=35000;
    double TotalPrice=price*quantity;

    double cgstamount=TotalPrice*0.025;
    double sgstamount=TotalPrice*0.025;
    double finalPrice=TotalPrice-(cgstamount);
    t4.setText(String.valueOf(TotalPrice));
    t5.setText(String.valueOf(cgstamount));
    t6.setText(String.valueOf(sgstamount));

    l9.setText(String.valueOf(finalPrice));

}

}
class MainClass
{

    public static void main(String []args)
    {
    GSTCalc calc=new GSTCalc();
        calc.createWindow();
    }

}