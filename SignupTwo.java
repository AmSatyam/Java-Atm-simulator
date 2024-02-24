package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno , eyes, eno;
    
    JComboBox religion,Income, Category, education, occupation ;
    String formno;
    
    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION - PAGE 2");
          
        
        
        
        JLabel additionalDetails = new JLabel ("Page 2: Additional Details.");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalDetails.setBounds(300, 100, 500, 25);
        add(additionalDetails);
        
        JLabel Name = new JLabel ("Religion :");
        Name.setFont(new Font("Raleway", Font.BOLD, 18));
        Name.setBounds(120, 200, 200, 25);
        add(Name);
        
        String valReligion[] = {"Hindu", "Sikh", "Christian", "Muslim", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 200, 450, 25);
        religion.setBackground(Color.WHITE);
        add(religion);
        
  
        JLabel fname = new JLabel("Category :");
        fname.setFont( new Font( "Raleway", Font.BOLD, 18));
        fname.setBounds(120,240,200,25);
        add(fname);
        
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        Category = new JComboBox(valCategory);
        Category.setBounds(300, 240, 450, 25);
        Category.setBackground(Color.WHITE);
        add(Category);
        
        
        
        JLabel dob = new JLabel ("Income : ");
        dob.setFont( new Font("Raleway",Font.BOLD,18));
        dob.setBounds(120,280,400,25);
        add(dob);
      
        String valIncome[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "upto 10,00000"};
        Income = new JComboBox(valIncome);
        Income.setBackground(Color.WHITE);
        Income.setBounds(300,280,400,25);
        add(Income);
        
        JLabel gender = new JLabel( "Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(120,320,350,25);
        add(gender);
        
        JLabel email = new JLabel( "Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(120,345,200,25);
        add(email);
        
        String educationValues[] = {"10th", "12th", "Graduated", "Post-Graduated", "Others"};
        education = new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300, 340, 450, 25);
        add(education);
        
        
        JLabel marital = new JLabel( "Occupation :");
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        marital.setBounds(120,400,350,25);
        add(marital);
        
        String occupationValues[] = {"Salaried", "Retired", "Self-employed", "Bussiness", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300, 400, 450, 25);
        add(occupation);
        
       
        
        JLabel address = new JLabel( "PAN No. :");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(120,440,350,25);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.PLAIN,14));
        pan.setBounds(300, 440, 450, 25);
        add(pan);
        
        JLabel city = new JLabel( "Aadhar No. :");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(120,480,350,25);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.PLAIN,14));
        aadhar.setBounds(300, 480, 450, 25);
        add(aadhar);
        
        
        
        JLabel state = new JLabel( "Senior Citizen :");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(120,520,350,25);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,520,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,520,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
       
        JLabel pincode = new JLabel( "Existing Account :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 18));
        pincode.setBounds(120,560,350,25);
        add(pincode);
        
       eyes = new JRadioButton("Yes");
        eyes.setBounds(300,560,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,560,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
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
//    String formno = "" + random; 
    String sreligion = (String) religion.getSelectedItem();
    String sCategory = (String) Category.getSelectedItem();
    String sIncome = (String) Income.getSelectedItem();
    String seducation = (String) education.getSelectedItem();
   String soccupation = (String) occupation.getSelectedItem();
   
    String seniorcitizen = null;
    if (syes.isSelected()) {
        seniorcitizen = "Yes";
    } else if (sno.isSelected()) {
        seniorcitizen = "No";
    }
    
    
    
    String existingaccount = null;
    if (eyes.isSelected()) {
        existingaccount = "Yes";
    } else if (eno.isSelected()) {
        existingaccount = "No";
    }
    
    String span = pan.getText();
    String saadhar = aadhar.getText();
    
    
 try {
//     if (occupation.equals("")) {
//         JOptionPane.showMessageDialog(null,"Occupation is Required");
//     }
//     
//     if (Income.equals("")) {
//         JOptionPane.showMessageDialog(null,"income Is Required");
//     }
//     
//     if (aadhar.equals("")) {
//         JOptionPane.showMessageDialog(null,"Fill aadhar");
//     }
//     
//     if (pan.equals("")) {
//         JOptionPane.showMessageDialog(null,"Fill Pan No.");
//     } else {
         Conn c = new Conn();
         String query = "insert into signuptwo values('"+formno+"' ,'"+sreligion+"' ,'"+sCategory+"' ,'"+sIncome+"' ,'"+seducation+"' ,'"+soccupation+"' ,'"+span+"' ,'"+saadhar+"' ,'"+seniorcitizen+"' ,'"+existingaccount+"' )";
      c.s.executeUpdate(query);
      
      //Signup3 Object
      
      setVisible(false);
      new SignupThree(formno).setVisible(true);
     } catch (Exception e) {
     System.out.println(e);
 }
        
}
    
    public static void main(String args[]) {
       new SignupTwo("");
    }
}
