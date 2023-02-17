
package employee.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JTextField tfusername ,tfpassword;               //As we have to use the username and password given by the user  in different method to hence we have declare it Globally. 
    
    Login()
    {
        //To set The color of the Login Page
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);   //To create our own Layout
        
        
         // To put User name on the Login Page
        
        JLabel lblusername = new JLabel("User Name");    
        lblusername.setBounds(40,30,100,30);
        add(lblusername);
        
          //This is to create a text field to take the user name from the user
        
         tfusername = new JTextField();                         //This is to take user input (i.e Username)
        tfusername.setBounds(150,30,150,30);
        add(tfusername);
        
        
        //To set Password  n the login Page
        
         JLabel lblpassword = new JLabel("Password");
         lblpassword.setBounds(40,80,100,30);
         add(lblpassword);
        
          //This is to create a text field to take the user name from the user
          
          tfpassword = new JTextField();                         //This is to take user input (i.e Password)
         tfpassword.setBounds(150,80,150,30);
         add(tfpassword);
         
         
        //To Create a Login Button and decorate it
        
        JButton login =new JButton("LOGIN");
        login.setBounds(105,140,150,25);
        login.setBackground(Color.yellow);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);                     //Inorder to  take the input from the username and password text field  we have created an action Listener
        add(login);
            
        //Set Image on the Right side Of the Frame
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(170,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel logimg = new JLabel(i3);
        logimg.setBounds(350,0,200,200);
        add(logimg);
        
        
        // Create the Frame of the Login Page
        setSize(600,250);    
        setLocation(450,200);               
        setVisible(true);
    }
    
    
      @Override
    public void actionPerformed(ActionEvent e) 
    {
        try 
        {
            String username =tfusername.getText();                     //gettext() Function is used to take the value inside the textfield 
            String password = tfpassword.getText();                    // same for password
        
            
             Conn c = new Conn();                                       
            //Using these to datas we are going to create a  query
             String query = "select * from login where username = '"+username+"'and password = '"+password+"'";     //We have created a Query which will fetch the  username and password from the database. 
            
             ResultSet rs = c.s.executeQuery(query);    //To execute the query  we will use the executeQuery function  // we have to store the returned value  in rs which is the object reference of Result Object.
               
             if(rs.next())                                       // This statement is used to check what is the value inside rs, If there is value it will open next class.
             {
                 setVisible(false);
                 new Home();
             }
             else                                               // If there there is no value present inside  it will open a popup
             {
                 JOptionPane.showMessageDialog(null, "Invalid user name and Password");
                 setVisible(false);
             }
             
        }
        catch(Exception ae)           //As we are using MySql and it is an exteranal entity and there will be chances of error so we have to use try catch block  in order handel the error.
            {
              ae.printStackTrace();          
            }
    }
            
    
    
    public static void main(String[] args)
    {
      
    }

  
}
