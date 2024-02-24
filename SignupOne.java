package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male, female , married, unmarried;
    JDateChooser dateChooser;
    
    SignupOne() {
        setLayout(null);
        
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong()% 9000L)+ 1000L);
        
        
        JLabel formno = new JLabel ("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        
        
        JLabel personDetails = new JLabel ("Page 1: Personal Details.");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        personDetails.setBounds(300, 100, 500, 25);
        add(personDetails);
        
        JLabel Name = new JLabel ("Name :");
        Name.setFont(new Font("Raleway", Font.BOLD, 18));
        Name.setBounds(120, 200, 200, 25);
        add(Name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        nameTextField.setBounds(300, 200, 450, 25);
        add(nameTextField);
        
        
        JLabel fname = new JLabel("Father Name :");
        fname.setFont( new Font( "Raleway", Font.BOLD, 18));
        fname.setBounds(120,240,200,25);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        fnameTextField.setBounds(300, 240, 450, 25);
        add(fnameTextField);
        
        
        JLabel dob = new JLabel ("Date Of Birth : ");
        dob.setFont( new Font("Raleway",Font.BOLD,18));
        dob.setBounds(120,280,400,25);
        add(dob);
      
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,280,350,25);
        dateChooser.setForeground(Color.BLUE);
        add(dateChooser);
        
        JLabel gender = new JLabel( "Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(120,320,350,25);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(300,320,60,30);
        add(male);
        
       
        female = new JRadioButton("Female");
        female.setBounds(450,320,70,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email = new JLabel( "Email-ID :");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(120,360,200,25);
        add(email);
        
       emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        emailTextField.setBounds(300, 360, 450, 25);
        add(emailTextField);
        
        
        JLabel marital = new JLabel( "Marital Status :");
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        marital.setBounds(120,400,350,25);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBackground(Color.WHITE);
        married.setBounds(300,400,70,30);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(450,400,90,30);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
        JLabel address = new JLabel( "Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(120,440,350,25);
        add(address);
        
    addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        addressTextField.setBounds(300, 440, 450, 25);
        add(addressTextField);
        
        JLabel city = new JLabel( "City :");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(120,480,350,25);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        cityTextField.setBounds(300, 480, 450, 25);
        add(cityTextField);
        
        
        
        JLabel state = new JLabel( "State :");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(120,520,350,25);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        stateTextField.setBounds(300, 520, 450, 25);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel( "Pin-code :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 18));
        pincode.setBounds(120,560,350,25);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        pinTextField.setBounds(300, 560, 450, 25);
        add(pinTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setVisible(true);
        setLocation(350,10);
    }
public void actionPerformed(ActionEvent ae) {
    String formno = "" + random; 
    String name = nameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
  
    String gender = null;
    if (male.isSelected()) {
        gender = "Male";
    } else if (female.isSelected()) {
        gender = "Female";
    }
    
    String email = emailTextField.getText();
    
    String marital = null;
    if (married.isSelected()) {
        marital = "Married";
    } else if (unmarried.isSelected()) {
        marital = "Unmarried";
    }
    
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pin = pinTextField.getText();
    
 try {
     if (name.equals("")) {
         JOptionPane.showMessageDialog(null,"Name is Required");
     }
     
     if (address.equals("")) {
         JOptionPane.showMessageDialog(null,"Address Is Required");
     }
     
     if (fname.equals("")) {
         JOptionPane.showMessageDialog(null,"Fill Father Name");
     }
     
     if (pin.equals("")) {
         JOptionPane.showMessageDialog(null,"Fill Pincode");
     } else {
         Conn c = new Conn();
         String query = "insert into signup values('"+formno+"' ,'"+name+"' ,'"+fname+"' ,'"+dob+"' ,'"+gender+"' ,'"+email+"' ,'"+marital+"' ,'"+address+"' ,'"+city+"' ,'"+pin+"' ,'"+state+"' )";
      c.s.executeUpdate(query);
     }
     
     setVisible(false);
     new SignupTwo(formno).setVisible(true);
     
 }  catch (Exception e) {
     System.out.println(e);
 }
        
}
    
    public static void main(String args[]) {
       new SignupOne();
    }
}
