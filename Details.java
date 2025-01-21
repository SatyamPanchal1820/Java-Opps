 class Dog {
    private String name;
    private String breed;
    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public void  setName(String name){
        this.name=name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
}

public class Details{
    public static void main(String[]args){
        Dog dog=new Dog("Tiger","Bull-Dog");
        System.out.println("Dog name is "+dog.getName()+" and Breed is "+dog.getBreed());

        dog.setName("Tommy");
        dog.setBreed("Labra");
        System.out.println("Dog name is "+dog.getName()+" and Breed is "+dog.getBreed());

    }
    
}
