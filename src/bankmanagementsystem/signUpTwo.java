package bankmanagementsystem;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class signUpTwo extends JFrame implements ActionListener{
     JTextField pan,aadhar;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    JButton next;
   
    String formno;
    
    signUpTwo(String formno){
  
    this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        
       
        
        
        JLabel additionaldetails=new JLabel("Page 2:ADDITIONAL DETAILS");
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(250,80,400,30);
        add(additionaldetails);
        
        JLabel name=new JLabel("RELIGION:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
       name.setBounds(50,140,200,30);
        add(name);
        
        String valReligion[]={"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHER"};
         religion=new JComboBox(valReligion);
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.WHITE);
        add(religion);
        
    
         JLabel fname=new JLabel("CATEGORY:");
         fname.setFont(new Font("Raleway",Font.BOLD,22));
       fname.setBounds(50,190,400,30);
        add(fname);
        
        String valCategory[]={"GENERAL","OBC","SC","ST","OTHER"};
                 category=new JComboBox(valCategory);
                category.setBounds(300,190,400,30);
                category.setBackground(Color.WHITE);
                add(category);
        
        JLabel dob=new JLabel("INCOME:");
         dob.setFont(new Font("Raleway",Font.BOLD,22));
       dob.setBounds(50,240,400,30);
        add(dob);
        
        String incomeCategory[]={"NULL","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
                 income=new JComboBox(incomeCategory);
                income.setBounds(300,240,400,30);
                income.setBackground(Color.WHITE);
                add(income);
        
         
        
        
         JLabel gender=new JLabel("EDUCATIONAL");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
       gender.setBounds(50,290,400,30);
        add(gender);
        
        JLabel email=new JLabel("QUALIFICATION:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
       email.setBounds(50,330,400,30);
        add(email);
        
         
        String educationalvalues[]={"NON-GRADUATION","GRADUATION","POST-GRADUATION","DOCTRATE","OTHER"};
                 education=new JComboBox(educationalvalues);
                education.setBounds(300,340,400,30);
                education.setBackground(Color.WHITE);
        add(education);
        
        
        
         JLabel marital=new JLabel("OCCUPATION:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
       marital.setBounds(50,390,400,30);
        add(marital);
            
        String occupationvalues[]={"SALARIED","SELF-EMPLOYED","BUSSINESSMAN","STUDENT","RETIRED","OTHER"};
                 occupation=new JComboBox(occupationvalues);
                occupation.setBounds(300,390,400,30);
                occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
         JLabel address=new JLabel("PAN NUMBER:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
       address.setBounds(50,440,400,30);
        add(address);
        
          pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
         JLabel city=new JLabel("AADHAR NUMBER:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
       city.setBounds(50,490,600,30);
        add(city);
        
          aadhar=new JTextField();
          aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state=new JLabel("SENIOR CITIZEN:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
       state.setBounds(50,540,400,30);
        add(state);
        
        syes=new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
         sno=new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
          JLabel pincode=new JLabel("EXISTING ACCOUNT:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
       pincode.setBounds(50,590,400,30);
        add(pincode);
        
          eyes=new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
         eno=new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existinggroup=new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
         
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
        
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="YES";
        }else if(sno.isSelected()){
            seniorcitizen="NO";
        }
        
        String existingaccount="null";
        if(eyes.isSelected()){
            existingaccount="YES";
        }else if(eno.isSelected()){
            existingaccount="NO";
        }
        String span=pan.getText();
        String saadhar=aadhar.getText();
        
        try{
                    conn c=new conn();          
                String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+existingaccount+"','"+span+"','"+saadhar+"')";
            c.s.executeUpdate(query);
           //signup 3 object
           setVisible(false);
           new signUpThree(formno).setVisible(true);
           
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        new signUpTwo("");
}
}