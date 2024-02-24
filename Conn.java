package bank.management.system;

import java.sql.*;


public class Conn {
 
Connection c;
Statement s;
public Conn() {
    try {
        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Satyam@123");
  s = c.createStatement();
    
    
    } catch (Exception e) {
        System.out.println(e);
    }
}

}

































/* 
notes

jdbc connectivity has 5 steps--

Register the driver
Create Connection
Create Statement
Execute Query
Close connection */