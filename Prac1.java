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
  
        Person p = new Person();
        p.name = "Alice";
        p.age = 19;
        p.gender = "M";
        p.displayDetails();
       
    }
}
