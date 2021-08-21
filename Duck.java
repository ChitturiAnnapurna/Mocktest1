package mocktest.animal;

public class Duck extends Animal implements Comparable<Duck> {
	public String beakColor;
	
	public Duck(String beak_color,int Age,String Gender,boolean Mammal,boolean mate) {
		super(Age,Gender,Mammal,mate);
		this.beakColor = beak_color;
	}
	
	public String GetBeakColor() {
		return(beakColor);
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public void quack() {
		System.out.println("quack");
	}
	
	@Override
	public boolean mate() {
		return(mate);
	}
	
	@Override
	public String SerializeToCSV() {
		return (new String(age+","+gender+","+mammal+","+beakColor+","+mate));
	}
	
	class Age {
		private int age;
		
		public Age(int a) {
			this.age = a;
		}
		
		public int Age() {
			return age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}



	public int getAge() {
		// TODO Auto-generated method stub
		return this.getAge();
	}


		@Override
		public int compareTo(Duck o) {
			 int size;
			 Integer integer = new Integer(8);
			return integer.compareTo(o.age);
			// TODO Auto-generated method stub
			
		}

}
