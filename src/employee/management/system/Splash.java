package employee.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Splash extends JFrame implements ActionListener
{
     Splash()
     {
            // This is to set the background colour of the frame
         getContentPane().setBackground(Color.WHITE);  //4> getContentPane() is to take access of the whole frame after that we will put color in the frame using setBackgroundcolor().Inside the setbackground we have to put color (As the color class is in AWT package so we have to import that package ,to put color). 
        
              
         setLayout(null);  //6>As we have to put the content according to my need at my preferred place (hence,we dont want to use the inbuilt layouts provided by swing).  so Null.
      
           // This is to Create the Heading text and place it in a specified position 
         JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM"); //5> To write the Text in the Frame we have to use JLabel class (We have to create an  object of JLabel and in the constructor call we have to type the Text).
         heading.setBounds(75,30,1200,60);   //7> This is to set the position of the text content.
         heading.setFont(new Font("serif",Font.PLAIN,60));  //8> This is to set the  size of the text content.  For this 1st we have to create an Object of Font Class and then pass the parameters ie.fontstyle,fonttype,fontsize
         heading.setForeground(Color.BLACK);                //9> To change colour of the foreground.  
         add(heading);               //5>By default the component won't be visible ,so we have to add the component(i.e heading) by using add() 
         
         
            //Adding Image to the Frame
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png")); // 10>This is to put an Image  in the frame. First we have created an object of Image Class.After that we have to call the getSystem Resources of the ClassLoader classs inside the paranthesis we have to write the address of the Image) 
         Image i2 =i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);  // 11> As we have to Scale the Image in the frame we are using this .
         ImageIcon i3 =new ImageIcon(i2);  // 12> We have to convert the Object Reference of Image class to an Image Icon hence we are using this.We cannot pass the Image class obj Reference directly in Jlabel.
         JLabel image = new JLabel(i3);   //13>As we cannot ad the ImgeIcon directly to the frame  ,so we have to create a JLabel as we can add the JLabel in the frame.
         image.setBounds(60,100,1050,500);   //15> Setting the imae to the correct position. 
         add(image);                      //14> We can add the image now 
         
             //Adding button to the frame to move to further pages
         
         JButton clickhere = new JButton("CLICK HERE TO CONTINUE"); //16>This is to create a button (We have created an object Reference of Button.
         clickhere.setFont(new Font("serif",Font.BOLD,20));
         clickhere.setBounds(350,430,350,50);           //17> This id to set the position of the button in the frame.
         clickhere.setBackground(Color.cyan);                       //19>Set the background color of the  button
        
         clickhere.addActionListener(this);            //This iis a Method which is used to perform an Event. this will call the overridden Action Listener Method.
         
         
         image.add(clickhere);                                     // 18> This is to add the button to the frame 
         
         
           //THis is to create a frame
           
         setSize(1170,650);    // 1> This Function set Size is to create a frame which of mentioned height.By default the visibility is hidden.
         setLocation(200,50);        //3>As by default the frame will open at top left corner ,inorder to open it at a particular location in the screen set locatin is used.  it will take 2 args distance from left ,distance from top. 
         setVisible(true);              //2>As the previous function was to set the size, setVisible() is to display it.
         
         while(true)                                     //20> As we have to  make the Heading of the Page dippper so we will be using infinite while loop.
         {
             heading.setVisible(false);               //In the loop first make the visibilty hidden and in the next setvisible code we have to make it nothidden(i.e true) 
             try{
                   Thread.sleep(700);                  //This is to alter the flow(ie.stop for sometime) of the execution .This sleep method takes time for it to execute .
             }catch(Exception e)
             {
                 
             }
             heading.setVisible(true);  
             try{
                   Thread.sleep(700);                     //This is to alter the flow(ie.stop for sometime) of the execution
             }catch(Exception e)
             {
                 
             }
         }
        
     }
     @Override
    public void actionPerformed(ActionEvent ae)     //Action Listener method will call this  method
    {
       setVisible(false);                           //After this the visibility of the the Starting page will close(As the visibility is Hidden
       new Login();                                    //and this new Login will call The constructor of the Login Class. and Open the Login Page.
    }
    
    public static void main(String args[])
    {
        new Splash();
    }

    
}
