// Q1- Get the sum of the first n numbers
public class recursion {
    public static void getsum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println("The sum of the n numbers is: "+sum);
            return;
        }
        sum += i;
        getsum(i+ 1, n, sum);
    }
// Q2- Print factorial of a number;
        public static int getfact(int n){
            if(n== 0 || n == 1){
                return 1;
            }
            int fact_nm1= getfact(n-1);
            int fact= n * fact_nm1;
            return fact;
        }

// Q3- print the fibonacci sequence till the nth term;
        public static void getfibonacci(int a, int b, int n){
            if(n== 0){
                return;
            }
            int c= a+ b;
            System.out.println(c);
            getfibonacci(b, c, n-1);
        }
            
    public static void main(String argss[]){
        getsum(1, 6,0);
        int factorial = getfact(5);
        System.out.println(factorial);

        int a= 0, b= 1;
        System.out.println("The fibonacci sequence is: ");
        System.out.println(a);
        System.out.println(b);
        int n=10;
        getfibonacci(a, b, n-2);
        
        
    }
    
}
