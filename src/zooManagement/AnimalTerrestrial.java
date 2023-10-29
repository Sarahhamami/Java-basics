package zooManagement;

public class AnimalTerrestrial extends Animal {
	private int nbrLegs;
	
	
	
	public AnimalTerrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
		
		super(family, name, age, isMammal);
		/*super.family = family;
        super.name = name;
        super.age = age;
        super.isMammal = isMammal; */
        this.nbrLegs=nbrLegs;
        
	}
	
	@Override
	public String getType() {
		return "Terrestrial";
	}
	public float getQteCons() {
		return super.age*20;
	}
}
