package Student_Portal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class AdminFacultyFrame extends JFrame implements ActionListener{
	
	JButton b1,b2,b3,b4,b5,b6;
	JPanel p1,p2;
	AdminFacultyFrame(){
		setLayout(new BorderLayout());
        setSize(1200, 700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        b1 = new JButton("Add Faculty");
        b2 = new JButton("Delete Faculty");
        b3 = new JButton("Update Faculty");
        b4 = new JButton("Search Faculty");
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);


        b1.setPreferredSize(new Dimension(250, 70));
        b2.setPreferredSize(new Dimension(250, 70));
        b3.setPreferredSize(new Dimension(250, 70));
        b4.setPreferredSize(new Dimension(250, 70));
        add(p1 , BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        b5 = new JButton("Home");
        b5.addActionListener(this);
        b6 = new JButton("Exit");
        b6.addActionListener(this);

        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(b5);
        p2.add(b6);
        
        add(p2, BorderLayout.SOUTH);
       
	}




	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == b1) {
			dispose();
			AdminFacultyAddFrame adminFacultyAddFrame = new AdminFacultyAddFrame();
		
		} else if (src == b2) {
			dispose();
			AdminFacultyDeleteFrame adminFacultyDeleteFrame = new AdminFacultyDeleteFrame();
			
		} else if (src == b3) {
			dispose();
			AdminFacultyUpdateFrame adminFacultyUpdateFrame = new AdminFacultyUpdateFrame();
			
		} else if(src == b4) {
			dispose();
			AdminFacultySearchFrame adminFacultySearchFrame = new AdminFacultySearchFrame();
			
		} else if(src == b5) {
			dispose();
			MainMenu m = new MainMenu();
		} else if(src == b6){
			dispose();
		}
	}
}