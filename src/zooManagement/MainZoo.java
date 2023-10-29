package zooManagement;

public class MainZoo {
	public static void main(String[]args) {
		Animal lion = new Animal("F", "Lion", 5, true);
	    Animal lion2 = new Animal("F", "Lion2", 15, true);
	    Animal lion3= new Animal("F", "Lion3", 1, true);
	    Animal aQ= new AnimalAquatic("F", "Lion", 5, true, "HABITAT");
	    AnimalAquatic aQ2= new AnimalAquatic("F", "x", 2, false, "HABITAT");
	    AnimalTerrestrial aT= new AnimalTerrestrial ("F", "Singe", 3, true, 1);
	    System.out.println(aQ);
	    Zoo zoo= new Zoo("Esprit", "Ariana");
	    zoo.ajouterAnimal(aQ);
	    zoo.ajouterAnimal(aQ2);
	    System.out.println(zoo);
	    System.out.println("/////////////////");
	    System.out.println(aQ.getType());
	    System.out.println(aQ2.getType());
	    System.out.println("/////////////////");
	    System.out.println(zoo.getNbAquatic());
	    System.out.println(zoo.getNbAquatique());
	    
	}
}
