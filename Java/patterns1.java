// Q1 -> half pyitamid
// Q2 -> Rev half pyiramid

public class patterns1 {
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int i = 1; i <= n; i++ ){
    //         for (int j = 1; j <= i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // Rev half pyiramid
//     public static void main(String[] args){
//         int n = 4;
//         for(int i= n; i >= 1; i--){
//             for(int j= 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

    // Rev half pyiramid
    public static void main(String[] args){
        int n = 4;
        for(int i= 1; i<= n; i++){
            for(int j= 1; j <= n-i; j++ ){
                System.out.print(" ");
            }
            for(int j= 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
