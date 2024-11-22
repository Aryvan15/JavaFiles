// Q1 - Print the sum of first n natural numbers: Using the concept of Loop
// Types of loop  for, while, do- while loop
// for(initializer, condition, step)
// // while loop
// int i = 0;
// while(condition){
//       #try something
// }
// // do while loop
// int i =0;
// do {
//     something ;
// }
// while (condition);
import java.util.*;


public class Loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        for(int i = 0; i <= a; i++)  {
            sum = sum + i;
        }
    System.out.println(sum);
    sc.close();
}
}
