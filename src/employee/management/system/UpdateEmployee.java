package employee.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class UpdateEmployee extends JFrame implements ActionListener
{
    
    
    JTextField hieduinput,nameinput,fatnameinput,salinput,addressinput,phoneinput,emailinput,designationinput,aadharinput;
    JLabel empidinput;
    JButton updatedetails,back;
    String emp;
    UpdateEmployee(String emp )
    {
        this.emp =emp;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("UPDATE EMLPLOYEE DETAILS");
        heading.setBounds(250,25,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
            //EMPLOYEE NAME
        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(60,100,250,40);
        labelname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelname);
        
        JLabel nameinput = new JLabel();                                                   //This is to make the name un editable
        nameinput.setBounds(200,105,200,35);
        add(nameinput);
        
           // EMPLOYEE FATHER NAME       
        JLabel labelfatname = new JLabel("Father's Name :");
        labelfatname.setBounds(430,100,250,40);
        labelfatname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelfatname);
        
        JLabel fatnameinput = new JLabel();                                                   //This is to make the fathers name un editable
        fatnameinput.setBounds(640,105,200,35);
        add(fatnameinput);
        
        // EMPLOYEE DATE OF BIRTH 
        JLabel labeldob = new JLabel("DOB :");
        labeldob.setBounds(60,150,250,40);
        labeldob.setFont(new Font("serif",Font.PLAIN,20));
        add(labeldob);
         
        //Calendar Format of Input(JDateChooser)   
         JLabel dcdob =new JLabel();                                                         //This is to make the date of Birth name un editable
        dcdob.setBounds(200,155,200,35);
        add(dcdob);
        
         // SALARY 
         JLabel labelsal = new JLabel("Salary :");
        labelsal.setBounds(430,150,250,40);
        labelsal.setFont(new Font("serif",Font.PLAIN,20));
        add(labelsal);
        
        salinput = new JTextField();
        salinput.setBounds(640,155,200,35);
        add(salinput);
         
         //ADDRESS
         
         JLabel labeladdress = new JLabel("Address :");
        labeladdress.setBounds(60,200,250,40);
        labeladdress.setFont(new Font("serif",Font.PLAIN,20));
        add(labeladdress);
        
         addressinput = new JTextField();
        addressinput.setBounds(200,205,200,35);
        add(addressinput);
         
         //PHONE NUMBER
          JLabel labelphone = new JLabel("Phone Number :");
        labelphone.setBounds(430,200,250,40);
        labelphone.setFont(new Font("serif",Font.PLAIN,20));
        add(labelphone);
        
         phoneinput = new JTextField();
        phoneinput.setBounds(640,205,200,35);
        add(phoneinput);
        
         //EMAIL
         
         JLabel labelemail = new JLabel("Email :");
        labelemail.setBounds(60,250,250,40);
        labelemail.setFont(new Font("serif",Font.PLAIN,20));
        add(labelemail);
        
        emailinput = new JTextField();
        emailinput.setBounds(200,255,200,35);
        add(emailinput);
         
         //HIGEST EDUCATION
          JLabel labelhiedu = new JLabel("Higest Education :");
        labelhiedu.setBounds(430,250,250,40);
        labelhiedu.setFont(new Font("serif",Font.PLAIN,20));
        add(labelhiedu);
        
        String courses[]={"Qualification","M.Tech","MSC","BA","B.COM","B.Tech","BSC","BBA","BCA","MBA","MCA","MA"};   //This Array is to 
        
         hieduinput = new JTextField();                                  // This Class JComboBox is to  create a drop down menu  and it takes  String of Array as the Argument
        hieduinput.setBounds(640,255,200,35);
        add(hieduinput);
         //DESIGNATION
         
          JLabel labeldesignation = new JLabel("Designation :");
       labeldesignation.setBounds(60,300,250,40);
        labeldesignation.setFont(new Font("serif",Font.PLAIN,20));
        add(labeldesignation);
        
        designationinput = new JTextField();
        designationinput.setBounds(200,305,200,35);
        add(designationinput);
         
         //AADHAR NUMBER
          JLabel labelhaadhar = new JLabel("Aadhar Number :");
        labelhaadhar.setBounds(430,300,250,40);
        labelhaadhar.setFont(new Font("serif",Font.PLAIN,20));
        add(labelhaadhar);
        
        JLabel aadharinput = new JLabel();                                  // This Class JComboBox is to  create a drop down menu  and it takes  String of Array as the Argument
       aadharinput.setBounds(640,305,200,35);
        aadharinput.setBackground(Color.WHITE);
        add(aadharinput);
         //EMPLOYEE ID
         
         JLabel labelempid = new JLabel("Employee ID :");
       labelempid.setBounds(60,350,250,40);
        labelempid.setFont(new Font("serif",Font.PLAIN,20));
        add(labelempid);
        
         empidinput = new  JLabel();
         empidinput.setFont(new Font("serif",Font.PLAIN,20));
        empidinput.setBounds(200,355,200,35);
        add(empidinput);
        
        
        try
        {
          Conn c =new Conn();
          String query = "select * from employee where empID ='"+emp+"'";
          ResultSet rs = c.s.executeQuery(query);
          while(rs.next())
          {
             nameinput.setText(rs.getString("name")); 
             fatnameinput.setText(rs.getString("fathername")); 
             dcdob.setText(rs.getString("DOB")); 
             salinput.setText(rs.getString("salary")); 
             addressinput.setText(rs.getString("address")); 
             phoneinput.setText(rs.getString("phone")); 
             emailinput.setText(rs.getString("email")); 
             hieduinput.setText(rs.getString("education")); 
             designationinput.setText(rs.getString("designation")); 
             aadharinput.setText(rs.getString("aadhar")); 
               empidinput.setText(rs.getString("empID"));     
          }
        }
        catch(Exception aa)
        {
          aa.printStackTrace();
        }
        
        // ADD Details and Back Button
        
        updatedetails = new JButton("UPDATE DETAILS");
        updatedetails.setBounds(305,500,150,25);
         updatedetails.setForeground(Color.GREEN);
         updatedetails.addActionListener(this);
        add(updatedetails);
        
        
        back = new JButton("BACK");
        back.setBounds(500,500,150,25);
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);

        
        setSize(900,600);
        setLocation(220,50);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == updatedetails)
        {   
            String salary = salinput.getText();
            String address = addressinput.getText();
            String phonenum = phoneinput.getText();
            String email = emailinput.getText();
            String higestedu = (String) hieduinput.getText();                        // As  the combo box stores the file in form of object hence we have to typecast it ,and then we have choose the selected item hence we used getSelectedItem.
            String designation = designationinput.getText();
            String empid = empidinput.getText();    
            
            
         try 
         {
             Conn conn = new Conn();
             String query = "update  employee set salary = '"+salary+"',address = '"+address+"', phone = '"+phonenum+"',email = '"+email+"',education = '"+higestedu+"',designation = '"+designation+"'  where empID = '"+empid+"'" ;
             conn.s.executeUpdate(query);                                                           // In the Login Page line 84 as that was to execute the query(that is a DDL Command), but here we are updating the table which is a DML Command language hence(we use executeUpdate(query));       
             JOptionPane.showMessageDialog(null,"Details Updated successfully");        //This will show a message the details added sucessfully.
             setVisible(false);
             new Home();
         }
         catch(Exception e)                                                                   //As database is an External entity so there are some chances of error  hence we are using try catch
         {
            e.printStackTrace();
         }
            
        }
        else
        {
            setVisible(false);
            new Home();
        }
       
    }
    public static void main(String[] args) 
    {
        new UpdateEmployee("");
    }

    
}
