
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date ;

public class FastCash extends JFrame implements ActionListener{
    
      JButton deposit, withdrawl, fastCash, miniStatement, balanceEnquiry, pinChange, exit;
      String  pinNumber;
     
      
FastCash(String pinNo){
    this.pinNumber = pinNo;
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(850, 810,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 850, 750);
    add(image);
    
    JLabel l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
    l1.setBounds(200, 250, 400, 30);
    l1.setForeground(Color.WHITE);
    l1.setFont(new Font("System", Font.BOLD, 16 ));
  image.add(l1);
  
 deposit = new JButton("RS 100");
  deposit.setBounds(170, 300, 130, 30);
 deposit.addActionListener(this);
  image.add(deposit);
  
   withdrawl = new JButton("RS 500");
  withdrawl.setBounds(330, 300, 130, 30);
  withdrawl.addActionListener(this);
  image.add(withdrawl);
  
 fastCash = new JButton("RS 1000");
 fastCash.setBounds(170, 340, 130, 30);
 fastCash.addActionListener(this);
 image.add(fastCash);
  
 miniStatement = new JButton("RS 2000");
 miniStatement.setBounds(330, 340, 130, 30);
 miniStatement.addActionListener(this);
 image.add(miniStatement);
  
       balanceEnquiry = new JButton("RS 5000");
  balanceEnquiry.setBounds(170, 380, 130, 30);
balanceEnquiry.addActionListener(this);
  image.add(balanceEnquiry);
   
  pinChange = new JButton("RS 10000");
  pinChange.setBounds(330, 380, 130, 30);
  pinChange.addActionListener(this);
  image.add(pinChange);

  
 exit = new JButton("BACK");
exit.setBounds(330, 420, 130, 30);
exit.addActionListener(this);
image.add(exit);

  
  
    setSize(850,820);
    getContentPane().setBackground(Color.WHITE);
    setLocation(300,0);
//    setUndecorated(true);
    setVisible(true);
}

 public void actionPerformed(ActionEvent ae){
     if (ae.getSource() == exit) {  //back
      setVisible(false);
         new Transaction(pinNumber).setVisible(true);
     } else {
         String amount = ((JButton)ae.getSource()).getText().substring(3); //RS 500
         Conn c = new Conn();
         try{
             ResultSet rs = c.s.executeQuery("Select* from bank where pin = '"+pinNumber+"'");
    int balance = 0;
        while(rs.next()) {
            if (rs.getString("type").equals("deposit")) {
                   balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                      balance -= Integer.parseInt(rs.getString("amount"));
            }
   }
        if(ae.getSource() != exit && balance < Integer.parseInt(amount)) {
            JOptionPane.showMessageDialog(null, "Insufficient Balance");
            return;
        }
        Date date = new Date();
        String query = ("insert into bank values('"+pinNumber+"', '"+date+"', 'withdrawl', '"+amount+"')");
          c.s.executeUpdate(query);
          JOptionPane.showMessageDialog(null, "Rs. "+ amount +" Debited Successfully");
        
          setVisible(false);
          new Transaction(pinNumber).setVisible(true);
          
          
     } catch (Exception e) {
         System.out.println(e);
     }
      
  }
    
 }
 public static void main(String args[]) {
     new FastCash("");
    }
}

