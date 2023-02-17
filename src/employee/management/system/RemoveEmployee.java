
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;  
import java.awt.event.*;// Using this pacaksge we can  execute the sql query.  

public class RemoveEmployee extends JFrame  implements ActionListener
{
    Choice cempid;
    JButton delete,back;
    
    RemoveEmployee()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/HOMEPAGE.png"));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel logimg = new JLabel(i3);
        logimg.setBounds(350,80,500,300);
        add(logimg);

        JLabel labelempID =new JLabel("EmpLoyee ID");
        labelempID.setBounds(50,50,100,30);
        add(labelempID);
        
        cempid = new Choice();
        cempid.setBounds(160,55,150,30);
        add(cempid);
       
        try
       {
           Conn con = new Conn();                                                                 //Created an Object Reference
           ResultSet rs = con.s.executeQuery("select * from employee");                     // This is to Execute the Query as it is a DDL Command hence ececute and we are storing it in ResultSet rs. 
           while(rs.next())                                                                      //Inorder to add the EmpID to the Choice we  1st have to loop it using while loop and then one by one 
           {                                                                                     //It will add the empid to the choice ,(rs.getString("empID"); will take the emp ID and put it in the choice box.
            cempid.add(rs.getString("empID"));                             
           }
           
       }   
       catch(Exception ee)
       {
           ee.printStackTrace();
       }
        
        
         
        JLabel lblname =new JLabel("Name :");
        lblname.setBounds(50,100,100,30);
        add(lblname);
        
         JLabel selectname =new JLabel();
        selectname.setBounds(160,100,100,30);
        add(selectname);
        
          JLabel lblfname =new JLabel("Father's Name :");
        lblfname.setBounds(50,140,100,30);
        add(lblfname);
        
        JLabel selectfname =new JLabel();
        selectfname.setBounds(160,140,100,30);
        add(selectfname);
        
         JLabel lbldob =new JLabel("DOB :");
        lbldob.setBounds(50,180,100,30);
        add(lbldob);
        
        JLabel selectdob =new JLabel();
        selectdob.setBounds(160,180,100,30);
        add(selectdob);
        
         JLabel lblsalary =new JLabel("Salary :");
        lblsalary.setBounds(50,220,100,30);
        add(lblsalary);
        
         JLabel selectsalary = new JLabel();
        selectsalary.setBounds(160,220,100,30);
        add(selectsalary);
        
         try
       {
           Conn con = new Conn();                                                                 //Created an Object Reference
           String query ="select * from employee where empID ='"+ cempid.getSelectedItem()+"'";                     // This is to Execute the Query as it is a DDL Command hence ececute and we are storing it in ResultSet rs. 
           ResultSet rs = con.s.executeQuery(query);
           
           while(rs.next())                                                                      //Inorder to add the EmpID to the Choice we  1st have to loop it using while loop and then one by one 
           {                                                                                     //It will add the empid to the choice ,(rs.getString("empID"); will take the emp ID and put it in the choice box.
              selectname.setText(rs.getString("name"));
              selectfname.setText(rs.getString("fathername"));
              selectdob.setText(rs.getString("DOB"));
              selectsalary.setText(rs.getString("salary"));
                                       
           }
           
       }   
       catch(Exception pp)
       {
           pp.printStackTrace();
       }
        
         cempid.addItemListener(new ItemListener(){
                 public void itemStateChanged(ItemEvent ie){
                      try
       {
           Conn con = new Conn();                                                                 //Created an Object Reference
           String query ="select * from employee where empID ='"+ cempid.getSelectedItem()+"'";                     // This is to Execute the Query as it is a DDL Command hence ececute and we are storing it in ResultSet rs. 
           ResultSet rs = con.s.executeQuery(query);
           
           while(rs.next())                                                                      //Inorder to add the EmpID to the Choice we  1st have to loop it using while loop and then one by one 
           {                                                                                     //It will add the empid to the choice ,(rs.getString("empID"); will take the emp ID and put it in the choice box.
              selectname.setText(rs.getString("name"));
              selectfname.setText(rs.getString("fathername"));
              selectdob.setText(rs.getString("DOB"));
              selectsalary.setText(rs.getString("salary"));
                                       
           }
           
       }   
       catch(Exception pp)
       {
           pp.printStackTrace();
       }
                     
                 }});
           
         delete =new JButton("DELETE RECORD");
         delete.setBounds(250,480,150,30);
         delete.addActionListener(this);
         add(delete);
         
         back = new JButton("BACK");
         back.setBounds(450,480,150,30);
         back.addActionListener(this);
         add(back);
         
        setSize(900,600);
        setLocation(220,50);
        setVisible(true);
        
    }
    
    
        
    public static void main(String[] args)
    {
      new RemoveEmployee();    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== delete)
       {
         try
         {
             Conn con =new Conn();
             String query ="delete from employee where empID ='"+cempid.getSelectedItem()+"'";                     // This is to Execute the Query as it is a DDL Command hence ececute and we are storing it in ResultSet rs. 
             con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Employee Info Deleted Sucessfully");
            setVisible(false);
            new Home();
         }
         catch(Exception xx)
         {
             xx.printStackTrace();
         }
       }
       else
       {
             new Home();
           setVisible(false);
           
       }
       
    }
}
