import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    float mark;
    String remark;

    public void AssignRem() {
        if (mark >= 50) {
            remark = "Selected";
        } else {
            remark = "Not Selected ";
        }
    }

    public void ENTER() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  Name  :");
        name = sc.nextLine();
        System.out.println("Enter your  Roll num :");
        roll_no = sc.nextInt();

        System.out.println("Enter your Score : ");
        mark = sc.nextInt();
        AssignRem();
    }

    public void Display() {
        System.out.println("Result ");
        System.out.println("Name    : " + name);
        System.out.println("RollNo     : " + roll_no);
        System.out.println("Name    : " + name);
        System.out.println("Score   : " + mark);
        System.out.println("Remarks : " + remark);
    }

}

public class Candidate {
    public static void main(String[] args) {
        Student can = new Student();
        can.ENTER();
        can.Display();

    }
}
