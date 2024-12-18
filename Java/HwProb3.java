// Write a program to find if a number is a power of 2 or not.
// Write a program to toggle a bit a position = “pos” in a number “n”.
// Write a program to count the number of 1’s in a binary representation of the number.
// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. 
import java.util.*;
public class HwProb3 {
    // Function whether power of 2 or not
    public static void Power(int num){
        int newNum= num -1;
        if ((newNum & num)== 0){
            System.out.println("The given number is power of 2");
        }else{
            System.out.println("The given number is not a power of 2");
        }
        

    }
    // Function to count the number of 1's 
    public static void count(int num){
        int count= 0;
        while(num> 0){
        count += num & 1;
        num >>= 1;
    }
    System.out.println(count);


        
            
    }

    
      
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Give me the number to check: ");
        int number = sc.nextInt();
        // Power(number);
        count(number);
        sc.close();
        

    }

    
}
