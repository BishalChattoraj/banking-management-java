package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class signUpThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    signUpThree(String formno){
        this.formno=formno;
        
        
        
        
        setLayout(null);
        JLabel l1=new JLabel("PAGE 3: ADDITIONAL DETAILS");
        l1.setFont(new Font ("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("ACCOUNT TYPE:");
        type.setFont(new Font ("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        type.setBackground(Color.WHITE);
        add(type);
        
        
        r1=new JRadioButton("SAVINGS ACCOUNT");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,250,30);
        add(r1);
        
        r2=new JRadioButton("FIXED DEPOSIT ACCOUNT");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3=new JRadioButton("CURRENT ACCOUNT");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4=new JRadioButton("RECURRING ACCOUNT");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
         JLabel card=new JLabel("CARD NUMBER:");
        card.setFont(new Font ("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        card.setBackground(Color.WHITE);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font ("Raleway",Font.BOLD,22));
        number.setBounds(330,300,250,30);
        number.setBackground(Color.WHITE);
        add(number);
        
           JLabel carddetails=new JLabel("YOUR 16 DIGIT CARD NUMBER");
        carddetails.setFont(new Font ("Raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,200,20);
        carddetails.setBackground(Color.WHITE);
        add(carddetails);
        
          JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font ("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        pin.setBackground(Color.WHITE);
        add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font ("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,250,30);
        pnumber.setBackground(Color.WHITE);
        add(pnumber);
        
         JLabel pindetails=new JLabel("YOUR 4 DIGIT PIN");
        pindetails.setFont(new Font ("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,200,20);
        pindetails.setBackground(Color.WHITE);
        add(pindetails);
        
         JLabel services=new JLabel("SERVICES REQUIRED:");
        services.setFont(new Font ("Raleway",Font.BOLD,22));
        services.setBounds(100,450,250,20);
        services.setBackground(Color.WHITE);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,490,200,30);
        add(c1);
        
         c2=new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,490,200,30);
        add(c2);
        
         c3=new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,540,200,30);
        add(c3);
        
         c4=new JCheckBox("EMAIL & SMS ALERTS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,540,200,30);
        add(c4);
        
          c5=new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,590,200,30);
        add(c5);
        
          c6=new JCheckBox("E-STATEMENTS");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,590,200,30);
        add(c6);
        
          c7=new JCheckBox("I HEREBY DECLARES THE ABOVE GIVEN INFORMATION IS CORRECT ACCORDING TO MY KNOWLEDGE ");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,620,600,30);
        add(c7);
        
        submit=new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,16));
        submit.setBounds(400,680,150,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,16));
        cancel.setBounds(600,680,150,30);
        cancel.addActionListener(this);
        add(cancel);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accounttype="null";
            if(r1.isSelected()){
                accounttype="SAVINGS ACCOUNT";
            }else if(r2.isSelected()){
                accounttype="FIXED DEPOSIT ACCOUNT";
            }else if(r3.isSelected()){
                accounttype="CURRENT ACCOUNT";
            }else if(r4.isSelected()){
                accounttype="RECURRING ACCOUNT";
            }
            
            
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
            
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
            
            String facility="";
            if(c1.isSelected()){
                facility=facility+"ATM CARD";
            }else if(c2.isSelected()){
                facility=facility+"INTERNET BANKING";
            }else if(c3.isSelected()){
                facility=facility+"MOBILE BANKING";
            }else if(c4.isSelected()){
                facility=facility+"EMAIL & SMS ALERTS";
            }else if(c5.isSelected()){
                facility=facility+"CHEQUE BOOK";
            }else if(c6.isSelected()){
                facility=facility+"E-STATEMENTS";
            }
            
            try{
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"ACCOUNT TYPE IS REQUIRED");
                }else{
                    conn c=new conn();
                        String query1="insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                        String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
              c.s.executeUpdate(query1);
              c.s.executeUpdate(query2);
              
              JOptionPane.showMessageDialog(null,"CARD NUMBER:"+cardnumber+"\n PIN:"+pinnumber);
              
              setVisible(false);
              new deposit(pinnumber).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
     new signUpThree("");   
    }
}
