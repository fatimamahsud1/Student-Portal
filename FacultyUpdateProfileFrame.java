package Student_Portal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FacultyUpdateProfileFrame extends JFrame implements ActionListener {
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton b1,b2,b3;
    Faculty_Panel faculty;
    
    public FacultyUpdateProfileFrame(Faculty_Panel faculty){
    	setLayout(null);
        setSize(1200, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        this.faculty = faculty;
        j1 = new JLabel("Update Faculty Profile");
        j1.setBounds(230, 10, 220, 100);
        j1.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
        add(j1);
        j2 = new JLabel("Name: ");
        j2.setBounds(50, 80, 70, 100);
        add(j2);
        j3 = new JLabel("ID number: ");
        j3.setBounds(50, 130, 140, 100);
        add(j3);
        j4 = new JLabel("Email: ");
        j4.setBounds(50, 180, 140, 100);
        add(j4);
        j5 = new JLabel("Gender: ");
        j5.setBounds(50, 230, 140, 100);
        add(j5);
        j6 = new JLabel("Contact number: ");
        j6.setBounds(50, 280, 140, 100);
        add(j6);
        j7 = new JLabel("Address: ");
        j7.setBounds(50, 330, 140, 100);
        add(j7);
        j8 = new JLabel("CNIC: ");
        j8.setBounds(50, 380, 140, 100);
        add(j8);
        j9 = new JLabel("Course: ");
        j9.setBounds(50, 430, 140, 100);
        add(j9);
        j1.setForeground(Color.white);
        j2.setForeground(Color.white);
        j3.setForeground(Color.white);
        j4.setForeground(Color.white);
        j5.setForeground(Color.white);
        j6.setForeground(Color.white);
        j7.setForeground(Color.white);
        j8.setForeground(Color.white);
        j9.setForeground(Color.white);

        t1 = new JTextField(15);
        t1.setBounds(400, 110, 150, 30);
        add(t1); 
        t2 = new JTextField(15);
        t2.setBounds(400, 160, 150, 30);
        add(t2);
        t3 = new JTextField(15);
        t3.setBounds(400, 210, 150, 30);
        add(t3);     
        t4 = new JTextField(15);
        t4.setBounds(400, 260, 150, 30);
        add(t4);
        t5 = new JTextField(15);
        t5.setBounds(400, 310, 150, 30);
        add(t5);
        t6 = new JTextField(15);
        t6.setBounds(400, 360, 150, 30);
        add(t6);       
        t7 = new JTextField(15);
        t7.setBounds(400, 410, 150, 30);
        add(t7);
        t8 = new JTextField(15);
        t8.setBounds(400, 460, 150, 30);
        add(t8);
        
        b1 = new JButton("Back");
        b1.setBounds(100,590,70,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Submit");
        b2.setBounds(230, 590, 80, 30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("Exit");
        b3.setBounds(370, 590, 70, 30);
        b3.addActionListener(this);
        add(b3);
        
        setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == b1) {
			dispose();
			WelcomeFaculty a  = new WelcomeFaculty(faculty);
		}
		else if (src == b2) {
			dispose();
			Faculty_Panel.updateProfile(t1.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText(), t6.getText(), t7.getText(), t8.getText());
			JOptionPane.showMessageDialog(null, "Information Updated Successfully");
		}
		else if (src == b3) {
			dispose();
		}
	}
}
