package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class withdrawl extends JFrame implements ActionListener{
    
     JButton withdrawl,back;
    JTextField amount;
    String pinnumber;
    
    
    
    
    withdrawl(String pinnumber){
    setLayout(null);
        this.pinnumber=pinnumber;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
        JLabel text=new JLabel("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,12));
        text.setBounds(150,270,400,20);
        image.add(text);
        
         amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setBounds(150,310,300,25);
        image.add(amount);
        
         withdrawl=new JButton("WITHDRAW");
        withdrawl.setBounds(355,420,100,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
           back=new JButton("BACK");
        back.setBounds(355,460,100,30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(800,800);
        setLocation(300,0);
        setVisible(true);
}
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdrawl){
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE AMOUNT YOU WANT TO WITHDRAW");
            }else{
                try{
                conn c=new conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','WITHDRAW','"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" Withdrawn Successfully");
                setVisible(false);
                new transaction(pinnumber).setVisible(true);
            }catch(Exception e){
                    System.out.println(e);
            }
            }
            
            
            
            
            
            
        }else if(ae.getSource()==back){
            setVisible(false);
            new transaction(pinnumber).setVisible(true);
        }
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        new withdrawl("");
    }
}
