

import java.util.*;

class Car
{
    int CarId;
    String CarType;
    int Rent;
    
    public void GetCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Id : ");
        CarId=sc.nextInt();
        System.out.println("Enter Car Type : ");
        CarType=sc.next();
    }
    public int GetRent(){
        if(CarType==("Small"))
           Rent = 1000;
        if(CarType==("Van"))
           Rent = 800;
        if(CarType==("SUV"))
            Rent = 2500;
        return Rent;
    }

    public void ShowCar(){
        System.out.println("Car Id : "+CarId);
        System.out.println("Car Type : "+CarType);
        System.out.println("Rent : "+GetRent());
    }
}

public class Carrental
{
   public static void main(String args[])
   {
     Car ob=new Car();  
     ob.GetCar();
     ob.GetRent();
     ob.ShowCar();
   }
}