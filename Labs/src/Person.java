/* Name Jinke Wang
 * Section 1
 * Lab 3
 */

public class Person {
	static int current_year = 2017;
	private String name;
	private int birthdate;
	private int age;
	//constructor
	public Person(String name, int birthdate){
		this.name = name;
		this.birthdate = birthdate;
	}
	public void reset_birthday(int year){
		birthdate = year;
	}
	public void show_person_info(){
		System.out.println("This is " + name);
		System.out.println("I was born in " + birthdate + ".");
		age = current_year - birthdate;
		System.out.println("I am " + age + " years old.");
		if (age >= 65){
			System.out.println("I'm a senior citizen");
		}
		else{
			System.out.println("I'm not old enough to be classified as a senior by Medicare!");
		}
	}
	public static void main(String[] args) {
		Person John = new Person("John",1957);
		John.show_person_info();
	}

}