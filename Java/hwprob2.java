import java.util.*;
public class hwprob2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("What operation do you want to perform \n press 1 for Add \n 2 for Multiply \n 3 for Divide \n 4 for remainder \n 5 for subtract: ");
        int operation = sc.nextInt();

        switch(operation){
            case 1: System.out.println(a+ b);
            break;
            case 2: System.out.println(a * b);
            break;
            case 3: System.out.println(a/ b);
            break;
            case 4: System.out.println(a% b);
            break;
            case 5: System.out.println(a - b);
            break;
            default : System.out.println("invalid operation");
            
        }

    sc.close();
    }
}
