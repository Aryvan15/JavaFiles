import java.util.*;

public class arrys {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i= 0; i< size; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("What do you want to find in the array: ");
        int find = sc.nextInt();
        for(int i= 0; i< size; i++){
            if(array[i]== find){
                System.out.println("I found the value at index "+ i);
            }
        }
    
        sc.close();
    }


    
}
