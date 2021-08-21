package mocktest.animal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mocktest.animal.Duck.Age;


public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("text.txt");

          try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			    String line;
			   while((line = br.readLine())!= null) {
				System.out.println(line);
			    }
		   } catch(IOException e) {
			     e.printStackTrace();
		   }
		  
	//task3
          
          
		ArrayList<Fish> list = new ArrayList<Fish>();
		  list.add(new Fish(6,true,10,"female",true,true));
		  list.add(new Fish(8,true,10,"male",true,true));
		  list.add(new Fish(7,true,10,"male",true,true));
		  list.add(new Fish(5,true,10,"female",true,true));
		  list.add(new Fish(9,true,10,"female",true,true));
		  
		  
		  Collections.sort(list);
		  
		  System.out.println("Sorting in ascending order");
		  
		  System.out.println(list);
		  
		  Collections.sort(list,Collections.reverseOrder());
		  
		  System.out.println("Sorting in descending order");
		  
		  System.out.println(list);

	
	
	//task4
	
	
	      ArrayList<Duck> aList= new ArrayList<Duck>();
	   
	      aList.add(new Duck("yellow",10,"male",true,true));
		  aList.add(new Duck("green",8,"female",true,true));
		  aList.add(new Duck("brown",7,"male",true,true));
		  aList.add(new Duck("blue",9,"female",true,true));
		  aList.add(new Duck("brown",5,"male",true,true));
		  
		  if(aList.contains("brown")) {		
		       System.out.println("filtered");
		   {
			  System.out.println("not filtered");
		  }
	   } 
		   aList.stream().sorted().forEach(System.out::println);
		  
		  
	}	 
	   
}


