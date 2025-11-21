package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

     JButton next; 
     JComboBox religionBox, categoryBox, incomeBox, educationBox, occupationBox;
     JRadioButton y1, n1, y2, n2;
     JTextField panTextField, adharTextField;
     String formno;
   
    SignupTwo(String formno) {
        this.formno = formno;
      
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Datails");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
          additionalDetails.setBounds(290, 80, 400, 30);
          add(additionalDetails);
          
          
          JLabel religion = new JLabel("Religion:");
             religion.setFont(new Font("Raleway", Font.BOLD, 20));
         religion.setBounds(100, 140, 200, 30 );
          add(religion);
          
          // for dropdown use call name DropDown
          String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christians", "Other"};
           religionBox = new JComboBox(valReligion);
          religionBox.setBounds(300,140, 400, 30);
          religionBox.setBackground(Color.white);
          add(religionBox);
                  
           JLabel category = new JLabel("Category:");
           category.setFont(new Font("Raleway", Font.BOLD, 20));
           category.setBounds(100, 190, 200, 30);
           add(category);
          
          String valCategory[] = {"Genral", "OBC", "SC", "ST", "Other" };
           categoryBox = new JComboBox(valCategory);
          categoryBox.setBackground(Color.white);
          categoryBox.setBounds(300, 190, 400, 30);
           add(categoryBox);
                  
              JLabel income = new JLabel("Income:");
            income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
          add(income);
          
            String valIncome[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000" };
           incomeBox = new JComboBox(valIncome);
        incomeBox.setBackground(Color.white);
         incomeBox.setBounds(300, 240, 400, 30);
           add(incomeBox);
          
              JLabel educational = new JLabel("Educational");
            educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
          add(educational);
          
           JLabel qualification = new JLabel("Qualification:");
            qualification.setFont(new Font("Raleway", Font.BOLD, 20));
       qualification.setBounds(100, 315, 200, 30);
          add(qualification);
          
          String valEducation[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others" };
           educationBox = new JComboBox(valEducation);
           educationBox.setBackground(Color.white);
          educationBox.setBounds(300, 315, 400, 30);
          add(educationBox);
          
              JLabel occupation = new JLabel("Occupation:");
            occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 365, 200, 30);
          add(occupation);
          
                    
          String valOccupation[] = {"Saleried", "Self-Employed", "Bussiness", "Student", "Retired", "Others" };
           occupationBox = new JComboBox(valOccupation);
           occupationBox .setBackground(Color.white);
          occupationBox .setBounds(300, 365, 400, 30);
          add(occupationBox );
          
              JLabel panno = new JLabel("Pan Number:");
             panno.setFont(new Font("Raleway", Font.BOLD, 20));
         panno.setBounds(100, 415, 200, 30);
          add(panno);
          
          panTextField = new JTextField();
          panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
          panTextField.setBounds(300, 415, 400, 30);
          add(panTextField);
          
          JLabel Adharno = new JLabel("Adhar Number:");
            Adharno.setFont(new Font("Raleway", Font.BOLD, 20));
       Adharno.setBounds(100, 465, 200, 30);
          add(Adharno);
          
          adharTextField = new JTextField();
          adharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
          adharTextField.setBounds(300, 465, 400, 30);
          add(adharTextField);
          
          
              JLabel seniorCitizens = new JLabel("Senior Citizens:");
            seniorCitizens.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizens.setBounds(100, 515, 200, 30);
          add(seniorCitizens);
          
                    
          y1 = new JRadioButton("Yes");
            y1.setBounds(300,515, 100, 30);
            y1.setBackground(Color.WHITE);
          add(y1);
          
                    
          n1 = new JRadioButton("No");
            n1.setBounds(450, 515, 100, 30);
            n1.setBackground(Color.WHITE);
          add(n1);
          
           ButtonGroup seniorCitizensBG = new ButtonGroup();
           seniorCitizensBG.add(y1);
           seniorCitizensBG.add(n1);
    
          
          
              JLabel existingAccount = new JLabel("Existing Account:");
            existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
       existingAccount.setBounds(100, 565, 200, 30);
          add(existingAccount);

            y2 = new JRadioButton("Yes");
            y2.setBounds(300, 565, 120, 30);
            y2.setBackground(Color.white);
          add(y2);
          
                    
          n2 = new JRadioButton("No");
         n2.setBounds(450, 565, 120, 30);
 n2.setBackground(Color.WHITE);
          add(n2);
          
       ButtonGroup existingAccountBG = new ButtonGroup();
       existingAccountBG.add(y2);
       existingAccountBG.add(n2);
          
         next = new JButton("Next");
          next.setBackground(Color.BLACK);
          next.setForeground(Color.white);
          next.setFont(new Font("Raleway", Font.BOLD, 14));
          next.setBounds(620,630, 80, 30);
          next.addActionListener(this);
          add(next);
     
    getContentPane().setBackground(Color.WHITE);
    setSize(850, 800);
    setVisible(true);
    setLocation(350, 10);
    }
    
    
   public void actionPerformed(ActionEvent ae){
        
       //to get item from combobox  use function name is getSelectedItem()
       String sReligion = (String) religionBox.getSelectedItem();
       String sCategory = (String) categoryBox.getSelectedItem();
       String sIncome = (String) incomeBox.getSelectedItem();
        String sEducation = (String) educationBox.getSelectedItem();
         String sOccupation = (String) occupationBox.getSelectedItem();
         String sPanno =  panTextField.getText();
         String sAdharno =  adharTextField.getText();
         String sSeniorCitizen = null;
         if (y1.isSelected())
             sSeniorCitizen = "Yes";
         else if (n1.isSelected())
                 sSeniorCitizen = "No";
       
   String sExistingAccount = null;
   if(y2.isSelected())
       sExistingAccount = "Yes";
   else if(n2.isSelected())
       sExistingAccount = "No";
   
   try {
      
       Conn c = new Conn();
       String query = "insert into SignupTwo values('"+formno+"', '"+sReligion+"', '"+sCategory+"', '"+sIncome+"', '"+sEducation+"', '" +sOccupation+"', '"+sPanno+"', '"+sAdharno+"', '"+sSeniorCitizen+"', '"+ sExistingAccount+"')";
       c.s.executeUpdate(query);
       
       //signup3 object 
       setVisible(false);
       new Signup3(formno).setVisible(true);
       
   }catch(Exception e){
       System.out.print(e);
   }
       
  
   
}
    public static void main(String args[]) {
        new SignupTwo(" ");
        
    }
}
