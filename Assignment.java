package Student_Portal;
import java.io.Serializable;


public class Assignment implements Serializable{
	
	
	private String name;
	private int number;
	private String details;
	private int marks;
	private boolean submitted;
	private boolean returned;
	
	
	public Assignment(String name, int number, String details, int marks,  boolean submitted, boolean returned) {
		this.name = name;
		this.number = number;
		this.details = details;
		this.submitted = submitted;
		this.returned = returned;	
		
		
	}
	
}
