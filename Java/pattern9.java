public class pattern9 {
    public static void main(String args[]){
        int n= 6;
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= n; j++){
                if(i== 1){
                    System.out.print("*");
                }
                else if(i> 2 && j==1 || i>= 4 && j== 5 || i==2 && j== 6){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
