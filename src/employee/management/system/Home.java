package employee.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener
{
      JButton View ,Add,Update,Remove;                                 //We have declared the JButton Instance as Global Varivale as it  is being used in more than one function
       
    Home()
    {    
        setLayout(null);     //As we don't want to use swing's Layout
         
        // Inorder to set the Image in the frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ADAD.jpeg"));
         Image i2 =i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);     //This is to scale the Image
         ImageIcon i3 =new ImageIcon(i2);  
         JLabel image = new JLabel(i3);  
         image.setBounds(0,0,1120,630);  
         add(image);       
        
         JLabel label =new JLabel("Employee Management System");        //This is to set the name on the right side above the tabs. 
         label.setBounds(650,380,1100,50);
         label.setForeground(Color.BLUE);
         label.setFont(new Font("serif",Font.BOLD,30));
         image.add(label);
             
          Add =new JButton("ADD EMPLOYEE");
         Add.setBounds(680,440,170,50);
          Add.addActionListener(this);                                        //When button is clicked a new tab will open
         image.add(Add);
         
          View = new JButton("VIEW EMPLOYEES");
         View.setBounds(870,440,170,50);
         View.addActionListener(this);                                      //When button is clicked a new tab will open
         image.add(View);
           
         Remove =new JButton("REMOVE EMPLOYEE");
         Remove.setBounds(680,500,170,50);
         Remove.addActionListener(this);                              //When button is clicked a new tab will open
         image.add(Remove);
         
          Update = new JButton("UPDATE RECORD");
         Update.setBounds(870,500,170,50);
          Update.addActionListener(this);                                  //When button is clicked a new tab will open
         image.add(Update);
         
         
         
        
         
        //This is to create the frame of the Home Page
        setSize(1120,630);
        setLocation(250,100);
        setBackground(Color.GRAY);
        setVisible(true);
         
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== View)                      // getSource will check, what is the source of the click event if it is Add it will execute this block
        {
             setVisible(false);
            new Viewemployee();
        }
        else if(ae.getSource() == Add)
        {
            setVisible(false);
           new AddEmployee();
           
        }
        else if(ae.getSource() == Update)
        {
            setVisible(false);
            new Viewemployee();
        }
        else if(ae.getSource() == Remove)
        {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args)
     {
        new Home();
     }

    
}
