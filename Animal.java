package mocktest.animal;

public class Animal {
	public int age;
	public String gender;
	public boolean mammal;
	public boolean mate;
	
	
	public Animal(int age, String gender, boolean mammal, boolean mate) {
		super();
		this.age = age;
		this.gender = gender;
		this.mammal = mammal;
		this.mate = mate;
	}
	
	public void SetAge(int n) {
		this.age = n;
		
	}
	
	public void SetGenderMale() {
		this.gender=gender;
	}
	
	public void SetGenderFemale() {
		this.gender=gender;
	}
	
	public void SetMammal(boolean Mammal) {
		this.mammal=Mammal;
	}
	
	public int GetAge() {
		return age;
	}
	
	public boolean IsMammal() {
		return(mammal);
	}
	
	public String GetGender() {
		return(gender);
	}
	
	public boolean mate() {
		return(mate);
	}
	
	public String SerializeToCSV()
	{
		return(new String(age+","+gender+","+mammal+","+mate));
	}
	

}
