public class patterns {
    public static void main(String args[]){
        // Q hollow cyilender
        int rows = 4;
        int cols = 5;
        // outer loop
        for (int i = 1; i<= rows; i++){
            for (int j =1; j <= cols;j++){
                if(i ==1 || j ==1 || i == rows || j == cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
