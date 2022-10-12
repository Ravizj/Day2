import java.util.Scanner;

public class SumOfNthNumber {
    static int Input(){
        int num=5;
        return num;
    }
    public static void main(String[] args) {
        int num=Input();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+i;
            sum+=i;
        }
        System.out.println(sum);
    }
}

