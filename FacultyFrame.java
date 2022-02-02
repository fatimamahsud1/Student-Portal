package Student_Portal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FacultyFrame extends JFrame implements ActionListener{
	JButton j1,j2,j3;
	JPanel p1;
	JLabel l1,l2;
	JTextField t1,t2;
	Border b;
	public FacultyFrame() {
		setLayout(null);
        setSize(1200, 700);
        getContentPane().setBackground(Color.RED);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = BorderFactory.createLineBorder(Color.black);
        
        l1 = new JLabel("Username ");
        l1.setBounds(30,90,150,50);
        
        l2 = new JLabel("Password ");
        l2.setBounds(30,140,150,50);
        
        t1 = new JTextField(10);
        t1.setBounds(170,110,160,20);
        t1.setBorder(b);
        
        t2 = new JTextField(10);
        t2.setBounds(170,160,160,20);
        t2.setBorder(b);
        
        j1 = new JButton("Home");
        j1.setBounds(30,350,70,30);
        j1.setBackground(Color.white);
        j1.setBorder(b);
        
        j3 = new JButton("Login");
        j3.setBounds(150, 350, 70, 30);
        j3.setBackground(Color.white);
        j3.setBorder(b);
        
        j2 = new JButton("Exit");
        j2.setBounds(270, 350, 70, 30);
        j2.setBackground(Color.white);
        j2.setBorder(b);


        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(j1);
        add(j3);
        add(j2);
        
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
        
	}

	
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		if (src == j1) {
			dispose();
			MainMenu m = new MainMenu();
		}
		else if (src == j2) {
			dispose();
		}
		
		else if (src == j3) {
			String username = t1.getText();
			String password = t2.getText();
			
			if(username.equals("") && password.equals(""))
				JOptionPane.showMessageDialog(null, "Invalid Username and Password!");
			else if(username.equals(""))
				JOptionPane.showMessageDialog(null, "Enter A Valid Username");
			else if(password.equals(""))
				JOptionPane.showMessageDialog(null, "Enter a Valid Password");
			else if(Faculty_Panel.check_username(username) && Faculty_Panel.check_password(password)) {
				Faculty_Panel faculty = Faculty_Panel.getFacultybyUsername(username);
				dispose();
				WelcomeFaculty a = new WelcomeFaculty(faculty);
			} else {
				JOptionPane.showMessageDialog(null, "Username or Password Not Found!");
			}
		}
	} 
}
