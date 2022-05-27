// EXERCISE - Validating parameters (2 parts)


public class Person {
    
    private String name;
    private int age;
    
    //constructor
    public Person(String name, int age) {
        if ((name != null && name.length() <= 40) && (age >= 0 && age <= 120) && (!name.equals(""))) {
            this.name = name;
            this.age = age;
        } else {
            throw new IllegalArgumentException("name entered was incorrect");
        }
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
		
		Person person = new Person("John", 25); //valid input
		Person person1 = new Person("", 25);  //invalid input, uncomment to test
	}
}