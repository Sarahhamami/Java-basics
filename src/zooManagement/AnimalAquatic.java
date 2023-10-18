package zooManagement;

public class AnimalAquatic extends Animal {
	private String habitat; 
	//methode 
	public AnimalAquatic() {
		// super();
	}
	
	public AnimalAquatic(String family, String name, int age, boolean isMammal, String habitat) {
		//super();
		super(family, name, age, isMammal); //appel de constructeur de la classe mère 
		/*this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        */
        this.habitat=habitat; 
	}
	
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String toString() {

		return super.toString()+" "+this.habitat;
		
	}
	
}
