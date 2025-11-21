
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    
      JButton deposit, withdrawl, fastCash, miniStatement, balanceEnquiry, pinChange, exit;
      String  pinNumber;
      
Transaction(String pinNo){
    this.pinNumber = pinNo;
   
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(850, 810,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 850, 750);
    add(image);
    
    JLabel l1 = new JLabel("Please select your Transaction");
    l1.setBounds(200, 250, 400, 30);
    l1.setForeground(Color.WHITE);
    l1.setFont(new Font("System", Font.BOLD, 16 ));
  image.add(l1);
  
 deposit = new JButton("Deposit");
  deposit.setBounds(170, 300, 130, 30);
 deposit.addActionListener(this);
  image.add(deposit);
  
   withdrawl = new JButton("Cash Withdraw");
  withdrawl.setBounds(330, 300, 130, 30);
  withdrawl.addActionListener(this);
  image.add(withdrawl);
  
 fastCash = new JButton("Fast Cash");
 fastCash.setBounds(170, 340, 130, 30);
 fastCash.addActionListener(this);
 image.add(fastCash);
  
 miniStatement = new JButton("Mini Statement");
 miniStatement.setBounds(330, 340, 130, 30);
 miniStatement.addActionListener(this);
 image.add(miniStatement);
  
       balanceEnquiry = new JButton("Balance Enquiry");
  balanceEnquiry.setBounds(170, 380, 130, 30);
balanceEnquiry.addActionListener(this);
  image.add(balanceEnquiry);
   
  pinChange = new JButton("Pin Change");
  pinChange.setBounds(330, 380, 130, 30);
  pinChange.addActionListener(this);
  image.add(pinChange);

  
 exit = new JButton("Exit");
exit.setBounds(330, 420, 130, 30);
exit.addActionListener(this);
image.add(exit);

  
 
    setSize(850,820);
    getContentPane().setBackground(Color.WHITE);
    setLocation(300,0);
    setUndecorated(true);
    setVisible(true);
}

 public void actionPerformed(ActionEvent ae){
     if (ae.getSource() == exit) {
         System.exit(0);
     } else if (ae.getSource() == deposit) {
         setVisible(false);
         new Deposit(pinNumber).setVisible(true);
     } else if (ae.getSource() == withdrawl) {
         setVisible(false);
         new withdrawl(pinNumber).setVisible(true);
     }
     else if (ae.getSource() == fastCash) {
         setVisible(false);
         new FastCash(pinNumber).setVisible(true);
     } else if (ae.getSource()== pinChange) {
         setVisible(false);
         new Pin(pinNumber).setVisible(true);
        
     } else if (ae.getSource()== balanceEnquiry) {
         setVisible(false);
         new BalanceEnquiry(pinNumber).setVisible(true);
     } else if (ae.getSource()== miniStatement) {
        
         new MiniStatement(pinNumber).setVisible(true);
     }

     
      
      
  }
    
    public static void main(String args[]) {
     new Transaction("");
    }
}
