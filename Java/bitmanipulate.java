import java.util.*;
public class bitmanipulate {
    public static void main(String args[]){
        int a= 5;
        
        int pos= 0;
        int bitMask= 1<< pos;
        // Get bit
        if((bitMask & a) == 0){
            System.out.println("The bit was zero");
        }
        else{
            System.out.println("The bit was one");
        }



        //Set Bit  :- converts the mentioned bit to 1
        int newNumber= bitMask | a;
        System.out.println("The new Number is after setting it: "+ newNumber);



        //Clear Bit :- converts the mentioned bit to 0
        int notBitMask= ~(bitMask);
        int clrNo= notBitMask & a;
        System.out.println("The number after performing the clear bit operation: "+ clrNo);


        // Update bit
        Scanner sc= new Scanner(System.in);
        System.out.println("Whether you want to make the bit 0 or 1");
        int value= sc.nextInt();
        if(value == 1){
            int newNumber1= bitMask | a;
            System.out.println("The new Number is after updating bit is: "+ newNumber1);

        }else{
            int notBitMask1= ~(bitMask);
            int clrNo1= notBitMask1 & a;
            System.out.println("The number after performing the Update bit operation: "+ clrNo1);


        }
        sc.close();
    

    }
    
}
