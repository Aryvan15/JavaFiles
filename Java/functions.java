import java.util.*;

public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int add(int x, int y){
        int sum = x+y;
        return sum ;
    }
    public static int multiply(int x, int y){
        int product = x* y;
        return product;
    }
    public static int factorial(int x){
        int factorial = 1;
        for(int i= x; i>= 1; i--){
            factorial = factorial* i;
        }
        return factorial;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum =add(a, b);
        int Product = multiply(a, b);
        int factor = factorial(c);
        System.out.println("The sum of the two numbers is: "+sum);
        System.out.println("THe product of the two numbers is: "+ Product );
        System.out.println("The factorial of the given number is: "+ factor);

        sc.close();
    }
}
