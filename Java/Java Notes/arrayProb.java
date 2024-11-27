//spiral order of a Matrix
import java.util.*;
public class arrayProb {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //Get input
        System.out.println("Give us the values of rows and cols: ");
        int n= sc.nextInt();
        int m= sc.nextInt();

        int[][]matrix= new int[n][m];

        for(int i= 0; i< n; i++){
            for(int j= 0; j< m; j++){
                matrix[i][j]= sc.nextInt();
            }
        
        }
        for(int i= 0; i< n; i++){
            for(int j= 0; j< m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //making the spiral order for the matrix: 
        System.out.println("The spiral order for the given matrix is: ");

        int rowStrt= 0;
        int rowEnd= n-1;
        int colStrt= 0;
        int colEnd= m- 1;

        //main area to think and code
        //using pointers to start from the specified position
        while(rowStrt <= rowEnd && colStrt<= colEnd){
            for(int col= colStrt; col<= colEnd; col++){
                System.out.print(matrix[rowStrt][col]+ " ");
            }
            rowStrt++;

            for(int row= rowStrt; row <= rowEnd; row++){
                System.out.print(matrix[row][colEnd]+ " ");
            }
            colEnd--;

            for(int col= colEnd; col>= colStrt; col--){
                System.out.print(matrix[rowEnd][col]+ " ");
            }
            rowEnd--;

            for(int row= rowEnd; row>= rowStrt; row--){
                System.out.print(matrix[row][colStrt]+ " ");
            }
            colStrt++;

        }
        sc.close();

    }
    
}
