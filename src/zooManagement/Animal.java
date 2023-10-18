package zooManagement;

public class Animal {
	protected String family;
	protected String name;
	protected int age ; 
	protected boolean isMammal; 
	public Animal() {
		
	}
	
	  public Animal(String family, String name, int age, boolean isMammal) {
	        this.family = family;
	        this.name = name;
	        this.age = age;
	        this.isMammal = isMammal;
	    }
		/*public String getFamily() {
		        return family;
		}
		public  String getName(){
		        return name;
		}
		public int getAge() {
		        return age;
		}
		
		public boolean isMammal() {
	        return isMammal;
		}
		 */
	    public void afficherAnimal(){
	        System.out.println(this.family);
	        System.out.println(this.name);
	        System.out.println(this.age);
	        System.out.println(this.isMammal);
	    }
	    @Override
	    public String toString() {
	        return "Animal{" +
	                "family='" + family + '\'' +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", isMammal=" + isMammal +
	                '}';
	    }
	   public boolean comparerAnimal(Animal a1, Animal a2) {
		   if (a1.age==a2.age && a1.family.equals(a2.family)) {
			   return true;
		   }else 
		   return false; 
	   }
	   
	   public boolean equals (Animal a) {
		   if (this.age==a.age && this.family.equals(a.family)) {
			   return true;
		   }else 
		   return false; 
	   }
	    
}
