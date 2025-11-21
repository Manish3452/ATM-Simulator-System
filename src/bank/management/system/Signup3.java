package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener  {
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton b1, b2;
     String formno;  
  

    Signup3(String formno) {
     
        this.formno = formno;
      
      //Labels
    
     
      JLabel l1 = new JLabel("Page 3: Account Details");
       JLabel l2 = new JLabel("Account Type");
        JLabel l3 = new JLabel("Card Number");
           JLabel cno = new JLabel("XXXX-XXXX-XXXX-4184");
           cno.setBounds(330, 300, 300, 30);
           cno.setFont(new Font("Raleway", Font.BOLD, 18));
           
         JLabel l4 = new JLabel("Your 16 Digit Card Number");
                
                 
          JLabel l5 = new JLabel("PIN:");
          
               JLabel pno = new JLabel("XXXX");
                 pno.setBounds(330, 370, 300, 30);
                 pno.setFont(new Font("Raleway", Font.BOLD, 18));
          
           JLabel l6 = new JLabel("Your 4 Digit Password"); 
            JLabel l7 = new JLabel("Service Required:");
            
      
     //Radio Buttons
      r1 = new JRadioButton("Saving Account");
       r2 = new JRadioButton("Fixed Deposit Account");
        r3 = new JRadioButton("Current Account");
         r4 = new JRadioButton("Recurring Deposit Account");
         
  c1 = new JCheckBox("ATM CARD");
   c2 = new JCheckBox("Internet Banking");
    c3 = new JCheckBox("Mobile Banking");
     c4 = new JCheckBox("EMAIL&SMS Alerts");
      c5 = new JCheckBox("Cheque Book");
       c6 = new JCheckBox("E-Statement");
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of knowledge");
                 
     //Buttons           
      b1 = new JButton("Submit");
       b1.addActionListener(this);
      
       b2 = new JButton("Cancel");
        b2.addActionListener(this);
       
    //Set Style
   setLayout(null);
    l1.setBounds(280, 40, 400, 40);
     l2.setBounds(100, 140, 200, 30);
      l3.setBounds(100, 300, 200, 30);
       l4.setBounds(100, 330, 200, 20);
        l5.setBounds(100, 370, 200, 30);
         l6.setBounds(100, 400, 200, 20);
          l7.setBounds(100, 435, 400, 30);
         
    r1.setBounds(100, 180, 250, 30);  
     r2.setBounds(350, 180, 200, 30);    
      r3.setBounds(100, 220, 200, 30);    
       r4.setBounds(350, 220, 250, 30);    
       
        
 c1.setBounds(100, 470, 200, 30);    
  c2.setBounds(350, 470, 200, 30);    
   c3.setBounds(100, 510, 200, 30);    
    c4.setBounds(350, 510, 200, 30);  
     c5.setBounds(100, 550, 200, 30); 
      c6.setBounds(350, 550, 200, 30);    
       c7.setBounds(100, 610, 600, 30);
    
    b1.setBounds(300, 645, 100, 30);
     b2.setBounds(440, 645, 100, 30);
     
                
     
    l1.setFont(new Font("Raleway", Font.BOLD, 22));
     l2.setFont(new Font("Raleway", Font.BOLD, 18));
      l3.setFont(new Font("Raleway", Font.BOLD, 18));
       l4.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
         l6.setFont(new Font("Raleway", Font.BOLD, 12));
          l7.setFont(new Font("Raleway", Font.BOLD, 18));
         
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
         r2.setFont(new Font("Raleway", Font.BOLD, 16));
          r3.setFont(new Font("Raleway", Font.BOLD, 16));
           r4.setFont(new Font("Raleway", Font.BOLD, 16));
           
    c1.setFont(new Font("Raleway", Font.BOLD, 16));
     c2.setFont(new Font("Raleway", Font.BOLD, 16));
      c3.setFont(new Font("Raleway", Font.BOLD, 16));
       c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
         c6.setFont(new Font("Raleway", Font.BOLD, 16));
          c7.setFont(new Font("Raleway", Font.BOLD, 13));
                  
    b1.setFont(new Font("Raleway", Font.BOLD, 14)); 
     b2.setFont(new Font("Raleway", Font.BOLD, 14));           
       
    r1.setBackground(Color.WHITE);
     r2.setBackground(Color.WHITE);
      r3.setBackground(Color.WHITE);
       r4.setBackground(Color.WHITE);

    c1.setBackground(Color.WHITE);
     c2.setBackground(Color.WHITE);
      c3.setBackground(Color.WHITE);
       c4.setBackground(Color.WHITE);
        c5.setBackground(Color.WHITE);
         c6.setBackground(Color.WHITE);
          c7.setBackground(Color.WHITE);
     
    b1.setBackground(Color.BLACK);
     b1.setForeground(Color.white);
             
    b2.setBackground(Color.BLACK);
     b2.setForeground(Color.white); 
         
   ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
     bg.add(r2);
      bg.add(r3);
       bg.add(r4);
       
      
       
              
    add(l1);   
     add(l2);   
      add(l3);   
       add(l4);   
        add(l5);   
         add(l6);
          add(l7); 

      add(r1);
       add(r2);  
        add(r3);
         add(r4);
          add(c1);
           add(c2);
            add(c3);
             add(c4);
              add(c5);
               add(c6);
                add(c7);
                     
     add(b1);
      add(b2);
     
     add(cno);
     add(pno); 


      getContentPane().setBackground(Color.white);
      setSize(850 , 820);
      setLocation(350, 0);
      setVisible(true);
   }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == b1) {
            
           String acType = "";
           if (r1.isSelected())
               acType = "Saving Account";
           else if (r2.isSelected())
               acType = "FD Account";
            else if (r3.isSelected())
               acType = "CurrentAccount";
            else if (r4.isSelected())
               acType = "Recurring Deposit Account";
           
           Random random = new Random();
           String cardno = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L); 
            String pinno = "" + Math.abs((random.nextLong() % 9000L) + 1000L); 
            
            String facility = "";
            if(c1.isSelected())
               facility += " ATM Card "; 
           if(c2.isSelected())
               facility += " Internet Banking ";
           if(c3.isSelected())
               facility += " Mobile Banking ";
            if(c4.isSelected())
               facility += " EMAIL & SMS Alerts ";
           if(c5.isSelected())
               facility += " Cheque Book ";
            if(c6.isSelected())
               facility += " E-Satatement ";
            
   
                try {
                if(acType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                    
                } else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+acType+"','"+cardno+"','"+pinno+"','"+facility+"')";  
                  String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";  
                  
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                   
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pinno);
                    setVisible(false);
                    new Deposit(pinno).setVisible(true);
                    
                }
            }catch (Exception e) {
    System.out.print(e);
}
                
}else if(ae.getSource() == b2 ) {
              setVisible(false);
                    new Login().setVisible(true);
        }
    
    
   
    }
    public static void main(String args[]) {
        new Signup3("");
    }
}
