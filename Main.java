import java.io.*;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		ArrayList<Bear> bears = new ArrayList<Bear>();
		ArrayList<Tiger> tigers = new ArrayList<Tiger>();
		ArrayList<Elephant> elephants = new ArrayList<Elephant>();
		ArrayList<Animals> animal = new ArrayList<Animals>();

		Bear bear = new Bear();
		Elephant elephant = new Elephant();
		Tiger tiger = new Tiger();
		ZooKeeper zookeeper = new ZooKeeper();

		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
	    int operation;

	    
	    do {
		    System.out.print("------- ZOO MANAGEMENT -------  ");
		    System.out.print("\n   Bear                 [1] ");
			System.out.print("\n   Tiger                [2] ");
			System.out.print("\n   Elephant             [3] ");
			System.out.print("\n   Manager List         [4] ");
			System.out.print("\n   Add Animals          [5] ");
			System.out.print("\n   Print Animal List    [6] ");
			System.out.print("\n   Delete Animals       [7] ");
			System.out.print("\n   Search Animals       [8] ");
			System.out.print("\n   Update Animals       [9] ");
			System.out.print("\n Your Selection is: ");
		    operation = s.nextInt();
		    
		    switch(operation) {
		    case 1:
				
				bear.setName("Vivi"); bear.setColor("Brown") ; bear.setAge(2);
				System.out.println("[Animals information]	 " + "Name :"+bear.getName() + 
						" Color :"+bear.getColor() + " Age :"+bear.getAge());
				
		    	break;
		    case 2:
		    	tiger.setName("Gigi"); tiger.setColor("Grey") ; tiger.setAge(1);
				System.out.println("[Animals information]	 " + "Name :"+tiger.getName() + 
						" Color :"+tiger.getColor() + " Age :"+tiger.getAge());
				
		    	break;
		    case 3:
		    	elephant.setName("Wowo"); elephant.setColor("Yellow") ; elephant.setAge(4);
				System.out.println("[Animals information]	 " + "Name :"+elephant.getName() + 
						" Color :"+elephant.getColor() + " Age :"+elephant.getAge());
		    	break;
		    case 4:
		    	zookeeper.information();
				System.out.println("current we have " + bears.size() + " bears");
		    	break;
		    case 5://add
		    	Scanner input = new Scanner(System.in);
		    	System.out.println("Adding bear/elephant/tiger : ");
		    	String addName = input.nextLine();
		    	if(addName.equals("bear")) {
		    		System.out.println("Enter the animal name : ");
		    		String name = s.next();
				    System.out.println("Enter the animal color : ");
			    	 String color = s.next();
				    System.out.println("Enter the animal Age : ");
				     int age = s1.nextInt();
				     bears.add(new Bear(name,color,age));
				    System.out.println(bears.get(0));
				 	System.out.println("current we have " + bears.size() + " bears");

		    	}
	
		    	if(addName.equals("tiger")) {
		    		System.out.println("Enter the animal name : ");
		    		String name = s.next();
				    System.out.println("Enter the animal color : ");
			    	 String color = s.next();
				    System.out.println("Enter the animal Age : ");
				     int age = s1.nextInt();
				     tigers.add(new Tiger(name,color,age));
				     System.out.println(tigers.get(0));
				 	System.out.println("current we have " + tigers.size() + " tigers");

		    	}

		    	if(addName.equals("elephant")) {
		    		System.out.println("Enter the animal name : ");
		    		String name = s.next();
				    System.out.println("Enter the animal color : ");
			    	 String color = s.next();
				    System.out.println("Enter the animal Age : ");
				     int age = s1.nextInt();
				     elephants.add(new Elephant(name,color,age));
				     System.out.println(elephants.get(0));
					 	System.out.println("current we have " + elephants.size() + " elephants");

		    	}


			     break;
		    case 6://print the list
			    System.out.println("BEARS ");
			    Iterator<Bear> bearIterator = bears.iterator();
			    while(bearIterator.hasNext()) {
			    	System.out.print(bearIterator.next()+"");
			    }
			    System.out.println("ELEPHANTS ");
		    	for(Elephant e: elephants) {
			    	 System.out.println(e);
			     }
			    System.out.println("TIGERS ");
		    	for(Tiger t: tigers) {
			    	 System.out.println(t);
			     }
		    	System.out.println("----------------------------");
		    	break;
		    	
		    case 7: //Delete
		    	input = new Scanner(System.in);
		    	System.out.println("Adding bear/elephant/tiger : ");
		    	String deleteName = input.nextLine();
		    	if(deleteName.equals("bear")) {
		    		System.out.println("Enter the animal name : ");
		    		for( Bear b : bears) {
		    			if(b.equals(deleteName))
		    			{
		    				bears.remove(deleteName);
		    			}
		    			System.out.println("The bear has been removed"+ deleteName);
		    		}
				 	System.out.println("current we have " + bears.size() + " bears");

		    	}
	
		    	
		    case 8: //Search
		    	input = new Scanner(System.in);
		    	System.out.println("Search bear/elephant/tiger : ");
		    	String searchName = input.nextLine();
		    	if(searchName.equals("bear")) {
		    		for(Bear b : bears) {
		    			if(b.getName().equals(searchName))
		    					{
		    				return;
		    					}
		    			
		    	}
		    	}
		    case 9: //Update
		    	
		    
		    
		    }

	    }while(operation!=0);
	}
	    

	
	public static void checkKeeper(Scanner scanner, Animals animals) {
		animals.information();

		System.out.println("Are you zoo keeper Peter Y/N ?");
		String keeper = scanner.next();

		if(keeper.equals("Y")) {
			System.out.println("Feed Y/N ?");
			String feed = scanner.next();
			if(feed.equals("Y")) {
				System.out.println(animals.getName() + " is feeded has been record");

			}
			if(feed.equals("N")) {
				System.out.println("Please feed on time");

			}
		}
		else
			System.out.println("You do not have access");
	}
}
