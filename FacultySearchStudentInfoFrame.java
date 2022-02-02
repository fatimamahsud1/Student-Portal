package Student_Portal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FacultySearchStudentInfoFrame extends JFrame implements ActionListener{
	Quiz quiz;
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11;
	JButton b1,b2;
	Student_Panel student;
	Faculty_Panel faculty;
	String course;
	int total_assignments, total_quiz, courseIndex;
	
	FacultySearchStudentInfoFrame(Student_Panel student, Faculty_Panel faculty, String courseName, int index){
		setLayout(new BorderLayout());
        setSize(1200, 700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        this.student = student;
        this.faculty = faculty;
        this.course = courseName;
        this.courseIndex = index;
        
        
        /*for (int i = 0; i < student.courses.get(courseIndex).assignments.size(); i++) {
        	total_assignments += student.courses.get(courseIndex).assignments.get(i).assessment_marks;      	
        }
        for (int i = 0; i < student.courses.get(courseIndex).quiz.size(); i++) {
        	total_quiz += student.courses.get(courseIndex).quiz.get(i).assessment_marks;      	
        }*/
        
   
        
        j1 = new JLabel("Student Info" );
        j1.setBounds(200, 10, 220, 100);
        j1.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
        add(j1);
        j2 = new JLabel("Name:    " + student.name);
        j2.setBounds(50, 100, 200, 100);
        add(j2);
        j3 = new JLabel("Registration number:   " + student.ID);
        j3.setBounds(50, 150, 200, 100);
        add(j3);
        j4 = new JLabel("Emal:	" + student.email);
        j4.setBounds(50, 200, 200, 100);
        add(j4);
        j5 = new JLabel("Gender: "+ student.gender);
        j5.setBounds(50, 250, 200, 100);
        add(j5);
        j6 = new JLabel("Contact Number:	" + student.contact_number);
        j6.setBounds(50, 300, 200, 100);
        add(j6);
        j7 = new JLabel("Address:	" + student.address);
        j7.setBounds(50, 350, 200, 100);
        add(j7);
        j8 = new JLabel("Quiz 1 marks:			8 out of 15");
        j8.setBounds(50, 400, 200, 100);
        add(j8);
        j9 = new JLabel("Quiz 2 marks:			10 out of 15");
        j9.setBounds(50, 450, 200, 100);
        add(j9);
        j10 = new JLabel("Quiz 3 marks:			7 out of 15");
        j10.setBounds(50, 500, 200, 100);
        add(j10);
        j11 = new JLabel("Quiz 4 marks:			15 out of 15");
        j11.setBounds(50, 550, 200, 100);
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

        b1 = new JButton("Exit");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == b1) {
			dispose();
		}
		else if (src == b2) {
			dispose();
			FacultyStudentSearchFrame a = new FacultyStudentSearchFrame(faculty);
		}
		
	}
}
