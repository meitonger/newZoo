public class Elephant extends Animals {

    public Elephant() {

    }

	public Elephant(String name, String color, int age) {
		 this.animalNames = name;
	        this.animalColor = color;
	        this.animalAge = age;
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
