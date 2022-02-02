package Student_Portal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Faculty_Panel extends Person implements Serializable{
	String course;

	public Faculty_Panel(String name, String ID, String email, String gender, String contact_number, String address, String CNIC, String username, String password, String course) {
		
		super(name, ID, email, gender, contact_number, address, CNIC, username, password);
		this.course = course;
		
	}
	
	public Faculty_Panel() {
		
	}


	public static void updateProfile(String name1, String ID1, String email1, String gender1, String contact_number1, String address1, String CNIC1, String course1) {
		ArrayList<Faculty_Panel> list = readFile();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).ID.equals(ID1)) {
				list.get(i).name = name1;
				list.get(i).ID = ID1;
				list.get(i).email = email1;
				list.get(i).gender = gender1;
				list.get(i).contact_number = contact_number1;
				list.get(i).address = address1;
				list.get(i).CNIC = CNIC1;
				list.get(i).course = course1;
			}
			
			File f = new File("Faculty.dat");
			ObjectOutputStream output;
			try {
				output = new ObjectOutputStream(new FileOutputStream(f));
				for (int j = 0; j < list.size(); j++) {
					output.writeObject(list.get(i));
				}
				output.close();
			}catch (FileNotFoundException e) {
				
			} catch (IOException e) {
				
			}
		}
	}
	
	

	public static Student_Panel searchStudent(String name, String reg) {
		ArrayList<Student_Panel> list = readStudentFile();
		Student_Panel s = new Student_Panel();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(name) && list.get(i).ID.equals(reg)) {
				s = list.get(i);
			}
		}
		return s;
	}
	
	

	public static ArrayList<Student_Panel> readStudentFile(){
        ArrayList<Student_Panel> list = new ArrayList<Student_Panel>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("Student.dat"));
            while(true){
                Student_Panel s = (Student_Panel) o.readObject();
                list.add(s);
            }
        }
        catch ( ClassNotFoundException c)
        {

        }
        catch ( ClassCastException c)
        {

        }
         catch ( EOFException e)
        {

        } catch (FileNotFoundException ex) {

        }
          catch (IOException ex) {

        }
        return list;
    }
	
	
	//reading faculty file
	public static ArrayList<Faculty_Panel> readFile(){
        ArrayList<Faculty_Panel> list = new ArrayList<Faculty_Panel>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("Faculty.dat"));
            while(true){
                Faculty_Panel f = (Faculty_Panel) o.readObject();
                list.add(f);
            }
        }
        catch ( ClassNotFoundException c)
        {

        }
        catch ( ClassCastException c)
        {

        }
         catch ( EOFException e)
        {

        } catch (FileNotFoundException ex) {

        }
          catch (IOException ex) {

        }
        return list;
    }
 
	
	//to dispaly or read full faculty file
	public static void displayAll() {
		ArrayList<Faculty_Panel> list = readFile();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
		}
	}

	
	//check if username exists in faculty file
    public static boolean check_username(String n){
        boolean check = false;
        ArrayList<Faculty_Panel> a = readFile();
        for(Faculty_Panel s:a){
            if(s.username.equals(n)){
                check = true;
            }    
        }
        return check;
    }
    
    
    //return faculty if it exists otherwise return null
    public static Faculty_Panel getFacultybyUsername(String username) {
	        ArrayList<Faculty_Panel> a = readFile();
	        for(Faculty_Panel s:a){
	            if(s.username.equals(username)){
	            	return s;
	            }    
	        }
	        return null;
    }
    
    
    //get faculty by name
    public static Faculty_Panel getFaculty(String name1, String ID1) {
        ArrayList<Faculty_Panel> a = readFile();
        for(Faculty_Panel s:a){
            if(s.name.equals(name1) && s.ID.equals(ID1)){
            	return s;
            }    
        }
        return null;
    }
    
    
    
    //get faculty profile by index number
    public static Faculty_Panel getFacultyprofile(int i) {
    	ArrayList<Faculty_Panel> list = readFile();
    	return list.get(i);
    }
    
    
    
    //check if password matches
    public static boolean check_password(String n){
        boolean check = false;
        ArrayList<Faculty_Panel>a = readFile();
        for(Faculty_Panel s:a){
            if(s.password.equals(n)){
                check = true;
            }    
        }
        return check;
    }
    
    
    //witing object to faculty file
    public static void writeFaculty(Faculty_Panel c){
        File f = new File("faculty.dat");
        try {

            FileOutputStream fos = null;


            fos = new FileOutputStream(
                    f, true);

            if (f.length() == 0) {
                ObjectOutputStream oos
                        = new ObjectOutputStream(fos);
                oos.writeObject(c);
                oos.close();
            }

            else {

                MyObjectOutputStream oos = null;
                oos = new MyObjectOutputStream(fos);
                oos.writeObject(c);

                oos.close();
            }

            fos.close();
        }


        catch (Exception e) {
            System.out.println("Error Occurred" + e);
        }
    }
	
}
