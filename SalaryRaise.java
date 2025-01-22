class Salary {
    private String name;
    private String job;
    private double salary;

    public Salary(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double per) {
        salary = salary + salary + (per / 100);
    }
}

public class SalaryRaise {
    public static void main(String[] args) {
        Salary salary = new Salary("Satyam Panchal", "IT", 60000);
        System.out.println("Name of Employee is " + salary.getName() + ", job title is " + salary.getJob()
                + " and salary is " + salary.getSalary());

        salary.raiseSalary(15);
        System.out.println("Name of Employee is " + salary.getName() + ", job title is " + salary.getJob()
                + " and salary is " + salary.getSalary());

        salary.setName("John Doe");
        salary.setJob("Marketing");
        salary.setSalary(40000);

        System.out.println("Name of Employee is " + salary.getName() + ", job title is " + salary.getJob()
                + " and salary is " + salary.getSalary());
        salary.raiseSalary(8);
        System.out.println("Name of Employee is " + salary.getName() + ", job title is " + salary.getJob()
                + " and salary is " + salary.getSalary());

    }
}
