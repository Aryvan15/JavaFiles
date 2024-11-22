import java.util.*;

public class exerciseProb{
    public static int average(int x, int y, int z){
        int sum = x+ y+ z;
        int average= sum/3;
        return average;
    }
    public static int sumOfOdd(int n){
        int sum= 0;
        for(int i= 1; i<= n; i= i+2){
            sum= sum+ i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("What is the last no to get the odd sum: ");
        int d= sc.nextInt();
        int avrg= average(a, b, c);
        System.out.println(avrg);
        int oddsum= sumOfOdd(d);
        System.out.println("The sum is: "+oddsum);
        sc.close();
    }

}