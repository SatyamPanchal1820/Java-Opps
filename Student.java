public class Student {

    String name;
    int rollNumber;
    int[] marks = new int[5]; 

  
    public int getTotalMark() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getAverageMark() {
        return getTotalMark() / 5.0;
    }

    public static void main(String[] args) {
  
        Student student = new Student();
     
        student.name = "Alice";
        student.rollNumber = 123;
        student.marks[0] = 98;
        student.marks[1] = 93;
        student.marks[2] = 97;
        student.marks[3] = 94;
        student.marks[4] = 74;

        System.out.println("Student Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Total Marks: " + student.getTotalMark());
        System.out.println("Average Marks: " + student.getAverageMark());
    }
}