import java.util.List;

public class Bear  extends Animals  {
	


    public Bear() {
    }



	public Bear(String name, String color, int age) {
		 this.animalNames = name;
	        this.animalColor = color;
	        this.animalAge = age;
	}
	
	public static void printBears( List<Bear> bears) {
		for(Bear b : bears) {
			System.out.println(b.toString());
		}
	}
	

	


	@Override
    public void information() {
        System.out.println( "[Animals information]	 " + "Name :"+this.getName() + " Color :"+this.getColor() + " Age :"+this.getAge());
    }
	@Override
	public String toString() {
       String info =  "[Animals information]	 " + "Name :"+this.getName() + " Color :"+this.getColor() + " Age :"+this.getAge();
       return info;
	}



}
