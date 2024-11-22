// Q2.Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;
public class HwProb {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("What is the radius of the circle: ");
        int radius = sc.nextInt();
        int square = radius * radius;

        double area = (3.14 * square);
        System.out.println(square);
        System.out.println("The Area of the Circle is:;" +area);
        sc.close();
    }
}

