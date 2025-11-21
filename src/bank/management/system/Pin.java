package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Pin extends JFrame implements ActionListener {
    

    JButton b1, b2;
     JPasswordField pin, repin;
String pinNumber;
     
    Pin(String pinno){
        this.pinNumber = pinno;
      
     
     setLayout(null);
     
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(850, 810,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 850, 750);
    add(image);
    
          
        JLabel text = new JLabel("CHANGE YOUR PIN");
text.setFont(new Font("System", Font.BOLD, 16));
text.setForeground(Color.WHITE);
        text.setBounds(240, 240, 500, 35);
        image.add(text);
        
        
        JLabel pinText = new JLabel("New PIN:");
pinText.setFont(new Font("System", Font.BOLD, 16));
pinText.setForeground(Color.WHITE);
       pinText.setBounds(150, 280, 150, 25);
        image.add(pinText);
        
         pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        pin.setBounds(300, 280 ,180, 25);
        image.add(pin);
        
                
        
        
    JLabel repinText = new JLabel("Re-Enter New PIN:");
repinText.setFont(new Font("System", Font.BOLD, 16));
repinText.setForeground(Color.WHITE);
       repinText.setBounds(150, 320, 150, 25);
        image.add(repinText);
        
           repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 16));
        repin.setBounds(300, 320, 180, 25);
     image.add(repin);
     
           
        b1 = new JButton("CHANGE");
        b2 = new JButton("BACK");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    b1.setBounds(330, 385, 140, 30);
     b2.setBounds(330, 420, 140, 30);
     image.add(b1);
     
        image.add(b2);
     
     
        
    setSize(850, 820);
    setVisible(true);
     getContentPane().setBackground(Color.WHITE);
     //    setUndecorated(true);
    setLocation(300,0);
    
    }
    
   
    public void actionPerformed (ActionEvent ae) {
        
        
      
        if(ae.getSource() == b1){
            
        String npin = pin.getText();
        String rpin = repin.getText();
        
        if(!npin.equals(rpin)) {
            JOptionPane.showMessageDialog(null, "ENTERED PIN does not match");
            return;
        }
        
      if(npin.equals("")){
          JOptionPane.showMessageDialog(null, "Please Eneter PIN");
          return;
      }
      
     try{
          
      Conn c = new Conn();
      String q1 = "update bank set Pin = '"+rpin+"' where Pin = '"+pinNumber+"'";
      String q2 = "update login set PinNumber = '"+rpin+"' where pinNumber = '"+pinNumber+"'";
      String q3 = "update signup3 set pinNumber = '"+rpin+"' where pinNumber = '"+pinNumber+"'";
   
      c.s.executeUpdate(q1);
       c.s.executeUpdate(q2);
        c.s.executeUpdate(q3);
        
        JOptionPane.showMessageDialog(null, "PIN changed successfully");
        setVisible(false);
       
        }  catch (Exception e) {
                System.out.print(e);
                }
        } else {
  
        setVisible(false);
        new Transaction("").setVisible(true);
        new Transaction(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
       new Pin("");
               
             
    }
}
