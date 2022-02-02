package Student_Portal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FacultyProfileFrame extends JFrame implements ActionListener{
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
	JButton b1,b2,b3;
	Faculty_Panel faculty;
	
	public FacultyProfileFrame(Faculty_Panel faculty) {
		setLayout(null);
        setSize(1200, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        this.faculty = faculty;
        j1 = new JLabel("Faculty Profile");
        j1.setBounds(280, 20, 220, 100);
        j1.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
        add(j1);
        j2 = new JLabel("Name:    " + faculty.name);
        j2.setBounds(50, 100, 200, 100);
        add(j2);
        j3 = new JLabel("ID number:   " + faculty.ID);
        j3.setBounds(50, 150, 200, 100);
        add(j3);
        j4 = new JLabel("Email:    " + faculty.email);
        j4.setBounds(50, 200, 200, 100);
        add(j4);
        j5 = new JLabel("Gender:    " + faculty.gender);
        j5.setBounds(50, 250, 200, 100);
        add(j5);
        j6 = new JLabel("Contact number:    " + faculty.contact_number);
        j6.setBounds(50, 300, 200, 100);
        add(j6);
        j7 = new JLabel("Address:    " + faculty.address);
        j7.setBounds(50, 350, 250, 100);
        add(j7);
        j8 = new JLabel("CNIC:    " + faculty.CNIC);
        j8.setBounds(50, 400, 200, 100);
        add(j8);
        
        j9 = new JLabel("Course:");
        j9.setBounds(50, 450, 200, 100);
        add(j9);
        
        j10 = new JLabel(faculty.course);
        j10.setBounds(110, 450, 200, 100);
        add(j10);
        
        b1 = new JButton("Back");
        b1.setBounds(100,650,70,30);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Log Out");
        b2.setBounds(300, 650, 80, 30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("Exit");
        b3.setBounds(500, 650, 70, 30);
        add(b3);
        b3.addActionListener(this);
        j1.setForeground(Color.white);
        j2.setForeground(Color.white);
        j3.setForeground(Color.white);
        j4.setForeground(Color.white);
        j5.setForeground(Color.white);
        j6.setForeground(Color.white);
        j7.setForeground(Color.white);
        j8.setForeground(Color.white);
        j9.setForeground(Color.white);
        j10.setForeground(Color.white);

        setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == b1) {
			dispose();
			WelcomeFaculty f = new WelcomeFaculty(faculty);
		}
		else if (src == b2) {
			dispose();
			FacultyFrame f = new FacultyFrame();
		}
		else
			dispose();
		
	}
}
