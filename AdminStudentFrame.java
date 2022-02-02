package Student_Portal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminStudentFrame extends JFrame implements ActionListener{
	
	JButton b1,b2,b3,b4,b5,b6;
	JPanel p1,p2;
	
	AdminStudentFrame(){
		setLayout(null);
		setSize(1200, 700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.RED);

        b1 = new JButton("Add Student");
        b2 = new JButton("Delete Student");
        b3 = new JButton("Update Student");
        b4 = new JButton("Search Student");
        b5 = new JButton("Home");
        b5.addActionListener(this);
        b6 = new JButton("Exit");
        b6.addActionListener(this);
        b1.setBounds(450,50,250,50);
        b2.setBounds(450,150,250,50);
		b3.setBounds(450,250,250,50);
		b4.setBounds(450,350,250,50);
		b5.setBounds(450,450,250,50);
		b6.setBounds(450,550,250,50);
		
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
       // add(p1, BorderLayout.CENTER);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
        
        
       // p1 = new JPanel();
       // p1.setLayout(new FlowLayout());
       // p1.add(b5);
       /// p1.add(b6);
        
       // add(p1, BorderLayout.CENTER);
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == b1) {
			dispose();
			AdminStudentAddFrame adminStudentAddFrame = new AdminStudentAddFrame();
		
		} else if (src == b2) {
			dispose();
			AdminStudentDeleteFrame adminStudentDeleteFrame = new AdminStudentDeleteFrame();
			
		} else if (src == b3) {
			dispose();
			AdminStudentUpdateFrame adminStudentUpdateFrame = new AdminStudentUpdateFrame();
			
		} else if(src == b4) {
			dispose();
			AdminStudentSearchFrame adminStudentSearchFrame = new AdminStudentSearchFrame();	
		}else if(src == b5) {
			dispose();
			MainMenu m = new MainMenu();
		}
		else if(src == b6){
			dispose();
		}
		
	}
}
