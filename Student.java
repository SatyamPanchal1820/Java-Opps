class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[5]; 
    }

    public void setMarks(int[] marks) {
        this.marks = new int[marks.length]; 
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i]; 
        }
    }

    public double getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getAverageMarks() {
        return getTotalMarks() / marks.length;
    }
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public static void main(String[] args) {
      
        Student student = new Student("Alice", 123);

        int[] marks = new int[]{98, 93, 97, 94, 78};
        student.setMarks(marks);

        double total = student.getTotalMarks();
        double average = student.getAverageMarks();

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
