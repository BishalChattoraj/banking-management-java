package bankmanagementsystem;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class signUpOne extends JFrame implements ActionListener{
    Long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    signUpOne(){
        setLayout(null);
        Random ran=new Random();
         random=Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel formno=new JLabel("APPLICATION NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(180,20,600,40);
        add(formno);
        
        
        JLabel personaldetails=new JLabel("Page 1:PERSONAL DETAILS");
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        personaldetails.setBounds(250,80,400,30);
        add(personaldetails);
        
        JLabel name=new JLabel("NAME:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
       name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
         JLabel fname=new JLabel("FATHER'S NAME:");
         fname.setFont(new Font("Raleway",Font.BOLD,22));
       fname.setBounds(100,190,400,30);
        add(fname);
        
          fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob=new JLabel("DATE OF BIRTH:");
         dob.setFont(new Font("Raleway",Font.BOLD,22));
       dob.setBounds(100,240,400,30);
        add(dob);
        
         dateChooser =new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
         JLabel gender=new JLabel("GENDER:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
       gender.setBounds(100,290,400,30);
        add(gender);
        
         male=new JRadioButton("MALE");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
         female=new JRadioButton("FEMALE");
        female.setBounds(450,290,100,30);
         female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup =new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email=new JLabel("EMAIL ADDRESS:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
       email.setBounds(100,340,400,30);
        add(email);
        
          emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
         JLabel marital=new JLabel("MARITAL STATUS:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
       marital.setBounds(100,390,400,30);
        add(marital);
        
        
         
         married=new JRadioButton("MARRIED");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
         unmarried=new JRadioButton("UNMARRIED");
        unmarried.setBounds(450,390,100,30);
         unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         other=new JRadioButton("OTHER");
        other.setBounds(630,390,100,30);
         other.setBackground(Color.WHITE);
        add(other);
        
         ButtonGroup maritalgroup =new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
         JLabel address=new JLabel("ADDRESS:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
       address.setBounds(100,440,400,30);
        add(address);
        
          addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
         JLabel city=new JLabel("CITY:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
       city.setBounds(100,490,400,30);
        add(city);
        
          cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state=new JLabel("STATE:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
       state.setBounds(100,540,400,30);
        add(state);
        
         stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
          JLabel pincode=new JLabel("PINCODE:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
       pincode.setBounds(100,590,400,30);
        add(pincode);
        
          pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
          next=new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
        getContentPane().setBackground(Color.WHITE);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno=""+random;
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender="null";
        if(male.isSelected()){
            gender="MALE";
        }else if(female.isSelected()){
            gender="FEMALE";
        }
        String email=emailTextField.getText();
        String marital="null";
        if(married.isSelected()){
            marital="MARRIED";
        }else if(unmarried.isSelected()){
            marital="UNMARRIED";
        }else if(other.isSelected()){
            marital="OTHER";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String Pin=pinTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"NAME IS REQUIRED");
            }else{
                conn c=new conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+Pin+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new signUpTwo(formno).setVisible(true);
            }
            
            
           
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
 
    
    
    public static void main(String args[]){
        new signUpOne();
    }

}