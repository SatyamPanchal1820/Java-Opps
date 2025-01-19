public class Management {

    private int id;
    private String name;
    private int age;
    private String department;


    public Management(int id, String name, int age, String department) {

        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Error: ID must be a positive integer.");
        }

        this.name = name; 

        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 18 and 60.");
        }


        if (department.equals("HR") || department.equals("IT") || department.equals("Finance")) {
            this.department = department;
        } else {
            System.out.println("Error: Invalid department. Choose from HR, IT, Finance.");
        }
    }

    public void display() {
   
        if (this.id <= 0 || this.age < 18 || this.age > 60 || this.department == null || this.department.isEmpty()) {
            System.out.println("Employee details are incomplete due to invalid data.");
        } else {
            System.out.println("Employee ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Department: " + this.department);
        }
    }

    public static void main(String[] args) {

      Management emp1 = new Management(101, "Virat ", 30, "HR");
        emp1.display();

        Management emp2 = new Management(-5, "Satyam Panchal", 21, "IT");
        emp2.display();

       Management emp3 = new Management(103, "Rohit", 65, "Finance");
        emp3.display();

    
    }
}
