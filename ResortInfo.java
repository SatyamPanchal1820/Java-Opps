 import java.util.Scanner;
 
 class Resort{
    

    int room_no;
    String customer_name;
    int charge;
    int day;
    public double Compute(){
        double amount;
        amount=charge*day;
        if(amount>=1100){
            amount=amount*1.02;
        }else{
            amount=amount*1.10;
        }
        return amount;
    }

    public void getInfo(){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Name : ");
        customer_name=sc.nextLine();
        System.out.print("Enter a room number : ");
        room_no=sc.nextInt();
       
        System.out.print("Enter a Price : ");
        charge=sc.nextInt();
        System.out.print("Enter a days : ");
        day=sc.nextInt();

    }
    public void DispInfo(){
        System.out.println("Room number is  "+room_no);
        System.out.println("Customer Name  is "+customer_name);
        System.out.println("Price is : "+charge);
        System.out.println("Day you stay in Resort : "+day);
        System.out.println("Total amount is "+Compute());
    }
}

public class ResortInfo{
    public static void main(String[] args) {
        Resort res=new Resort();
        res.getInfo();
        res.DispInfo();
    }
}
