package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.*;
public class AddEmployee extends JFrame implements ActionListener
{
    
    Random ran =new Random();
    int number =ran.nextInt(999999);
    JTextField nameinput,fatnameinput,salinput,addressinput,phoneinput,emailinput,designationinput,aadharinput;
    JComboBox hieduinput;
    JLabel empidinput;
    JDateChooser dcdob;
    JButton adddetails,back;
    AddEmployee()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("ADD EMLPLOYEE DETAILS");
        heading.setBounds(250,25,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
            //EMPLOYEE NAME
        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(60,100,250,40);
        labelname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelname);
        
         nameinput = new JTextField();
        nameinput.setBounds(200,105,200,35);
        add(nameinput);
        
           // EMPLOYEE FATHER NAME       
        JLabel labelfatname = new JLabel("Father's Name :");
        labelfatname.setBounds(430,100,250,40);
        labelfatname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelfatname);
        
        fatnameinput = new JTextField();
        fatnameinput.setBounds(640,105,200,35);
        add(fatnameinput);
        
        // EMPLOYEE DATE OF BIRTH 
        JLabel labeldob = new JLabel("DOB :");
        labeldob.setBounds(60,150,250,40);
        labeldob.setFont(new Font("serif",Font.PLAIN,20));
        add(labeldob);
         
        //Calendar Format of Input(JDateChooser)   
         dcdob =new JDateChooser();                               // JDateChooser class object is being made here as the input we want to take will be in date format and it will open up a calendar format.
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
        
         hieduinput = new JComboBox(courses);                                  // This Class JComboBox is to  create a drop down menu  and it takes  String of Array as the Argument
        hieduinput.setBounds(640,255,200,35);
        hieduinput.setBackground(Color.WHITE);
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
        
        aadharinput = new JTextField();                                  // This Class JComboBox is to  create a drop down menu  and it takes  String of Array as the Argument
       aadharinput.setBounds(640,305,200,35);
        aadharinput.setBackground(Color.WHITE);
        add(aadharinput);
         //EMPLOYEE ID
         
         JLabel labelempid = new JLabel("Employee ID :");
       labelempid.setBounds(60,350,250,40);
        labelempid.setFont(new Font("serif",Font.PLAIN,20));
        add(labelempid);
        
         empidinput = new  JLabel(""+number);
         empidinput.setFont(new Font("serif",Font.PLAIN,20));
        empidinput.setBounds(200,355,200,35);
        add(empidinput);
        
        
        // ADD Details and Back Button
        
        adddetails = new JButton("ADD DETAILS");
        adddetails.setBounds(305,500,150,25);
         adddetails.setForeground(Color.GREEN);
         adddetails.addActionListener(this);
        add(adddetails);
        
        
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
        if(ae.getSource() == adddetails)
        {
            String name = nameinput.getText();
            String fathername = fatnameinput.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();    //As we are taking input from the calendar hence  we 1st used dateeditor then get UI component after that get Text.(Then we have to Type cast it to Text Editor) 
            String salary = salinput.getText();
            String address = addressinput.getText();
            String phonenum = phoneinput.getText();
            String email = emailinput.getText();
            String higestedu = (String) hieduinput.getSelectedItem();                        // As  the combo box stores the file in form of object hence we have to typecast it ,and then we have choose the selected item hence we used getSelectedItem.
            String designation = designationinput.getText();
            String aadharno = aadharinput.getText();
            String empid = empidinput.getText();    
            
            
         try 
         {
             Conn conn = new Conn();
             String query = "insert into employee values('"+name+"','"+fathername+"','"+dob+"','"+salary+"','"+address+"','"+phonenum+"','"+email+"','"+higestedu+"','"+designation+"','"+aadharno+"','"+empid+"') " ;
             conn.s.executeUpdate(query);                                                           // In the Login Page line 84 as that was to execute the query(that is a DDL Command), but here we are updating the table which is a DML Command language hence(we use executeUpdate(query));       
             JOptionPane.showMessageDialog(null,"Details added successfully");        //This will show a message the details added sucessfully.
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
        new AddEmployee();
    }

    
}
