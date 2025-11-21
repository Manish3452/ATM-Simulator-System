package bank.management.system;
import java.sql.*;

public class Conn {
    
Connection c;
Statement s;

   public Conn() {
       // my SQL is external entity. so, more chances to become . this is how we wiil have to use exception handling(for run time error)
try{
  
     //step-1  create connection
    c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Mani1234#");
 
    //step-2  create statement
    s = c.createStatement();    
}catch(Exception e){
    System.out.print(e);
}
       
   }
}
