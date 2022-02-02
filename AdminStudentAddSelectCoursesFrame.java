package Student_Portal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AdminStudentAddSelectCoursesFrame extends JFrame implements ActionListener{
	
	JList list;
	JLabel j1, j2;
	JButton b1;
	int semester;
	String strCourses = "";

	String sem1[] = {"ICT", "Islamic Studies"};
	String sem2[] = {"Programming Fundamentals", "Digital Logic Design"};
	String sem3[] = {"Data Structures and Algorithms", "Communication Skills"};
	String sem4[] = {"Pak Studies", "Operating Systems"};
	String sem5[] = {"Artificial Intelligence"};
	String sem6[] = {"Compiler Construction", "Embedded Systems"};
	String sem7[] = {"Mobile App Development", "Web Technology"};
	String sem8[] = {"Introduction to Bioinformatics", "French" };
	
	
	AdminStudentAddSelectCoursesFrame(String name, int semester){



		setLayout(null);
		setSize(1200, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.semester = semester;
		getContentPane().setBackground(Color.RED);


        j1 = new JLabel("Course Selection Menu");
        j1.setBounds(200, 50, 300, 100);
        j1.setFont(new Font("Sanserif", Font.PLAIN, 25));
        add(j1);
        
        j2 = new JLabel(name + ", Kindly Select Courses for semester " + semester);
        j2.setBounds(50, 150, 400, 100);
        j2.setFont(new Font("Sanserif", Font.PLAIN, 15));
        add(j2);
        
        if(semester == 1)
            list = new JList(sem1);
        else if(semester == 2)
            list = new JList(sem2);
        else if(semester == 3)
            list = new JList(sem3);
        else if(semester == 4)
            list = new JList(sem4);
        else if(semester == 5)
            list = new JList(sem5);
        else if(semester == 6)
            list = new JList(sem6);
        else if(semester == 7)
            list = new JList(sem7);
        else
        	list = new JList(sem8);

		j1.setForeground(Color.white);
		j2.setForeground(Color.white);

        list.setBounds(200,300,200,150);
        list.setVisibleRowCount(3);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(list);
        
        b1 = new JButton("Submit");
        b1.setBounds(300, 600, 100, 30);
        add(b1);
        b1.addActionListener(this);
        
        setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		if(src == b1) {
			if(getSelectedIndex()) {
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Please Select all Courses");
			}
		}
	}
	
	public boolean getSelectedIndex() {
		int[] selectedIndices = list.getSelectedIndices();
		String[] myArray = new String[3];
		for (int i = 0; i < selectedIndices.length; i++) {
		               myArray[i] =  String.valueOf(list.getModel().getElementAt(selectedIndices[i]));
		 }
			for(int i = 0; i < myArray.length; i++) {
				if(myArray[i] == null)
					return false;
			}
		return true;
	}
	
	public String[] get_sem() {
		 if(semester == 1)
			 return sem1;
	        else if(semester == 2)
				 return sem2;
	        else if(semester == 3)
				 return sem3;
	        else if(semester == 4)
				 return sem4;
	        else if(semester == 5)
				 return sem5;
	        else if(semester == 6)
				 return sem6;
	        else if(semester == 7)
				 return sem7;
	        else
				 return sem8;
	}
}
