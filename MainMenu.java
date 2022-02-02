package Student_Portal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener{
    JButton j1;
	JButton j2;
	JButton j3;
	JLabel l1;
	ImageIcon icon;
	AdminFrame a;

	public MainMenu() {
		icon = new ImageIcon("sms.jpg");
	    l1 = new JLabel(icon);
		l1.setText("Student Management System");
		l1.setBounds(250,-80,650,500);
	    l1.setHorizontalTextPosition(JLabel.CENTER);
	    l1.setVerticalTextPosition(JLabel.TOP);
	    l1.setForeground(Color.white);
	    l1.setFont(new Font("Sanserif",Font.BOLD,35));
		setLayout(null);
		setSize(1200, 700);
        setVisible(true);
        setResizable(false);
        getContentPane().setBackground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j1 = new JButton("ADMIN");
		j2 = new JButton("FACULTY");
		j3 = new JButton("STUDENT");
		j1.setForeground(Color.black);
		j1.setBackground(Color.white);
		j2.setForeground(Color.black);
		j2.setBackground(Color.white);
		j3.setBackground(Color.white);
		j3.setForeground(Color.black);
		j1.setFont(new Font("Sanserif",Font.PLAIN,15));
		j2.setFont(new Font("Sanserif",Font.PLAIN,14));
		j3.setFont(new Font("Sanserif",Font.PLAIN,14));
		//j1.setOpaque(false);
		//j1.setContentAreaFilled(false);
		//j1.setBorderPainted(false);
		//j2.setOpaque(false);
		//j2.setContentAreaFilled(false);
		//j2.setBorderPainted(false);
		//j3.setOpaque(false);
		//j3.setContentAreaFilled(false);
		//.setBorderPainted(false);
		l1.setForeground(Color.white);
		j1.setBounds(350,245,450,70);
		j2.setBounds(350,345,450,70);
		j3.setBounds(350,445,450,70);
		add(j1);
		add(j2);
		add(j3);
		add(l1);
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == j1) {
			dispose();
			AdminFrame a = new AdminFrame();
		}
		else if (src == j2) {
			dispose();
			FacultyFrame f = new FacultyFrame();
		}
		else if (src == j3) {
			dispose();
			StudentFrame s = new StudentFrame();
		}
	}
	
}
