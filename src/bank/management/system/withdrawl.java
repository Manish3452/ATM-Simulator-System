
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class withdrawl extends JFrame implements ActionListener {
    
    JTextField amount; 
    JButton withdrawl, back;
    String pinNumber;
    
    

    withdrawl(String PinNumber) {
        
        this.pinNumber = PinNumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 810, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 750 );
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to withdrawl");
text.setFont(new Font("System", Font.BOLD, 16));
text.setForeground(Color.WHITE);
        text.setBounds(160, 250, 400, 20);
        image.add(text);
        
        amount = new JTextField();
       amount.setFont(new Font("Raleway", Font.BOLD, 16));
        amount.setBounds(160, 300, 300, 25);
        image.add(amount);
        
     withdrawl = new JButton("Withdraw");
       withdrawl.setBounds(340, 385, 140, 30);
       withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        
         back = new JButton("Back");
         back.setBounds(340, 420, 140, 30);
         back.addActionListener(this);
        image.add(back);
        
        
        setSize(850,820);
    getContentPane().setBackground(Color.WHITE);
    setLocation(300,0);
//        setUndecorated(true);
    setVisible(true);
         
    }
    
    public void  actionPerformed(ActionEvent ae) {
        
       if(ae.getSource() == withdrawl) {
        String money = amount.getText();
        Date date = new Date();
      
        if(money.equals("")){
            JOptionPane.showMessageDialog(null, "Please eneter the amount. you want to deposit");
        } else {
try {
        Conn conn = new Conn();
        String query = "insert into bank values('"+pinNumber+"','"+date+"','withdrawl','"+money+"')";
        conn.s.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "RS "+money+" withdrawl Successfully" );
        setVisible(false);
new Transaction(pinNumber).setVisible(true);        
        } catch(Exception e) {
                System.out.print(e);
                }
            } 
       } else if (ae.getSource() == back) {
        setVisible(false);
        new Transaction(pinNumber).setVisible(true);
     }
     
        
    }
    
    public static void main(String args[]) {
        new withdrawl(" ");
    }
}
