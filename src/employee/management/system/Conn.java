package employee.management.system;
 import java.sql.*;
    /* This class is for the Connectivity to DATA Base(MySQL) using JDBC 
         There are 5 steps  for JDBC Connectivity
         1>Register The DriverClass
         2> Creating the Connection String
         3> Creating Statement
         4>Executing MySQL Queries
         5>Closing the Connections  */

public class Conn 
{
    
    Connection c;                                    //3>There is an Interface in Java named Connection in Sql package, we have to create a connection String
     Statement s;                     //5> This is to create a statement 
    public Conn()
    {
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");              //2>Here,we are registering the Driver Class and then we have to mention the Driver inside the paranthesis
         
// a- which concept are we using (i.e jdbc):/what is the database(ie.mysql):/where is mysql running(ie .localhost 3306 / name of the database to store the data/ username(ie. root)/password (i.e aadarshmysql)/  
        c =  DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","aadarshmysql");   //4> We have to make a connection String,there is a static method  called getConnection() in order to store the data in the database
        
        s = c.createStatement();                //6>Inorder to create a statement
       
        
        }
        catch(Exception e)                                                // 1>AsMy SQL is an External Entity so there are chances of error ,hence to supress that we are using try Catch .
        {
            e.printStackTrace();
        }
    }
}
