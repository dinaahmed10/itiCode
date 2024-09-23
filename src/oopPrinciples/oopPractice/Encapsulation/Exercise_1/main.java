package oopPrinciples.oopPractice.Encapsulation.Exercise_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();

       
        person.setName("Arthfael Viktorija");
        person.setAge(25);
        person.setCountry("USA");

         
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
	}

}
