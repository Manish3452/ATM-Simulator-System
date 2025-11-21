package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton back;
    String pinNumber;
    
    BalanceEnquiry(String pinno){
        this.pinNumber = pinno;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 810, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 750);
        add(image);

         back = new JButton("Back");
         back.setBounds(340, 420, 140, 30);
         back.addActionListener(this);
        image.add(back);
        
        
          Conn c = new Conn();
          int balance = 0;
         try{
             ResultSet rs = c.s.executeQuery("Select* from bank where pin = '"+pinNumber+"'");
    
        while(rs.next()) {
            if (rs.getString("type").equals("deposit")) {
                   balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                      balance -= Integer.parseInt(rs.getString("amount"));
            }
   }
         }catch (Exception e) {
            System.out.println(e);
        }
        
        JLabel text = new JLabel("Your Current Account balance is Rs " + balance);
        text.setForeground(Color.WHITE);
        text.setBounds(170, 260, 400, 30);
        image.add(text);
        
        
        
setSize(850,820);
setLocation(300, 0);
setVisible(true);
//    setUndecorated(true);
getContentPane().setBackground(Color.WHITE);


    }
    
    public void actionPerformed (ActionEvent ae){
        
        setVisible(false);
        new Transaction(pinNumber).setVisible(true);
        
    }
   
    public static void main(String args[]) {
       new BalanceEnquiry("");
    }
}
