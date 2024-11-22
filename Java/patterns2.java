// Pyiramid with mubmers
public class patterns2 {
//     public static void main(String[] args){
//         int n = 5;
//         for(int i= 1; i <=n; i++){
//             for(int j= 1; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
    
// }
// Inverted half pyiramid with numbers
    // public static void main(String[] args){
    //     int n= 5;
    //     for(int i= 1; i<= n; i++){
    //         for(int j= 1; j<= n-i+1; j++ ){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
// }

// Floyd's Triangle
    public static void main(String[] args){
        int n= 5;
        int number = 1;
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= i; j++ ){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }
}