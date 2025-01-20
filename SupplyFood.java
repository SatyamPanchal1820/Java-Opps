import java.util.*;

class Supply
{
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;
    
    public String GetType(){
        if(Sticker.equals("Green"))
           FoodType = "Vegetarian";
        if(Sticker.equals("Yellow"))
           FoodType = "Contains Egg";
        if(Sticker.equals("Red"))
           FoodType = "Non Vegetarian";

           return FoodType;
    }

    public void FoodIn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Food Code : ");
        Code=sc.nextInt();
        System.out.println("Enter Food Name : ");
        FoodName=sc.next();
        System.out.println("Enter Sticker Color : ");
        Sticker=sc.next();
        GetType();
    }
    
    public void FoodOut(){
        System.out.println("You Entered ");
        System.out.println("Food Code     : "+Code);
        System.out.println("Food Name     : "+FoodName);
        System.out.println("Sticker Color : "+Sticker);
        System.out.println("Food Type     : "+FoodType);
    }
}

class SupplyFood
{
       public static void main(String args[])
   {
     Supply ob=new Supply();  
     ob.FoodIn();
     ob.FoodOut();
   }
}