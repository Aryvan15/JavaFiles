//butterfly pattern
public class patterns8 {
    public static void main(String args[]){
        int n = 5;
        for(int i= 1; i<= n; i++){
            // first half- first part
            for(int j= 1; j<= i; j++ ){
                if(i== j || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    }
                }
                //first half- second part
            for(int j= 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            } 
            for(int j= 1; j<= i; j++ ){
                if(i== j || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    }
                }
            
            System.out.println();
            }
            
        //second half- fist part
        for(int i= n; i>= 1; i--){
            for(int j= 1; j<= i; j++ ){
                if(i== j || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    }
                }
            //second half- second part
            for(int j= 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j= 1; j<= i; j++ ){
                if(i== j || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    }
                }
            System.out.println();
        }
        
        
        
    }
}
