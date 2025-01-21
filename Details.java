class Person {
    private String name;
    private int age;
  public  Person(int age,String name){
    this.age=age;
    this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    
}

public class Details {
    public static void main(String[] args) {
    
        Person per = new Person(21, "Satyam Panchal"); 
        System.out.println("The person name is " + per.getName() + " and age of the person is " + per.getAge());
        

        per.setAge(21);
        per.setName("John Deo");
        System.out.println("The person name is " + per.getName() + " and age of the person is " + per.getAge());
    }
}
