package Student_Portal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class AdminFrame extends JFrame implements ActionListener{
	JButton j1,j2,j3,j4;
	ImageIcon y;
	JLabel l1;
	Border b;

	public AdminFrame() {
		setLayout(null);

		setSize(1200, 700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = BorderFactory.createLineBorder(Color.black);
        y = new ImageIcon("g.jpg");
		getContentPane().setBackground(Color.RED);
        l1 = new JLabel(y);
        l1.setBounds(0,0,800,450);
                  
        j1 = new JButton("Home");
        j2 = new JButton("Student");
        j3 = new JButton("Faculty");
        j4 = new JButton("Exit");
        j1.setBorder(b);
        j2.setBorder(b);
        j3.setBorder(b);
        j4.setBorder(b);
        j1.setBounds(450,100,200,50);
        j2.setBounds(450,200,200,50);
		j3.setBounds(450,300,200,50);
		j4.setBounds(450,400,200,50);
		//j1.setBackground(Color.white);
		j1.setFont(new Font("Sanserif",Font.PLAIN,18));
		j2.setFont(new Font("Sanserif",Font.PLAIN,17));
		j3.setFont(new Font("Sanserif",Font.PLAIN,18));
		j4.setFont(new Font("Sanserif",Font.PLAIN,18));


		
		add(j1);
	    add(j2);
		add(j3);
		add(j4);
		add(l1);
       
        
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
        j4.addActionListener(this);
        
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == j1) {
			dispose();
			MainMenu m = new MainMenu();
		} else if (src == j4) {
			dispose();
		} else if (src == j2) {
			dispose();
			AdminStudentFrame adminStudentFrame = new AdminStudentFrame();
		} else if (src == j3) {
			dispose();
			AdminFacultyFrame adminFacultyFrame = new AdminFacultyFrame();
		}
	}
}
