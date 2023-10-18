package zooManagement;



	public class ZooManagement {
	    public static void main(String[] args) {

	    Animal lion = new Animal("F", "Lion", 5, true);
	    Animal lion2 = new Animal("F", "Lion2", 15, true);
	    Animal lion3= new Animal("F", "Lion3", 1, true);
	    //lion.afficherAnimal();
	   // System.out.println(lion.toString());
	    //System.out.println(lion);
	    Zoo zoo1= new Zoo("Zoo1", "Tunis", 1);
	    Zoo zoo2= new Zoo("Zoo2", "Tunis", 1);
	    zoo1.ajouterAnimal(lion);
	    zoo1.ajouterAnimal(lion);
	    zoo2.ajouterAnimal(lion2);
	    
	    zoo2.ajouterAnimal(lion);
	    System.out.println(zoo2.toString());
	    System.out.println(zoo2.chercher(lion2));
	    System.out.println(zoo2.removeAnimal(lion2));
	    System.out.println(zoo2.toString());
	    zoo2.Add1time(lion3);
	    System.out.println("AAAAAA");
	    System.out.println(lion);
	    System.out.println(lion.equals(lion2));
	    }
	}

	