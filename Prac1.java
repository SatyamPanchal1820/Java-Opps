class Person {
    String name;
    int age;
    String gender;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
  
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.gender = "Female";
        person1.displayDetails();
       
    }
}
