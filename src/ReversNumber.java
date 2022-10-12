import java.util.Scanner;

public class ReversNumber {
   static void Rever(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();
       {

           //variables initialization
           int  reverse = 0, rem;


           //loop to find reverse number
           for( ;num != 0; num = num/10)
           {
               rem = num % 10;
               reverse = reverse * 10 + rem;
           };

           //output
           System.out.println ("Reversed Number: " + reverse);
       }
   }
    public static void main(String[] args) {
    Rever();
    }
}
