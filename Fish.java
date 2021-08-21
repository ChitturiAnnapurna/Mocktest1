package mocktest.animal;


public class Fish extends Animal implements Comparable<Fish> {
	
	public int size;
	public boolean canEat;
	
	Fish(int n,boolean canEat,int Age,String Gender,boolean Mammal,boolean mate) {
		super(Age,Gender,Mammal,mate);
		size = n;
		this.canEat = canEat;
	}
	
	

	public int getSize() {
		return(size);
	}
	
	public boolean canEat() {
		return(canEat);
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
	@Override
	public String SerializeToCSV() {
		return (new String(age+","+gender+","+mammal+","+size+","+canEat));
	}
	
	class size {
		private int Size;
		
		public size(int s) {
			this.Size = s;
		}
		
		public int Size() {
			return Size;
		}

		public int getSize() {
			return Size;
		}

		public void setSize(int size) {
			this.Size = Size;
		}
	}



	public int getsize() {
		// TODO Auto-generated method stub
		return this.getsize();
	}




		@Override
		public int compareTo(Fish o) {
			 int size;
			 Integer integer = new Integer(8);
			return integer.compareTo(o.size);
			// TODO Auto-generated method stub
			
		}
}


