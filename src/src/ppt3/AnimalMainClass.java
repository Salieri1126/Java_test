package src.ppt3;

public class AnimalMainClass {

	public static void main(String[] args) {
		
		Animal dubu = new Animal();
		Dog uyu = new Dog();
		Animal dale = new Dog();
		Animal congi = new Cat();
		
		dubu.sound();
		
		uyu.sound();
		uyu.jump();
		
		dale.sound();
		//dale.jump();
		
		System.out.println("================");
		school(dubu);
		school(uyu);
		school(dale);
		System.out.println("================");
		school(congi);
	}
	
	static void school(Animal student) {
		student.sound();
		
		if(student instanceof Dog) {
			Dog dale_home = (Dog)student;
			dale_home.jump();
		} else if(student instanceof Cat){
			Cat dale_home = (Cat)student;
			dale_home.punch();
		}
	}
}