package bank.management.system;

import javax.swing.*;
//IMAGE CLASS HEVE NOT INSIDE THE SWING PACKAGE, IT FROM AWT i.e.
//The full form of AWT in Java is Abstract Window Toolkit. It's a Java API for creating graphical user interfaces (GUIs).
import java.awt.*;
import java.awt.event.*;
//ResultSet is a class SQL package 
import java.sql.*; 



public class Login extends JFrame implements ActionListener {
    JButton Login, signup, clear;
    JTextField  cardTextField;
    JPasswordField pinTextField;
Login(){
    setTitle("AUTOMATED TELLER MACHINE");
    
    setLayout(null);
    //for using image we have to create a object i.e.
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
     //to change the size of icon make object i.e-
    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); 
      //i2 is an image which can not be put in jlabel so we have to again convert image into image icon i.e.
    ImageIcon i3 = new ImageIcon(i2);
    //we can not directly place an icon on frame, so, wehave to put the icon in JLabel i.e.
    JLabel label = new JLabel(i3);
    //bydefault system layout become in center so for using custom layout we have to set system layout null look line no. 16
    label.setBounds(70,10, 100,100);
    add(label);
    
    //label text
    JLabel text = new JLabel("Welcome to ATM"); 
   text.setFont(new Font("osward", Font.BOLD, 38));
    text.setBounds(200, 40, 400, 40);
    add(text); 
    
    //label card no.
   JLabel cardno = new JLabel("Card No."); 
   cardno.setFont(new Font("Raleway", Font.BOLD, 28));
   cardno.setBounds(120, 150, 150, 30);
    add(cardno); 
    
      //for card textfield 
   cardTextField = new JTextField();
   cardTextField.setBounds(300, 150, 230, 30);
   cardTextField.setFont(new Font("Arial",Font.BOLD, 14 ));
   add(cardTextField);
   
    //label pin
    JLabel pin = new JLabel("Pin:"); 
   pin.setFont(new Font("Raleway", Font.BOLD, 28));
   pin.setBounds(120, 220, 150, 40);
   add(pin); 
    
  //for pin text field
 pinTextField = new JPasswordField();
  pinTextField.setBounds(300, 220, 230, 30);
pinTextField.setFont(new Font("Arial",Font.BOLD, 14 ));
  add(pinTextField);
  
  //creat Button
 Login = new JButton("SIGN IN");
  Login.setBounds(300, 300, 100, 30);
  Login.setBackground(Color.BLACK);
  Login.setForeground(Color.WHITE);
  Login.addActionListener(this);
  add(Login);
 
 clear = new JButton("CLEAR");
clear.setBounds(430, 300, 100, 30);
clear.setBackground(Color.BLACK);
clear.setForeground(Color.WHITE);
clear.addActionListener(this);
add(clear);
  
   signup= new JButton("SIGN UP");
  signup.setBounds(300, 350, 230, 30);
 signup.setBackground(Color.BLACK);
signup.setForeground(Color.WHITE);
signup.addActionListener(this);
  add(signup);
   
    //for changing background of the image
    getContentPane().setBackground(Color.WHITE);
    //length and width of frame
    setSize(800,480); 
    
       //bydefult frame is hidden(false) from user visibility. so, we call a function i.e.
      setVisible(true);
      setLocation(350,200);
}

public void actionPerformed(ActionEvent ae) {
    if(ae.getSource() == clear) {
        //manually can set value which show in cardTextField after pushing on clear button i.e.
        cardTextField.setText(""); 
        pinTextField.setText("");
        
        
    }else if(ae.getSource() == Login ) {
       Conn conn = new Conn();
       String cardno = cardTextField.getText();
       String pinno = pinTextField.getText();
   String query = "select* from login where cardNumber = '"+cardno+"' and pinNumber = '"+pinno+"'";
     
      try{
          ResultSet rs = conn.s.executeQuery(query);
          if (rs.next()) {
              setVisible(false);
              new Transaction(pinno).setVisible(true);
          } else {
      
           JOptionPane.showMessageDialog(null, "Invalid card number or PIN.");
          }
          
      }catch(Exception e){
          System.out.println(e);
      }

  }

else if(ae.getSource() == signup){
    //when click on signup button open signupone frame
    setVisible(false);
new SignupOne().setVisible(true);
        }
    
}
    public static void main(String args[]) {
      new Login();
   
    }
}
