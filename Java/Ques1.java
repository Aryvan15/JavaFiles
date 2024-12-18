// Find the Minimum and Maximum Element in an Array
public class Ques1{
    public static void main(String args[]){
        int arr[]= {7,7,7,7,7,7,7,7,7,7};
        int min = 0;
        int max = 0;
        for(int i= 0; i< arr.length-1; i++){
            if(arr[i]< arr[min]){
                min = arr[i];
            }
            if(arr[i]> max){
                max= arr[i];
            }
            
        }
        System.out.println("The min value is: "+ min);
        System.out.println("The max value is: "+ max);

    }

}