package Student_Portal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FacultyStudentSearchFrame extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2,b3;
	Faculty_Panel faculty;
	
	FacultyStudentSearchFrame(Faculty_Panel faculty){
		setLayout(null);
        setSize(1200, 700);
        setVisible(true);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        this.faculty = faculty;
        l1 = new JLabel("Search Student Frame");
        l1.setBounds(200, 10, 220, 100);
        l1.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
        add(l1); 
        l2 = new JLabel("Enter Student's name: ");
        l2.setBounds(40, 100, 200, 100);
        add(l2);
        l3 = new JLabel("Enter Registration number: ");
        l3.setBounds(40, 250, 200, 100);
        add(l3);
        t1 = new JTextField(15);
        t1.setBounds(250, 140, 200, 30);
        add(t1);
        t2 = new JTextField(15);
        t2.setBounds(250, 290, 200, 30);
        add(t2);
        b1 = new JButton("Search");
        b1.setBounds(220, 530, 90, 30);
        add(b1);
        b2 = new JButton("Back");
        b2.setBounds(110, 530, 70, 30);
        add(b2);
        b3 = new JButton("Exit");
        b3.setBounds(350, 530, 70, 30);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		boolean check = false;
		if (src == b1) {
			dispose();
			Student_Panel s = Faculty_Panel.searchStudent(t1.getText(), t2.getText());
			for (int i = 0; i < 3; i++) {
				if (s.courses.get(i).course_name.equals(faculty.course)) {
					FacultySearchStudentInfoFrame n = new FacultySearchStudentInfoFrame(s, faculty, faculty.course, i);
					check = true;
					break;
				}
			}
			if (check == false) 
				JOptionPane.showMessageDialog(null, "Student not found!");
		}
		else if (src == b2) {
			dispose();
			WelcomeFaculty f = new WelcomeFaculty(faculty);
		}
		else if (src == b3) {
			dispose();
		}
		
	}
}
