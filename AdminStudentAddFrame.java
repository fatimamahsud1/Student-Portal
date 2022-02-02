package Student_Portal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class AdminStudentAddFrame extends JFrame implements ActionListener{
	
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1, b2, b3, b4;
    String[] subjects = {"", "", ""};
	
	public AdminStudentAddFrame(){

		setLayout(null);
        setSize(1200, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        j1 = new JLabel("Admin Student Add Frame");
        j1.setBounds(230, 10, 220, 100);
        j1.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
        add(j1);
        j2 = new JLabel("Name: ");
        j2.setBounds(50, 80, 70, 100);
        add(j2);
        j3 = new JLabel("Registration number: ");
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
        j9 = new JLabel("Semester: ");
        j9.setBounds(50, 430, 140, 100);
        add(j9);
        j10 = new JLabel("Fee Paid Status: ");
        j10.setBounds(50, 480, 140, 100);
        add(j10);
        
        j11 = new JLabel("Courses Selected: ");
        j11.setBounds(50, 530, 140, 100);
        add(j11);

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
        j11.setForeground(Color.white);

        j12 = new JLabel("");
        j12.setBounds(400, 530, 200, 100);
        add(j12);
        
        j13 = new JLabel("");
        j13.setBounds(400, 560, 200, 100);
        add(j13);
        
        j14 = new JLabel("");
        j14.setBounds(400, 590, 200, 100);
        add(j14);
        
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
        t8.setText("");
        add(t8);
        
        t9 = new JTextField(15);
        t9.setBounds(400, 510, 150, 30);
        add(t9);
        
        b1 = new JButton("Back");
        b1.setBounds(50,670,70,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Submit");
        b2.setBounds(200, 670, 80, 30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("Select Courses");
        b3.setBounds(350, 670, 140, 30);
        add(b3);
        b3.addActionListener(this);
        
        b4 = new JButton("Exit");
        b4.setBounds(550, 670, 70, 30);
        add(b4);
        b4.addActionListener(this);

        setVisible(true);
	}


    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        String username = Admin_Panel.generate_id();
        String password = "cui123";
        if (src == b1) {
            dispose();
            AdminFrame a = new AdminFrame();
        } else if(src == b2) {
            Student_Panel s = new Student_Panel(t1.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText(), t6.getText(), t7.getText(), username, password, Boolean.parseBoolean(t9.getText()), t8.getText(), subjects[0], subjects[1], subjects[2]);
            Student_Panel.writeStudent(s);
            JOptionPane.showMessageDialog(null, "Student's ID is: " + username + "\nStudent Successfully Created!");
        } else if(src == b3) {
            if(t8.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Semester First");
            } else if(t1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Enter Name First");
            } else {
                AdminStudentAddSelectCoursesFrame aa = new AdminStudentAddSelectCoursesFrame(t1.getText(), Integer.parseInt(t8.getText()));
                subjects = aa.get_sem();
                j12.setText(subjects[0]);
                j13.setText(subjects[1]);
                j14.setText(subjects[2]);
            }
        } else {
            dispose();
        }
    }
}