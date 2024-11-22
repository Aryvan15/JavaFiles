import java.util.*;

public class arrays2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("tell the rows and columns size: ");
        int rows= sc.nextInt();
        int cols= sc.nextInt();
        int[][]array= new int[rows][cols];

        //Taking Input values
        System.out.println("Give us the values for the array: ");
        for(int i= 0; i< rows; i++){
            for(int j= 0; j< cols; j++){
                array[i][j]= sc.nextInt();
            }
        }
        //Getting the output
        for(int i= 0; i< rows; i++){
            for(int j= 0; j< cols; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
            
        }
        int x= sc.nextInt();
        for(int i= 0; i< rows; i++){
            for(int j= 0; j< cols; j++){
                if(array[i][j]== x){
                    System.out.println("We found the value of x at("+i+","+j+")");
                }
            }
        }
        sc.close();

    }
    
}
