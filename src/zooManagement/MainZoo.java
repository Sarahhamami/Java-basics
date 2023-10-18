package zooManagement;

public class MainZoo {
	public static void main(String[]args) {
		Animal lion = new Animal("F", "Lion", 5, true);
	    Animal lion2 = new Animal("F", "Lion2", 15, true);
	    Animal lion3= new Animal("F", "Lion3", 1, true);
	    AnimalAquatic aQ= new AnimalAquatic("F", "Lion", 5, true, "HABITAT");
	    AnimalAquatic aQ2= new AnimalAquatic("F", "x", 2, false, "HABITAT");
	    System.out.println(aQ);
	    Zoo zoo= new Zoo("Esprit", "Ariana");
	    zoo.ajouterAnimal(aQ);
	    zoo.ajouterAnimal(aQ2);
	    System.out.println(zoo);
	    
	    
	}
}
