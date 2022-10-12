import java.util.Scanner;

public class SumOfNum {
    static int number(int n){
        System.out.println("Number is :="+n);
        return n;
    }

        public static void main(String[] args) {

       int num= number(5);
        int sum=0;
            for (int i=1;i<=num;i++){
                sum+=i;
            }
            System.out.println(sum);
        }
    }
