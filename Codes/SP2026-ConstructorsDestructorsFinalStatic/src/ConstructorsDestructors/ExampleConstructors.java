package ConstructorsDestructors;

class Cat {
	private String name;
	private int age;
	private boolean hungerStatus;
	private String[] favToys;
	
	public Cat() {
		name = "";
		age = 0;
		hungerStatus = false;
		favToys = new String[] {"", "", ""};
	}
	
	public Cat(String name, int age, boolean hungerStatus, String[] favToys) {
		this.name = name;
		this.age = age;
		this.hungerStatus = hungerStatus;
		this.favToys = favToys;
		
	}
	
	//adding another Parameterized Constructor
	public Cat(String name, int age, boolean hungerStatus) {
		this.name = name;
		this.age = age;
		this.hungerStatus = hungerStatus;
		this.favToys = new String[] {""};
		
	}
	
	//copy constructor for Cat
	public Cat(final Cat other) {
		this.name = other.name;
		this.age = other.age;
		this.hungerStatus = other.hungerStatus;
		this.favToys = other.favToys;
	}
	
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setfavToyOnIndex(int index, String toy) {
		favToys[index] = toy;
	}
	
	//show info
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Hunger Status: " + hungerStatus);
		for (int i = 0; i < favToys.length; i++)
			System.out.println(name + " likes " + favToys[i]);
		
	}
}

public class ExampleConstructors {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		String[] toys = new String[] {"mouse toy", "laser pointer", "feather toy"};
		Cat myOtherCat = new Cat("Tom", 3, true, toys);
		Cat myThirdCat = new Cat("Garfield", 8, true);
		myCat.showInfo();
		myOtherCat.showInfo();
		myThirdCat.showInfo();
		
		//Why we need copy constructors
		Cat c1 = new Cat ("Billi", 2, false, toys);
		Cat c2 = c1;
		
		c2.setName("Catto");
		
		c1.showInfo();
		//Copying using copy constructors
		Cat c3 = new Cat(c2);
		c3.setName("Cheshire");
		c1.showInfo();
		c3.showInfo();
		
		//cue, shallow copy
		toys[2] = "shelves";
		c1.showInfo();
		
		c1.setfavToyOnIndex(0, "rubber ducky");
		c3.showInfo();

	}

}
