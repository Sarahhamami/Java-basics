package zooManagement;
 	

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages=25;
    int nbAnimal=0;
    static int total;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
    }

    @Override
    public String toString() {
    	String ch="";
    	for (int i=0; i<this.nbAnimal; i++) {
    	
    			ch=ch+" "+animals[i];
    	
    	}
        return "Zoo{" +
                "animals=" +ch  +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    
    public void ajouterAnimal(Animal a) {
    	if (this.nbAnimal<this.nbrCages) {
    		this.animals[nbAnimal]=a; 
    		this.nbAnimal++;
    	}else {
    		System.out.println("pas de place disponible");
    	}  	
    }
    public int chercher( Animal animal) {	
    	for (int i=0; i<this.nbrCages; i++) {
    		if(this.animals[i].name==animal.name) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public boolean removeAnimal(Animal animal) {
        boolean success = false;

        for (int i = 0; i < this.nbAnimal; i++) {
            if (this.animals[i] != null && this.animals[i].equals(animal)) {
                this.animals[i] = null;
                success = true;
                break;
            }
        }

        if (success) {
            for (int i = 0; i < this.nbAnimal - 1; i++) {
                if (this.animals[i] == null) {
                    this.animals[i] = this.animals[i + 1];
                    this.animals[i + 1] = null;
                }
            }
            this.nbAnimal--;
        }

        return success;
    }
    
    public void Add1time (Animal animal) {
    	for (int i=0; i<this.nbrCages; i++) {
    		if(animals[i] != null && animals[i].equals(animal)) {
    			System.out.println("Animal existant");
    		}else {
    			this.ajouterAnimal(animal);
    		}
    	}
    
    }
    
   
    public String getType(Animal a) {
    	return a.getType();
    }
    public int getNbAquatic() {
    	int nb=0;
    	for (int i=0; i<this.nbrCages; i++) {
    		if (this.animals[i]!=null && this.animals[i].getType().equals("Aquatic")) {
    			nb+=1;
    		}
    	}
    	return nb;
    }
    
    // TODO1 getType qui va determiner dans le zoo le type de l'animal (est ce qu'il est terrestre ou aquatique) retourne String
   // TODO2 getNbAquatic va retourner le nombre d'animal aquatique seulement (int)
   
}
