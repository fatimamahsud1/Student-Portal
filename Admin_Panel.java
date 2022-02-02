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
import java.util.Random;


public class Admin_Panel implements Serializable{
	static Student_Panel  student;
	static Faculty_Panel  faculty;

	public static void add_student(Student_Panel  a){
		student.set_id(generate_id());
	}

	public static ArrayList<Student_Panel > readStudentFile(){
		ArrayList<Student_Panel > list = new ArrayList<Student_Panel >();
		try{
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("Student.dat"));
			try{
				while(true){
					System.out.println("IN while");
					Student_Panel  s = (Student_Panel)o.readObject();
					System.out.println(s.toString());
					list.add(s);
				}
			}
			catch (Exception e){
				System.out.println("End of file");
			}
			o.close();

		}
//		catch ( ClassNotFoundException c)
//		{
//
//		}
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

	public static void delete_student(String name1, String reg){
		ArrayList<Student_Panel > list = readStudentFile();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(name1) && list.get(i).ID.equals(reg)) {
				list.remove(list.get(i));
			}
		}
		File f = new File("Student.dat");
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(new FileOutputStream(f));
			for (int i = 0; i < list.size(); i++) {
				output.writeObject(list.get(i));
			}
			output.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public void update_student(){

	}

	public static Student_Panel  search_student(String name1, String reg){
		ArrayList<Student_Panel> list = readStudentFile();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(name1) && list.get(i).ID.equals(reg))
				return list.get(i);
		}
		return null;
	}



	public static void add_faculty(Faculty_Panel  f){
		faculty.set_id(generate_id());
	}

	public static ArrayList<Faculty_Panel > readFacultyFile(){
		ArrayList<Faculty_Panel > list = new ArrayList<Faculty_Panel >();
		try{
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("Faculty.dat"));
			while(true){
				Faculty_Panel  f = (Faculty_Panel ) o.readObject();
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

	public static void delete_faculty(String name1, String ID1){
		ArrayList<Faculty_Panel > list = readFacultyFile();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(name1) && list.get(i).ID.equals(ID1)) {
				list.remove(list.get(i));
			}
		}
		File f = new File("Faculty.dat");
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(new FileOutputStream(f));
			for (int i = 0; i < list.size(); i++) {
				output.writeObject(list.get(i));
			}
			output.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}
	

	public static Faculty_Panel  search_faculty(String name1, String ID1){
		ArrayList<Faculty_Panel > list = readFacultyFile();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(name1) && list.get(i).ID.equals(ID1))
				return list.get(i);
		}
		return null;

	}

	public void assign_teachers(){

	}

	public boolean fee_paid(){
		return false;
	}

	public static String randid() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 3) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}


	public static String generate_id(){
		String id = randid() + "-" + randid() + "-" + randid();
		return id;
	}


}
